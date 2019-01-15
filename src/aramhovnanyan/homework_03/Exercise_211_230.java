package aramhovnanyan.homework_03;

public class Exercise_211_230 {
    public static void main(String[] args) {

        int [] array = {0,-10,-22,6,22,34,-12,-38,45};
        int sum = 0;
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                sum = sum + array[i];
                count = count + 1;
            }
        }
        System.out.println("211.Mijin tvabanakan drakan" + " - " + sum / count);

        if (count > 0) {
            double mijtv = (double) sum / count;
            System.out.println("211.Mijin tvabanakan drakan" + " - " + mijtv);
        } else {
            System.out.println("211.Mijin tvabanakan drakan" + " - " +  0);
        }



    }
}
