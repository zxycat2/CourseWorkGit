public class MakeNode extends TreeNode {

    private String makeName;

    //getters
    public String getMakeName(){
        return this.makeName;
    }
    //setters
    public void setMakeName(String newMakeName){
        this.makeName = newMakeName;
    }

    //Init
    public MakeNode(String makeName){
        //Cast the comparable content to lower case for the alphabetically sorting to work properly
        super(makeName.toLowerCase());
        this.makeName = makeName;
        //init the car tree
        this.carTree = new CarTree();
    }

    //link to CarDetails
    private CarTree carTree;

    //Getters
    public CarTree getCarTree(){
        return this.carTree;
    }

    //Setters
    public void setCarTree(CarTree newCarTree){
        this.carTree = newCarTree;
    }

}
