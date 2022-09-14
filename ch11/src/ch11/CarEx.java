package ch11;

import java.util.ArrayList;

public class CarEx {

	public static void main(String[] args) {
		ArrayList<Car> al = new ArrayList<>();
		al.add(new Car());
		al.add(new Bus());
		al.add(new taxi());
		for (Car c : al) {
			c.print();
			// 3.HomeWork move를 출력하기 // instanceof 기사시험에 잘나오는 내용
			if (c instanceof Bus)
				((Bus) c).move();
			// 아래두줄 위한 줄 같음
//			Bus b = (Bus)c;
//			b.move();
		}
	}
}
