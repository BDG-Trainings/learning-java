package lessons_05;

public class Homework431 {
    public static void main(String[]args){
        int n = 5;
        int [][]matric = Utils.stexcelEvTpelMatric(n, n);
        int count = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if((i+j)>=(n-1)){
                    if((i+j)%2 == 1){
                        count++;
                    }
                }
            }
        }
        System.out.print(count);
    }
}
