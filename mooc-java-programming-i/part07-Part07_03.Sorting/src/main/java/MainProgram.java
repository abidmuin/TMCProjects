import java.util.Arrays;

public class MainProgram {

	public static void main(String[] args) {
		// write your test code here
//		int[] array = {3, 1, 5, 99, 3, 12};

		// Part 01
//		int[] numbers = {6, 5, 8, 7, 11};
//		System.out.println("Smallest: " + MainProgram.smallest(numbers));

		// Part 02
		// indices:      0  1  2  3  4
//		int[] numbers = {6, 5, 8, 7, 11};
//		System.out.println("Index of the smallest number: " + MainProgram.indexOfSmallest(numbers));

		// Part 03
		// indices:       0  1  2  3   4
//		int[] numbers = {-1, 6, 9, 8, 12};
//		System.out.println(MainProgram.indexOfSmallestFrom(numbers, 0));
//		System.out.println(MainProgram.indexOfSmallestFrom(numbers, 1));
//		System.out.println(MainProgram.indexOfSmallestFrom(numbers, 2));

		// Part 04
//		int[] numbers = {3, 2, 5, 4, 8};
//		System.out.println(Arrays.toString(numbers));
//		MainProgram.swap(numbers, 1, 0);
//		System.out.println(Arrays.toString(numbers));
//		MainProgram.swap(numbers, 0, 3);
//		System.out.println(Arrays.toString(numbers));

		// Part 05
//		int[] numbers = {8, 3, 7, 9, 1, 2, 4};
//		MainProgram.sort(numbers);
	}

	// Part 01
	public static int smallest(int[] array) {
		int smallest = Integer.MAX_VALUE;

		for (int num : array) {
			if (num < smallest) {
				smallest = num;
			}
		}

		return smallest;
	}

	// Part 02
	public static int indexOfSmallest(int[] array) {
		int smallest = smallest(array);
		int index = 0;

		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] == smallest) {
				index = i;
				break;
			}
		}

		return index;
	}

	// Part 03
	public static int indexOfSmallestFrom(int[] table, int startIndex) {
		int smallestNumber = smallest(Arrays.copyOfRange(table, startIndex, table.length));
		int index = startIndex;

		for (int i = startIndex; i < table.length; i++) {
			if (table[i] == smallestNumber) {
				index = i;
			}
		}

		return index;
	}

	// Part 04
	public static void swap(int[] array, int index1, int index2) {
		int num1 = array[index1];
		int num2 = array[index2];

		num1 = num1 ^ num2;
		num2 = num1 ^ num2;
		num1 = num1 ^ num2;

		array[index1] = num1;
		array[index2] = num2;
	}

	// Part 05
	public static void sort(int[] array) {
		// Selection Sort
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					swap(array, i, j);
				}
			}
			System.out.println(Arrays.toString(array));
		}
	}

}
