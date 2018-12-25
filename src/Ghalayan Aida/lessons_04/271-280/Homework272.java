package lessons_04;

public class Homework272 {
    public static void main(String [] args){
        int n = 5;
        char array[]= new char [n];
        array[0]= 'a';
        array[1]= 'b';
        array[2]= 'c';
        array[3]= '/';
        array[4]='e';
        boolean t;
        int i =0;
        int qanak = 0;
        while(i < n) {
            if (array[i] == 'b') {
                qanak++;
            }
            i++;
        }
        if (qanak>=n/2){
            t=true;
        }else{
            t=false;}
        System.out.println(t);
            }
                  }
