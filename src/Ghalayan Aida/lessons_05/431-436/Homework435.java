package lessons_05;

public class Homework435 {
    public static void main(String[]args){
        int n = 5;
        int count=0;
        double [][]matric = Utils.stexcelEvTpelDoubleMatric(n, n);
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if((i+j)<(n-1)){
                    if((int)matric[i][j]%5 ==0){
                        count++;
                    }
                }
            }
        }
        System.out.print(count);
    }
}
