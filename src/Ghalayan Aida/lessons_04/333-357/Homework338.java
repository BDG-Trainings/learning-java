package lessons_04;

public class Homework338 {
    public static void main(String[] args) {
        int n = 5;
        int X[] = {5, 11, -6, 11, 11};
        int i = 0;
        int max = X[0];
        int gumar = 0;
        while (i < n) {
            if (X[i] > max) {
                max = X[i];
              }
            i++;
          }i=0;
        while(i < n){
            if(X[i]==max){
            gumar = gumar + i;
        }i++;
        }
        System.out.print(gumar);
    }
}
