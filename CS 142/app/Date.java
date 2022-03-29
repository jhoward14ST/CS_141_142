package app;

public class Date implements Comparable<Date> {

    private final int day;
    private final Month month;
    private final int year;

    public Date() {
        this(0, null, 0);
    }

    public Date(String date) {
        String[] tempDate = date.split("-");
        this.day = Integer.parseInt(tempDate[0]);
        this.month = Month.valueOf(tempDate[1]);
        this.year = Integer.parseInt(tempDate[2]);
    }

    public Date(int day, Month month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    //@Override
    public int compareTo(Date other) {
        if (year != other.year) {
            return year - other.year;
        } else if (!month.equals(other.month)) {
            return month.compareTo(other.month);
        }
    return day - other.day;
    }

    public static int compareYears(Date first, Date second) {
        return Double.compare(first.year, second.year);
    }

    public static int compareMonths(Date first, Date second) {
        return CharSequence.compare(first.month.toString(), second.month.toString());
    }

    public boolean equals(Object obj) {
        if(obj instanceof Date){
            Date other = (Date) obj;
            return  day == other.day          &&
                    month.equals(other.month) &&
                    year == other.year;
        }
        return false;
    }

    public String toCSVFormat() {
        return day + "-" + month + "-" + year;
    }

    public String toString() {
        return day + " " + month + " " + year;
    }
}
