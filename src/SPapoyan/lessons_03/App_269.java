package SPapoyan.lessons_03;

public class App_269 {
    public static void main (String []args) {
        int [] X = {1,2,3,4,5,6,7,8,9,10};
        int [] Y = {1,2,3,4,5,6,7,8,9,10};
        int sum = 0;
        for (int i = 2; i < X.length; i=i+2) {
                sum = sum + X[i];

            } System.out.println("X զանգվածի զույգ ինդեքս ունեցող տարրերի գումարը = "+ sum );
        int sum1 = 0;
        for (int k = 1; k < Y.length; k=k+2) {
                sum1 = sum1 +Y[k];
        } System.out.println("Y զանգվածի կենտ ինդեքս ունեցող տարրերի գումարը = "+ sum1 );
        System.out.println("Ընդհանուր գումարը = "+ (sum + sum1));
    }
}

