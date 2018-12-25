package lessons_04;

public class Homework271 {
    public static void main(String [] args){
        int n = 3;
        char array[] = new char[n];
        array[0]= 'a';
        array[1]= 'b';
        array[2]='/';
        int i = 0;
        int qanak=0;
         while(i < n){
        if(array[i] == 'a'){
            qanak++;
            }
        i++;
    }System.out.println(qanak);
    }
}
