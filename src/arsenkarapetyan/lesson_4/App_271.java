package arsenkarapetyan.lesson_4;

public class App_271 {

    public static void main(String[] args) {

        int n = 12;
        //int[] numbers = {-4,55,-1,3,4,-76,0,43,-86,7,222, -71};
        char [] symbols = {'b','v', 'a','a','x','c','a','r','t','1','a','m',};
        int count_value=0;

        for (int i=0; i<symbols.length; i++){
            if(symbols[i]==97){
                count_value++;
            }
        }
        System.out.println("a-eri qanake: " + count_value + " hat e");
    }
}
