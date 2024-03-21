package inheritance;

public class Lion extends WildAnimal{
    // Child class for Inheritance.Animal parent class

    public void sleep(){
        System.out.println("Inheritance.Lion is sleeping");
    }

    @Override
    public void sleeping() {
        System.out.println("Inheritance.Lion will sleep in the day");
    }


//    @Override
//    public void eat() {
//        System.out.println("Lions eat meat");
//    }




}
