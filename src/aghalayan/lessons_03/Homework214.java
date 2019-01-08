package aghalayan.lessons_03;

public class Homework214 {
    public static void main(String[] args) {
        int arraySize = 10;
        int[] array = new int[arraySize];
        array[0] = -6;
        array[1] = 4;
        array[2] = -4;
        array[3] = 10;
        array[4] = 15;
        array[5] = 20;
        array[6] = 8;
        array[7] = 25;
        array[8] = 23;
        array[9] = 18;
        int i = 0;
        int gumar = 0;
        int qanak = 0;
        while (i < arraySize) {
            if (array[i] < 0) {
                qanak++;
                gumar = gumar + array[i];
            }
            i++;
        }
        if (qanak == 0) {
            System.out.println("drakan tiv chka");
        } else {
            System.out.println(gumar/qanak);
        }

    }
}


