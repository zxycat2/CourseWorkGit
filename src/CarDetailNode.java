public class CarDetailNode extends TreeNode{
    public CarDetailNode (String registrationNumber, String model, String color, CarDetailNode previous, CarDetailNode next){
        super(registrationNumber);
        this.color = color;
        this.model = model;
    }

    private String model;
    private String color;
}
