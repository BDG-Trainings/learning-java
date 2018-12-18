package SPapoyan.lessons_02;

public class App_68 {
    public static void main(String[] args) {

        int number = 4334;
        int miavor = number / 1000;
        int tasnavor = (number / 100) % 10;
        int haryuravor = (number / 10) % 10;
        int hazaravor = (number % 10);

        if (miavor > tasnavor) {
            System.out.println(miavor * haryuravor);
        }else {
            System.out.println("1");
        }
    }
}