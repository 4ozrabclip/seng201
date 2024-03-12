public class StarmanSummits { //need to finish this

    void climbMountain(double height, double dash, double slide){
        int attempts = 0;
        double increase = dash - slide;



        while(height > 0){
            attempts++;
            height -= dash;
            if(height > 0){
                height += slide;
            }
        }
        System.out.println("Starman needs to dash " + attempts + " times before he reaches the top of the mountain");

    }
    public static void main(String[] args){

        StarmanSummits starman = new StarmanSummits();
        starman.climbMountain(10, 2, 1); //attempts is 9 which is correct

        starman.climbMountain(123456, 54.7, 2.8); //attempts is 2378.  supposed to be 2379

        starman.climbMountain(21287.4, 16.4, 4.3); //attempts is 1759 which is correct


    }
}