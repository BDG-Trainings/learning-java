public class Homework69 {
    public static void main(String[] args){
        int number = 5895;
        int miavor = number% 10;
        int tasnavor = (number / 10)% 10;
        int haryuravor = (number / 100)% 10;
        int hazaravor = number / 1000;
        int y;
        if ((miavor + tasnavor + haryuravor +hazaravor)>20) {
            y = 1;
        }else{
            y = 0;
        }
            System.out.print(y);
        }
}


