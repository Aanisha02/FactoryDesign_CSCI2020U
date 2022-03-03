import java.sql.SQLOutput;

public class ZooFactory {

    //receives a number from main method and returns the class that corresponds with the integer
    public Zoo getZoo(int select){

        //switch statement will return the type of zoo based on the input
        switch(select){
            case 1:
                return new Aquarium(); //Aquarium description
            case 2:
                return new PettingZoo(); //Petting zoo description
            case 3:
                return new SafariPark(); //Safari park description
        }
        return null; //default return
    }


}
