package modules;

import utility.FibFunction;

public class FibModule {

    public static long fib(int n) {
        if ((n == 0) || (n == 1)) {
            return n;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }

    public static long ifib(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            long fn = 0;
            long fn_2 = 0;
            long fn_1 = 1;

            for (int i = 2; i <= n; i++) {
                fn = fn_1 + fn_2;
                fn_2 = fn_1;
                fn_1 = fn;
            }
            return fn;
        }
    }

    public static long mfib(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            long[] x = new long[n + 1];
            x[0] = 0;
            x[1] = 1;
            return memo(n, x);
        }
    }

    private static long memo(int n, long[] x) {
        if(x[n] == 0)
            x[n] = memo(n - 1, x) + x[n - 2];
        return x[n];
    }

    public static void print(FibFunction f, int n){
        // PRINTS : count of nth factorial
        System.out.print("------------------------- nth Fibonacci ");
        System.out.println("-----------------------");
        for (int i = 0; i <= n; i++ ) {
            System.out.print(i + "\t");
        }
        System.out.println();

        //PRINTS : value for nth factorial
        for (int i = 0; i <= n; i++ ) {
            System.out.print(f.fib(i) + "\t");
        }
        System.out.println();
    }

}
