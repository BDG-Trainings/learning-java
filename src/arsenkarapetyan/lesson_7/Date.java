package arsenkarapetyan.lesson_7;

public class Date {

    private int day;
    private int month;
    private int year;

    public Date (int day, int month, int year){
        setDate(day, month, year);
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setDate (int day, int month, int year){
        if (day > 0 && day < 32){
            this.day = day;
        } else {
            System.out.println("The day value is incorrect");
        }

        if (month > 0 && month < 13){
            this.month = month;
        } else {
            System.out.println("The month value is incorrect");
        }

        if (year > 1900 && year < 9999){
            this.year = year;
        } else {
            System.out.println("The year value is incorrect");
        }
    }

    public String to_String() {

        String day_string;
        String month_string;
        String year_string;

        if (day < 10) {
            day_string = "0" + day;
        } else {
            day_string = new Integer(day).toString();
        }

        if (month < 10) {
            month_string = "0" + month;
        } else {
            month_string = new Integer(month).toString();
        }

        if (year < 10) {
            year_string = "0" + year;
        } else {
            year_string = new Integer(year).toString();
        }

        String time = day_string + "/" + month_string + "/" + year_string;;
        return time;
    }

    public static void main(String[] args) {
        Date d = new Date(22, 4, 1975);
        System.out.println(d.to_String());
        Date d1 = new Date(40, 50, 1);
    }
}
