package ch13;
//람다 한줄 함수다. 
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;
//Function 매개값, 리턴값 모두 있음(주로 매개값은 리턴값으로 매핑)
public class FunctionEx1 {
	// student1 "김준수", 90, 86
	// student2 "손흥민", 95, 73
	private static List<Student> list = Arrays.asList( 
			new Student("김준수", 90, 86),
			new Student("손흥민", 95, 73)
			);
//Arrays.asList 일반 배열을 ArrayList로 변환한다. 특정한 배열에 의해 백업된 고정 크기 List로 반환.
//이때, asList()를 사용해서 List 객체를 만들 때 새로운 배열 객체를 만드는 것이 아니라,
//원본 배열의 주소값을 가져오게 된다.
//따라서 asList()를 사용해서 내용을 수정하면 원본 배열도 함께 바뀌게 되고
//원본 배열을 수정하면 그 배열로 만들어뒀던 asList()를 이용한 List 내용도 바뀌게 된다.
//이러한 이유 때문에 Arrays.asList()로 만든 List에 새로운 원소를 추가하거나 삭제 할 수 없다.
//따라서 Arrays.asList()는 배열의 내용을 수정하려고 할 때 List로 바꿔서 편리하게 사용하기 위함.
	
	public static void printString(Function<Student, String> function) {
		for(Student student : list) {
			System.out.println(function.apply(student) + "k "); // t->t.getName()
		}
		System.out.println();
	} 
	
	public static void printInt(ToIntFunction<Student> function) {
		for(Student student : list) {
			System.out.println(function.applyAsInt(student) + " "); // t -> t.getEnglishScore() // t -> t.getMathScore()
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		System.out.println("[학생 이름]");
		printString( t -> t.getName() ); //내부적으로 function.apply(student)
		
		System.out.println("[영어 점수]");
		printInt( t -> t.getEnglishScore() ); // t Student
		
		System.out.println("[수학 점수]");
		printInt( t -> t.getMathScore() );
		
	}

}
