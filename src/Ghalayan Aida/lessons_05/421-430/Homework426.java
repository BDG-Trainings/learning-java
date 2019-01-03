package lessons_05;

public class Homework426 {
    public static void main(String[]args){
        int m = 5;
        int [][] matric=Utils.stexcelEvTpelMatric(m,m);
        int sum = 0;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < m; j++){
                if ((i+j)< (m-1)){
                    if(matric[i][j]% 2 == 0){
                        sum= sum + matric[i][j];
                    }
                }
            }
        }System.out.print("Ojandak ankyunagcic ver zuyg arjeq unecox tarreri gumary " +sum);
    }
}
