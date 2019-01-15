package src.ofeliasahakyan.lesson_4;

public class Task276_280 {
    public static void main(String args[]) {
        char[] array = {'w', 'z', 'v', 'd','f','f','l'};
        //276
        boolean t = true;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 114) {
                t = false;
            }
        }
        System.out.println(t);
        //277
        int new_length = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 'd') {
                new_length++;
            }
        }
        char[] without_d = new char[new_length];
        int k = 0;
        for(int i=0; i<array.length;i++){
            if(array[i]!='d'){
                without_d[k] = array[i];
                k++;
            }
        }
        for(int i=0; i<new_length; i++){
            System.err.print(without_d[i] + ",");
        }
        System.out.println("\n");
        //278
        int new_length_odd = 0;
        for (int i = 0; i < array.length; i++) {
            if (i%2 != 0 ) {
                new_length_odd++;
            }
        }
        char[] odd_index_array = new char[new_length_odd];
        int m = 0;
        for(int i=0; i<array.length;i++){
            if(i%2 !=0){
                odd_index_array[m] = array[i];
                m++;
            }
        }
        for(int i=0; i<new_length_odd; i++){
            System.err.print(odd_index_array[i] + ",");
        }
        System.out.println("\n");
        //279
        int great_k_length = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 'k' ) {
                new_length_odd++;
            }
        }
        char[] great_k_array = new char[great_k_length];
        int n = 0;
        for(int i=0; i<array.length;i++){
            if(array[i]>'k'){
                great_k_array[n] = array[i];
                n++;
            }
        }
        for(int i=0; i<great_k_length; i++){
            System.err.print(great_k_array[i] + ",");
        }
        System.out.println("\n");
        //280
        int new_length_f = array.length;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 'f' ) {
                new_length_f+=1;
            }
        }
        char[] double_f_array = new char[new_length_f];
        int p = 0;
        for(int i=0; i<array.length;i++){
            double_f_array[p]=array[i];
            if(array[i]=='f'){
                double_f_array[p+1] = array[i];
                p++;
            }
        }
        for(int i=0; i<new_length_f; i++){
            System.err.print(double_f_array[i] + ",");
        }
    }
}
