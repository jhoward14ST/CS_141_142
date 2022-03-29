
public class ArraysExamples {
	public static void main(String[] args) {
		double[] expenses = { 10.0, 30.50, 12.75, 45, 0.0};//create an array
		
		//print the elements of the array, one on each line
		for (int i = 0; i < expenses.length; i++) {
			System.out.println(expenses[i]);
		}
		
		//find the sum of all the elements in the array
		double total = 0;
		for (int i = 0; i < expenses.length; i++) {
			//total = total + expenses[i];
			total += expenses[i];
		}
		System.out.println("The total is: " + total);
		
		//scale all the elements by 2
		for (int i = 0; i < expenses.length; i++) {
			expenses[i] = expenses[i] * 2;
		}
		
		for (int i = 0; i < expenses.length; i++) {
			System.out.println(expenses[i]);
		}
		
		//make an array of the y-values of a the function f(x), for inputs x = 0, 1, 2, 3, ..., 9 
		double[] yValues = new double[10];
		for (int i = 0; i < yValues.length; i++) {
			yValues[i] = f(i);
		}
		
		System.out.println( java.util.Arrays.toString(yValues) );

		int [] a3 = {7, 4, 8, 6, 2};
		arrayMystery(a3);
		System.out.println( java.util.Arrays.toString(a3) );
		

		
	}
	
	public static void arrayMystery(int[] a) {
		for (int i = 1; i < a.length; i++) {
			a[i] = i + a[i-1] - a[i];
			}
		}
	
		public static double f( double x) {
			return x * x * x; //f(x) = x^3
		

		
}
}
