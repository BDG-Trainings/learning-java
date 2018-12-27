package arsenkarapetyan.lesson_3;

public class App_218 {

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
        long sum = 0;

        while (i < arraySize) {
            if (i%2 != 0) {
                sum = sum + Math.abs(array[i]);
                System.out.println (sum);
            }
            i = i + 1;
        }
        System.out.println("Kent index ynecogh tarreri batsarzak arzheqneri gumare: " + sum );
    }
}
