public class App_6 {
    /*
      Տրված են a եվ b թվերը
      Կազմել ծրագիր որը t տրամաբանական տիպի փոփոխականին կվերագրի ture արժեքը եթե նրանց գումարը մեծ է տրված k թվից:
      Արտածել t-ի արժեքը:
    */
    public static void main(String[] args) {
        // T variable declaration and initialization
        boolean t = false;

        // K variable declaration and initialization
        int k = 100;


        // a and b variables initializations
        int a = 10;
        int b = 20;

        //if checking block
        if (a + b > k) {
            t = true;
        }

        System.out.println(t); // <---- Արտածել t-ի արժեքը
    }
}
