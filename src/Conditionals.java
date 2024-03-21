public class Conditionals {

    public static void main(String[] args) {
        // Conditionals - if, if else and else if statements
        int a = 6; // variable
        int b = 5;
        int c = 12;
        int e = 15;
//if b is equal to 5, then perform addition of c and e. if b is equal to 10, then perform addition of b and e.
// if b is equal to 15 then perform subtraction of b and e. if a is neither 5 nor 10 then perform multiplication of c and e

        if(b == 5 && c==10 && e==15){
            System.out.println(c+e);
        }
        else if(b == 10 || c==10 || e==16 ){
            System.out.println("The Addition of c and e"+ (c*e));
        }else if(b == 15){
            System.out.println("The subtraction of b and e" + (b-e));
        }
        else{
            System.out.println(c*e);
        }

        //Assigning variable by using BODMAS rule
        int f = (5+a)*(b*2);
        System.out.println(f);

    }
}
