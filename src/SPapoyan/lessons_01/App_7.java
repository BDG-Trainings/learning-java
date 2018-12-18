public class App_7 {
    /*
      Տրված են a եվ b թվերը
      Կազմել ծրագիր որը t տրամաբանական տիպի փոփոխականին կվերագրի ture արժեքը եթե նրանց գումարը փոքր է տրված k թվից:
      Արտածել t-ի արժեքը:
    */
    public static void main(String[] args) {

        boolean t = false;

        int k = 100;


        // a and b variables initializations
        int a = 10;
        int b = 20;

        if (a + b < k) {
            t = true;
        }

        System.out.println(t);
    }
}

