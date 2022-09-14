package ch12;
//실무에서 사용할수도있다
class Account2User extends Thread {
	Account2 act;
	boolean  flag; // boolean 기본값 false

	public Account2User(Account2 act, String name) { 
		super(name); // 부모 클래스 생성자(name) 호출
		this.act = act;
	}
	//조상 멤버와 자신의 멤버를 구별하기 위해 사용
	//super 키워드는 부모 클래스를 의미한다. 여기에 ()붙이면 부모 클래스의 생성자를 의미하게 된다.
	//이렇게 하면 부모 클래스의 기본 생성자가 없어져도 오류가 발생하지 않는다.
	//하위 클래스의 생성자에서 super를 사용할 때 주의할 점은 super가 가장 먼저 나타나야 한다는 점이다.
	//즉 부모가 초기화되기 전에 자식이 초기화되는 일을 방지하기 위한 정책이라고 생각하자.

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			synchronized (act) { // 하나의 자원을 여러 태스크가 사용하려 할 때에, 한 시점에서 하나의 태스크만이 사용
									// 할 수 있도록 하는 것
				if (flag)
					act.deposit((int) (Math.random() * 10000), getName());
				else
					act.withdraw((int) (Math.random() * 10000), getName());
				flag = !flag; // flag SWAP
			}
		}
	}
}

public class Account2Ex {

	public static void main(String[] args) {
		Account2 act1 = new Account2(10000); // 여자그룹 (옥주현 , 조정은 , 정선아)
		Account2 act2 = new Account2(15000); // 남자그룹 (김준수 , 전동석 , 신성록)

		// 여자그룹 (옥주현 , 조정은 , 정선아) / 남자그룹 (김준수 , 전동석 , 신성록)
		Account2User au1 = new Account2User(act1, "옥주현");
		Account2User au2 = new Account2User(act1, "조정은");
		Account2User au3 = new Account2User(act1, "정선아");
		Account2User au4 = new Account2User(act2, "김준수");
		Account2User au5 = new Account2User(act2, "전동석");
		Account2User au6 = new Account2User(act2, "신성록");

		au1.start();
		au2.start();
		au3.start();
		au4.start();
		au5.start();
		au6.start();

	}

}
