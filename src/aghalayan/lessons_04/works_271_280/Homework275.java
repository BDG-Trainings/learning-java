package aghalayan.lessons_04.works_271_280;

public class Homework275 {
    public static void main(String []args){
        int n = 5;
        char array[]= new char[n];
        array[0] = 'a';
        array[1] = 'b';
        array[2] = 'v';
        array[3] = 's';
        array[4] = 's';
        int i = 0;
        int qanak = 0;
        int gumar = 0;
        while(i < n){
            if (array[i] < 'k'){
                qanak++;
               }i++;
        }System.out.print(qanak);

    }
}


