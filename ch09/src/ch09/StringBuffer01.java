package ch09;

// String(고정, 추가하면 새로운 String이 생성되어 그 안에 추가) 과는 반대로 StringBuffer/StringBuilder 는 가변성 가지기 때문에 
// .append() .delete() 등의 API를 이용하여 동일 객체내에서 문자열을 변경하는 것이 가능
// 따라서 문자열의 추가,수정,삭제가 빈번하게 발생할 경우라면 String 클래스가 아닌
// StringBuffer/StringBuilder를 사용
// String       :  문자열 연산이 적고 멀티쓰레드 환경일 경우
// StringBuffer :  문자열 연산이 많고 멀티쓰레드 환경일 경우
// StringBuilder:  문자열 연산이 많고 단일쓰레드이거나 동기화를 고려하지 않아도 되는 경우 
public class StringBuffer01 {

	public static void main(String[] args) {
		StringBuffer strBuf = new StringBuffer();
		int len = strBuf.length();
		int size = strBuf.capacity();
		System.out.println("1." + strBuf + " / " + len + " / " + size);
		strBuf.append("누구든지 사랑하기 위해선 ");  // 문자열 추가
		len=strBuf.length();     // length는 길이 즉 들어있는 공간
		size=strBuf.capacity();  // Capacity는 용량 즉 들어갈 수 있는 공간 기본적으로 차지하는
		System.out.println("2." + strBuf + " / " + len + " / " + size);
		strBuf.append("한 번쯤 증오의 가슴이어야 했다"); //capacity 자동으로 늘어난다
		len=strBuf.length();
		size=strBuf.capacity();
		System.out.println("3." + strBuf + " / " + len + " / " + size);
		
	}

}
