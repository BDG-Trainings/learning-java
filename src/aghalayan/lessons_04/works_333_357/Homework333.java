package aghalayan.lessons_04.works_333_357;

public class Homework333 {
    public static void main(String [] args){
        int n = 5;
        int X[] = {0, -4, 5, 10, -6};
        int k = 6;
        int i = 1;
        int gumar = 0;
        while(i < (n-1)){
            if (X[i-1]+X[i+1]<k) {
               gumar += X[i];
            }i++;
        }System.out.print(gumar);
    }
}
