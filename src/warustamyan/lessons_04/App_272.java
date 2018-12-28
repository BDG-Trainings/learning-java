package warustamyan.lessons_04;


import java.util.Arrays;

public class App_272 {

    public static void main(String[] args) {
        double[] doubles = {23.44, 43};


        char name[] = {'a', 'r', 'a', 'm', 'b', 'b', 'b', 't'};
        boolean t = false;

        int b_count = 0;
        for (int i = 0; i < name.length; i++) {
            if (name[i] == 'b') {
                b_count = b_count + 1;
            }
//            name[i] = (char) (name[i] - 32);

        }

        if (b_count >= name.length / 2)
            t = true;

        System.out.println(t);
    }
}
