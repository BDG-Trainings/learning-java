    public class App_8 {
    /*
        Տրված են a, b եվ c թվերը
        Արտածել թվերը ըստ աճման կարգի:
    */
    public static void main(String[] args) {
        int a = 40;
        int b = 25;
        int c = 10;
            if (a<b && a<c) {
                System.out.println(a);
            } else  {
                    if (b<a && b<c) {
                            System.out.println(b);
                    }
                        if (c<a && c<b) {
                                System.out.println(c);
                        }
            }
            if (a<b && a>c) {
                    System.out.println(a);
                     } else {
                            if (b>a && b<c) {
                                    System.out.println(b);
                            }
            if (c>a && c<b) {
                    System.out.println(c);
                    } else {
                    if (c>b && c<a) {
                        System.out.println(c);
                    } if (b<a && b>c) {
                    System.out.println(b);
                }
            }
        }
        if (a>b && a>c) {
                System.out.println(a);
            } else {
                    if (b>a && b>c) {
                        System.out.println(b);
                     }
                    if (c>a && c>b) {
                            System.out.println(c);
                    }
            }

         }
    }
