public class MainProgram {

	public static void main(String[] args) {
		// write your test code here
		int[] array = {3, 1, 5, 99, 3, 12};

		// Part 01
//		int[] numbers = {6, 5, 8, 7, 11};
//		System.out.println("Smallest: " + MainProgram.smallest(numbers));

		// Part 02
		// indices:      0  1  2  3  4
//		int[] numbers = {6, 5, 8, 7, 11};
//		System.out.println("Index of the smallest number: " + MainProgram.indexOfSmallest(numbers));

		// Part 03
		// indices:       0  1  2  3   4
		int[] numbers = {-1, 6, 9, 8, 12};
		System.out.println(MainProgram.indexOfSmallestFrom(numbers, 0));
		System.out.println(MainProgram.indexOfSmallestFrom(numbers, 1));
		System.out.println(MainProgram.indexOfSmallestFrom(numbers, 2));
	}

	// Part 01
	public static int smallest(int[] array) {
		int smallest = array[0];

		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] < smallest) {
				smallest = array[i];
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

		return 1;

	}

}
