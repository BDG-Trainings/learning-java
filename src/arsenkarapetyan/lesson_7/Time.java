package arsenkarapetyan.lesson_7;

public class Time {

    static int hour;
    static int minute;
    static int second;

    public Time (int hour, int minute, int second){
        setTime(hour, minute, second);
    }

    public int getHour(){
        return hour;
    }

    public int getMinute(){
        return minute;
    }

    public int getSecond(){
        return second;
    }

    public void setHour(int hour){
        this.hour = hour;
    }

    public void setMinute(int minute){
        this.minute = minute;
    }

    public void setSecond(int second){
        this.second = second;
    }

    public void setTime (int hour, int minute, int second){
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

    public String to_String() {
        String hour_string;
        String minute_string;
        String second_string;

        if (hour < 10) {
            hour_string = "0" + hour;
        } else {
            hour_string = new Integer(hour).toString();
        }

        if (minute < 10) {
            minute_string = "0" + minute;
        } else {
            minute_string = new Integer(minute).toString();
        }

        if (second < 10) {
            second_string = "0" + second;
        } else {
            second_string = new Integer(second).toString();
        }

        String time = hour_string + ":" + minute_string + ":" + second_string;;
        return time;
    }

    public Time nextSecond(){
        Time vremya_vpered = new Time(hour, minute, second);
        if (second==59){
            vremya_vpered.setSecond(0);
            vremya_vpered.setMinute(minute+1);
            if(minute==59){
               vremya_vpered.setHour(hour+1);
               if (hour==23){
                   vremya_vpered.setHour(0);
                }
            }
        }else{
            vremya_vpered.setSecond(second+1);
        }
        return vremya_vpered;
    }

    public Time previousSecond(){
        Time vremya_nazad = new Time(hour, minute, second);
        if (second == 0){
            vremya_nazad.setSecond(59);
            vremya_nazad.setMinute(minute-1);
            if (minute == 0){
                vremya_nazad.setMinute(59);
                if (hour == 0){
                    vremya_nazad.setHour(23);
                }
            }
        }else {
            vremya_nazad.setSecond(second-1);
        }
        return vremya_nazad;
    }

}
