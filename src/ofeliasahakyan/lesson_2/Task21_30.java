package src.ofeliasahakyan.lesson_2;

/**
 * Տրված են իրարից տարբեր a, b, c թվերը։ Կազմել ծրագիր, որը
 */
public class Task21_30 {
    public static void main(String[] args) {
        int a = 42;
        int b = 58;
        int c = 73;
        /**
         * (21) կարտածի տրված թվերից մեծի արժեքը։
         */
        if (a > b && a > c) {
            System.out.println(a);
        }
        if (b > a && b > c) {
            System.out.println(b);
        }
        if (c > a && c > b) {
            System.out.println(c);
        }
        /**
         * (22) կարտածի փոքրի արժեքը։
         */
        if (a < b && a < c) {
            System.out.println(a);
        }
        if (b < a && b < c) {
            System.out.println(b);
        }
        if (c < a && c < b) {
            System.out.println(c);
        }
        /**
         * (23) եթե տրված թվերից գոնե մեկը հավասար է 1, ապա կարտածի true, հակառակ դեպքում` false:
         */
        if (a == 1 || b == 1 || c == 1) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        /**
         * (24) եթե տրված թվերից երկուսը ճիշտ հավասար են 2, ապա կարտածի true, հակառակ դեպքում՝ false:
         */

        if (a == 2 && b == 2) {
            System.out.println("true");
        } else if (a == 2 && c == 2) {
            System.out.println("true");
        } else if (b == 2 && c == 2) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        /**
         * (25) եթե այդպիսի երկարություն ունեցող հատվածներով հնարավոր է կառուցել եռանկյունի, ապա կարտածի 'y=1',
         * հակառակ դեպքում՝ 'y=2' արտահայտությունը։
         */
        if (a + c > b && a + b > c && b + c > a) {
            System.out.println("y = 1");
        } else {
            System.out.println("y = 2");
        }
        /**
         * (26) կարտածի 1, եթե տրված թվերից գոնե մեկը զույգ է, այլապես՝ 2։
         */
        if (a % 2 == 0 || b % 2 == 0 || c % 2 == 0) {
            System.out.println(1);
        } else {
            System.out.println(2);
        }
        /**
         * (27) կարտածի true, տրված թվերը կազմում են թվաբանական պրոգրեսիա, հակառակ դեպքում՝ false:
         */
        if (b - a == c - b) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        /**
         * (28) կարտածի true, տրված թվերը կազմում են երկրաչափական պրոգրեսիա, հակառակ դեպքում՝ false:
         */
        if (b / a == c / b) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        /**
         * (29) տրված թվերը կարտածի ըստ աճման կարգի հաջորդականության։
         */
        if (a < b && a < c) {
            System.out.println(a);
        }
        if (b < a && b < c) {
            System.out.println(b);
        }
        if (c < a && c < b) {
            System.out.println(c);
        }
        if ((a > b && a < c) || (a < b && a > c)) {
            System.out.println(a);
        }
        if ((b > a && b < c) || (b < a && b > c)) {
            System.out.println(b);
        }
        if ((c > a && c < b) || (c < a && c > b)) {
            System.out.println(c);
        }
        if (a > b && a > c) {
            System.out.println(a);
        }
        if (b > a && b > c) {
            System.out.println(b);
        }
        if (c > a && c > b) {
            System.out.println(c);
        }
        /**
         * (30) տրված թվերը կարտածի ըստ նվազման կարգի հաջորդականության։
         */
        if (a > b && a > c) {
            System.out.println(a);
        }
        if (b > a && b > c) {
            System.out.println(b);
        }
        if (c > a && c > b) {
            System.out.println(c);
        }
        if ((a > b && a < c) || (a < b && a > c)) {
            System.out.println(a);
        }
        if ((b > a && b < c) || (b < a && b > c)) {
            System.out.println(b);
        }
        if ((c > a && c < b) || (c < a && c > b)) {
            System.out.println(c);
        }
        if (a < b && a < c) {
            System.out.println(a);
        }
        if (b < a && b < c) {
            System.out.println(b);
        }
        if (c < a && c < b) {
            System.out.println(c);
        }
    }
}