package bank;

public class BankTest {
    public static void main(String[] args) {
        SBIBank sbiBank = new SBIBank(6.25);
        sbiBank.setRateOfInterest(8.0);
//        System.out.println("sbiBank.getRateOfInterest() = " + sbiBank.getRateOfInterest());
        System.out.println("sbiBank.rateOfInterest = " + sbiBank.rateOfInterest);
        sbiBank.withDrawl();

        // access modifiers
//        private - it can be accessed within the class
//        public - it can be accessed by any class
//        protected - it can be accessed only by the class and its child classes

    }


    }
