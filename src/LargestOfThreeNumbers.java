public class LargestOfThreeNumbers {

    public static void main(String[] args) {

        int a = 25;
        int b =15;
        int c = 20;

        if((a >= b && a>=c)){
            System.out.println(a +" is the largest number");
        }else if(b>=c && b>=a){
            System.out.println(b +" is the largest number");
        }
        else{
            System.out.println(c+ "is the largest number");
        }

        //Array is a collection of similar data types
        int[] arr = {12,14,200,199,201,56,45};
        System.out.println(arr[3]);
    }


}
