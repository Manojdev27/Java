package constructorsandencapsulation;

public class Encapsulation {

    public static void main(String[] args) {

        Student student = new Student("gene", 20);
        student.setEmail("godhand27@gmail.com");
//        System.out.println(student.rollNo);
//        System.out.println(student.firstName);
        // Constructor is used for initializing the values
//      System.out.println(student.email);// while encapsulating the email field, we can use only use getters and setters to set and get the values
        System.out.println(student.getEmail());
    }
}
