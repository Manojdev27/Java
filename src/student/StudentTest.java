package student;

public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "Harry";
        student.rollNo = 1;
        System.out.println("student.schoolName = " + student.schoolName);


        Student student1 = new Student();
        student1.name = "Hermione";
        student1.rollNo = 2;
        System.out.println("student1.rollNo = " + student1.rollNo + " "+"student1.rollNo = "+ student1.name + " "+"student.schoolName = " +student1.schoolName);
        Student.schoolName = "Beaubaxtons";
        System.out.println(Student.schoolName);

        //static variables are very useful for memory management, not specific to a particular object
        // bounded to class
        Student.changeSchoolName();
    }
}
