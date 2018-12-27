public class Homework220 {
    public static void main(String[] args) {
        int arraySize = 10;
        int[] array = new int[arraySize];
        array[0] = 0;
        array[1] = -4;
        array[2] = 10;
        array[3] = -1;
        array[4] = 1;
        array[5] = 2;
        array[6] = 2;
        array[7] = -2;
        array[8] = 3;
        array[9] = 1;
        int i = 0;
        int qanakdrakan = 0;
        int qanakbacasakan = 0;
        while (i < arraySize) {
            if (array [i] > 0) {
                qanakdrakan++;
            } else if (array[i] < 0) {
                qanakbacasakan++;
            }i++;
            }System.out.println("drakan tarrer@:" + qanakdrakan);
        System.out.println("bacasakan tarrer@:" + qanakbacasakan);
    }
}





