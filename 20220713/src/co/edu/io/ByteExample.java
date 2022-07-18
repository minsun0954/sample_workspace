package co.edu.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class ByteExample {
	public static void main(String[] args) {
		long start = System.nanoTime();
		try {
			FileInputStream fis = new FileInputStream("c:/Dev/image.png");
			FileOutputStream fos = new FileOutputStream("c:/Dev/image2.png");
			byte[] buff = new byte[100];
			
			while(true) {
				int buf = fis.read(buff);
				if(buf == -1) {
				break;
				}
				fos.write(buff);
			}
			fos.flush();
			fos.close();
			fis.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		long end = System.nanoTime();
		System.out.println("처리시산: "+ (end-start));
		
		
	}
	
//바이트 기반 입력 스트림	
public static void read1() {						// 예외 처리 : 파일이 존재하는지 안하는지 체크
	try {
		FileInputStream fis = new FileInputStream("c:/Dev/data1.dat");
			
		while(true) {
			int buf = fis.read();			// while문 읽어드릴파일이 없을땨까지
			if(buf == -1) {
				break;
			}
			System.out.println(buf);
		}
		fis.close();
			
	} catch (IOException e) {
		e.printStackTrace();
	}
	System.out.println("실행.");
		
	}



// 바이트 기반 출력 스트림
public static void write1() {
	
	try {
		FileOutputStream fos = new FileOutputStream("c:/Dev/data1.dat");		// data1.dat파일만듦
		byte a = 10 , b =20, c =20;
		
		fos.write(a);
		fos.write(b);
		fos.write(c);
		
		fos.flush();
		fos.close();
		
	} catch (IOException e) {
		
		e.printStackTrace();

	}
	System.out.println("실행.");
 }



// 배열 기반 출력 스트림
public static void write2() {
	byte[] arr = {10, 20, 30};
	FileOutputStream fos;
	try {
		fos = new FileOutputStream("c:/Dev/data2.dat");
		fos.write(arr);
		fos.flush();
		fos.close();
		
	} catch (IOException e) {
		e.printStackTrace();
	}
	System.out.println("실행.");
}		

//배열 기반 읽기 스트림
public static void read2() {
	try {
		FileInputStream fis = new FileInputStream("c:/Dev/data2.dat");
		
		byte[] arr = new byte[2];		// 한번에 2바이트씩 읽는 배열
		
		while(true) {
			int buf = fis.read(arr);
			if(buf == -1) {		// -1 읽을값이 없으면
			break;
			}
				for(int i = 0; i < buf; i++) {
				System.out.print(arr[i]);
				}
				System.out.println();
		}	
		fis.close();
	} catch (IOException e) {
		e.printStackTrace();
	}
	System.out.println("실행.");
}




}
