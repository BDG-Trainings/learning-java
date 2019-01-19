package arsenkarapetyan.lesson_3;

public class App_221 {
    public static void main(String[] args) {

        int a = -2;
        int b = 15;
        int sum =0;

        int[] array = {-4, 55, -1, 3, 4, -76, 0, 43, -86, 7, -34, 56};

        for (int i=0; i<array.length; i++){
            if (array[i]>a && array[i]<b ){
                sum = sum + array[i];
                System.out.println(array[i]);
            }
        }
        System.out.println(sum);
    }
}
