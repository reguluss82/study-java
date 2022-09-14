package exam;

public class RemoteControlEx {

	public static void main(String[] args) {
		// 1.선언
		RemoteControl rc = null;
		RemoteControl rc2 = null;
		// 2. 메모리 할당   // 부품처럼 인터페이스
		rc = new Television(); // default method(setMute) 는 RemoteControl의 구현 객체가 필요하므로 Television 객체를 인터페이스 변수에 대입하고 나서 호출가능
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(13);
		rc.setMute(true); //디폴트 메소드/ 인터페이스 임에도 불구하고 실행된다
		RemoteControl.changeBattery(); // static 이므로 선언하지 않아도 실행가능
		// 3. 메모리 할당
		rc2 = new Audio(); // default method(setMute) 는 RemoteControl의 구현 객체가 필요하므로 Television 객체를 인터페이스 변수에 대입하고 나서 호출가능
		rc2.turnOn();
		rc2.turnOff();
		rc2.setVolume(13);
		rc2.setMute(true); //디폴트 메소드/ 인터페이스 임에도 불구하고 실행된다
		RemoteControl.changeBattery(); // static 이므로 선언하지 않아도 실행가능
	}

}
