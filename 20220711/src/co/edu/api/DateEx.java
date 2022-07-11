package co.edu.api;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

/*
 * Date Calendar => 시간 날짜 정보
 */
public class DateEx {
	public static void main(String[] args) {
		
		// Date 클래스
		Date today = new Date();		// localDate,localDateTime
		today.getDate();
		today.getDay();
		
		System.out.println(today.toString());
		System.out.println(today.toGMTString());
		System.out.println(today.toLocaleString());
		
		// 2022년 07월 11일 14시 53분 12초.
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		System.out.println(sdf.format(today));
		
		sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(sdf.format(today));
		
		today = new Date("2022/07/15 13:23:12");
		System.out.println(sdf.format(today));

	
		// Calendar 클래스
		Calendar now = Calendar.getInstance();
		System.out.println(now.get(Calendar.YEAR) + "년");
		System.out.println(now.get(Calendar.MONTH) + "월");
		
		now.set(2022, 10, 11);
		System.out.println(now.get(Calendar.DATE) + "월");
		
		
		// Local Date
		LocalDate lDate = LocalDate.now();		// 정적메소드
		System.out.println(lDate.toString());
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		System.out.println(lDate.format(dtf));
		

		
	}

}
