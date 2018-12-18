package SPapoyan.lessons_02;

public class App_69 {
    public static void main(String[] args) {
        boolean y;
        int number = 5934;
        int miavor = number / 1000;
        int tasnavor = (number / 100) % 10;
        int haryuravor = (number / 10) % 10;
        int hazaravor = (number % 10);

        if (miavor + tasnavor + haryuravor + hazaravor > 20) {
            y = true;
        }else {
            y = false;
        }
        System.out.println(y);

    }
}
