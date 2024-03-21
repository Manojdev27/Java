package inheritance;

public abstract class Animal {// Abstraction
    int numberOfEars = 2;

    public Animal() {
        System.out.println("I am in Inheritance.Animal class constructor");
    }

    public final void eat(){
        System.out.println("eating");
    }
    public void run(){
        System.out.println("running");
    }

    public abstract  boolean isDomestic();
    public abstract void sleeping();
    }
