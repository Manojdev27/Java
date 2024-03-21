import java.util.ArrayList;

public class Arrays {

    public static void main(String[] args) {

        //Array is a collection of similar data types
        //largest index is always 1 less than the length of the array
        //index always starts from 0
        //if you try to access numbers that is bound of index, ArrayIndexOutOfBoundsException

        int[] arr = {12,14,200,199,201,56,45,35,57,89,99};
        int length = arr.length-1;
        System.out.println(length);
//        arr[12] = 162; //ArrayIndexOutOfBoundsException
        System.out.println(arr[3]);
        System.out.println(arr.length);

        for (int i = 0; i <=10; i++) {
            System.out.println(arr[i]);
        }

        int[] a = {5,6,7,8,9};
        String[] b = {"Testing", "Java", "Selenium"};
        for (int i = 0; i <a.length; i++) {
            System.out.println(a[i]);
        }
        for (int i = 0; i <b.length ; i++) {
            System.out.println(b[i]);
        }



    }
}
