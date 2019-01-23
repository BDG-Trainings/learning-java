package Classner;

public class Date {
    private int day;
    private int month;
    private int yaer;

    public Date(int day, int month, int yaer){
        this.day = day;
        this.month = month;
        this.yaer = yaer;
    }
    public int getDay(){
        return day;
    }
    public int getMonth(){
        return month;
    }
    public int getYaer(){
        return yaer;
    }
    public void SetDay(int day){
        this.day = day;
    }
    public void SetMonth(int month){
        this.month = month;
    }
    public void SetYear(int yaer){
        this.yaer = yaer;
    }public void SetDate(int day, int month, int yaer){
        this.day = day;
        this.month = month;
        this.yaer = yaer;
    }
    public String toString(){
        return "dd/mm/yyyy" +"="+ day+ "/" + month+ "/"+ yaer
                ;
    }
    public static void main(String [] args){
        Date Mesrop = new Date(15, 03, 2014);
        System.out.print("Mesrop."+Mesrop.toString());
    }

}
