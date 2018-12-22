public class Homework211 {
    public static void main(String[] args) {
        int arraySize = 10;
        int[] array = new int[arraySize];
        array[0] = 0;
        array[1] = -4;
        array[2] = 4;
        array[3] = 10;
        array[4] = -15;
        array[5] = 20;
        array[6] = -8;
        array[7] = 25;
        array[8] = -23;
        array[9] = 18;
        int i = 0;
        int qanak = 0;
        while (i < arraySize) {
            if (array [i] % 2 == 0) {
                qanak++; }
               i++;}
                    System.out.println(qanak);
                }

        }
