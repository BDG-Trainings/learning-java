public class Work9 {
    public static void main (String [] args){
        int a = 20;
        int b = 10;
        int c = 15;
        if (a < b && b < c){
            System.out.println(c+ " " + b + " " + a);
        }else if (b < a && a < c) {
            System.out.println(c+ " " + a + " " + b);
        } else if (c < b && b < a){
            System.out.println(a + " " + b + " " + c);
        }else if (b < c && c < a){
            System.out.println(a + " " + c + " " + b);
        }else if (c < a && a < b){
            System.out.println(b + " " + a + " " + c);
        }else if (a < c && c < b){
            System.out.println(b + " " + c + " " + a);
        }
    }
}
