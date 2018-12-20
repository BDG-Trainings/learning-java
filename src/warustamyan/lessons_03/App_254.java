package warustamyan.lessons_03;


public class App_254 {
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


        //Gtnenq mecaguyny
        int i = 0;
        int max = array[0];
        while (i < arraySize) {
            if (array[i] > max) {
                max = array[i];
            }
            i++;
        }

        //Gtnenq poqraguyny
        i = 0;
        int min = array[0];
        while (i < arraySize) {
            if (array[i] < min) {
                min = array[i];
            }
            i++;
        }

        System.out.println("Artadryaly : " + min * max);
    }
}
