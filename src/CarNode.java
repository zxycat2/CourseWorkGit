public class CarNode extends TreeNode{
    public CarNode(String registrationNumber, String model, String color){
        super(registrationNumber.toLowerCase());
        this.color = color;
        this.model = model;
        this.registrationNumber = registrationNumber;
    }

    private String model;
    private String color;
    private String registrationNumber;



    //getters

    public String getModel() {
        return this.model;
    }
    public String getColor(){
        return this.color;
    }
    public String getRegistrationNumber(){
        return this.registrationNumber;
    }

    //setters

    public void setModel(String newModel){
        this.model = newModel;
    }
    public void setColor(String newColor){
        this.color = newColor;
    }
    public void setRegistrationNumber(String newRegistrationNumber){
        this.registrationNumber = newRegistrationNumber;
    }
}
