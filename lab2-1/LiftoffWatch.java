public class LiftoffWatch {
    public double temperature;
    public String weather;
    public double wind;

    void setTemp(double temp){
        temperature = temp;
    }
    void setWeather(String state){
        weather = state;
    }
    void setWind(double speed){
        wind = speed;
    }
    boolean canWeLaunch() {
        if (temperature >= 16.5 && temperature <= 34.0) {
            if (weather == "Sunny" && wind <= 60) {
                return true;
            } else if (weather == "Cloudy" && wind <= 45) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;

        }
    }

}
