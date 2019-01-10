package aghalayan.lessons_03;

public class Homework221 {
    public static void main(String[] args) {
        int arraySize = 10;
        int array[] = new int[arraySize];
        array[0] = 1;
        array[1] = 2;
        array[3] = 1;
        array[4] = 0;
        array[5] = -12;
        array[6] = -4;
        array[7] = 0;
        array[8] = 4;
        array[9] = 7;
        int i = 0;
        int a = 3;
        int b = 7;
        int qanak = 0;
        int gumar = 0;
        while (i < arraySize) {
            if (a < array[i] && array[i] < b) {
                qanak++;
                gumar = gumar + array[i];
            }
            i++;
        }
        System.out.print(gumar);
    }
}
