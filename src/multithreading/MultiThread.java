package multithreading;

class Queue {

	int num;
	boolean valueSet = false;

	public synchronized void getValue() {
		if (!valueSet) {
			try {
				wait();
			} catch (Exception e) {

			}
		}
		System.out.println("Get: " + num);
		valueSet = false;
		notify();
	}

	public synchronized void putValue(int num) {
		if (valueSet) {
			try {
				wait();
			} catch (Exception e) {

			}
		}
		this.num = num;
		System.out.println("Put: " + num);
		valueSet = true;
		notify();
	}

}

class Producers implements Runnable {

	Queue queue;

	public Producers(Queue queue) {
		this.queue = queue;
		Thread T1 = new Thread(this, "Producers");
		T1.start();
	}

	public void run() {
		int value = 0;
		while (true) {
			queue.putValue(value++);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {

			}
		}

	}

}

class Consumers implements Runnable {

	Queue queue;

	public Consumers(Queue queue) {
		this.queue = queue;
		Thread T2 = new Thread(this, "Consumers");
		T2.start();
	}

	public void run() {
		while (true) {
			queue.getValue();
			try {
				Thread.sleep(1000);
			} catch (Exception e) {

			}
		}
	}

}

public class MultiThread {
	public static void main(String[] args) {
		Queue queue = new Queue();
		new Producers(queue);
		new Consumers(queue);
	}
}
