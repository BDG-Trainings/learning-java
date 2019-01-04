package lessons_05;

public class Homework436 {
    public static void main(String[]args){
        int n = 5;
        int count = 0;
        int sum = 0;
        int a = 5;
        int b = 45;
        int [][]matric = Utils.stexcelEvTpelMatric(n,n);
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
               if(j < i){
                   if(matric[i][j]>a && matric [i][j]< b){
                       count++;
                       sum = sum + matric [i][j];
                   }
               }
            }
        }
        System.out.print(sum/count);
    }
}
