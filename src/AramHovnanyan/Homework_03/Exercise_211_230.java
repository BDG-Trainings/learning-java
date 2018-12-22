package AramHovnanyan.Homework_03;

public class Exercise_211_230 {
    public static void main(String[] args) {
        int [] array = {0,-10,-22,6};
        int sum = 0;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                sum = sum + array[i];
                count = count + 1;
            }
        }
        if (count > 0) {
            double mijtv = (double) sum / count;
            System.out.println("Mijin tvabanakan drakan" + " - " + mijtv);
        } else {
            System.out.println("Mijin tvabanakan drakan" + " - " +  0);
        }
    }
}
