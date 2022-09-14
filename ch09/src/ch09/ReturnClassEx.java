package ch09;
//return 형

class ReturnTest {
	int    empid;
	String ename;
	String tel;
	public ReturnTest() {
	}
	public ReturnTest ( int empid, String ename, String tel) {
		this.empid = empid;
		this.ename = ename;
		this.tel   = tel;
	}
}


class ReturnClass {
	int    id;    // Key
	String name;
	public ReturnClass ( int id, String name) {
		this.id   = id;
		this.name = name;
	}
	// void --> return 형 없음
	public void rtnTest1() {
		System.out.println("rtnTest1 ...");
		// return;
	}
	// int --> return 형 int 
	public int rtnTest2(int kkk) {
		System.out.println("rtnTest2 ...");
		//int result = kkk*10;    // 120
		int k100 = kkk*10;    // 120 //이름이 중요한 것이 아니라 리턴 타입 int가 중요
		//return result; // return 호출한 곳으로
		return k100; // return 호출한 곳으로
	}
	// String --> return 형 String
	public String rtnTest3() {
		String strResult = "안녕";
		int kkk = 12;
		System.out.println("rtnTest3 ...");
		return strResult;
	}	
	// ReturnTest --> return 형 ReturnTest
	public ReturnTest rtnTest4() {
	ReturnTest returnTest = new ReturnTest(100, "김유신", "01022235678");
	returnTest.ename = "김춘추";
	System.out.println("rtnTest4 RturnTest return");
	return returnTest; // 객체의 주소가 return
	}	
}

public class ReturnClassEx {

	public static void main(String[] args) {
		ReturnClass returnClass = new ReturnClass(1234, "Return Test");
		returnClass.rtnTest1();
		int k11 = returnClass.rtnTest2(12);
		System.out.println("returnClass.rtnTEst2(12) 결과-->" + k11);
		String kStr = returnClass.rtnTest3();
		System.out.println("returnClass.rtnTEst3 결과-->" + kStr);
		
		// **** 객체에 대한 return 방법
		//ReturnTest returnTest4 = new ReturnTest();
		//returnTest4 = returnClass.rtnTest4();
		ReturnTest returnTest4 = returnClass.rtnTest4(); //선언과 할당을 동시에 (위 주석 두줄과 동일)
		System.out.println("returnClass.rtnTEst4 returnTest4.empid-->" + returnTest4.empid);
		System.out.println("returnClass.rtnTEst4 returnTest4.ename-->" + returnTest4.ename);
		System.out.println("returnClass.rtnTEst4 returnTest4.tel-->" + returnTest4.tel);
	}

}
