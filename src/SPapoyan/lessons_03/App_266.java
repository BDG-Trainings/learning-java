package SPapoyan.lessons_03;

public class App_266 {
    public static void main (String []args) {
        int [] X = {1,2,3,4,5};
        int [] Y = {1,2,3,4,5};
        int sum = 0;
        for (int i = 0; i< X.length; i++) {
            if (X[i]% 2 != 0) {
                sum = sum + X[i];
            }
        } System.out.println("X զանգվածի կենտ արժեք ունեցող տարրերի գումարը = "+sum);
        int sum1 = 0;
        for (int k = 0; k< Y.length; k++) {
            if (Y[k]%2 == 0) {
                sum1 = sum1 + Y[k];
            }
        } System.out.println("Y զանգվածի զույգ արժեք ունեցող տարրերի գումարը = " +sum1);
        System.out.println("X զանգվածի կենտ արժեք ունեցող տարրերի գումարի և " +
                "Y զանգվածի զույգ արժեք ունեցող տարրերի գումարի տարբերությունը = " +(sum-sum1));
    }
}