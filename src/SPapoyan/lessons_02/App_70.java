package SPapoyan.lessons_02;

public class App_70 {
    public static void main(String[] args) {
        int number = 5134;
        int miavor = number / 1000;
        int tasnavor = (number / 100) % 10;
        int haryuravor = (number / 10) % 10;
        int hazaravor = (number % 10);

        char y;

        if (miavor * tasnavor * haryuravor * hazaravor > 200) {
            System.out.println(y = '0');
        }else {
            System.out.println(y = '1');
        }
    }
}
