package lessons_04;

public class Homework273 {
    public static void main(String[] args) {
        int n = 5;
        char array[] = new char[n];
        array[0] = 'a';
        array[1] = 's';
        array[2] = 's';
        array[3] = 'd';
        array[4] = 'v';
        int i = 0;
        int gumar = 0;
        while (i < n) {
            if (array[i] == 's'){
                gumar += i;
            }i++;
        }System.out.print(gumar);
    }
}
