package lessons_05;

public class Homework433 {
    public static void main(String [] args){
        int n = 5;
        int [][]matric= Utils.stexcelEvTpelMatric(n, n);
        int a = 5;
        int b = 20;
        int count = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if((i+j)<(n-1)){
                    if(matric[i][j]>a && matric[i][j]<b){
                        count++;
                    }
                }
            }
        }
        System.out.print(count);
    }
}
