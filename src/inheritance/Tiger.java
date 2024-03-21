package inheritance;

public class Tiger extends WildAnimal{

    public void jump(){
        System.out.println("tiger is jumping");
    }

    @Override
    public void sleeping() {
        System.out.println("Inheritance.Tiger sleeps at night");
    }


//    @Override
//    public void eat() {
//        System.out.println("Tigers eat meat");
//    }




}
