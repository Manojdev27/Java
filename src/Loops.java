public class Loops {
    public static void main(String[] args) {
        //Loops - initialization, condition, increment or decrement
        for(int i=1;i<=10;i++) {
            System.out.println(i);
        }

        for (int i=10;i>=0;i--){
            System.out.println(i);
        }
        for (int i=10;i>=0;i=i-2){
            System.out.println(i);
        }
//print only the odd numbers
        for (int i = 0; i < 15; i++) {
            if (i%2 == 1){
                System.out.print(i+ " ");
            }

        }

        //print all the numbers divisible by 2 and 3 --> from 1 to 200
        for (int i = 0; i <= 200; i++)
            if ((i % 2 == 0))
                if ((i % 3 == 0))
                    System.out.print(i + " ");

        System.out.println();
    }
}
