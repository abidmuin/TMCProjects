public class List<Type> {
	private Type[] values;
	private int firstFreeIndex;

	public List() {
		this.values = (Type[]) new Object[10];
		this.firstFreeIndex = 0;
	}

	public void add(Type value) {
		if (this.firstFreeIndex == this.values.length) {
			grow();
		}

		this.values[this.firstFreeIndex] = value;
		this.firstFreeIndex++;
	}

	private void grow() {
		int newSize = this.values.length + this.values.length / 2;
		Type[] newValues = (Type[]) new Object[newSize];

		System.arraycopy(this.values, 0, newValues, 0, this.values.length);

		this.values = newValues;
	}

	public boolean contains(Type value) {
		for (int i = 0; i < this.firstFreeIndex; i++) {
			if (this.values[i].equals(value)) {
				return true;
			}
		}

		return false;
	}


}