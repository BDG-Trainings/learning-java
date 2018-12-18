package ArmenIskandaryan.Lesson_02;

public class Homework_02 {
    static int a = 4;
    static int b = 2;
    static int c = 1;
    static int d = 1;
    static int k = 200;
    static boolean t = false;

    static boolean example24() {
        if (a != 2) {
            if (b == 2 && c == 2) {
                t = true;
            }
        } else if (b != 2) {
            if (a == 2 && c == 2) {
                t = true;
            }
        } else if (c != 2) {
            if (a == 2 && b == 2) {
                t = true;
            }
        }
        System.out.println("t = " + t);
        return t;
    }

    static boolean example25() {
        if ((a + b <= c) || (a + c <= b) || (b + c <= a)) {
            t = false;
            System.out.println("y = 2");
        } else {
            t = true;
            System.out.println("y = 1");
        }
        return t;
    }

    static int example26() {
        if ((a % 2 == 0) || (b % 2 == 0) || (c % 2 == 0)) {
            return 1;
        }
        return 2;
    }

    static boolean example27() {
        if ((a - b == b - c) || (a - c == c - b) || (c - a == a - b) || (c - b == b - a)
                || (b - a == a - c) || (b - c == c - a)) {
            t = true;
        } else {
            t = false;
        }
        System.out.println("t = " + t);
        return t;
    }

    static int example31() {
        int max;
        int max1 = b;
        int max2 = d;
        if (a > b) {
            max1 = a;
        } else {
            max1 = b;
        }
        max = max1;
        if (c > d) {
            max2 = c;
        } else {
            max2 = d;
        }
        if (max2 > max) {
            max = max2;
        }
        return max;
    }

    static boolean example33() {
        t = false;
        if (a == 1) {
            t = true;
            return t;
        }
        if (b == 1) {
            t = true;
            return t;
        }
        if (c == 1) {
            t = true;
            return t;
        }
        if (d == 1) {
            t = true;
            return t;
        }
        return t;
    }

    static boolean example34() {
        t = false;
        if ((a + b == c + d) || (a + c == b + d) || (a + d == b + c)) {
            t = true;
        }
        return t;
    }

    static boolean example35() {
        t = false;
        if ((a == b + c + d) || (b == a + c + d) || (c == a + b + d) || (d == a + b + c)) {
            t = true;
        }
        return t;
    }

    static boolean example36() {
        int i = 0;
        if (a % 2 == 1) {
            i++;
        }
        if (b % 2 == 1) {
            i++;
        }
        if (c % 2 == 1) {
            i++;
        }
        if (d % 2 == 1) {
            i++;
        }
        if (i >= 2) {
            System.out.println("1");
            t = true;
        } else {
            System.out.println("2");
            t = false;
        }
        return t;
    }

    static boolean example61() {
        t = false;
        int number = 7896;
        int miavor = number % 10;
        System.out.println("miavor = " + miavor);
        int tasnavor = (number / 10) % 10;
        System.out.println("tasnavor = " + tasnavor);
        int haryuravor = (number / 100) % 10;
        System.out.println("haryuravor = " + haryuravor);
        int hazaravor = (number /1000) % 10;
        System.out.println("hazaravor = " + hazaravor);
        if (miavor + tasnavor == haryuravor + hazaravor) {
            t = true;
        }
        System.out.println(t);
        return t;
    }

    public static void main(String[] args) {
        example61();
    }
}