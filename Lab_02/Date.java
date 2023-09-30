package Lab_02;

public class Date {

    int day;
    int month;
    int year;

    Date(int day, int month, int year) {

        this.day = day;
        this.month = month;
        this.year = year;

    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getDay() {
        return day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getMonth() {
        return month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public String toString() {

        return String.format("%02d/%02d/%04d", day, month, year);
    }

    public Date isLatest(Date d1, Date d2) {
        if (d1.getMonth() > d2.getMonth()) {
            return d1;
        } else {
            return d2;
        }
    }

}
