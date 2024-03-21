package constructorsandencapsulation;

public class Wizards {

    // Default Constructor
    public Wizards()// Constructor - helps to construct the object
    {
        age = 17;
    }

    //Parametrized Constructor
    public Wizards(String firstName, String lastName, int age, String patronus) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.patronus = patronus;
    }

    public void work(){
        System.out.println("9 hours");
    }
    public String firstName;
    public String lastName;
    public int age;
    public String patronus;

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

    public String getPatronus() {
        return patronus;
    }

    public void setPatronus(String patronus) {
        this.patronus = patronus;
    }
}
