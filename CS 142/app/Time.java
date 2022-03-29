package app;

public class Time implements Comparable<Time> {

    private final int hour;
    private final int minutes;

    public Time() {
        this.hour = 0;
        this.minutes = 0;
    }

    public Time(String time) {
        String[] tempTime = time.split(":");
        this.hour = Integer.parseInt(tempTime[0]);
        this.minutes = Integer.parseInt(tempTime[1]);
    }

    public Time(int hour, int minutes) {
        this.hour = hour;
        this.minutes = minutes;
    }

    //@Override
    public int compareTo(Time other) {
        if(hour != other.hour)
            return hour - other.hour;
        return minutes - other.minutes;
    }

    public static int compareHours(Time first, Time second) {
        return Double.compare(first.hour, second.hour);
    }

    public static int compareMinutes(Time first, Time second) {
        return Double.compare(first.minutes, second.minutes);
    }

    //@Override
    public boolean equals(Object obj) {
        if(obj instanceof Time){
            Time other = (Time) obj;
            return hour == other.hour && minutes
                    == other.minutes;
        }
        return false;
    }

    public String toCSVFormat() {
        return toString();
    }

    public String toString() {
        return hour + ":" + minutes;
    }
}
