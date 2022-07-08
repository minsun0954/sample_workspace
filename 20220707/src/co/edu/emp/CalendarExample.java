package co.edu.emp;

import java.util.Calendar;
import java.util.Scanner;
/*
 * 캘린더 연습
 */
public class CalendarExample {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();						
		System.out.println(cal.get(Calendar.YEAR)+"년");
		System.out.println(cal.get(Calendar.MONTH)+1 + "월");			// 0~11
		System.out.println(cal.get(Calendar.DATE)+"일");
		System.out.println(cal.get(Calendar.DAY_OF_WEEK)+"요일");			// 1일요일~7토요일
		System.out.println(cal.getActualMaximum(Calendar.DATE)+"일");	// 말일날짜

		cal.set(2022, 5, 1); 			// 2022 06 01로 날짜 지정			
		System.out.println(cal.get(Calendar.YEAR)+"년");
		System.out.println(cal.get(Calendar.MONTH)+1 + "월");			// 0~11
		System.out.println(cal.get(Calendar.DATE)+"일");
		System.out.println(cal.get(Calendar.DAY_OF_WEEK)+"요일");			// 1일요일~7토요일
		System.out.println(cal.getActualMaximum(Calendar.DATE)+"일");	// 말일날짜

		CalendarExample cal1 = new CalendarExample();
		cal1.getLastDate(2022,8);
		cal1.getDayInfo(2022,8);
	
	}		
		
	// 년 월 정보 => 년 월의 막일 정보(메소드) 2222 9 => 30일
		public static int getLastDate(int year, int month) {
			Calendar cal = Calendar.getInstance();	
			cal.set(year, month -1,1); 			// 년월일 정보 지정 7 => 6
			System.out.printf("%d년 %d월 마지막 날짜는 %d일\n" , year,month, cal.getActualMaximum(Calendar.DATE));
			return cal.getActualMaximum(Calendar.DATE);
		}
		
		// 년 월 정보 => 년 월의 요일 정보(메소드) 2022 9 => 5요일
		public static int getDayInfo( int year, int month ) {
			Calendar cal = Calendar.getInstance();	
			cal.set(year, month -1,1);
			System.out.printf("%d년 %d월의 요일 정보는 %d요일\n" , year,month, cal.get(Calendar.DAY_OF_WEEK)) ;	
			return cal.get(Calendar.DAY_OF_WEEK);
		}
	
		
		
		
	}

