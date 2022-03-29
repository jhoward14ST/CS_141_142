package testing;

import modules.ModuleOne;
import modules.ModuleTwo;

import static modules.ModuleOne.binarySearch;
import static modules.ModuleOne.selectionSort;
import static modules.ModuleOne.bubbleSort;
import static modules.ModuleOne.insertionSort;
import static modules.ModuleTwo.mergeSort;
import static modules.ModuleTwo.quickSort;
import static modules.ModuleTwo.selectionSort;

public class AlgorithmsTest {

    public static void checkBinarySearch(int[] data){
        System.out.println();
        System.out.println(" ---- B I N A R Y    S E A R C H -----");
        System.out.println();
        print(data);
        System.out.println("location of 2: " + binarySearch(data, 2));
        System.out.println("location of 5: " + binarySearch(data, 5));
        System.out.println("location of 9: " + binarySearch(data, 9));
        System.out.println();
    }

    public static void checkBubbleSort(int[] data) {
        System.out.println(" ---- B U B B L E   S O R T -----");
        System.out.println("Data before bubble sort.");
        print(data);
        bubbleSort(data);
        System.out.println("Data after bubble sort.");
        print(data);
    }

    public static void checkInsertionSort(int[] data) {
        System.out.println(" ---- I N S E R T I O N   S O R T -----");
        System.out.println("Data before insertion sort.");
        print(data);
        insertionSort(data);
        System.out.println("Data after insertion sort.");
        print(data);
    }

    public static void checkMergeSort(int[] data) {
        System.out.println(" ---- M E R G E    S O R T -----");
        System.out.println("Data before merge sort.");
        print(data);
        mergeSort(data);
        System.out.println("Data after merge sort.");
        print(data);
    }

    public static void checkQuickSort(int[] data) {
        System.out.println(" ---- Q U I C K    S O R T -----");
        System.out.println("Data before quick sort.");
        print(data);
        quickSort(data);
        System.out.println("Data after quick sort.");
        print(data);
    }

    public static void checkRecursiveBinarySearch(int[] data){
        System.out.println();
        System.out.println(" ---- R E C U R S I V E   B I N A R Y   S E A R C H -----");
        System.out.println();
        print(data);
        System.out.println("location of 2: " + binarySearch(data, 2));
        System.out.println("location of 5: " + binarySearch(data, 5));
        System.out.println("location of 9: " + binarySearch(data, 9));
        System.out.println();
    }

    public static void checkISelectionSort(int[] data) {
        System.out.println(" ---- I T E R A T I V E    S E L E C T I O N    S O R T -----");
        print(data);
        ModuleOne.selectionSort(data);
        print(data);
        System.out.println();
    }
    public static void checkRSelectionSort(int[] data) {
        System.out.println(" ---- R E C U R S I V E    S E L E C T I O N    S O R T -----");
        print(data);
        ModuleTwo.selectionSort(data);
        print(data);
        System.out.println();
    }

    public static void intro(){
        System.out.println();
        System.out.println();
        System.out.println("***************************************************");
        System.out.println();
        System.out.println();
        System.out.println(" \t \t \t \t  W E L C O M E  ");
        System.out.println();
        System.out.println(" A L G O R I T H M S    T E S T    P R O G R A M");
        System.out.println();
        System.out.println();
        System.out.println("***************************************************");
        System.out.println();
        System.out.println();
    }

    public static void main(String[] args) {
        intro();
        int[] data  = {2, 9, 4, 1, 7, 5, 3, 8, 6};
        int[] data1 = {2, 5, 7, 1, 4, 3, 6};
        int[] data2 = {1, 2, 4, 5, 6, 8, 9};
        int[] data3 = {2, 5, 11, 1, 9, 4, 16, 8, 13};

//        checkBubbleSort(data);
//        checkISelectionSort(data);
//        checkRSelectionSort(data);
//        checkInsertionSort(data);

//        checkMergeSort(data3);
//        checkQuickSort(data3);
//
//        checkBinarySearch(data2);
//        checkRecursiveBinarySearch(data2);

    }

    public static void print(int[] list) {

        for(int i = 0; i < list.length; i++) {
            System.out.print("[" + i + "]");
        }
        System.out.println();

        //This uses a for-each loop to print out list
        for(int item : list) {
            System.out.print(" " + item + " ");
        }
        System.out.println();
        System.out.println();
    }
}
