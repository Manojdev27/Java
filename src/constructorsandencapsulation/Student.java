package constructorsandencapsulation;

public class Student {
    private String firstName;
    private int rollNo;
    private String email;

    public Student(String firstName, int rollNo){
        this.firstName = firstName;
        this.rollNo = rollNo;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setRollNo(int rollNo){
        this.rollNo = rollNo;
    }

    public int getRollNo(){
        return rollNo;
    }
    public void setEmail(String email){
        if(email.endsWith("@gmail.com")){
            this.email = email;
        }
        else{
            System.out.println("Provide a valid email id");
        }

    }
    public String getEmail(){
        if(email != null){
            return this.email;
        }
        else{
            return "The email is invalid";
        }

    }
}
