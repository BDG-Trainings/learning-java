package SPapoyan.lessons_02;

public class App_65 {
    public static void main(String[] args) {

        int number = 2676;
        int miavor = number / 1000;
        int tasnavor = (number / 100) % 10;

        if (miavor * tasnavor == 12) {
            System.out.println("y = 12");
        }else {
            System.out.println("y = 0");
        }
    }
}
