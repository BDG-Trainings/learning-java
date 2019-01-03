package lessons_05;

public class Homework423 {
    public static void main(String [] args){
        int m = 5;
        int count = 0;
        int sum = 0;
        int [][]matric = Utils.stexcelEvTpelMatric(m, m);
for(int i= 0; i <m ; i++ ){
    for(int j = 0; j < m; j++ ){
        if(j <= i){
            if (matric[i][j]% 2 == 0){
                count++;
                sum = sum + (matric[i][j]*matric[i][j]);
            }
        }
    }
}
System.out.print("mijin qarakusayin@ = " + Math.sqrt(sum/count));
    }
}

