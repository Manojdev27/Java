public class VaragsTest {

public static int addWithVarArgs(int... a){
    int sum = 0;
    for (int i = 0; i < a.length; i++) {
        sum = sum+a[i];
    }
    return sum;
}


    public static void main(String[] args) {

        System.out.println(addWithVarArgs(1,2,3,89,984,588,664,255));
    }
}
