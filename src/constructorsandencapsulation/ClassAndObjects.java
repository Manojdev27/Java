package constructorsandencapsulation;

public class ClassAndObjects {
    public static void main(String[] args) {

        Wizards wizards = new Wizards(); // New Object
        wizards.firstName = "Harry";
        wizards.lastName = "Potter";
        wizards.age = 43;
        wizards.patronus = "Stag";
        System.out.println(wizards.firstName+" "+ wizards.lastName +" "+ "and his patronus is "+wizards.patronus);

        Wizards wizards1 = new Wizards();
        wizards1.firstName = "Hermione";
        wizards1.lastName = "Granger";
        wizards1.age = 44;
        wizards1.patronus = "otter";
        System.out.println(wizards1.firstName+" "+ wizards1.lastName +" "+ "and her patronus is "+wizards1.patronus);

        // If the object properties are not assigned with values, whether it is a string it will return null and int it returns 0.
        // by using constructor and setting a value, it will return the assigned default value in the constructor not return 0
        Wizards wizards2 = new Wizards();
        System.out.println(wizards2.firstName);// null
        System.out.println(wizards2.age);//0

        //accessing the method using object
        wizards.work();

        Employee employee2 = new Employee();
        employee2.id = 2;
        employee2.firstName = "Olivia";
        employee2.isPermanentEmployee = true;
        System.out.println(employee2.id);
        System.out.println(employee2.firstName);
        System.out.println(employee2.isPermanentEmployee);

        //passing values using constructor
        Employee employees = new Employee(1, "Gene","Godhand", true);
        System.out.println(employees.id);
        System.out.println(employees.firstName);

        Employee employee1 = new Employee(3,"Four", "Devas", 300, "Mikami", true);
        System.out.println(employee1.id);
        System.out.println(employee1.firstName);
        System.out.println(employee1.lastName);
        System.out.println(employee1.isPermanentEmployee);
        System.out.println(employee1.age);
        System.out.println(employee1.companyName);

        // using Setters to set values for the object.
        Employee employee3 = new Employee();
        employee3.setId(1);
        employee3.setFirstName("Gene");
        employee3.setLastName("Godhand");
        employee3.setAge(20);
        employee3.setPermanentEmployee(true);
        employee3.setCompanyName("Shinji Mikami");

        // using getters printing the values
        System.out.println(employee3.getId()+" "+ employee3.getFirstName()+" "+ employee3.getLastName()+" "+employee3.getAge()+" "+ employee3.getCompanyName()+" "+ employee3.isPermanentEmployee);
        employee3.work();// Calling the method using reference variable of the Constructors.Employee Object.
        new Employee().work();// Anonymous Object --> nameless or variable less object.


    }
}
