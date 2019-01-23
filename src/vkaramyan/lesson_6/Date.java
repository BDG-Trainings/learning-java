package vkaramyan.lesson_6;

public class Date {
	
	static int [] day = {1, 31};
	static int [] month = {1, 12};
	static int [] year = {1900, 9999};
	
	public Date (int [] day, int [] month, int [] year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public int [] getDay() {
		return day;
	}
	
	public int [] getMonth() {
		return month;
	}
	
	public int [] getYear() {
		return year;
	}
	
	public void setDay(int [] day) {
		this.day = day;
	}
	
	public void setMonth(int [] month) {
		this.month = month;
	}
	
	public void setYear(int [] year) {
		this.year = year;
	}
	
	public void setDate(int [] day, int [] month, int [] year) {
		this.day = day;
		this.month = month;
		this.year = year;
		
	}
	
	
	public String toString() {
		return String.format("dd/mm/yyyy", getDay(), getMonth(), getYear());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date date = new Date(day, month, year);
		date.setDate("01", "07", "1982");
		System.out.println(date);
		

	}

}
