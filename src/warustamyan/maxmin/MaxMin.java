package warustamyan.maxmin;


public class MaxMin {

    public static void main(String[] args) {

        int[] array = new int[10];

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

        int min = array[0];

        int max = array[0];

        for (int i = 0; i < array.length; i = i + 1) {
            if (min > array[i]) {
                min = array[i];
            }

            if (max < array[i]) {
                max = array[i];
            }
        }

        System.out.println(" min : " + min);
        System.out.println(" max : " + max);
    }
}
