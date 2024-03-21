package bank;

public class SBIBank extends RBI {

    public SBIBank(double roi){
//        super.rateOfInterest = roi;
        super(roi);
    }

    @Override
    public void withDrawl() {
        super.withDrawl();
        System.out.println("please withdraw from ATM");
    }

    @Override
    public void deposit() {
        System.out.println("please deposit in ATM");
    }
}
