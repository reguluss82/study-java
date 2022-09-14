package ch03;

public class Continue1 {

	public static void main(String[] args) {
		for (int i = 0; i < 10 ; i ++) {
			System.out.println("대박 i = " + i );
			if ( i > 5) continue;  // 만나면 해당 반복부분 탈출 후 다음반복실행 /break; 만나는 즉시 반복문 전체 탈출
			System.out.println("쪽박 i = " + i);
		}

	}

}
