package lessons_04;

public class Homework280 {
    public static void main(String[] args) {
        int n = 5;
        char Array[] = new char[n];
        Array[0] = 'f';
        Array[1] = 'b';
        Array[2] = 'k';
        Array[3] = 'f';
        Array[4] = 'v';
        int i = 0;
        int j = 0;
        char Array1[] = new char[2*n];
        while (i < n) {
            if (Array[i]=='f' ) {
                Array1[j]='f';
                Array1[++j] ='f';
            }else{
                Array1[j]=Array[i];
            }j++;
            i++;}

        System.out.print(Array1);
    }
}