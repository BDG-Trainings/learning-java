package ArmenIskandaryan.Lesson_03;

public class App_218 {
    public static void main(String[] args) {
        int [] arr = {5, 10, 2, -10, -20, 30, -25, 50, 10, -5};
        int sum = 0;
        for (int i = 1; i < arr.length; i = i + 2) {
                sum = sum + Math.abs(arr[i]);
        }
        System.out.println("Կենտ ինդեքսով տարրերի բացարձակ արժեքների գումարը հավասար է " + sum);
    }
}
