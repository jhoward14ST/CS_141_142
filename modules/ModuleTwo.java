package modules;

import static modules.ModuleOne.swap;
/****************************************************************
 * Update the methods with the recursive versions
 * discussed in this class.
 * NOTE : Methods CANNOT use any special methods from Java API.
 ****************************************************************/

public class ModuleTwo {

    public static void binarySearch(int[] data, int target) {
        int min = data[0];
        int max = data[data.length - 1];
        binarySearch(data, target, min, max);
    }

    private static int binarySearch(int[] data, int target, int min, int max) {
            if (max >= 1 && 1 < data.length - 1) {
                int mid = min + (max - min) / 2;
                if (data[mid] == target) {
                    return mid;
                }
                if (data[mid] > target) {
                    return binarySearch(data, target, min, mid - 1);
                } else {
                    return binarySearch(data, target, mid + 1, max);
                }
            }
            return -1;
    }

    private static int[] makeFirstHalf(int[] data) {
        int midpoint = data.length / 2;
        int[] firstHalf = new int[midpoint];
        System.arraycopy(data, 0, firstHalf, 0, firstHalf.length);
        return firstHalf;
    }

    private static int[] makeSecondHalf(int[] data) {
        int midpoint = data.length / 2;
        int[] secondHalf = new int[midpoint];
        System.arraycopy(data, midpoint, secondHalf, 0, secondHalf.length);
        return secondHalf;
    }

    private static void merge(int[] data, int[] left, int[] right) {
        int index = 0;
        int leftIndex = 0;
        int rightIndex = 0;

        while (leftIndex < left.length && rightIndex < right.length) {
            if (left[leftIndex] < right[rightIndex]) {
                data[index++] = left[leftIndex++];
            } else {
                data[index++] = right[rightIndex++];
            }
        }
        while (leftIndex < left.length) {
            data[index++] = left[leftIndex++];
        }
        while (rightIndex < right.length) {
            data[index++] = right[rightIndex++];
        }
    }

    public static void mergeSort(int[] data) {
        if (data.length > 1) {
            int[] left = makeFirstHalf(data);
            int[] right = makeSecondHalf(data);
            mergeSort(left);
            mergeSort(right);
            merge(data, left, right);
        }

        }

    private static int partition(int[] data, int low, int high) {
        int midpoint = low + (high - low) / 2;
        int pivot = data[midpoint];
        boolean done = false;
        while(!done) {
            while (data[low] < pivot) {
                low++;
            }
            while (pivot < data[high]) {
                high--;
            }
            if (low >= high) {
                done = true;
            } else {
                int temp = data[low];
                data[low] = data[high];
                data[high] = temp;
                low++;
                high--;
            }
        }
        return high;
    }

    public static void quickSort(int[] data) {
        int max = data.length - 1;
        quickSort(data, 0, max);
    }

    private static void quickSort(int[] data, int min, int max) {
        int mid;
        if (min >= max) {
            //noinspection UnnecessaryReturnStatement
            return;
        } else {
            mid = partition(data, min, max);
            quickSort(data, min, mid);
            quickSort(data, mid + 1, max);
        }
    }

    public static void selectionSort(int[] data) {
        selectionSort(data, 0);
    }

    private static void selectionSort(int[] data, int start) {
        if (start < data.length - 1) {
            int minIndex = start;

            for (int i = start + 1; i < data.length; i++) {
                if (data[i] < data[minIndex]) {
                    minIndex = i;
                }
            }
        swap(data, start, minIndex);
        selectionSort(data, start + 1);
    }
    }

    public static int minIndex(int[] data, int min) {
        int index = min;
        if (min >= data.length | min < 0) {
            return -1;
        } else {
            for(int i = min + 1; i < data.length; i++) {
                if(data[i] < data[index])
                    index = i;
            }
        }
        return index;
    }
    }
