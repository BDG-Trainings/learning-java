package SPapoyan.lessons_02;

public class App_61 {
    public static void main(String[] args) {

        boolean t;

        int number = 5234;

        int miavor = number / 1000;
        System.out.println("Miavor :" + miavor );

        int tasnavor = (number / 100) % 10;
        System.out.println("Tasnavor :"  + tasnavor);

        int haryuravor = (number / 10) % 10;
        System.out.println("Haryuravor :" + haryuravor);

        int hazaravor = (number % 10);
        System.out.println("Hazaravor :" + hazaravor);

        if (miavor + tasnavor == haryuravor + hazaravor) {
            t = true;
        }else {
            t = false;
        }
            System.out.println("RESULT :" + t);

    }
}
