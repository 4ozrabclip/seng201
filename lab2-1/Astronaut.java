public class Astronaut {
    private String name = "Starman";
    private int age = 1;
    private String rocketShip = "Falcon Heavy";
    private String poweredBy = "Electricity";
    private boolean inSpace = true;

    public void printName(){
        System.out.println("Hello, my name is " + name);
    }
    public void printAge(){
        System.out.println("I am " + age + " years old");
    }
    public void printRocket(){
        System.out.println("My rocket is " + rocketShip + " and it is powered by " + poweredBy);
    }
    public boolean isInSpace(){ return inSpace;}

}
