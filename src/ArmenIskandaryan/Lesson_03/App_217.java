package ArmenIskandaryan.Lesson_03;

public class App_217 {
    public static void main(String[] args) {
        int [] arr = {5, 10, 2, -10, -20, 30, -25, 50, 10, -5};
        int num = 1;
        for (int i = 1; i < arr.length; i = i + 2) {
                num = num * (arr[i] * arr[i]); // num = num * Math.pow(arr[i], 2);
        }
        System.out.println("Կենտ ինդեքսով տարրերի քառակուսիների արտադրյալը հավասար է " + num);
    }
}
