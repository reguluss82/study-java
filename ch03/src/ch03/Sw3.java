package ch03;

public class Sw3 {

	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		String season = "";
		// switch () {case 1 실행 break; default 실행;}
		switch (num) {
		case 12:	case 1:		case 2:		season = "겨울"; break;
		case 3:		case 4:		case 5:		season = "봄"; break;
		case 6:		case 7:		case 8:		season = "여름"; break;
		case 9:		case 10:	case 11:	season = "가을"; break;
		default : season = "뭬야"; break;
		}
		System.out.printf("%d월은 %s입니다.", num, season); //printf (서식이 있는 출력) 
	}														//System.out.printf ("출력 서식", 출력할 내용);
}
