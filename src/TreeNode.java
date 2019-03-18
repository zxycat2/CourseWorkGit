import jdk.nashorn.api.tree.Tree;

public class TreeNode {
    protected Comparable comparableContent;
    protected TreeNode previous;
    protected TreeNode next;

    protected TreeNode parent;

    //init
    public TreeNode(Comparable comparableContent){
        this.comparableContent = comparableContent;
    }

    //getters
    public Comparable getComparableContent(){
        return this.comparableContent;
    }
    public TreeNode getPrevious(){
        return this.previous;
    }
    public TreeNode getNext(){
        return this.next;
    }
    public TreeNode getParent(){ return this.parent; }

    //setters
    public void setComparableContent(Comparable newComparableContent){
        this.comparableContent = newComparableContent;
    }
    public void setPrevious(TreeNode newPrevious){
        this.previous = newPrevious;
    }
    public void setNext(TreeNode newNext){
        this.next = newNext;
    }
    public void setParent(TreeNode newParent){
        this.parent = newParent;
    }

}
