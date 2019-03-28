import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Tree {
    private TreeNode treeRoot = null;
    //get root
    public TreeNode getTreeRoot(){
        return this.treeRoot;
    }
    //Self-defined exception
    protected class NodeAlreadyExistsException extends Exception{

    }
    protected class NodeNotFoundException extends Exception{

    }
    //insert method for user to use
    public void insert(TreeNode treeNodeToInsert, Boolean printResult) throws NodeAlreadyExistsException{
        //when the tree is empty
        if (this.treeRoot == null){
            this.treeRoot = treeNodeToInsert;
            if (printResult){
                System.out.println("Inserted!");
            }

        }else {
            this.insertWhenTheTreeIsNotEmpty(treeNodeToInsert, this.treeRoot, printResult);
        }
    }
    //inner insert function when the tree is not empty
    private void insertWhenTheTreeIsNotEmpty(TreeNode treeNodeToInsert, TreeNode currentTreeNode, Boolean printResult) throws NodeAlreadyExistsException{
        //when tree is empty
//        if (this.treeRoot == null){
//            this.treeRoot = treeNodeToInsert;
//            return;
//        }
        //when not empty
        int compareResult = (treeNodeToInsert.getComparableContent()).compareTo(currentTreeNode.getComparableContent());
        if (compareResult == 0){
            //Node already exists
            throw new NodeAlreadyExistsException();
        }else if (compareResult > 0){
            if (currentTreeNode.getNext() == null){
                currentTreeNode.setNext(treeNodeToInsert);
                treeNodeToInsert.setParent(currentTreeNode);
                if (printResult) {
                    System.out.println("Inserted!");
                }

            }else {
                this.insertWhenTheTreeIsNotEmpty(treeNodeToInsert, currentTreeNode.next, printResult);
            }

        }else if (compareResult < 0){
            if (currentTreeNode.getPrevious() == null){
                currentTreeNode.setPrevious(treeNodeToInsert);
                treeNodeToInsert.setParent(currentTreeNode);
                System.out.println("Inserted!");
            }else {
                this.insertWhenTheTreeIsNotEmpty(treeNodeToInsert, currentTreeNode.previous, printResult);
            }
        }
    }

    //find
    public TreeNode find(Comparable treeNodeContentToFind, TreeNode current, Boolean printResult) throws NodeNotFoundException{

        TreeNode treeNodeForRecursiveSearch = null;
        if (current == null){
            if (printResult){
                System.out.println("Match Not Found!");
            }
            throw new NodeNotFoundException();
        }else {
            int compareResult = treeNodeContentToFind.compareTo(current.getComparableContent());
            if (compareResult == 0){
                if (printResult){
                    System.out.println("Match Found!");
                }
                return current;
            }else if (compareResult > 0){
                treeNodeForRecursiveSearch = current.getNext();
            }else if (compareResult < 0){
                treeNodeForRecursiveSearch = current.getPrevious();
            }
        }
        return this.find(treeNodeContentToFind, treeNodeForRecursiveSearch, printResult);
    }

    //remove
    public void remove(Comparable treeNodeContentToRemove, String nodeID, Boolean printResult){


        try{
            TreeNode nodeToBeRemoved = this.find(treeNodeContentToRemove, this.treeRoot, true);


            //When the node has no next and previous, set its parent's left/right to null
            if (nodeToBeRemoved.getNext() == null && nodeToBeRemoved.getPrevious() == null){
                this.replaceNode(nodeToBeRemoved, null);
                //When node has one sub node, replace the parent's left/right to that sub node
            }else if (nodeToBeRemoved.getNext() != null && nodeToBeRemoved.getPrevious() == null){
                this.replaceNode(nodeToBeRemoved, nodeToBeRemoved.getNext());
            }else if (nodeToBeRemoved.getNext() == null && nodeToBeRemoved.getPrevious() != null){
                this.replaceNode(nodeToBeRemoved, nodeToBeRemoved.getPrevious());
                //When node has two sub nodes, replace with next largest
            }else if (nodeToBeRemoved.getNext() != null && nodeToBeRemoved.getPrevious() != null){
                this.replaceWithNextLargest(nodeToBeRemoved, nodeToBeRemoved.getNext(), nodeID);
            }
            if (printResult){
                System.out.println("Removed!");
            }
        }catch (NodeNotFoundException e){
            if (printResult){
                System.out.println("Removal Did Not Conduct!");
            }
        }
    }
    //Help with removing node, do the simple replacing
    private void replaceNode(TreeNode nodeToBeRemoved, TreeNode replaceMent){


        //When removing the root
        if (nodeToBeRemoved.getParent() == null){
            if ((nodeToBeRemoved.getPrevious()) != null){
                (nodeToBeRemoved.getPrevious()).setParent(null);
                this.treeRoot = nodeToBeRemoved.getPrevious();
            }else if ((nodeToBeRemoved.getNext()) != null){
                (nodeToBeRemoved.getNext()).setParent(null);
                this.treeRoot = nodeToBeRemoved.getNext();
            }else {
                this.treeRoot = null;
            }
            //When removing other nodes
        }else if ((nodeToBeRemoved.getParent()).getNext() == nodeToBeRemoved){
            (nodeToBeRemoved.getParent()).setNext(replaceMent);
            if (nodeToBeRemoved.getNext() != null || nodeToBeRemoved.getPrevious() != null){
                replaceMent.setParent((nodeToBeRemoved.getParent()));
            }
        }else {
            (nodeToBeRemoved.getParent()).setPrevious(replaceMent);
            if (nodeToBeRemoved.getNext() != null || nodeToBeRemoved.getPrevious() != null){
                replaceMent.setParent((nodeToBeRemoved.getParent()));
            }
        }

    }

    //Help with removing node, will replace the node for removing with the next largest node
    private void replaceWithNextLargest(TreeNode nodeToBeRemoved, TreeNode current, String nodeID){

        if (current.getPrevious() == null) {
            nodeToBeRemoved.setComparableContent(current.getComparableContent());
            switch (nodeID){
                case "Make":
                    ((MakeNode)nodeToBeRemoved).setMakeName(((MakeNode)current).getMakeName());
                    break;
                case "Car":
                    ((CarNode)nodeToBeRemoved).setRegistrationNumber(((CarNode)current).getRegistrationNumber());
                    ((CarNode)nodeToBeRemoved).setColor(((CarNode)current).getColor());
                    ((CarNode)nodeToBeRemoved).setModel(((CarNode)current).getModel());
                    break;
            }
            if (current.getParent() == nodeToBeRemoved) {
                (current.getParent()).setNext(current.getNext());
                (current.getNext()).setParent(nodeToBeRemoved);
            } else {
                (current.getParent()).setPrevious(current.getNext());
                (current.getNext()).setParent(current.getParent());
            }
            //Clear out the current(Origin next largest)
            current.setNext(null);
            current.setComparableContent(null);
        } else {
            this.replaceWithNextLargest(nodeToBeRemoved, current.getPrevious(), nodeID);
        }

    }

    //Display all the makes of cars inorder
    public String display(TreeNode current) {
        String inOrderDetails = new String();
        if (current != null) {
            inOrderDetails += this.display(current.getPrevious());
            inOrderDetails += current.getComparableContent() + "  ";
            inOrderDetails += this.display(current.getNext());
        }
        return inOrderDetails;
    }

    @Override
    public String toString() {
        return this.display(this.treeRoot);
    }

    public List<TreeNode> getAllNodesInOrder(TreeNode current){
        List<TreeNode> list = new ArrayList<TreeNode>();

        if (current != null){
            if (current.getPrevious() != null){
                list.addAll(this.getAllNodesInOrder(current.getPrevious()));
            }

            list.add(current);

            if (current.getNext() != null){
                list.addAll(this.getAllNodesInOrder(current.getNext()));
            }
        }

        return list;

    }

    public void balanceTheTree(){
        List<TreeNode> nodesList = this.getAllNodesInOrder(this.getTreeRoot());
        int midNumber = (nodesList.size()/2);
        //clear all the nodes(delete next, previous and parent)
        for (int index = 0; index < nodesList.size(); index ++){
            nodesList.get(index).setParent(null);
            nodesList.get(index).setNext(null);
            nodesList.get(index).setPrevious(null);
        }
        this.treeRoot = null;
        //Insert them again
        for (int i = 0; i<= midNumber; i++) {
            try {
                this.insert(nodesList.get(i), false);
            }catch (Exception e){

            }
        }
        for (int i = midNumber +1; i < nodesList.size(); i++) {
            try {
                this.insert(nodesList.get(i), false);
            }catch (Exception e){

            }
        }

    }
}
