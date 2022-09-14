package ch13;
//Consumer 매개값은 있고 리턴값이 없음
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

public class ConsumerEx {

	public static void main(String[] args) {
		Consumer<String> consumer = t -> System.out.println(t + "8");
		consumer.accept("1.java");
		BiConsumer<String, String> biconsumer = (t, u) -> System.out.println(t + u);
		biconsumer.accept("2.Java", "20220801");
		
		DoubleConsumer doubleConsumer = d -> System.out.println(100 + d);
		doubleConsumer.accept(8.0);
		

	}

}
