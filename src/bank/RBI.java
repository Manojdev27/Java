package bank;

public abstract class RBI{

    protected double rateOfInterest;

    public RBI(double rateOfInterest) {
        this.rateOfInterest = rateOfInterest;
    }

    public  void withDrawl(){
        System.out.println("I support withdrawl from bank");
    };

    public double getRateOfInterest() {
        return rateOfInterest;
    }

    public void setRateOfInterest(double rateOfInterest) {
        this.rateOfInterest = rateOfInterest;
    }

    public abstract void deposit();

}
