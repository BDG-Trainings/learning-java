package arsenkarapetyan.lesson_3;

public class App_219 {

    public static void main(String[] args) {

        int arraySize = 10;
        int[] array = {-4,55,-1,3,4,-76,0,43,-86,7};

        int i = 1;
        int count = 0;
        int k =12;

        while (i < arraySize) {
            if (k%i == 0) { // bazmapatik
                count ++;
            }
            i = i + 1;
        }
        System.out.println("12 tvin bazmapatik index ynecogh tarreri qanake: " + count );
    }
}
