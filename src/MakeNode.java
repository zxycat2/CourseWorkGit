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
    }

    //link to CarDetails
    private CarDetailTree carDetailTree;

    //Getters
    public CarDetailTree getCarDetailTree(){
        return this.carDetailTree;
    }

    //Setters
    public void setCarDetailTree(CarDetailTree newCarDetailTree){
        this.carDetailTree = newCarDetailTree;
    }

}
