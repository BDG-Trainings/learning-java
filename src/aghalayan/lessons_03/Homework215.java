package aghalayan.lessons_03;

public class Homework215 {
    public static void main(String[] args) {
        int arraySize = 10;
        int[] array = new int[arraySize];
        array[0] = 0;
        array[1] = 4;
        array[2] = 1;
        array[3] = 10;
        array[4] = 1;
        array[5] = 20;
        array[6] = 2;
        array[7] = 25;
        array[8] = 3;
        array[9] = 18;
        int i = 0;
        int gumar = 0;
        while (i < arraySize) {
            if (i %2 == 0) {
              gumar = gumar + array[i];
            }
            i++;
        }
                   System.out.println(gumar);

    }
}
