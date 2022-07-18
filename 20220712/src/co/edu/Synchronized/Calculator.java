package co.edu.Synchronized;

public class Calculator {
	private int memory;
	
public int getMomory() {
		return memory;		
}
	
	
	
public synchronized void setMemory(int memory) {			// synchronized 있으면 User-1  :  100 User-2  :  50
															// synchronized 없으면 User-2  :  50  User-1  :  50

	this.memory = memory;
	
	try {
		Thread.sleep(2000);
	}catch (InterruptedException e) {
		e.printStackTrace();
	}
	System.out.println(Thread.currentThread().getName() + "  :  "+ this.memory);
}
}
