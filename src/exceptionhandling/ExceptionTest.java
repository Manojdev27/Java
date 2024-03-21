package exceptionhandling;

import java.util.Scanner;

public class ExceptionTest {
    public static void main(String[] args) throws InterruptedException {

            int a =5;
            int b=0;
//          unchecked Exceptions - runtime
        int[] c = {2,3};
        try{
            System.out.println(a/b); //java.lang.ArithmeticException
            System.out.println(c[2]);//java.lang.ArrayIndexOutOfBoundsException
        }
        catch (ArithmeticException e){
            System.out.println("Enter b value again. Don't enter 0");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the b again");
            int b1 = scanner.nextInt();
            System.out.println(a/b1);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("I am Array Index out of bounds exception");
        }

//        Thread.sleep(3000);// checked exception - compile time

    }


}
