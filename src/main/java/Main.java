import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);

        //create an object of the factory class to receive the appropriate subclass
        ZooFactory factory = new ZooFactory();

        //The first subclass instantiated is the 'Aquarium' class
        Zoo zoo1 = factory.getZoo(1);
        //The second subclass instantiated is the 'PettingZoo' class
        Zoo zoo2 = factory.getZoo(2);
        //The last subclass instantiated is the 'SafariPark' class
        Zoo zoo3 = factory.getZoo(3);

        System.out.println("--------Let's explore some zoos!--------");

        int choice = 4; //default initialization, will store user input

        //The program will keep running until user enters 0 to quit
        while(choice != 0) {
            System.out.println("\nChoose a zoo to check out:\n" +
                    "1. Aquarium \n2. Petting Zoo \n3. Safari Park \n4. Display all \n0. Quit");
            choice = user.nextInt();

            //The main class passes the information (location and animal) to the method
            //and returns the description of Aquarium if user presses (1)
            if(choice == 1)
            zoo1.zooDescription("aquarium", "clown fish");

            //The following information (location and animal) is passed to the method
            //and returns the description of Petting zoo if user chooses (2)
            if(choice == 2)
            zoo2.zooDescription("petting zoo", "llamas");

            //The following information (location and animal) is passed to the method
            //and returns the description of safari park if user chooses (3)
            if(choice == 3)
            zoo3.zooDescription("safari park", "lions");

            //User choosing (4) will result in all zoo description to be printed
            if(choice == 4){
                zoo1.zooDescription("aquarium", "clown fish");
                zoo2.zooDescription("petting zoo", "llamas");
                zoo3.zooDescription("safari park", "lions");
            }

            //for invalid choices
            if(choice > 4 || choice < 0)
                System.out.println("Please enter a valid number [0-4]");
        }
    }
}
