
public class HashMapTest {

	public static void main(String[] args) throws InterruptedException {
		for (int i = 0; i < 1000; i++) {
			if (hash(i) % 8 == 0) {
				System.out.println(i);
			}
		}

		final HashMap<Integer, Integer> map = new HashMap<Integer, Integer>(4,
				0.5f);

		map.put(0, 0);
		map.put(8, 8);

		Thread threadA = new Thread(new Runnable() {
			@Override
			public void run() {
				map.put(1, 1);
			}
		}, "threadA");
		threadA.start();

		Thread threadB = new Thread(new Runnable() {
			@Override
			public void run() {
				map.put(2, 2);
			}
		}, "threadB");
		threadB.start();

		threadA.join();
		threadB.join();

		map.get(17);

	}

	static int hash(int h) {
		// This function ensures that hashCodes that differ only by
		// constant multiples at each bit position have a bounded
		// number of collisions (approximately 8 at default load factor).
		h ^= (h >>> 20) ^ (h >>> 12);
		return h ^ (h >>> 7) ^ (h >>> 4);
	}

}
