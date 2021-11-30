package testing;

import app.*;
import app.Mission.Builder;
import modules.TModule;
import utility.ArrayList;
import modules.ModuleOne;
import modules.ModuleTwo;
import modules.UModule;
//import utility.List;
import java.util.List;

public class WarningDeleter {

    public static void main(String[] args) {

        //DATE
        Date Trevor = new Date(17, Month.SEP, 1993);
        Date Jared = new Date(22, Month.JAN, 1998);
        print(Trevor.compareTo(Jared));
        print(Trevor.toCSVFormat());


        //MONTH
        Month month2 = Month.FEB;
        Month month3 = Month.MAR;
        Month month4 = Month.APR;
        Month month5 = Month.MAY;
        Month month6 = Month.JUN;
        Month month7 = Month.JUL;
        Month month8 = Month.AUG;
        Month month10 = Month.OCT;
        Month month11 = Month.NOV;
        Month month12 = Month.DEC;


        //TIME
        Time Snoop = new Time(4, 20);
        print(Snoop.toCSVFormat());


        //PAYLOAD
        Payload Doge = new Payload("Much name", "Very type", 3, "Such orbit");
        print(Doge.toCSVFormat());


        //CUSTOMER


        //MISSION
        Builder Test = new Builder();
        Mission Test2 = new Mission(Test);
        Customer doggo = new Customer("Much name", "Many type"
                , "United Doge of Wow");
        Mission.Builder TeslaDogester = new Mission.Builder();
        print(TeslaDogester.setFlightNumber("Much Flight"));
        print(TeslaDogester.setLaunchDate(Trevor));
        print(TeslaDogester.setLaunchTime(Snoop));
        print(TeslaDogester.setLaunchSite("Such Site"));
        print(TeslaDogester.setVehicleType("Tesla Roadster"));
        print(TeslaDogester.setPayload(Doge));
        print(TeslaDogester.setCustomer(doggo));
        print(TeslaDogester.setMissionOutcome("Very Success"));
        print(TeslaDogester.setFailureReason("Bad doggo"));
        print(TeslaDogester.setLandingType("Wow"));
        print(TeslaDogester.setLandingOutcome("Good doggo"));

        String flightNumber = Test2.getFlightNumber();
        Date launchDate = Test2.getLaunchDate();
        Time launchTime = Test2.getLaunchTime();
        String launchSite = Test2.getLaunchSite();
        String vehicleType = Test2.getVehicleType();
        Payload payload = Test2.getPayload();
        Customer customer = Test2.getCustomer();
        String missionOutcome = Test2.getMissionOutcome();
        String failureReason = Test2.getFailureReason();
        String landingType = Test2.getLandingType();
        String landingOutcome = Test2.getLandingOutcome();

      //  print(Test2.compareMasses(Test2.getPayload(), TeslaDogester.payload));
        print(TeslaDogester.toCSVFormat());
        print(doggo.toCSVFormat());


        //LIST<E>
        ArrayList test = new ArrayList();
        test.clear();
        print(test.iterator());
        int[] data  = {2, 9, 4, 1, 7, 5, 3, 8, 6};
//        List<> arrayList1 = new List<>() {};
//        arrayList1.add(80);
//        arrayList1.add(20);
//        arrayList1.add(30);
//        arrayList1.add(10);
//        arrayList1.add(50);
//        arrayList1.add(5);
        ArrayList<Integer> arrayList2 = new ArrayList<> ();
        arrayList2.add(80);
        arrayList2.add(20);
        arrayList2.add(30);
        arrayList2.add(10);
        arrayList2.add(50);
        arrayList2.add(5);
        ModuleOne.indexOf(data, 7);
        ModuleTwo.binarySearch(data, 7);
        print(ModuleTwo.minIndex(data, 2));
        ModuleTwo.binarySearch(data, 7);
       // utility.List<Integer> list = new List();
       // TModule.binarySearch(list, 20);

    }
    public static <T> void print(T type) {
        System.out.println(type);
    }
}
