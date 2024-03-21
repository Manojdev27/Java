package inheritance;

public class Dog extends DomesticAnimal{
    public Dog() {
        System.out.println("I am in dog class constructor");
    }

    @Override
    public void sleeping() {

    }

    public void bark(){
        System.out.println("Barking Inheritance.Dog");
    }
}
