package testing;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class ListFileTest {
    public static void read(String location, List<String> list) throws FileNotFoundException {
        File file               = new File(location);
        Scanner input           = new Scanner(file);
        String[] array;
        String   line;
        List<String> items      = new ArrayList<>();
        while(input.hasNextLine()) {
            //read in using " " delimiter each word and then add to list.
            line     = input.nextLine();
            array    = line.split(" ");
            // reverse items
            for (int i = array.length - 1; i >= 0; i--) {
                items.add(array[i]);
            }
            //put the items into a line string
            StringBuilder builder = new StringBuilder();
            for (String item : items) {
                builder.append(item).append(" ");
            }
            // assign it to be added to overall list
            line = builder.toString();
            list.add(line); // then add each item by using another loop
            // clear out the contents items
            items.clear();
        }
        input.close();
    }
    public static void write(String location, List<String> list) throws FileNotFoundException {
        PrintStream output      = new PrintStream(location);
        StringBuilder builder   = new StringBuilder();
        for (String data : list) {
            builder.append(data).append("\n");
        }
        output.print(builder);
        output.close();
    }
    // specify a newline character before reading it in. each line that you're reading in in terms of the get feature, you're going to have to ...
    public static void main(String[] args) throws FileNotFoundException{
        String inputLocation    = File.separator + "Users" + File.separator + "Jared" + File.separator + "Desktop" +
                File.separator + "COLLEGE" + File.separator + "Seattle Central" + File.separator + "CSC 143" +
                File.separator + "GitHub directory" + File.separator + "my-api-jhoward14ST" + File.separator + "data" +
                File.separator + "words.txt";
        String outputLocation   = File.separator + "Users" + File.separator + "Jared" + File.separator + "Desktop" +
                File.separator + "COLLEGE" + File.separator + "Seattle Central" + File.separator + "CSC 143" +
                File.separator + "GitHub directory" + File.separator + "my-api-jhoward14ST" + File.separator + "data" +
                File.separator + "reverse_words.txt";
        // TODO: update program to use an Array List
        List<String> list = new ArrayList<>();
        // TODO: process items in file (REVERSALS, can be done either in main or in read)
        read(inputLocation, list);
        write(outputLocation, list);
    }
}
