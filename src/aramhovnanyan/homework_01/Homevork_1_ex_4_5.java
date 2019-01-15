package aramhovnanyan.homework_01;

public class Homevork_1_ex_4_5 {

    /*
Տրված են a, b եվ c թվերը
4 - Կազմել ծրագիր որը  կարտածի մեծագույնի արժեքը:
5 - Կազմել ծրագիր որը  կարտածի փոքրագույնի արժեքը:
 */

    public static void main(String[] args) {

        int a = 24;
        int b = 27;
        int c = 23;



        //exercise 4
        if (a > b) {
            if (a > c) {
                System.out.println("The greatest value" + " " + a);
            } else {
                if (c > b) {
                    System.out.println("The greatest value" + " " +  c);
                }
            }
        } else {
            if (b > c) {
                System.out.println("The greatest value" + " " +  b);
            } else {
                System.out.println("The greatest value" + " " +  c);
            }
        }


        //exercise 5
        if (a < b) {
            if (a < c) {
                System.out.println("The smallest value" + " " +  a);
            } else {
                if (c < b) {
                    System.out.println("The smallest value" + " " +  c);
                }
            }
        } else {
            if (b < c) {
                System.out.println("The smallest value" + " " +  b);
            } else {
                System.out.println("The smallest value" + " " +  c);
            }
        }




    }



}
