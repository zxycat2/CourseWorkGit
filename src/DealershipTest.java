
public class DealershipTest {
    public static void main(String arg[]){
        //crete a new instance of the Dealership
        MakeTree makeTree = new MakeTree();
        Dealership dealership = new Dealership();
        dealership.setMakeTree(makeTree);


        //test
//        try {
//            makeTree.insert(new MakeNode("F"));
//            makeTree.insert(new MakeNode("I"));
//            makeTree.insert(new MakeNode("c"));
//            makeTree.insert(new MakeNode("G"));
//            makeTree.insert(new MakeNode("h"));
//            makeTree.insert(new MakeNode("J"));
//            makeTree.insert(new MakeNode("B"));
//            makeTree.insert(new MakeNode("a"));
//            makeTree.insert(new MakeNode("D"));
//            makeTree.insert(new MakeNode("E"));
//
//        }catch (Tree.NodeAlreadyExistsException e){
//            System.out.println("Make already exists!");
//        }
        //end of test

        //menu
        while (true){
            String menuString = "Welcome to the system, please enter your option here:\n" +
                    "1: Add a new make of cars\n" +
                    "2:Find if a make of cars exists in the system\n" +
                    "3:Remove the a make of cars from the system\n" +
                    "4:Display all the make of cars\n" +
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
                        makeTree.insert(newMakeNode);
                    }catch (Tree.NodeAlreadyExistsException e){
                        System.out.println("Make already exists!");
                    }
                    break;
                case 2:
                    userInputMakeName = Input.getString("Input the name of the make:");
                    makeTree.find(userInputMakeName, makeTree.getTreeRoot());
                    break;
                case 3:
                    userInputMakeName = Input.getString("Input the name of the make:");
                    makeTree.remove(userInputMakeName);
                    break;
                case 4:
                    String allMake = makeTree.display(makeTree.getTreeRoot());
                    if (allMake == ""){
                        System.out.println("No Make To Show, the System is currently empty!");
                    }else {
                        System.out.println(allMake);
                    }
                    break;
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
