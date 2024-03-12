import java.util.ArrayList;
import java.util.List;
public class GreenAlienTransporter {
    private int[] battery;
    private ArrayList<GreenAlien> passengers;
    private String name;

    public GreenAlienTransporter(String name){
        this.name = name; //transporter name

        passengers = new ArrayList<GreenAlien>(); //initialize passengers list

        //initialize batteries
        battery = new int[5];
        battery[1] = 100;
        battery[2] = 100;
        battery[3] = 100;
        battery[4] = 100;
    }
    public boolean addPassenger(GreenAlien alien){
        return !passengers.contains(alien) ? passengers.add(alien) : false;
    }
    public boolean removePassenger(GreenAlien alien){
        return passengers.remove(alien);
    }
    public String getPassengerNames(){
        String resultStr = "";
        for (int i = 0; i < passengers.size(); i++) {
            GreenAlien passenger = passengers.get(i);
            resultStr += passenger.getName();
            if (i != passengers.size() - 1) {
                resultStr += ", ";
            }
        }
        return resultStr;
    }
    public int countEyes(){
        int eyeSum = 0;
        for(GreenAlien passenger : passengers){
            eyeSum += passenger.getEyeCount();
        }
        return eyeSum;
    }
    public ArrayList<String> shoppingList(){
        ArrayList<String> list = new ArrayList<>();
        for (GreenAlien passenger : passengers) {
            list.add(passenger.getFavouriteCandy());
        }
        return list;
    }
    public String toString(){
        return "The passengers on " + name + " are: \n" + getPassengerNames() + "\nThe number of eyes on this transporter is: " + countEyes();
    }

    public boolean replaceCell(int cellNum){
        if(cellNum >=1 && cellNum <= 4){
            battery[cellNum] = 100;
            return true;
        }
        else{
            return false;
        }
    }
    public boolean travel(int lightYears){
        int total = getTotalCharge();
        int chargeRemaining = lightYears*10;
        if(total <= chargeRemaining){
            return false;
        }
        for(int b = 0; b < 4; b++){
            if(battery[b] <= chargeRemaining){
                chargeRemaining -= battery[b];
                battery[b] = 0;
            }
            else if(battery[b] >= chargeRemaining){
                battery[b] -= chargeRemaining;
            }
        }
        return true;

    }
    public int getCharge(int cellNum){
        if(cellNum >=1 && cellNum <= 4){
            return battery[cellNum];
        }
        else{
            return -1;
        }
    }
    public int getTotalCharge(){
        int total = 0;
        for(int i = 1; i <= 4; i++){
            total += battery[i];
        }
        return total;
    }
    public static void main(String[] args){

    }
}