package ArmenIskandaryan.Lesson_04;

public class App_295 {
    public static void main(String[] args) {
        int [] arrX = {1, 15, -20, 50, -21, -8, 52, 27, -10, -3};
        int xCount = arrX.length;
        if (xCount == 0) {
            System.out.println("Քանի որ սկզբնական զանգվածի չափը հավասար է 0-ի, հետևաբար, նոր զանգվածի չափը ևս հավասար է 0");
        } else {
            double yCount = Math.ceil(arrX.length/2);
            int [] arrY = new int[(int)yCount];
            for (int i = 0; i * 2 < arrX.length; i++) {
                arrY[i] = arrX[2 * i];
                System.out.println(i + " -> " + arrY[i]);
            }
        }
/*        for (int i = 0; i < arrY.length; i++) {
            System.out.println(i + " -> " + arrY[i]);
        } */
    }
}
