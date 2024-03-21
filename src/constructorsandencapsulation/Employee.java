package constructorsandencapsulation;

public class Employee {


    // Constructor does not have any explicit return type, but it is having an implicit return type of the current class object.
    public Employee(){
        age =18;
        companyName = "godhand";
    }
    public Employee(int id, String firstName, String lastName, int age, String companyName, boolean isPermanentEmployee) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.companyName = companyName;
        this.isPermanentEmployee = isPermanentEmployee;
    }

    public Employee(int param1, String param2, String param3, boolean param4){
        id = param1;
        firstName = param2;
        lastName = param3;
        isPermanentEmployee = param4;
    }
    public int id;
    public String firstName;
    public String lastName;
    public int age;
    public String companyName;
    public boolean isPermanentEmployee;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public boolean isPermanentEmployee() {
        return isPermanentEmployee;
    }

    public void setPermanentEmployee(boolean permanentEmployee) {
        isPermanentEmployee = permanentEmployee;
    }

    public void work(){
        System.out.println("9 hours");
    }

}
