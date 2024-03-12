public class SpaceStation {
    void dock(){
        System.out.println("Starman floats toward the space station and enters through the airlock");

    }
    void dock(String vehicle){
        System.out.println("Starman enters the large airlock, piloting " + vehicle);
    }
    void dock(String vehicle, String songName){
        dock(vehicle);
        System.out.println("... and the station cranks up " + songName + " on the entertainment system");
    }
}