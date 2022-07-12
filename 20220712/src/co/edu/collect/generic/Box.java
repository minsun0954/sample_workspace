package co.edu.collect.generic;
/*
 * 제너릭 : 사용하는 시점에 타입을 정해주겠다
 */
public class Box<T> {			
	private T obj;				// 임의의 타입을 주겠다 타입의 제한없이 매개변수 값에 넣을 수 있음
	
public void set(T obj) {		// public void set( Object obj)
	this.obj = obj;
}

public T get() {				// public Object get() 
	return obj;
}




}
