package ch09;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class GreCal1 { //실무에서 더 많이 쓰인다

	public static void main(String[] args) {
		GregorianCalendar gc = new GregorianCalendar();
		int	      year  = gc.get(GregorianCalendar.YEAR);
		int	      month = gc.get(GregorianCalendar.MONTH) + 1;
		int	      day   = gc.get(GregorianCalendar.DATE);
		System.out.printf("오늘은 %d년 %d월 %d일 입니다 \n", year, month, day);
		
		// (E)->요일	(a)->오전/오후
		//SimpleDateFormat sdf = new SimpleDateFormat("yyyy/mm/dd(E) (a)hh:mm:ss"); // m은 분/ M은 월 
		SimpleDateFormat sdf = new SimpleDateFormat("yy/MM/dd(E) (a)hh:mm:ss");
		Date date = gc.getTime();
		System.out.println(sdf.format(date));

	}

}
