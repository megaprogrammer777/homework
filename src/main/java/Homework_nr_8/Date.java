package Homework_nr_8;

public class Date {
       private int day;
       private int month;
       private int year;

    public void setDay(int day) {
        this.day = day;
        if(day > 31) {
            System.out.println("Unnamed day");
        }else {
            System.out.println(day);
        }
    }

    public void setMonth(int month) {
        this.month = month;
        if (month>12) {
            System.out.println("Unnamed month");
        }else {
            System.out.println(month);
        }
    }

    public void setYear(int day) {
        this.year = year;
        if (year>2023) {
            System.out.println("Unnamed year");
        }else {
            System.out.println(year);
        }
    }

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void displayDate(){
        System.out.println(day+"/"+month+"/"+year);
    }
}

