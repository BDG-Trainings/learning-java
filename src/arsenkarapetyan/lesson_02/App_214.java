package arsenkarapetyan.lesson_02;

public class App_214 {

    public static void main(String[] args) {

        int arraySize = 10;
        int[] array = new int[arraySize];

        array[0] = -4;
        array[1] = 55;
        array[2] = -1;
        array[3] = 3;
        array[4] = 4;
        array[5] = -76;
        array[6] = 0;
        array[7] = 43;
        array[8] = -86;
        array[9] = 7;

        int i = 0;
        int sum = 0;
        int count = 0;
        while (i < arraySize) {
            if (array[i] < 0) {
                sum = sum + array[i];
                count = count + 1;
            }
            i = i + 1;
        }
        System.out.println("Bacasakan tarreri mijin tvabanakane: " + sum / count);
    }
}
