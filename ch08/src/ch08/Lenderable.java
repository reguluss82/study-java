package ch08;

public interface Lenderable {
	// 상태값 표시(상수)	//사람들이 잘 알아들을 수 있도록 표현하는 방법 상수
	int BORROW = 1; //	빌려간 상태
	int NORMAL = 0;	//	대여 가능상태
	void checkOut(String borrower, String date);
	void checkin();
	
}

class SeperateVolume implements Lenderable {
	String	title;		// 초기 생성시 값 입력  실행하면 --> 	젊은 베르테르 슬픔
	String	date;		//										2022/07/25
	String	borrower;	//									    정승환/박윤하
	int		status;		// 상태값 기본값 0
	
	SeperateVolume(String title) {
		this.title = title;
	}
	
	// 책 대여
	@Override
	public void checkOut(String borrower, String date) {
		if (status != NORMAL) return; //NORMAL 이 아니면
		this.date		= date;
		this.borrower	= borrower;
		status			= BORROW;
		// BORROW =1; 안됨
		System.out.println(borrower +"가 "+date+"일에 "+title+"을 대여했다");
	}
	
	// 책 반납
	@Override
	public void checkin() {
		if (status != BORROW) return; //BORROW 이 아니면
		System.out.println(borrower +"가 " +title+"을 반납했다");
		date		= null;
		title		= null;
		borrower	= null;
		status		= NORMAL;	// 0으로 설정
		
	}
	
}