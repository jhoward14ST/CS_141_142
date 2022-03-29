package app;

import java.io.File;
import java.io.FileNotFoundException;

public class MissionControl {

    public static void main(String[] args) throws FileNotFoundException {

        Mission mission = new Mission.Builder()
                .setFlightNumber("F1-3")
                .setFailureReason("Collision During Launch")
                .build();

        System.out.println(mission);
    }
}
