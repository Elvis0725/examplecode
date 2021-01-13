class Test {
	volatile static int i = 0;
	volatile static int j = 0;

	static void one() {
		i++;
		j++;
	}

	static void two() {
		System.out.println("i=" + i + " j=" + j);
	}

	public static void main(String[] args) {
		Thread thread = new Thread(new Runnable() {

			@Override
			public void run() {
				while (true) {

					one();
				}
			}
		});
		Thread thread1 = new Thread(new Runnable() {

			@Override
			public void run() {
				while (true) {
					two();
				}
			}
		});
		thread.start();
		thread1.start();
	}
}
