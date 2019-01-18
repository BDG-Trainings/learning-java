package arsenkarapetyan.lesson_7;

public class Time {

    static int hour;
    static int minute;
    static int second;

    public Time (int hour, int minute, int second){
        if (0 <= hour && hour <= 23){
            this.hour = hour;
        } else {
            System.out.println("The hour is out of the range");
        }
        if (0 <= minute && minute <= 59){
            this.minute = minute;
        } else {
            System.out.println("The minute is out of the range");
        }
        if (0 <= second && second <= 59){
            this.second = second;
        } else {
            System.out.println("The hour is out of the range");
        }
    }

}
