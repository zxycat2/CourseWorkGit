import java.util.HashMap;
import java.util.Map;

public class DealershipTest {

    public static void main(String arg[]){
        //crete a new instance of the Dealership
        MakeTree makeTree = new MakeTree();
        Dealership dealership = new Dealership();
        dealership.setMakeTree(makeTree);



        //test
//        Map<String, Integer> modelMap = new HashMap<String, Integer>();
//        System.out.println(modelMap.get("?"));
//        try {
//            makeTree.insert(new MakeNode("F"), true);
//            makeTree.insert(new MakeNode("I"), true);
//            makeTree.insert(new MakeNode("c"), true);
//            makeTree.insert(new MakeNode("G"), true);
//            makeTree.insert(new MakeNode("h"), true);
//            makeTree.insert(new MakeNode("J"), true);
//            makeTree.insert(new MakeNode("B"), true);
//            makeTree.insert(new MakeNode("a"), true);
//            makeTree.insert(new MakeNode("D"), true);
//            makeTree.insert(new MakeNode("E"), true);
//            makeTree.insert(new MakeNode("Z"), true);
//            makeTree.insert(new MakeNode("x"), true);
//            makeTree.insert(new MakeNode("Y"), true);
//            makeTree.insert(new MakeNode("M"), true);
//            makeTree.balanceTheTree();
//            System.out.println(makeTree.getTreeRoot().getComparableContent());
//        }catch (Tree.NodeAlreadyExistsException e){
//            System.out.println("Make already exists!");
//        }
//
//
//        try {
//            MakeNode carToBeAddedsMake = (MakeNode) (makeTree.find("a", makeTree.getTreeRoot(), true));
//            CarNode newCarNode = new CarNode("a6", "a6", "a6");
//            try{
//                carToBeAddedsMake.updateModelMap("a6", true);
//                carToBeAddedsMake.getCarTree().insert(newCarNode, true);
//            }catch (Tree.NodeAlreadyExistsException e){
//            }
//            newCarNode = new CarNode("a9", "a99", "a9");try{
//                carToBeAddedsMake.updateModelMap("a99", true);
//                carToBeAddedsMake.getCarTree().insert(newCarNode, true);
//            }catch (Tree.NodeAlreadyExistsException e){
//            }
//            newCarNode = new CarNode("a3", "a99", "a3");try{
//                carToBeAddedsMake.updateModelMap("a99", true);
//                carToBeAddedsMake.getCarTree().insert(newCarNode, true);
//            }catch (Tree.NodeAlreadyExistsException e){
//            }
//            newCarNode = new CarNode("a7", "a99", "a7");try{
//                carToBeAddedsMake.updateModelMap("a99", true);
//                carToBeAddedsMake.getCarTree().insert(newCarNode, true);
//            }catch (Tree.NodeAlreadyExistsException e){
//            }
//            newCarNode = new CarNode("a8", "a99", "a8");try{
//                carToBeAddedsMake.updateModelMap("a99", true);
//                carToBeAddedsMake.getCarTree().insert(newCarNode, true);
//            }catch (Tree.NodeAlreadyExistsException e){
//            }
//            newCarNode = new CarNode("a10", "a10", "a10");try{
//                carToBeAddedsMake.updateModelMap("a10", true);
//                carToBeAddedsMake.getCarTree().insert(newCarNode, true);
//            }catch (Tree.NodeAlreadyExistsException e){
//            }
//            newCarNode = new CarNode("a2", "a2", "a2");try{
//                carToBeAddedsMake.updateModelMap("a2", true);
//                carToBeAddedsMake.getCarTree().insert(newCarNode, true);
//            }catch (Tree.NodeAlreadyExistsException e){
//            }
//            newCarNode = new CarNode("a1", "a1", "a1");try{
//                carToBeAddedsMake.updateModelMap("a1", true);
//                carToBeAddedsMake.getCarTree().insert(newCarNode, true);
//            }catch (Tree.NodeAlreadyExistsException e){
//            }
//            newCarNode = new CarNode("a4", "a4", "a4");try{
//                carToBeAddedsMake.updateModelMap("a4", true);
//                carToBeAddedsMake.getCarTree().insert(newCarNode, true);
//            }catch (Tree.NodeAlreadyExistsException e){
//            }
//            newCarNode = new CarNode("a5", "a5", "a5");try{
//                carToBeAddedsMake.updateModelMap("a5", true);
//                carToBeAddedsMake.getCarTree().insert(newCarNode, true);
//            }catch (Tree.NodeAlreadyExistsException e){
//            }
//
//            carToBeAddedsMake = (MakeNode) (makeTree.find("b", makeTree.getTreeRoot(), true));
//            newCarNode = new CarNode("b6", "b99", "b6");
//            try{
//                carToBeAddedsMake.updateModelMap("b99", true);
//                carToBeAddedsMake.getCarTree().insert(newCarNode, true);
//            }catch (Tree.NodeAlreadyExistsException e){
//            }
//            newCarNode = new CarNode("b9", "b99", "b9");try{
//                carToBeAddedsMake.updateModelMap("b99", true);
//                carToBeAddedsMake.getCarTree().insert(newCarNode, true);
//            }catch (Tree.NodeAlreadyExistsException e){
//            }
//            newCarNode = new CarNode("b3", "b99", "b3");try{
//                carToBeAddedsMake.updateModelMap("b99", true);
//                carToBeAddedsMake.getCarTree().insert(newCarNode, true);
//            }catch (Tree.NodeAlreadyExistsException e){
//            }
//            newCarNode = new CarNode("b7", "b99", "b7");try{
//                carToBeAddedsMake.updateModelMap("b99", true);
//                carToBeAddedsMake.getCarTree().insert(newCarNode, true);
//            }catch (Tree.NodeAlreadyExistsException e){
//            }
//            newCarNode = new CarNode("b8", "b8", "b8");try{
//                carToBeAddedsMake.updateModelMap("b8", true);
//                carToBeAddedsMake.getCarTree().insert(newCarNode, true);
//            }catch (Tree.NodeAlreadyExistsException e){
//            }
//            newCarNode = new CarNode("b10", "b99", "b10");try{
//                carToBeAddedsMake.updateModelMap("b99", true);
//                carToBeAddedsMake.getCarTree().insert(newCarNode, true);
//            }catch (Tree.NodeAlreadyExistsException e){
//            }
//            newCarNode = new CarNode("b2", "b2", "b2");try{
//                carToBeAddedsMake.updateModelMap("b2", true);
//                carToBeAddedsMake.getCarTree().insert(newCarNode, true);
//            }catch (Tree.NodeAlreadyExistsException e){
//            }
//            newCarNode = new CarNode("b1", "b1", "b1");try{
//                carToBeAddedsMake.updateModelMap("b1", true);
//                carToBeAddedsMake.getCarTree().insert(newCarNode, true);
//            }catch (Tree.NodeAlreadyExistsException e){
//            }
//            newCarNode = new CarNode("b4", "b4", "b4");try{
//                carToBeAddedsMake.getCarTree().insert(newCarNode, true);
//            }catch (Tree.NodeAlreadyExistsException e){
//            }
//            newCarNode = new CarNode("b5", "b5", "b5");try{
//                carToBeAddedsMake.getCarTree().insert(newCarNode, true);
//            }catch (Tree.NodeAlreadyExistsException e){
//            }
//
//            carToBeAddedsMake = (MakeNode) (makeTree.find("c", makeTree.getTreeRoot(), true));
//            newCarNode = new CarNode("c6", "c6", "c6");
//            try{
//                carToBeAddedsMake.getCarTree().insert(newCarNode, true);
//            }catch (Tree.NodeAlreadyExistsException e){
//            }
//            newCarNode = new CarNode("c9", "c9", "c9");try{
//                carToBeAddedsMake.getCarTree().insert(newCarNode, true);
//            }catch (Tree.NodeAlreadyExistsException e){
//            }
//            newCarNode = new CarNode("c3", "c3", "c3");try{
//                carToBeAddedsMake.getCarTree().insert(newCarNode, true);
//            }catch (Tree.NodeAlreadyExistsException e){
//            }
//            newCarNode = new CarNode("c7", "c7", "c7");try{
//                carToBeAddedsMake.getCarTree().insert(newCarNode, true);
//            }catch (Tree.NodeAlreadyExistsException e){
//            }
//            newCarNode = new CarNode("c8", "c8", "c8");try{
//                carToBeAddedsMake.getCarTree().insert(newCarNode, true);
//            }catch (Tree.NodeAlreadyExistsException e){
//            }
//            newCarNode = new CarNode("c10", "c10", "c10");try{
//                carToBeAddedsMake.getCarTree().insert(newCarNode, true);
//            }catch (Tree.NodeAlreadyExistsException e){
//            }
//            newCarNode = new CarNode("c2", "c2", "c2");try{
//                carToBeAddedsMake.getCarTree().insert(newCarNode, true);
//            }catch (Tree.NodeAlreadyExistsException e){
//            }
//            newCarNode = new CarNode("c1", "c1", "c1");try{
//                carToBeAddedsMake.getCarTree().insert(newCarNode, true);
//            }catch (Tree.NodeAlreadyExistsException e){
//            }
//            newCarNode = new CarNode("c4", "c4", "c4");try{
//                carToBeAddedsMake.getCarTree().insert(newCarNode, true);
//            }catch (Tree.NodeAlreadyExistsException e){
//            }
//            newCarNode = new CarNode("c5", "c5", "c5");try{
//                carToBeAddedsMake.getCarTree().insert(newCarNode, true);
//            }catch (Tree.NodeAlreadyExistsException e){
//            }
//
//            carToBeAddedsMake = (MakeNode) (makeTree.find("f", makeTree.getTreeRoot(), true));
//            newCarNode = new CarNode("f6", "f6", "f6");
//            try{
//                carToBeAddedsMake.getCarTree().insert(newCarNode, true);
//            }catch (Tree.NodeAlreadyExistsException e){
//            }
//            newCarNode = new CarNode("f9", "f9", "f9");try{
//                carToBeAddedsMake.getCarTree().insert(newCarNode, true);
//            }catch (Tree.NodeAlreadyExistsException e){
//            }
//            newCarNode = new CarNode("f3", "f3", "f3");try{
//                carToBeAddedsMake.getCarTree().insert(newCarNode, true);
//            }catch (Tree.NodeAlreadyExistsException e){
//            }
//            newCarNode = new CarNode("f7", "f7", "f7");try{
//                carToBeAddedsMake.getCarTree().insert(newCarNode, true);
//            }catch (Tree.NodeAlreadyExistsException e){
//            }
//            newCarNode = new CarNode("f8", "f8", "f8");try{
//                carToBeAddedsMake.getCarTree().insert(newCarNode, true);
//            }catch (Tree.NodeAlreadyExistsException e){
//            }
//            newCarNode = new CarNode("f10", "f10", "f10");try{
//                carToBeAddedsMake.getCarTree().insert(newCarNode, true);
//            }catch (Tree.NodeAlreadyExistsException e){
//            }
//            newCarNode = new CarNode("f2", "f2", "f2");try{
//                carToBeAddedsMake.getCarTree().insert(newCarNode, true);
//            }catch (Tree.NodeAlreadyExistsException e){
//            }
//            newCarNode = new CarNode("f1", "f1", "f1");try{
//                carToBeAddedsMake.getCarTree().insert(newCarNode, true);
//            }catch (Tree.NodeAlreadyExistsException e){
//            }
//            newCarNode = new CarNode("f4", "f4", "f4");try{
//                carToBeAddedsMake.getCarTree().insert(newCarNode, true);
//            }catch (Tree.NodeAlreadyExistsException e){
//            }
//            newCarNode = new CarNode("f5", "f5", "f5");try{
//                carToBeAddedsMake.getCarTree().insert(newCarNode, true);
//            }catch (Tree.NodeAlreadyExistsException e){
//            }
//
//            carToBeAddedsMake = (MakeNode) (makeTree.find("i", makeTree.getTreeRoot(), true));
//            newCarNode = new CarNode("i6", "i6", "i6");
//            try{
//                carToBeAddedsMake.getCarTree().insert(newCarNode, true);
//            }catch (Tree.NodeAlreadyExistsException e){
//            }
//            newCarNode = new CarNode("i9", "i9", "i9");try{
//                carToBeAddedsMake.getCarTree().insert(newCarNode, true);
//            }catch (Tree.NodeAlreadyExistsException e){
//            }
//            newCarNode = new CarNode("i3", "i3", "i3");try{
//                carToBeAddedsMake.getCarTree().insert(newCarNode, true);
//            }catch (Tree.NodeAlreadyExistsException e){
//            }
//            newCarNode = new CarNode("i7", "i7", "i7");try{
//                carToBeAddedsMake.getCarTree().insert(newCarNode, true);
//            }catch (Tree.NodeAlreadyExistsException e){
//            }
//            newCarNode = new CarNode("i8", "i8", "i8");try{
//                carToBeAddedsMake.getCarTree().insert(newCarNode, true);
//            }catch (Tree.NodeAlreadyExistsException e){
//            }
//            newCarNode = new CarNode("i10", "i10", "i10");try{
//                carToBeAddedsMake.getCarTree().insert(newCarNode, true);
//            }catch (Tree.NodeAlreadyExistsException e){
//            }
//            newCarNode = new CarNode("i2", "i2", "i2");try{
//                carToBeAddedsMake.getCarTree().insert(newCarNode, true);
//            }catch (Tree.NodeAlreadyExistsException e){
//            }
//            newCarNode = new CarNode("i1", "i1", "i1");try{
//                carToBeAddedsMake.getCarTree().insert(newCarNode, true);
//            }catch (Tree.NodeAlreadyExistsException e){
//            }
//            newCarNode = new CarNode("i4", "i4", "i4");try{
//                carToBeAddedsMake.getCarTree().insert(newCarNode, true);
//            }catch (Tree.NodeAlreadyExistsException e){
//            }
//            newCarNode = new CarNode("i5", "i5", "i5");try{
//                carToBeAddedsMake.getCarTree().insert(newCarNode, true);
//            }catch (Tree.NodeAlreadyExistsException e){
//            }
//
//
//        }catch (Tree.NodeNotFoundException e){
//
//        }
        //end of test

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
                        makeTree.find(userInputMakeName, makeTree.getTreeRoot(), true);
                    }catch (Tree.NodeNotFoundException e){

                    }
                    break;
                case 3:
                    userInputMakeName = Input.getString("Input the name of the make:");
                    makeTree.remove(userInputMakeName, "Make", true);
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
                    makeTree.removeCar(carRegistrationNumber);
                    break;
                case 7:
                    String inputMakeName = Input.getString("Input the make name:");
                    try {
                        String allCarWithTheInputMake = makeTree.displayCarFromOneMake(inputMakeName);
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
