package Interfaces;

public class InterfaceTest {

    // An interface can only have abstract methods. It can support multiple inheritance.
    // the interface abstract methods can be implemented in a class
    // we can extend one interface in other interface. parent, child relationship.

    private static String name = "Harry";
    static {
        System.out.println("I am in a static block");
        System.out.println(name);
        name = "testing";
        System.out.println(name);
    }

    public static void main(String[] args) {
        System.out.println("main method");
    }
}
