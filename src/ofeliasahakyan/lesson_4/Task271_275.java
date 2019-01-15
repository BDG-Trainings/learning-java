package src.ofeliasahakyan.lesson_4;

public class Task271_275 {
    public static void main(String args[]) {
        char[] array = {'a', 'b', 'c'};
        //271
        int count_a = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 'a') {
                count_a += 1;
            }
        } System.err.println(count_a);
        //272
        boolean t;
        int count_b = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 'b') {
                count_b += 1;
            }
        }
        if(array.length/2<=count_b) {
            System.out.println(t = true);
        } else {
            System.out.println(t=false);
        }
        //273
        int sum_s=0;
        for(int i=0; i<array.length;i++){
            if(array[i]=='s'){
                sum_s+=i;
            }
        } System.out.println(sum_s);
        //274
        int sum_great_h=0;
        int count_great_h=0;
        for(int i=0; i<array.length;i++){
            if(array[i]>104){
                sum_great_h+=i;
                count_great_h+=1;
            }
        } System.out.println(sum_great_h/count_great_h);
        //275
        int count_less_k = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 10) {
                count_less_k += 1;
            }
        } System.out.println(count_less_k);
    }
}

