public class MakeTree extends Tree {

    //Override the display method to display the origin input name, not the lowercase one

    @Override
    public String display(TreeNode current) {
        String inOrderDetails = new String();
        if (current != null) {
            inOrderDetails += this.display(current.getPrevious());
            inOrderDetails += ((MakeNode)current).getMakeName() + "  ";
            inOrderDetails += this.display(current.getNext());
        }
        if (inOrderDetails.equals("")){
            inOrderDetails += "Currently there are no Make in the system!";
        }
        return inOrderDetails;

    }
}
