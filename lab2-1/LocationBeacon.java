public class LocationBeacon {
    public int hours;
    public int minutes;
    public int distance;

    void heartBeat(int startHour, int startMinute, int startDistance, int speed, int duration){
        hours = startHour;
        minutes = startMinute;
        distance = startDistance;
        speed = (speed * 10)/60; // NEED TO SORT THIS SPEED THING OUT
        for(int i = 0; i < duration/10; i++){
            minutes += 10;
            if(minutes > 59){
                hours++;
                minutes %= 60;
                hours %=24;
            }
            distance += speed;

            System.out.println("["+hours+":"+minutes+"] Starman is "+distance+"km away from Earth");
        }
    }
}