package aghalayan.lessons_04.works_311_316;

public class Homework314 {
    public static void main(String [] args){
        int n = 6;
        int X []= {0, 8, 9, -6, -3, -5};
        int qanak = 0;
        int i = 0;
        int j = 0;
        while(i < n){
            if (X[i] > 0){
                qanak=qanak +2;
            }i++;
        }i=0;
        int Y [] = new int[qanak];
        while(i < n){
            if(X[i]> 0){
                Y[j] = X[i];
                Y [j+1]=0;
                j=j+2;
            }i++;
        }j= 0;
        while(j < (qanak)){
            System.out.println(Y[j]);
            j++;
        }
    }
}
