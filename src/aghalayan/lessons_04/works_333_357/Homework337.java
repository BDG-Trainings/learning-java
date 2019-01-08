package aghalayan.lessons_04.works_333_357;

public class Homework337 {
    public static void main(String[] args) {
        int n = 5;
        int X[] = {5, -10, -6, 8, 11};
        int i = 0;
        int artadryal = 1;
        int gumar = 0;
        while (i < n) {
        artadryal = artadryal * X[i];
        i = i + 2;
        }
        if (artadryal < 0) {
        System.out.print("s=1");
        }else {
         i=1;
            while(i<n){
            gumar = gumar + X[i];
        i= i+2;
        }
            System.out.print(gumar);
        }
    }
}
