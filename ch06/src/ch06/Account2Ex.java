package ch06;

class Account2 {
	String 	accountNo;	// 계좌번호
	String 	ownerName;	// 계좌주
	int 	balance;	// 잔고
	
	// Account2() {} <- 기본생성자는 메모리만 만들어놓겠다
	
	Account2(String actno, String own, int bal) { // 생성자(타입 변수) <- 메모리에 변수들 기본값 세팅해준다
		accountNo	= actno;
		ownerName	= own;
		balance		= bal;
	}
	// 예금
	void deposit(int amt) {
		balance += amt;
	}
	// 출금
	void withdraw(int amt) {
		if (balance < amt ) {
			System.out.println(ownerName + "인출 안됨-->현재잔액 부족:잔액->" + balance+"   요청금액->"+amt);
		}
		else balance -= amt;	
	}
	// 잔고 
		int getBal() {
			return balance;
		}

}





public class Account2Ex {  // 파일이름 public 클래스에 메인 메소드

	public static void main(String[] args) {
		Account2 ac1 = new Account2("국민 1111", "김춘추", 10000);
		Account2 ac2 = new Account2("신한 2222", "강감찬", 20000);
		Account2 ac3 = new Account2("국민 3333", "조정은", 30000);
		ac1.deposit(5000);
		//ac1.getBal();
		System.out.println("은행계좌:" + ac1.accountNo + "  성함:"+ ac1.ownerName + "잔액:" + ac1.balance );
		ac1.withdraw(12000);
		System.out.println("은행계좌:" + ac1.accountNo + "  성함:"+ ac1.ownerName + "잔액:" + ac1.balance );
		ac1.withdraw(5000);
		System.out.println("은행계좌:" + ac1.accountNo + "  성함:"+ ac1.ownerName + "잔액:" + ac1.balance );
		// 강감찬 --> 예금 7000 , 조회 , 출금 3500 , 조회
		System.out.println();
		ac2.deposit(7000);
		System.out.println("은행계좌:" + ac2.accountNo + "  성함:"+ ac2.ownerName + "잔액:" + ac2.balance );
		ac2.withdraw(3500);
		System.out.println("은행계좌:" + ac2.accountNo + "  성함:"+ ac2.ownerName + "잔액:" + ac2.balance );
	}

}
