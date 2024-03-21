public class Methods {
    //static methods
    static int add(int a, int b){
        return a+b;
    }
    // Method Overloading or compile time polymorphism.
    static int add(int a, int b, int c){
        return a+b+c;
    }
    static double add(double a, double b){

        return a+b;
    }


    public static void main(String[] args) {

        int a = 20;
        int x = 5;
        int y =10;
        double z = 20.34;
        double w = 25.445;

        System.out.println(add(15, 20, 25));
        System.out.println(add(15, 20));
        System.out.println(add(15.55,56.22));


        System.out.println(add(x,y));
        System.out.println(add(z,w));
        System.out.println(add(a,x,y));



    }
}
