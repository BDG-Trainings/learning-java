package arsenkarapetyan.lesson_3;

public class App_220 {

    public static void main(String[] args) {

        int arraySize = 10;
        int[] array = {-4,55,-1,3,4,-76,0,43,-86,7};

        int i = 0;
        int count_1 = 0;
        int count_2 = 0;

        while (i < arraySize) {
            if (array[i] > 0) {
                count_1 ++;
            }
            else if (array[i] < 0) {
                count_2 ++;
            }
            i = i + 1;
        }
        System.out.println("Drakan: " + count_1 + " ev Bacasakan: " + count_2);
    }
}
