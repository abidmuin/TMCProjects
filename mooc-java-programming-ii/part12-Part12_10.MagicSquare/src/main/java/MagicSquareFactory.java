public class MagicSquareFactory {

	public MagicSquare createMagicSquare(int size) {

		MagicSquare square = new MagicSquare(size);

		// implement the creation of a magic square with the Siamese method algorithm here
		int number = 1;
		int row = 0;
		int column = size / 2;
		int totalSize = size * size;

		while (number <= totalSize) {
			square.placeValue(row, column, number);
			number++;

			// update row and column
			int updatedRow = (row - 1 + size) % size;
			int updatedColumn = (column + 1) % size;

			if (square.readValue(updatedRow, updatedColumn) != 0) {
				row = (row + 1) % size;
			} else {
				row = updatedRow;
				column = updatedColumn;
			}
		}

		return square;
	}
}
