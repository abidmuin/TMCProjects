public class Program {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();

		map.put("one", 1);
		map.put("two", 2);
		map.put("three", 3);

		System.out.println("Value for 'two': " + map.get("two")); // 2

		map.remove("two");
		System.out.println("Value for 'two' after removal: " + map.get("two")); // null

		System.out.println("Size of map: " + map.size()); // 2
		System.out.println("Is map empty? " + map.isEmpty()); // false
	}
}
