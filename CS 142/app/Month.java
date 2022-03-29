package app;

public enum Month {
    JAN("Jan"),
    FEB("Feb"),
    MAR("Mar"),
    APR("Apr"),
    MAY("May"),
    JUN("Jun"),
    JUL("Jul"),
    AUG("Aug"),
    SEP("Sep"),
    OCT("Oct"),
    NOV("Nov"),
    DEC("Dec");

    private final String month;

    Month(String month) {
        this.month = month;
    }

    @Override
    public String toString() {
        return month;
        }
    }