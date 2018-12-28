package warustamyan.lessons_04;


public class App_277 {

    public static void main(String[] args) {


        char[] content = {'A', 'v', 's', 'd', 'x', 's', 'N', 'v', 'r', 'd', 's', 'm'};
        char[] without_d = new char[content.length];

        int k = 0;
        for (int i = 0; i < content.length; i++) {
            if (content[i] != 'd') {
                without_d[k] = content[i];
                k++;
            }
        }

        for (int i = 0; i < without_d.length; i++) {
            System.out.print(without_d[i] + ", ");
        }
    }
}
