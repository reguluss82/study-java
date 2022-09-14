package ch09;

import java.util.Calendar;

public class Calendar1 {

	public static void main(String[] args) {
		// 기본 Today
		Calendar cal = Calendar.getInstance(); // 생성자 안뜸 -> getInstance 사용/자원절감
		int    year  = cal.get(Calendar.YEAR); //YEAR 대문자 - 상수값이 저장되어있구나
		int    month = cal.get(Calendar.MONTH)+ 1;	// 0월부터 이므로 +1
		int    date  = cal.get(Calendar.DATE);
		System.out.printf("오늘은 %d년 %d월 %d 입니다 \n", year,month,date);
		
		int     hour = cal.get(Calendar.HOUR);
		int     min  = cal.get(Calendar.MINUTE);
		int     sec  = cal.get(Calendar.SECOND);
		System.out.printf("지금은 %d:%d:%d시 입니다.\n", hour, min , sec);

	}

}
