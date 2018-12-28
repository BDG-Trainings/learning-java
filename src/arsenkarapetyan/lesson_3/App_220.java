package arsenkarapetyan.lesson_3;

public class App_220 {

    public static void main(String[] args) {

        int arraySize = 10;
        int[] array = {-4, 55, -1, 3, 4, -76, 0, 43, -86, 7};

        int i = 0;
        int positiveCount = 0;
        int negativeCount = 0;

        while (i < arraySize) {
            if (array[i] > 0) {
                positiveCount++;
            } else if (array[i] < 0) {
                negativeCount++;
            }
            i = i + 1;
        }
        System.out.println("Drakan: " + positiveCount + " ev Bacasakan: " + negativeCount);
    }
}
