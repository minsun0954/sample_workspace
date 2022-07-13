package co.edu.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class charExample {
	public static void main(String[] args) {
		
		try {
			FileReader fr = new FileReader ("c:/Dev/test.txt");
			char[] cbuf = new char[10];				// 10글자읽기
			int buf = 0;
			while((buf = fr.read(cbuf))!= -1) {
				for(int i = 0; i < buf; i++) {
					System.out.print(cbuf[i]);		// 읽어드린 버퍼의 크기만큼 반복
				}
				System.out.println();
			}
			fr.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("실행. ");
		
	}
		
		

	
	
// 문자열 기반 출력 스트림
public static void writer1() {
	Scanner scn = new Scanner(System.in);
	System.out.println("입력> ");
	String txt = "";
	try {
		FileWriter fw = new FileWriter("c:/Dev/test.txt");	// 파일만듦
		
		while(true) {							
			try{
				txt = scn.nextLine();					// 읽은 값을 담겠다  
			}catch(NoSuchElementException e) {			// ctrl z 누르면 실행 
				break;
			}
			fw.write(txt + "\n");
		}
		fw.flush();
		fw.close();
		
	} catch (IOException e) {
		e.printStackTrace();
	}
	System.out.println("실행. ");
}




public static void reader1() {
	
	try {
		FileReader fr = new FileReader("c:/Dev/test.txt");		
		while(true) {
			int buf = fr.read();
			if(buf == -1) {
				break;
			}
			System.out.print((char)buf);			//(char) 안해주면 숫자값 출력
		}
		fr.close();
		
	} catch (IOException e) {
		e.printStackTrace();
	}
	System.out.println("실행. ");
}
	

	
	
	
}
