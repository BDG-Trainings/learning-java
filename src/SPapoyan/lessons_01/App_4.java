public class App_4 {
    /*
    Տրված են a, b եվ c թվերը
    Կազմել ծրագիր որը  կարտածի մեծագույնի արժեքը:
     */
    public static void main(String[] args){
        int a = 15;
        int b = 5;
        int c = 21;

        if (a>b) {
            if (a>c) {
                System.out.println(a);
            }
        }else {
            if (b>c) {
                if (b>a) {
                    System.out.println(b);
                }
            }
        }if (c>b) {
            if (c>a) {
                System.out.println(c);
            }
        }



    }
}
