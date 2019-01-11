package SPapoyan.lessons_04;

public class App_278 {
    public static void main (String []args) {

        char [] name = {'a', 'n', 'm', 'r','x','a', 'k'};
        char [] NewMassive = new char [name.length];

        int k = 0;
        for (int i = 1; i < name.length; i=i+2) {
            NewMassive[k] = name[i];
            k++;
          //  System.out.println(+i);
        }

        for (int i = 0; i < NewMassive.length; i++) {
            System.out.print(NewMassive[i] + ",");
        }
    }
}