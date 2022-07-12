package co.edu.collect;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		// Arraylist vs LinkedList
		
		ArrayList<String> aList = new ArrayList<String>();
		
		
		LinkedList<String> lList = new LinkedList<String>();
		
		long start = System.currentTimeMillis();		// 현재시점 시간
		for(int i = 0; i<100000; i++) {
			aList.add(0,Integer.toString(i));
		}
		long end = System.currentTimeMillis();		
		System.out.println("aList 걸린시간: " + (end-start));
		
		
		start = System.currentTimeMillis();
		for(int i = 0; i<100000; i++) {
			lList.add(0,Integer.toString(i));
		}
		end = System.currentTimeMillis();		
		System.out.println("lList 걸린시간: " + (end-start));
		
		
	}

}
