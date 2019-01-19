package arsenkarapetyan.lesson_2;

public class App_62 {
    public static void main(String[] args) {
        int a = 4558;
        int b;
        int c;

       if (a < 5000){
           b=a%10;
           System.out.println(b);
           c=a%1000/100;
           System.out.println(c);
       }
       else{
           b = a/1000;
           System.out.println(b);
           c = a%100/10;
           System.out.println(c);
       }
       System.out.println(a/(b+c));
    }
}
