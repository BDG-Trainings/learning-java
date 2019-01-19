package arsenkarapetyan.lesson_2;

import java.util.Scanner;

public class Yana_work {

    public static void main(String[] args) {

        System.out.println("Яна, что ты получила?");
        Scanner scan = new Scanner(System.in);

        int ocenka = scan.nextInt();

        if (ocenka >= 7){
            System.out.println("Apres!");
        }
        else {
            System.out.println("Amot");
        }
    }
}
