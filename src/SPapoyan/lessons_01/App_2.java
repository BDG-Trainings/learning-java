public class App_2 {

/*
    Տրված են a եվ b թվերը
    2 - Կազմել ծրագիր որը t տրամաբանական տիպի փոփոխականին կվերագրի ture արժեքը եթե a մեծ է  b ից հակառակ դեպքում false: Արտածել t-ի արժեքը:
 */
    public static void main(String[] args) {
        // T variable declaration
        boolean t;

        // a and b variables initializations
        int a = 10;
        int b = 20;

        //if checking block
        if (a > b) {
            t = true;
        } else {  //<---- հակառակ դեպքում
            t = false;
        }

        System.out.println(t); // <---- Արտածել t-ի արժեքը
    }
}
