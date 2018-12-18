package SPapoyan.lessons_02;

public class App_62 {
    public static void main(String[] args) {

        int number = 9999;
        int miavor = number / 1000;
        int tasnavor = (number / 100) % 10;
        int haryuravor = (number / 10) % 10;
        int hazaravor = (number % 10);


        if (number < 5000) {
            System.out.println( number / (miavor + haryuravor));
        } else {
            if (number > 5000) {
                System.out.println( number /  (hazaravor + tasnavor));
            }
        }
    }
}
