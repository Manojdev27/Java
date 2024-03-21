package inheritance;

public class InheritanceTest {

    public static void main(String[] args) {

// Inheritance is acquiring the methods from the parent class. not only using for code reusablity, but also implies IS-A relationship.
// Object with parent reference type - liberty to create required child object at runtime.
//  method in the parent class --> don't want that behaviour --> child is implementing its own behaviour is called Method Overriding. it is also known as dynamic or runtime polymorphism.


        Tiger tiger = new Tiger();
        tiger.eat();// inherited methods
        tiger.run();// inherited methods
        tiger.jump();// specific method for tiger

        Lion lion = new Lion();
        lion.sleep();// specific method for lion
        lion.eat();// inherited methods
        lion.run();// inherited methods

        Animal lion2 = new Lion(); // object for the lion, reference type is now parent class
        System.out.println(lion2.numberOfEars);
        lion2.eat();// overridden method
        lion2.run();
        System.out.println(lion2.isDomestic());

        // Abstraction - overriding the incomplete methods of the parent class in the child class, and it is a form of data hiding
        Animal sheep = new Sheep();
        sheep.sleeping();
        System.out.println(sheep.isDomestic());

//        Inheritance.Animal lionAnimal = new Inheritance.Lion(); // upcasting --> implicitly
//        lionAnimal.sleeping();
//        lionAnimal.eat();
//        Inheritance.Lion lionType = (Inheritance.Lion)Inheritance.Lion;
//        lionType.roar();
//        ((Inheritance.Lion) lionAnimal).roar(); // downcasting


        // Multilevel Inheritance
        Dog dog = new Dog();
        System.out.println(dog.isDomestic());
        System.out.println(dog.numberOfEars);
        System.out.println("dog.numberOfEars = " + dog.numberOfEars);

        DomesticAnimal dog1 = new Dog();
        dog1.isDomestic();
        ((Dog) dog1).bark(); // downcasting

        Animal dog2 = new Dog();
        dog2.isDomestic();
        ((Dog) dog2).bark(); // Upcasting



    }
}
