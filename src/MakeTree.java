import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MakeTree extends Tree {

    //Override the display method to display the origin input name, not the lowercase one

    @Override
    public String display(TreeNode current) {
        String inOrderDetails = "";
        if (current != null) {
            inOrderDetails += this.display(current.getPrevious());
            inOrderDetails += ((MakeNode)current).getMakeName() + "  ";
            inOrderDetails += this.display(current.getNext());
        }
        return inOrderDetails;
    }



    public String displayAllCars(){

        String returnString = "";

        List<TreeNode> allMakeNodesInOrder = this.getAllNodesInOrder(this.getTreeRoot());

        for (int index = 0; index < allMakeNodesInOrder.size(); index ++){
            returnString += ((MakeNode)(allMakeNodesInOrder.get(index))).getCarTree().display(((MakeNode)(allMakeNodesInOrder.get(index))).getCarTree().getTreeRoot());
        }

        if (returnString.equals("")){
            returnString += "Currently there are no cars in the system!";
        }

        return returnString;
    }

    public String displayCarFromOneMake(String makeName) throws NodeNotFoundException{
        MakeNode makeNode = (MakeNode)(this.find(makeName, this.getTreeRoot(), true));
        return makeNode.getCarTree().display(makeNode.getCarTree().getTreeRoot());
    }



    public Map<String, TreeNode> findCarFromAllMake(String carRegistrationNumber) throws NodeNotFoundException{
        List<TreeNode> allMakeNodesInOrder = this.getAllNodesInOrder(this.getTreeRoot());
        Map<String, TreeNode> map = new HashMap<>();
        for (int index = 0; index < allMakeNodesInOrder.size(); index ++){
            try {
                CarNode carNode = (CarNode)(((MakeNode)(allMakeNodesInOrder.get(index))).getCarTree().find(carRegistrationNumber, ((MakeNode)(allMakeNodesInOrder.get(index))).getCarTree().getTreeRoot(), false));
                map.put("CarNode", carNode);
                map.put("MakeNode", allMakeNodesInOrder.get(index));
                return map;
            }catch (NodeNotFoundException e){
            }
        }
        System.out.println("Car does not exist!");
        throw new NodeNotFoundException();
    }

    public void removeCar(String carRegistrationNumber){
        try {
            Map<String, TreeNode> map = this.findCarFromAllMake(carRegistrationNumber);
            MakeNode makeNode = (MakeNode)(map.get("MakeNode"));
            CarNode carNode = (CarNode)(map.get("CarNode"));
            makeNode.updateModelMap(carNode.getModel(), false);
            makeNode.getCarTree().remove(carRegistrationNumber, "Car", true);
            (makeNode.getCarTree()).balanceTheTree();
        }catch (NodeNotFoundException e){
            System.out.println("Removal did not conduct!");
        }
    }


}
