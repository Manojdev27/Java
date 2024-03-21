package inheritance;

public abstract class DomesticAnimal extends Animal {
    public DomesticAnimal() {
        System.out.println("I am in Inheritance.DomesticAnimal Constructor");
    }

    @Override
    public boolean isDomestic() {
        return true;
    }

    public abstract void sleeping();

//    @Override
//    public void eat() {
//        System.out.println("This dog eat a lot");
//    }
}
