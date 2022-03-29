package testing;

import modules.UModule;

import utility.ArrayList;
import utility.Comparator;
import utility.List;

//Class for testing utility package sorting algorithms
public class CompareTestUtility2 {

    public static void intro(){
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

    public static class Stock implements Comparator<Stock> {
        String name;
        int price;

        public Stock(String name, int price) {
            this.name = name;
            this.price = price;
        }

        public int getPrice() {
            return price;
        }

        public String getName() {
            return name;
        }

        public String toString() {
            return name + ": " + price;
        }

        public static int comparePrices(Stock first, Stock second) {
            return Double.compare(first.getPrice(), second.getPrice());
        }

        public static int compareNames(Stock first, Stock second) {
            return CharSequence.compare(first.getName(), second.getName());
        }

        @Override
        public int compare(Stock first, Stock second) {
            return 0;
        }
    }

    public static void CompareStocks() {
        System.out.println();
        System.out.println("***************************************************");
        System.out.println();
        Stock BA = new Stock("BA", 300);
        Stock SPOT = new Stock("SPOT", 500);
        Stock ARKK = new Stock("ARKK", 100);
        Stock VB = new Stock("VB", 250);
        Stock AMZN = new Stock("AMZN", 3200);
        Stock FPX = new Stock("FPX", 150);
        Stock BTC = new Stock("BTC", 30000);

        List<Stock> stocks = new ArrayList<Stock>();
        stocks.add(BA);
        stocks.add(SPOT);
        stocks.add(ARKK);
        stocks.add(VB);
        stocks.add(AMZN);
        stocks.add(FPX);
        stocks.add(BTC);

        List stocks2 = new ArrayList();
        stocks2.add("BA");
        stocks2.add("SPOT");
        stocks2.add("ARKK");
        stocks2.add("VB");
        stocks2.add("AMZN");
        stocks2.add("FPX");
        stocks2.add("BTC");

        System.out.println("------- dimensions: before sorting --------");
        for (int i = 0; i < stocks2.size(); i++) {
            System.out.println("element " + i + ": " + stocks2.get(i));
        }

        System.out.println();
        System.out.println("------- dimensions: natural ordering --------");
        UModule.quickSort(stocks2);

        for(int i = 0; i < stocks.size(); i++) {
            System.out.println("element " + i + " : " + stocks2.get(i));
        }

        System.out.println();
        System.out.println("------- prices: different ordering --------");
        UModule.quickSort(stocks, Stock::comparePrices);

        for (int i = 0; i < stocks.size(); i++) {
            System.out.println(stocks.get(i));
        }

        System.out.println();
        System.out.println("------- names: different ordering --------");
        UModule.quickSort(stocks, Stock::compareNames);

        for (int i = 0; i < stocks.size(); i++) {
            System.out.println(stocks.get(i));
        }
    }

    public static void main(String[] args) {
        CompareStocks();

    }
}
