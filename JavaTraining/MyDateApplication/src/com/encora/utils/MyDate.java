package com.encora.utils;

public class MyDate {
	private int day;
	private int month;
	private int year;
	public MyDate(int day,int month,int year) {

      setMonth(month);
      setYear(year);
      setDay(day);
      System.out.println("Given year is leap year :"+isLeapYear(year));
		
	}
	@Override
	public String toString() {
		
		return day+"-"+month+"-"+year;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
		int lastday=getNumberOfDaysInMonth(getYear(), getMonth());
		if (day<1)
			this.day=1;
		else if (day<lastday) {
			this.day=day;
		}
		else {
			this.day=lastday;
		}
		
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
		if (month>12)
			this.month=12;
		else if (month<1) {
			this.month=1;
		}
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
		if(year>2030)
			this.year=2030;
		else if (year<2023) {
			this.year=2023;
			
		}
	}
	public boolean isLeapYear(int year) {
		this.year=year;
		return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
	}
	public int getNumberOfDaysInMonth(int year, int month) {
		if (month == 1 || month == 3 || month == 5 || month == 7 ||		
				        month == 8 || month == 10 || month == 12)
				
				        return 31;			
		 if (month == 4 || month == 6 || month == 9 || month == 11)
				
				        return 30;
		if (month == 2) return isLeapYear(year) ? 29 : 28;
				
		 return 0; // If month is incorrect
				
				
	}

}
