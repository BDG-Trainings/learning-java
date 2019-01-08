package aghalayan.lessons_04.works_271_280;

public class Homework278 {
    public static void main(String[] args) {
        int n = 5;
        char Array[] = new char[n];
        Array[0] = 'a';
        Array[1] = 'b';
        Array[2] = 'k';
        Array[3] = 's';
        Array[4] = 'v';
        int i = 0;
        int j = 0;
        char Array1[] = new char[n/2];
        while (i < n) {
            if (i%2 ==1 ) {
           Array1[j]=Array[i];
                j++;
            }
         i++;}

        System.out.print(Array1);
    }
}