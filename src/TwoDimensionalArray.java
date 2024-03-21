public class TwoDimensionalArray {

    public static void main(String[] args) {
        int [] a = new int[3];
        int[] b = {3,5,6};
//        System.out.println(b[2]);

        int [][] c = new int[2][2];
        c[0][0] = 2;
        c[0][1] = 4;
        c[1][0] = 6;
        c[1][1] = 8;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println(c[i][j]);
            }
        }

        int [] [] d = new int[][]{
                {7,8,9},{1,2,3},{6,3,7}
        };

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(d[i][j]);
            }
        }

//        Object [][] e = new Object[][]
//        {
//                {1,"Harry"},{2, Potter}
//        };
    }
    
}
