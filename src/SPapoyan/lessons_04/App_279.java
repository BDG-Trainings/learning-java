package SPapoyan.lessons_04;

public class App_279 {
    public static void main (String []args) {

        char [] name = {'l', 'n', 'm', 'r','x','a', 'k'};
        char [] NewMassive = new char [name.length];

        int k = 0;
        for (int i = 0; i < name.length; i++) {
            if (name [i] > 'k')
            NewMassive[k] = name[i];
            k++;
            //  System.out.println(+i);
        }

        for (int i = 0; i < NewMassive.length; i++) {
            System.out.print(NewMassive[i] + ",");
        }
    }
}
