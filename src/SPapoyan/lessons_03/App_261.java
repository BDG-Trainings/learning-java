package SPapoyan.lessons_03;

public class App_261 {
    public static void main(String [] args) {
        double[] X = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        double[] Y = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        double sum = 0;
        double count = 0;
        for (int i = 0; i < X.length; i++) {
            sum = sum + X[i];
            count++;
        }
        System.out.println("X Զանգվածի միջին թվանականը = " + sum / count);
        double sum1 = 0;
        double count1 = 0;
        for (int k = 0; k < Y.length; k++) {
            sum1 = sum1 + Y[k];
            count1++;
        }
        System.out.println("Y Զանգվածի միջին թվանականը = " + sum1 / count1);
        System.out.println ("X և Y զանգվածների միջին թվաբանակնների արտադրյալը = " + (sum/count) * (sum1/count1));
    }
}

