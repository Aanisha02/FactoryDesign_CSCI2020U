public class Aquarium implements Zoo{

    //This class implements the Zoo interface and inherits its abstract methods
    //This method will print out the "zoo description" as followed
    @Override
    public void zooDescription(String location, String animal){
        System.out.println("The " + location + " has many fish, like " + animal + ".");
    }
}
