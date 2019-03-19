public class CarTree extends Tree{

    //Override the display method so the car tree can display all the attributes of the car node
    @Override
    public String display(TreeNode current) {
        String inOrderDetails = "";
        if (current != null) {
            inOrderDetails += this.display(current.getPrevious());
            inOrderDetails += "Registration Number:" + ((CarNode)current).getRegistrationNumber() + ", "
                    + "Model:" + ((CarNode)current).getModel() + ", "
                    + "Color:" + ((CarNode)current).getColor()
                    + "\n";
            inOrderDetails += this.display(current.getNext());
        }
        return inOrderDetails;
    }
}
