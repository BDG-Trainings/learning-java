public class Homework231{
    public static void main(String[] args){
        int arraySize = 10;
        int[] array = new int[arraySize];
        array[0] = -3;
        array[1] = 4;
        array[2] = -4;
        array[3] = 1;
        array[4] = -15;
        array[5] = -21;
        array[6] = -9;
        array[7] = -25;
        array[8] = -23;
        array[9] = -17;
        int i = 0;
        int gumar = 0;
        int qanak = 0;
        while (i < arraySize) {
            if (array[i] % 2 == 0) {
                qanak ++;
                gumar = gumar + (array[i] * array[i]);
            }
            i++;
        }  System.out.println(gumar);
        }

    }
