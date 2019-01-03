package lessons_05;

public class Homework424 {
    public static void main(String [] args){
        int m = 5;
        int [][]matric = Utils.stexcelEvTpelMatric(m, m);
        int count = 0;
        int sum = 0;
        for(int i=0; i < m; i++){
            for(int j = 0; j < m; j++){
                if(j <= i){
                    if(matric[i][j]% 2 == 1){
                        count++;
                        sum = sum + matric[i][j];
                    }
                }
            }
        }System.out.print("mijin tvabanakan@ =" + sum/count);
    }
}
