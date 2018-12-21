package warustamyan.lessons_03;


public class App_211 {
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

        //array init another way
        int[] inlineInitArray = {1, 2, 5, -4, 44, 65};

        //WHILE LOOP
        int i = 0;
        int sum = 0;
        int count = 0;
        while (i < arraySize) {
            if (array[i] > 0) {
                sum = sum + array[i];
                count = count + 1;
            }
            i = i + 1;
        }
        System.out.println("Mijin tvabanakan while : " + sum / count);


        //FOR LOOP
        int forCount = 0;
        sum = 0;
        for (int k = 0; k < arraySize; k++) {
            if (array[k] > 0) {
                sum = sum + array[k];
                forCount = forCount + 1;
            }
        }
        System.out.println("Mijin tvabanakan for : " + sum / forCount);
    }
}
