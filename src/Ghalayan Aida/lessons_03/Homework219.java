public class Homework219 {
    public static void main(String[] args) {
        int arraySize = 10;
        int[] array = new int[arraySize];
        array[0] = 0;
        array[1] =-4;
        array[2] = 10;
        array[3] = -1;
        array[4] = 1;
        array[5] = 2;
        array[6] = 2;
        array[7] = -2;
        array[8] = 3;
        array[9] = 1;
        int i = 0;
        int k = 2;
        int qanak=0;
        while (i < arraySize) {
            if (i %k == 0) {
                qanak++;
               }i++;
        }
        System.out.println(qanak);

    }
}





