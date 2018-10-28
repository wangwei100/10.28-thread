package name.helloworld.thread;

public class Test1 {
	private static int num;
	private static final int threadNum = 3;
	private static final int loopNum = 2;
	private static final int singleThreadLoopNum = 10;
	static {
		num = 0;
	}

	public synchronized void CallbackMethod(String threadNum) {
		for (int i = 1; i <= singleThreadLoopNum; i++) {
			System.out.println(threadNum + ":" + (++num));
		}
	}

	public void printNum() throws InterruptedException {
		for (int i = 1; i <= loopNum; i++) {
			for (int j = 1; j <= threadNum; j++) {
				Worker runnable = new Worker(this);
				Thread thread = new Thread(runnable);
				thread.setName("线程" + j);
				thread.start();
				thread.join();
			}
		}
	}

	public static void main(String[] args) throws InterruptedException {
		Test1 t = new Test1();
		t.printNum();
	}
}

class Worker implements Runnable {
	private Test1 printCallback;

	public Worker(Test1 printCallback) {
		this.printCallback = printCallback;
	}

	public void run() {
		printCallback.CallbackMethod(Thread.currentThread().getName());
	}
}