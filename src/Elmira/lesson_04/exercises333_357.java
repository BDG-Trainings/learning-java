package src.Elmira.lesson_04;

import java.util.Arrays;

/**
 **  Տրված են  n բնական թիվը և n տարրեր պարունակող X միաչափ զանգվածը:
 **  Կազմել տրված խնդիրների լուծման բլոկ սխեման ու ծրագիրը,
 *   որի կհաշվեն և կտպեն
 * */
public class exercises333_357 {

    public static void main(String[] args) {
        /*
         *   N 333
         *   զանգվածի այն (բացառությամբ առաջին և վերջին) տարրերի գումարը,
         *   որոնց նախորդ և հաջորդ տարրերի գումարը փոքր է տված k թվից
         */
        int X1[] = {8, 3, 7, 2, -5, -4, 8, 0, 7};
        int k = 3;
        int sum = 0;
        for (int i = 1; i < X1.length-1 ; i++) {
            if( X1[i-1]+X1[i+1] < k ){
                sum += X1[i];
            }
        }
        System.out.println("N 333: " + sum);


        /*
         *   N 334
         *   զանգվածի դրական տարրերի գումարը, եթե զանգվածի առաջին մեծագույն տարրի համարը մեծ չէ n/2-ից,
         *   հակառակ դեպքում բացասական տարրերի արտադրյալը
         */
        int X2[] = {8, 3, 7, 2, -5, -4, 8, 0, 7};
        int firstMaxElIndex = 0;
        for (int i = 0; i < X2.length; i++) {
            if (i > firstMaxElIndex){
                firstMaxElIndex = i;
                break;
            }
        }

        int s = 0;
        int p = 1;
        if (firstMaxElIndex < X2.length/2 ){
            for (int i = 0; i < X2.length ; i++) {
                if(X2[i] > 0){
                    s += X2[i];
                }
            }
            System.out.println("N 334: Sum="+s);
        }else {
            for (int i = 0; i < X2.length ; i++) {
                if(X2[i]  < 0){
                    p *= X2[i];
                }
            }
            System.out.println("N 334: Mult="+p);
        }


        /*
         *   N 335
         *   զանգվածի այն (բացառությամբ առաջին և վերջին) տարրի համարը և արժեքը,
         *   որի նախորդ և հաջորդ տարրերի արժեքների գոմարը ամենամեծն է նման եղանակով ստացվող բոլոր հնարավորներից:
         *   Ենթադրվում է որ զանգվածում կա միայն մեկ այդպիսի տարր
         */

        /*
         *   N 336
         *   զանգվածի մեծագույն տարրը, եթե զանգվածը պարունակում է գոնե մեկ բացասական տարր,
         *   հակառակ դեպքում տպել s=0
         */
    }



}