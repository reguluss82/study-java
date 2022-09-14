package ncs.test;

public class ArrayTest {

	int sum = 0, oddCount = 0, evenCount = 0, max = 0, min = 100;

//최대값 리턴
	public int max(int[] arr) {
		for (int ar : arr) {
			if (ar > max)
				max = ar; // 최대값
		}
		return max;
	}

// 최소값 리턴
	public int min(int[] arr) {
		for (int ar : arr) {
			if (ar < min)
				min = ar; // 최소값
		}
		return min;
	}

// 짝수 개수 리턴
	public int evenCount(int[] arr) {
		for (int ar : arr) {
			if (ar % 2 == 0)
				evenCount++; // 짝수 개수
		}
		return evenCount;
	}

// 홀수 개수 리턴
	public int oddCount(int[] arr) {
		for (int ar : arr) {
			if (ar % 2 != 0)
				oddCount++; // 홀수 개수
		}
		return oddCount;
	}

// 합계 리턴
	public int sum(int[] arr) {
		for (int ar : arr) {
			sum += ar;
		}
		return sum;
	}

// 평균 리턴
	public String avg(int[] arr) {
		for (int ar : arr) {
			sum += ar;
		}
		double avg = (double) sum / arr.length;
		return String.format("%.2f", avg);
	}

// 배열 값 출력
	public void print(int[] arr) {
		System.out.print("Array : ");
		for (int i = 0; i < 6; i++) {
			System.out.print(arr[i] + "  ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
// 배열 할당
		int[] array = new int[10];
		int[] arr = new int[6];
		for (int i = 0; i < 6; i++) {
			array[i] = (int) (Math.random() * 100) + 1;
			arr[i] = array[i];
		}
// 메소드 실행 및 결과 출력
		ArrayTest art = new ArrayTest();
		System.out.println("할당된 배열의 크기 : " + arr.length);
		art.print(arr);
		System.out.println("가장 큰 값 : " + art.max(arr));
		System.out.println("가장 작은 값 : " + art.min(arr));
		System.out.println("짝수의 개수 : " + art.evenCount(arr));
		System.out.println("홀수의 개수 : " + art.oddCount(arr));
		System.out.println("합계 : " + art.sum(arr));
		System.out.println("평균 : " + art.avg(arr));
	}
}
