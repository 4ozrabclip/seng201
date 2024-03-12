public class StarmanFixes {
    public double oneTurn;
    public double tightenAmount;


    void setOneTurn(double amount){
        oneTurn = amount;
    }
    double getTightenAmount(){
        return tightenAmount;
    }
    void tightenQuarter(){
        tightenAmount += (oneTurn*0.25);
        System.out.println("Starman tightens the nut one quarter of a turn");
    }
    void tightenHalf(){
        tightenQuarter();
        tightenQuarter();
        System.out.println("The nut has been tightened half a turn");
    }
    void tightenFull(){
        tightenHalf();
        tightenHalf();
        System.out.println("The nut has been tightened a full turn");
    }

}
