import java.util.Map;
import java.util.HashMap;
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
    public Map<String, Integer> getModelMap(){
        return this.modelMap;
    }

    //Setters
    public void setCarTree(CarTree newCarTree){
        this.carTree = newCarTree;
    }
    public void updateModelMap(String modelName, Boolean add){
        Integer originNumber = this.modelMap.get(modelName);
        if (originNumber != null){
            if (add){
                this.modelMap.put(modelName, originNumber + 1);
            }else {
                this.modelMap.put(modelName, originNumber - 1);
            }
        }else {
            this.modelMap.put(modelName, 1);
        }
    }

    //Statistic about specific model
    protected Map<String, Integer> modelMap = new HashMap<String, Integer>();



}
