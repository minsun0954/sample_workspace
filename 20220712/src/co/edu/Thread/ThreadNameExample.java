package co.edu.Thread;
// Thread 상속 1)ThreadA 2)ThreadB
// 멀티 스레드라서 순서 랜덤 실행됨

class ThreadA extends Thread{
	public ThreadA () {
		setName("Tread-A");
	}

	@Override
	public void run() {
		for(int i = 0; i < 2; i++) {
			System.out.println("Thread명 = " + getName());
		}
	}	
}

class ThreadB extends Thread{
	public ThreadB () {
		setName("Tread-B");
	}

	@Override
	public void run() {
		for(int i = 0; i < 2; i++) {
			System.out.println("Thread명 = " + getName());
		}
	}
}	


public class ThreadNameExample {
	public static void main(String[] args) {
		Thread threadA = new ThreadA();
		threadA.start();
		
		Thread threadB = new ThreadB();
		threadB.start();
	}
}
