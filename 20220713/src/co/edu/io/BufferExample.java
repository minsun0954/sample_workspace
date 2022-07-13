package co.edu.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Scanner;

/*
 * 보조스트림 생성
 * 바이트 기반 => 문자 기반 (InputStreamReader, OutputStreamWriter)
 * 				버퍼스트림(성능향상)
 * 
 */
public class BufferExample {
	public static void main(String[] args) {
	 
		bufferReaderWriter();
	}
	


	
	// 바이트 스트림 -> 문자 스트림
	public static void streamToWriter() {
		OutputStream os = System.out;			// 키보드 입력
		OutputStreamWriter osw = new OutputStreamWriter(os);
		
		Scanner scn = new Scanner(System.in);	
		System.out.println("입력> ");
		String text = scn.nextLine();
		
		try {
			osw.write(text + "\n");
			osw.write("실행. ");
			osw.flush();
			osw.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	public static void streamToReader() {
		InputStream is = System.in;			// 키보드 값을 입력 스트림으로 읽겠습니다
		InputStreamReader isr = new InputStreamReader(is);
		
		char[] cbuf = new char[10];
		System.out.println("입력> ");
		try {
			int b = isr.read(cbuf);
			for(int i=0; i<b; i++)
				System.out.print((char) cbuf[i]);
			
			System.out.println();
			isr.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("실행.");
	}
	
	
	
	// 버퍼스트림
		public static void bufferReaderWriter() {
			try {
				FileInputStream fis = new FileInputStream("c:/Dev/image.png");			// 입력 기본 스트림
				BufferedInputStream bis = new BufferedInputStream(fis);					// 입력 보조 스트림
				
				FileOutputStream fos = new FileOutputStream("c:/Dev/buffer.png");
				BufferedOutputStream bos = new BufferedOutputStream(fos);
			
				while(true) {
					int bt = bis.read();
					if(bt == -1) {
						break;
					}
					bos.write(bt);
					
				}
				bos.flush();
				bos.close();
				bis.close();
				fis.close();
				fos.close();
				
			}catch (IOException e) {
					e.printStackTrace();
			}
				
			System.out.println("실행.");
		}
		
			
	
	
	
}
