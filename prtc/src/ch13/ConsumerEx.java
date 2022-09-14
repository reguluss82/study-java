package ch13;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

public class ConsumerEx {

	public static void main(String[] args) {
		Consumer<String> consumer = t -> System.out.println("1." + t);
		consumer.accept("java");
		BiConsumer<String, String> biConsumer = (t, u) -> System.out.println(t + u);
		biConsumer.accept("바", "보");
		DoubleConsumer doubleConsumer = d -> System.out.println(100 + d);
		doubleConsumer.accept(8.0);

	}

}
