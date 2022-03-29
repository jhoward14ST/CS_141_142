import java.util.Arrays;

public class ArrayUtilities {

	public static void main(String[] args) {
		// some arrays to test
		int[] grades = { 20, 50, 50, 100, 40, 30 };
		int[] quizzes = { 20, 50, 50, 100, 40, 30 };
		// String gradeString = Arrays.toString(grades);
		// System.out.println(gradeString);
		// System.out.println(Arrays.equals(grades, quizzes));

		// printArray(grades);
		// System.out.println(areArraysEqual(grades, quizzes));
		//
		// printArray(quizzes);
		// swap(quizzes, 0,1);
		printArray(quizzes);

		// bubbleSort(grades);

	}

	// print an array, with [ ] around it and commas between the entries
	public static void printArray(int[] arr) {
		System.out.print("[");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			if (i != arr.length - 1) { // if we're not at the very end, print the comma
				System.out.print(", ");
			}
		}
		System.out.println("]");
	}

	// test if two int arrays are equal
	public static boolean areArraysEqual(int[] array1, int[] array2) {
		if (array1.length != array2.length) { // return false if arrays are different lengths
			return false;
		}

		for (int i = 0; i < array1.length; i++) {
			if (array1[i] != array2[i]) {
				return false;
			}
		}
		return true; // if we got the end, there were no indices where the elements differed.
	}

	// swap two elements of an array at the given indices
	public static void swap(int[] arr, int i, int j) {
		// try this: (it doesn't work)
		// arr[i] = arr[j]; //arr[i] takes the value of arr[j]
		// arr[j] = arr[i]; //arr[j] takes the NEW arr[i] value, which is the old arr[j]

		int temp = arr[i]; // saves the old value
		arr[i] = arr[j]; // overwrites arr[i]
		arr[j] = temp; // gives arr[j] the old value for arr[i]
	}

	// sorts the given int array using the Bubble Sort algorithm
	public static void bubbleSort(int[] arr) {
		// outer loop goes here
		for (int j = 0; j < arr.length - 1; j++) {
			printArray(arr);
			for (int i = 0; i < arr.length - 1 - j; i++) {
				if (arr[i] > arr[i + 1]) { // if they are out of order
					swap(arr, i, i + 1); // swap them
				}
			}
		}
	}




}