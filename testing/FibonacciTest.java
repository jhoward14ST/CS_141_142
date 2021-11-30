package testing;

import static modules.FibModule.print;
import modules.FibModule;

public class FibonacciTest {

    public static void checkIterative(int n){
        System.out.println("\t \t \t I T E R A T I V E   -   ifib(n)");
        System.out.println();
        print(FibModule::ifib, n);
        System.out.println();
    }

    public static void checkMemoization(int n){
        System.out.println("\t \t \t M E M O I Z A T I O N   -   mfib(n)");
        System.out.println();
        print(FibModule::mfib, n);
        System.out.println();
    }

    public static void checkRecursive(int n){
        System.out.println("\t \t \t R E C U R S I V E   -   fib(n)");
        System.out.println();
        print(FibModule::fib, n);
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
        System.out.println(" F I B O N A C C I    T E S T    P R O G R A M");
        System.out.println();
        System.out.println();
        System.out.println("***************************************************");
        System.out.println();
        System.out.println();
    }

    public static void main(String[] args) {
        intro();
//        checkRecursive(21);
//          checkRecursive(42);
//        checkRecursive(49);
//        checkMemoization(21);
//        checkMemoization(42);
//        checkMemoization(49);
//        checkMemoization(500);
//        checkIterative(21);
//        checkIterative(42);
//        checkIterative(49);
//        checkIterative(500);
    }

}
