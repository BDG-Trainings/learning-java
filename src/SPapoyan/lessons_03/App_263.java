package SPapoyan.lessons_03;

public class App_263 {
    public static void main(String []args) {
        int[] X = {-1, 2, 3, 4, -5, -6, -7, 8, -9, 10};
        int[] Y = {1, 2, 3, 4, 5, -6, -7, -8, 9, 10};
        int sum = 0;
        int count = 0;
        for (int i = 0; i < X.length; i++) {
            if (X[i] > 0) {
                count++;
            }
        } System.out.println("X զանգվածի դրական տարրերի քանակը = " +count);
        int count1 = 0;
        for (int k = 0; k < Y.length; k++) {
            if (Y[k] > 0) {
                count1++;
            } sum = count+count1;
        }
        System.out.println("X զանգվածի դրական տարրերի քանակը = " +count1);
        System.out.println("X և Y զանգվածների դրական տարրերի քանակը = " +sum);
    }
}
