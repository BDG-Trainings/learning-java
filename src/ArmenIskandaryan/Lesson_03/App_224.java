package ArmenIskandaryan.Lesson_03;

public class App_224 {
    public static void main(String[] args) {
        int [] arr = {5, 10, 2, -10, 20, 30, -25, 50, 10, -5};
        int k = 15;
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (Math.abs(arr[i]) < k) {
                sum = sum + Math.pow(arr[i], 3);
            }
        }
        System.out.println("Տրված k թվից փոքր բացարձակ արժեքով տարրերի խորանարդների գումարը հավասար է " + sum);
    }
}
