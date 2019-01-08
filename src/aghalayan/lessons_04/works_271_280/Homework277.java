package aghalayan.lessons_04.works_271_280;

public class Homework277 {
    public static void main(String[] args) {
        int n = 5;
        char Array[] = new char[n];
        Array[0] = 'a';
        Array[1] = 'b';
        Array[2] = 'd';
        Array[3] = 's';
        Array[4] = 'd';
        int i = 0;
        int qanak = 0;
        int j = 0;
        while (i < n) {
            if (Array[i] == 'd') {
                qanak++;
            }
            i++;
        }
        char Array1[] = new char[n - qanak];
         i = 0;
        while (i < n) {
            if (Array[i] !='d'){
                Array1[j] = Array[i];
                j++;
            }
            i++;
        }
        System.out.print(Array1);
    }
}
