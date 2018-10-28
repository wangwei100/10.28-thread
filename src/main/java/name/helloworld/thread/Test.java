package name.helloworld.thread;

public class Test {
	public static void main(String[] args) {
		// for (int i = 0; i < 10; i++) {
		// int k = i * 10 + 1;

		ThreadTest t = new ThreadTest();
		for (int i = 0; i < 10; i++) {
			Thread t1 = new Thread(t, "t1");
			Thread t2 = new Thread(t, "t2");
			// Thread t3 = new Thread(t, "t3");
			// Thread t4 = new Thread(t, "t4");
			// Thread t5 = new Thread(t, "t5");
			// Thread t6 = new Thread(t, "t6");
			// Thread t7 = new Thread(t, "t7");
			// Thread t8 = new Thread(t, "t8");
			// Thread t9 = new Thread(t, "t9");
			// Thread t10 = new Thread(t, "t10");

			t1.start();
			t2.start();
			// t3.start();
			// t4.start();
			// t5.start();
			// t6.start();
			// t7.start();
			// t8.start();
			// t9.start();
			// t10.start();
		}
	}

}

class ThreadTest extends Thread {
	private int count = 0;

	// public ThreadTest(int k) {
	//
	// }

	// public Add(int n) {
	// number=n;
	// }

	public synchronized void run() {
		// for (int i = 0; i < 10; i++) {
		// int k = i * 10 + 1;
		// Add add = new Add(k);
		// }
		for (int j = 0; j < 5; j++) {
			count++;
			System.out.println(Thread.currentThread().getName() + ",count:" + count);
		}
	}
}