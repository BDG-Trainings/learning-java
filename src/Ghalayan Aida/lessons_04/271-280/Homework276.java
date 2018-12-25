package lessons_04;

public class Homework276 {
    public static void main(String[] args){
        int n = 3;
        char array[]= new char[n];
        array[0]='r';
        array[1]='/';
        array[2]='p';
        boolean t= false;
        int i = 0;
        while(i < n){
            if(array[i]=='r'){
            t = true;
            break;
            }else{
            t = false;
            }i++;
        }
        System.out.print(t);
    }
}
