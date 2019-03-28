import java.util.HashMap;
import java.util.Map;

public class DealershipTest {

    public static void main(String arg[]){
        //crete a new instance of the Dealership
        MakeTree makeTree = new MakeTree();
        Dealership dealership = new Dealership();
        dealership.setMakeTree(makeTree);

        //menu
        while (true){
            String menuString = "Welcome to the system, please enter your option here:\n" +
                    "1: Add a new make of cars\n" +
                    "2:Find if a make of cars exists in the system\n" +
                    "3:Remove the a make of cars from the system\n" +
                    "4:Display all the make of cars\n" +
                    "5:Add new car\n" +
                    "6:Remove car from the system\n" +
                    "7:Display car from one make\n" +
                    "8:Display all data in the system\n" +
                    "9:Display number of cars from a specific make and model\n" +
                    "0:Quit the system";
            System.out.println(menuString);
            int userInput = 99;
            try {
                userInput  = Input.getInteger("Your option:");
            }catch (NumberFormatException e){
                System.out.println("Invalid input! You can only input number here!");
                continue;
            }
            switch (userInput){
                case 1:
                    String userInputMakeName = Input.getString("Input the name of the make:");
                    MakeNode newMakeNode = new MakeNode(userInputMakeName);
                    try {
                        makeTree.insert(newMakeNode, true);
                        makeTree.balanceTheTree();
                    }catch (Tree.NodeAlreadyExistsException e){
                        System.out.println("Make already exists!");
                    }
                    break;
                case 2:
                    userInputMakeName = Input.getString("Input the name of the make:");
                    try{
                        makeTree.find(userInputMakeName.toLowerCase(), makeTree.getTreeRoot(), true);
                    }catch (Tree.NodeNotFoundException e){

                    }
                    break;
                case 3:
                    userInputMakeName = Input.getString("Input the name of the make:");
                    makeTree.remove(userInputMakeName.toLowerCase(), "Make", true);
                    makeTree.balanceTheTree();
                    break;
                case 4:
                    String allMake = makeTree.display(makeTree.getTreeRoot());
                    if (allMake == ""){
                        System.out.println("No Make To Show, the System is currently empty!");
                    }else {
                        System.out.println(allMake);
                    }
                    break;
                case 5:
                    userInputMakeName = Input.getString("Input the make of the car you want to add to:");
                    try{
                        MakeNode carToBeAddedsMake = (MakeNode) (makeTree.find(userInputMakeName.toLowerCase(), makeTree.getTreeRoot(), true));
                        String carRegistrationNumber = Input.getString("Car registration number:");
                        String carModel = Input.getString("Car model:");
                        String carColor = Input.getString("Car color:");

                        CarNode newCarNode = new CarNode(carRegistrationNumber, carModel, carColor);
                        try{
                            carToBeAddedsMake.updateModelMap(carModel, true);
                            carToBeAddedsMake.getCarTree().insert(newCarNode, true);
                            (carToBeAddedsMake.getCarTree()).balanceTheTree();
                        }catch (Tree.NodeAlreadyExistsException e){
                            System.out.println("Car already exists!");
                        }
                        break;

                    }catch (Tree.NodeNotFoundException e){
                        System.out.println("You can only add car to existing make!");
                        break;
                    }
                case 6:
                    String carRegistrationNumber = Input.getString("Input car registration number:");
                    makeTree.removeCar(carRegistrationNumber.toLowerCase());
                    break;
                case 7:
                    String inputMakeName = Input.getString("Input the make name:");
                    try {
                        String allCarWithTheInputMake = makeTree.displayCarFromOneMake(inputMakeName.toLowerCase());
                        if (allCarWithTheInputMake != ""){
                            System.out.println(allCarWithTheInputMake);
                        }else {
                            System.out.println("The input make currently dose not have any car!");
                        }
                        break;
                    }catch (Tree.NodeNotFoundException e){
                        System.out.println("Did not find make with the input name!");
                        break;
                    }
                case 8:
                    allMake = makeTree.display(makeTree.getTreeRoot());
                    System.out.println("All makes:");
                    if (allMake == ""){
                        System.out.println("No Make To Show, the System is currently empty!");
                    }else {
                        System.out.println(allMake);
                    }
                    System.out.println("All Cars:");
                    System.out.println(makeTree.displayAllCars());
                    break;

                case 9:
                    inputMakeName = Input.getString("Input the make name:");
                    try {
                        MakeNode makeNode = (MakeNode)(makeTree.find(inputMakeName, makeTree.getTreeRoot(), true));
                        String inputModel = Input.getString("Input the model:");
                        System.out.println("The number of car of that model and make:");
                        Integer number = makeNode.getModelMap().get(inputModel);
                        if (number == null){
                            number = 0;
                        }
                        System.out.println(number);
                        break;
                    }catch (Tree.NodeNotFoundException e){
                        System.out.println("Did not find make with the input name!");
                        break;
                    }

                case 0:
                    System.out.println("Are you sure you wanna quit? (Y/N):");
                    String confirmation = Input.getString("confirmation:");
                    if (confirmation.toLowerCase().equals("y")){
                        return;
                    }else {
                        continue;
                    }
                default:
                    System.out.println("Invalid option, please check your input!");
            }
        }
    }
}
