package scanner;

import java.util.Scanner;

public class InputTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = scanner.nextInt();
        System.out.println("Enter the second number");
        int b = scanner.nextInt();
        System.out.print("The sum of a and b is: ");
        add(a,b);

        System.out.println("Enter your first Name:");
        String firstName = scanner.next();
        System.out.println(firstName);
        System.out.println("Enter your last Name:");
        String lastName = scanner.next();
        System.out.println(lastName);

        System.out.println("The name is: " +firstName + " "+ lastName);




    }
    public static void add(int a, int b){
        System.out.println(a+b);
    }
}
