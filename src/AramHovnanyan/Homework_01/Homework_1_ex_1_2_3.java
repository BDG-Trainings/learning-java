package AramHovnanyan.Homework_01;

public class Homework_1_ex_1_2_3 {
    /*
Տրված են a եվ b թվերը
1 - Կազմել ծրագիր որը t տրամաբանական տիպի փոփոխականին կվերագրի ture արժեքը եթե a հավասար է b ին հակառակ դեպքում false: Արտածել t-ի արժեքը:
2 - Կազմել ծրագիր որը t տրամաբանական տիպի փոփոխականին կվերագրի ture արժեքը եթե a մեծ է  b ից հակառակ դեպքում false: Արտածել t-ի արժեքը:
3 - Կազմել ծրագիր որը t տրամաբանական տիպի փոփոխականին կվերագրի ture արժեքը եթե a փոքր է  b ից հակառակ դեպքում false: Արտածել t-ի արժեքը:
 */

    public static void main(String[] args) {

        boolean t = false;
        boolean t1 = false;
        boolean t2 = false;


        int a = 10;
        int b = 20;

        //exercise 1
        if (a == b) {
            t = true;
        }
        System.out.println(t);


        //exercise 2
        if (a > b) {
            t1 = true;
        }

        System.out.println(t1);

        //exercise 3
        if (a < b) {
            t2 = true;
        }

        System.out.println(t2);
    }
}






