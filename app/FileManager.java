package app;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

import java.util.Scanner;

public class FileManager {

    private String outputDirectory;
    private String inputFileLocation;
    private String csvFileLocation;

//    public FileManager() {
//        this("", "");
//    }
//
//    public FileManager(String inputLocation, String outDirectory) {
//        outputDirectory     = outDirectory;
//        inputFileLocation   = inputLocation;
//        csvFileHeader       = "";
//        list                = new ArrayList<>();
//    }
//
//    public static void filterCustomerDataByName(String customerName) throws FileNotFoundException {
//        String csvLocation = outputDirectory + File.separator + customerName + "_csv.csv";
//        String txtLocation = outputDirectory + File.separator + customerName + "_txt.txt";
//        File csvFile = new File(csvLocation);
//        File txtFile = new File(txtLocation);
//        PrintStream csvStream = new PrintStream(csvFile);
//        PrintStream txtStream = new PrintStream(txtFile);
//
//        Mission mission;
//        if(csvFile.exists() && txtFile.exists()) {
//            csvStream.println(csvFileHeader);
//
//            for (int i = 0; i < list.size(); i++) {
//                mission = list.get(i);
//                if(mission.get(i).getCustomer().getName().equals(customerName)) {
//                    csvStream.println(list.get(i).toCSVFormat());
//                    txtStream.println(list.get(i).toString());
//                }
//            }
//        }
//
//        csvStream.close();
//        txtStream.close();
//    }

    public static void filterNASA() {

    }

    public static void filterBermudaThailand() {

    }

    private Mission parse(String line) throws IllegalArgumentException {
        String[] str = line.split(",");
        String[] column = new String[10];

        for (int i = 0; i < str.length; i++) {
            column[i] = str[i];
        }

        if (str.length < column.length) {
            for (int i = str.length; i < column.length; i++) {
                column[i] = "";
            }
        }
        return null;
    }

    public void read(String location) throws FileNotFoundException {}

}
