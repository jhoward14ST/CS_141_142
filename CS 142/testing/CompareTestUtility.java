package testing;

import app.*;
import modules.UModule;
import utility.ArrayList;
import utility.List;

public class CompareTestUtility {

    public static void intro() {
        System.out.println();
        System.out.println();
        System.out.println("***************************************************");
        System.out.println();
        System.out.println();
        System.out.println(" \t \t \t \t  W E L C O M E  ");
        System.out.println();
        System.out.println(" \t \t C O M P A R E   O B J E C T S  ");
        System.out.println(" \t \t    T E S T    P R O G R A M");
        System.out.println();
        System.out.println();
        System.out.println("***************************************************");
        System.out.println();
        System.out.println();
    }

    public static void DateTest() {
        Date EnduringFreedom = new Date(7, Month.OCT, 2001);
        Date PersianGulf = new Date(1, Month.AUG, 1990);
        Date IraqiFreedom = new Date(19, Month.MAR, 2003);

        List<Date> dates = new ArrayList<>();
        dates.add(PersianGulf);
        dates.add(IraqiFreedom);
        dates.add(EnduringFreedom);

        System.out.println("------- dimensions: before sorting --------");
        for (int i = 0; i < dates.size(); i++) {
            System.out.println("element " + i + ": " + dates.get(i));
        }

        System.out.println();
        System.out.println("------- dimensions: natural ordering --------");
        UModule.quickSort(dates);

        for (int i = 0; i < dates.size(); i++) {
            System.out.println("element " + i + " : " + dates.get(i));
        }

        System.out.println();
        System.out.println("------- years: different ordering --------");
        UModule.quickSort(dates, Date::compareYears);

        for (int i = 0; i < dates.size(); i++) {
            System.out.println(dates.get(i));
        }

        System.out.println();
        System.out.println("------- months: different ordering --------");
        UModule.quickSort(dates, Date::compareMonths);

        for (int i = 0; i < dates.size(); i++) {
            System.out.println(dates.get(i));
        }
        System.out.println();
    }

    public static void PayloadTest() {
        Payload doge = new Payload("doge", "good doggo", 20, "around dog park");
        Payload muchDoge = new Payload("muchDoge", "much good doggo", 25, "much orbit");
        Payload wowDoge = new Payload("wowDoge", "wow good doggo", 30, "wow orbit");
        Payload manyDoge = new Payload("manyDoge", "many good doggo", 40, "many orbit");

        List<Payload> payloads = new ArrayList<>();
        payloads.add(muchDoge);
        payloads.add(manyDoge);
        payloads.add(doge);
        payloads.add(wowDoge);

        System.out.println("------- dimensions: before sorting --------");
        for (int i = 0; i < payloads.size(); i++) {
            System.out.println("element " + i + ": " + payloads.get(i));
        }

        System.out.println();
        System.out.println("------- dimensions: natural ordering --------");
        UModule.quickSort(payloads);

        for (int i = 0; i < payloads.size(); i++) {
            System.out.println("element " + i + " : " + payloads.get(i));
        }

        System.out.println();
        System.out.println("------- names: different ordering --------");
        UModule.quickSort(payloads, Payload::compareNames);

        for (int i = 0; i < payloads.size(); i++) {
            System.out.println(payloads.get(i));
        }

        System.out.println();
        System.out.println("------- masses: different ordering --------");
        UModule.quickSort(payloads, Payload::compareMasses);

        for (int i = 0; i < payloads.size(); i++) {
            System.out.println(payloads.get(i));
        }
        System.out.println();
    }

    public static void TimeTest() {
        Time morning = new Time(6, 0);
        Time lateMorning = new Time(10, 30);
        Time noon = new Time(12, 0);
        Time afternoon = new Time(4, 20);
        Time evening = new Time(7, 30);

        List<Time> times = new ArrayList<>();
        times.add(morning);
        times.add(evening);
        times.add(noon);
        times.add(lateMorning);
        times.add(afternoon);

        System.out.println("------- dimensions: before sorting --------");
        for (int i = 0; i < times.size(); i++) {
            System.out.println("element " + i + ": " + times.get(i));
        }

        System.out.println();
        System.out.println("------- dimensions: natural ordering --------");
        UModule.quickSort(times);

        for (int i = 0; i < times.size(); i++) {
            System.out.println("element " + i + " : " + times.get(i));
        }

        System.out.println();
        System.out.println("------- hours: different ordering --------");
        UModule.quickSort(times, Time::compareHours);

        for (int i = 0; i < times.size(); i++) {
            System.out.println(times.get(i));
        }

        System.out.println();
        System.out.println("------- minutes: different ordering --------");
        UModule.quickSort(times, Time::compareMinutes);

        for (int i = 0; i < times.size(); i++) {
            System.out.println(times.get(i));
        }
    }

    public static void main(String[] args) {
        DateTest();
        PayloadTest();
        TimeTest();

    }
}
