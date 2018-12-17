package AramHovnanyan;

public class Homework_1_ex_6_7 {
    /*
Տրված են a եվ b թվերը
6 - Կազմել ծրագիր որը t տրամաբանական տիպի փոփոխականին կվերագրի ture արժեքը եթե նրանց գումարը մեծ է տրված k թվից: Արտածել t-ի արժեքը:
7 - Կազմել ծրագիր որը t տրամաբանական տիպի փոփոխականին կվերագրի ture արժեքը եթե նրանց գումարը փոքր է տրված k թվից: Արտածել t-ի արժեքը:
 */
    public static void main(String[] args) {

        boolean t = false;
        boolean t1 = false;

        int k = 50;

        int a = 40;
        int b = 20;

        //exercise 6
        if (a + b > k) {
            t = true;
        }

        System.out.println(t);


        //exercise 7
        if (a + b < k) {
        t1 = true;
    }

        System.out.println(t1);


}


}
