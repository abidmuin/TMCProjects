import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HashMap<K, V> {
	private static final int INITIAL_CAPACITY = 16;
	private static final double LOAD_FACTOR = 0.75;
	private List<List<Node<K, V>>> buckets;
	private int size;

	public HashMap() {
		this.buckets = new ArrayList<>(INITIAL_CAPACITY);
		for (int i = 0; i < INITIAL_CAPACITY; i++) {
			buckets.add(new ArrayList<>());
		}
		this.size = 0;
	}

	private int getBucketIndex(K key) {
		return Math.abs(key.hashCode() % buckets.size());
	}

	public void put(K key, V value) {
		int index = getBucketIndex(key);
		List<Node<K, V>> bucket = buckets.get(index);

		for (Node<K, V> node : bucket) {
			if (node.getKey().equals(key)) {
				node.setValue(value);
				return;
			}
		}

		bucket.add(new Node<>(key, value));
		size++;

		if (size > LOAD_FACTOR * buckets.size()) {
			resize();
		}
	}

	public V get(K key) {
		int index = getBucketIndex(key);
		List<Node<K, V>> bucket = buckets.get(index);

		for (Node<K, V> node : bucket) {
			if (node.getKey().equals(key)) {
				return node.getValue();
			}
		}
		return null;
	}

	public void remove(K key) {
		int index = getBucketIndex(key);
		List<Node<K, V>> bucket = buckets.get(index);

		Iterator<Node<K, V>> iterator = bucket.iterator();
		while (iterator.hasNext()) {
			Node<K, V> node = iterator.next();
			if (node.getKey().equals(key)) {
				iterator.remove();
				size--;
				return;
			}
		}
	}

	private void resize() {
		List<List<Node<K, V>>> newBuckets = new ArrayList<>(buckets.size() * 2);
		for (int i = 0; i < newBuckets.size(); i++) {
			newBuckets.add(new ArrayList<>());
		}

		for (List<Node<K, V>> bucket : buckets) {
			for (Node<K, V> node : bucket) {
				int newIndex = Math.abs(node.getKey().hashCode() % newBuckets.size());
				newBuckets.get(newIndex).add(node);
			}
		}

		buckets = newBuckets;
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}
}
