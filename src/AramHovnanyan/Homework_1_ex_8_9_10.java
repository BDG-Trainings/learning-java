package AramHovnanyan;

public class Homework_1_ex_8_9_10 {

public static void main(String[] args){

    int a = 10;
    int b = 50;
    int c = 2;



    if (a < b) {
        if (a < c) {
            if (b < c) {
                System.out.println(a + "," + b + "," + c);
            } else {
                System.out.println(a + "," + c + "," + b);
            }
        }
    } else {
        if (b < a) {
            if (b < c) {
                if (a < c) {
                    System.out.println(b + "," + a + "," + c);
                } else {
                    System.out.println(b + "," + c + "," + a);
                }
            } else {
                if(a < b){
                    System.out.println(c + "," + a + "," + b);
                }else {
                    System.out.println(c + "," + b + "," + c);
                }


            }
        }
    }
}

}
