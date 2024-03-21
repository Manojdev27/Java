package student;

public class Student {

    public String name; // when each object have diff values - use non static variables
    public int rollNo;
    public static String schoolName = "Hogwarts";

    //constructors are menat to be used to initialize non static variables. eventhough you can able to instantiate, it is not a good practice.

    public static void changeSchoolName(){
        schoolName = "Hogsmeade";
    }
    //you cannot change the value for non static variable inside the static method.
}
