package co.edu.Thread;


class CalcThread extends Thread {
	public CalcThread(String name){
		setName(name);
	}

	@Override
	public void run() {
		for(int i =0; i<2000000000; i++) {
			if(i%50000000 == 0) {
				try {
					Thread.sleep(1);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		System.out.println("Tread: " + getName());
	}
}



public class PriorityExample {

	public static void main(String[] args) {
		for(int i = 1; i<= 10; i++) {
			Thread thread = new CalcThread("Thread-" + i);		// 스레드 반복 새로운 생성자 반복
			if(i != 10) {										// 우선순위 10이 제일 높음 => 많이 실행 됨 
				thread.setPriority(1);
			}else {
				thread.setPriority(10);
			}
			thread.start();
		}
	}

}
