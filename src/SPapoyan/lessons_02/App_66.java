package SPapoyan.lessons_02;

public class App_66 {
    public static void main(String[] args) {

        int number = 4994;
        int miavor = number / 1000;
        int tasnavor = (number / 100) % 10;
        int haryuravor = (number / 10) % 10;
        int hazaravor = (number % 10);

        if (miavor == 4 && hazaravor == 4) {
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
