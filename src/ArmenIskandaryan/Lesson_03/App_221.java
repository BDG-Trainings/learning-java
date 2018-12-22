package ArmenIskandaryan.Lesson_03;

public class App_221 {
    public static void main(String[] args) {
        int [] arr = {5, 10, 2, -10, 20, 30, -25, 50, 10, -5};
        int k1 = 15;
        int k2 = 50;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > k1 && arr[i] < k2) // || (arr[i] > k2 && arr[i] < k1)
            {
                sum = sum + arr[i];
            }
        }
        System.out.println("Տրված միջակայքին պատկանող տարրերի գումարը հավասար է " + sum);
    }
}
