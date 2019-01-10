package SPapoyan.lessons_03;

public class App_265 {
    public static void main (String []args) {
        int [] X = {10,20,30,40,50};
        int [] Y = {1,2,3,4,1};
        int sum = 0;
        for (int i = 0; i< X.length; i++) {
            sum = sum + X[i];
        } System.out.println("X զանգվածի տարրերի գումարը = "+sum);
        int mult = 1;
        for (int k = 0; k< Y.length; k++) {
            if (mult>0) {
                mult = mult * Y[k];
            }
        } System.out.println("Y զանգվածի տարրերի արտադրյալը = "+mult);
        System.out.println("X զանգվածի տարրերի գումարի և Y զանգվածի տարրերի արտադրյալի հարաբերոթյունը = " + sum/mult);
    }
}
