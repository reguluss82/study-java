package exam;

public class Television implements RemoteControl {
	
	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");

	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");

	}

	@Override
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME; // 10이상은 주지 않겠다.
		} else if(volume<RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME; // 음수 볼륨 없으므로
		} else {
			this.volume = volume;
		}
		System.out.println("현재 Audio 볼륨: " + this.volume); //this. 구분 지역변수
																//디버그로 this. 없는거 찾아내기
	}

}
