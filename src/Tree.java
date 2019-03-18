import java.util.ArrayList;

public class Tree {
    private TreeNode treeRoot = null;
    //get root
    public TreeNode getTreeRoot(){
        return this.treeRoot;
    }
    //Self-defined exception
    protected class NodeAlreadyExistsException extends Exception{

    }
    //insert method for user to use
    public void insert(TreeNode treeNodeToInsert) throws NodeAlreadyExistsException{
        //when the tree is empty
        if (this.treeRoot == null){
            this.treeRoot = treeNodeToInsert;
            System.out.println("Inserted!");
        }else {
            this.insertWhenTheTreeIsNotEmpty(treeNodeToInsert, this.treeRoot);
        }
    }
    //inner insert function when the tree is not empty
    private void insertWhenTheTreeIsNotEmpty(TreeNode treeNodeToInsert, TreeNode currentTreeNode) throws NodeAlreadyExistsException{
        //when tree is empty
        if (this.treeRoot == null){
            this.treeRoot = treeNodeToInsert;
            return;
        }
        //when not empty
        int compareResult = (treeNodeToInsert.getComparableContent()).compareTo(currentTreeNode.getComparableContent());
        if (compareResult == 0){
            //Node already exists
            throw new NodeAlreadyExistsException();
        }else if (compareResult > 0){
            if (currentTreeNode.getNext() == null){
                currentTreeNode.setNext(treeNodeToInsert);
                treeNodeToInsert.setParent(currentTreeNode);
                System.out.println("Inserted!");
            }else {
                this.insertWhenTheTreeIsNotEmpty(treeNodeToInsert, currentTreeNode.next);
            }

        }else if (compareResult < 0){
            if (currentTreeNode.getPrevious() == null){
                currentTreeNode.setPrevious(treeNodeToInsert);
                treeNodeToInsert.setParent(currentTreeNode);
                System.out.println("Inserted!");
            }else {
                this.insertWhenTheTreeIsNotEmpty(treeNodeToInsert, currentTreeNode.previous);
            }
        }
    }

    //find
    public TreeNode find(Comparable treeNodeContentToFind, TreeNode current){

        TreeNode treeNodeForRecursiveSearch = null;
        if (current == null){
            System.out.println("Match Not Found!");
            return null;
        }else {
            int compareResult = treeNodeContentToFind.compareTo(current.getComparableContent());
            if (compareResult == 0){
                System.out.println("Match Found!");
                return current;
            }else if (compareResult > 0){
                treeNodeForRecursiveSearch = current.getNext();
            }else if (compareResult < 0){
                treeNodeForRecursiveSearch = current.getPrevious();
            }
        }
        return this.find(treeNodeContentToFind, treeNodeForRecursiveSearch);
    }

    //remove
    public void remove(Comparable treeNodeContentToRemove){
        TreeNode nodeToBeRemoved = this.find(treeNodeContentToRemove, this.treeRoot);
        if (nodeToBeRemoved == null){
            System.out.println("Removal Did Not Conduct!");
        }else {
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
                this.replaceWithNextLargest(nodeToBeRemoved, nodeToBeRemoved.getNext());
            }
            System.out.println("Removed!");
        }
    }
    //Help with removing node, do the simple replacing
    private void replaceNode(TreeNode nodeToBeRemoved, TreeNode replaceMent){


        //When removing the root
        if (nodeToBeRemoved.getParent() == null){
            this.treeRoot = null;
            //When removing other nodes
        }else if ((nodeToBeRemoved.getParent()).getNext() == nodeToBeRemoved){
            (nodeToBeRemoved.getParent()).setNext(replaceMent);
        }else {
            (nodeToBeRemoved.getParent()).setPrevious(replaceMent);
        }

    }

    //Help with removing node, will replace the node for removing with the next largest node
    private void replaceWithNextLargest(TreeNode nodeToBeRemoved, TreeNode current){


        if (current.getPrevious() == null) {
            nodeToBeRemoved.setComparableContent(current.getComparableContent());
            if (current.getParent() == nodeToBeRemoved) {
                (current.getParent()).setNext(current.getNext());
            } else {
                (current.getParent()).setPrevious(current.getNext());
            }
            //Clear out the current(Origin next largest)
            current.setNext(null);
            current.setComparableContent(null);
        } else {
            this.replaceWithNextLargest(nodeToBeRemoved, current.getPrevious());
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
}
