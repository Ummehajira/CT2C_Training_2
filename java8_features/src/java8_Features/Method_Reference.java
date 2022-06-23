package java8_Features;

import java.util.Arrays;
import java.util.List;

public class Method_Reference {
	public static void main(String[] args) {
		List<Integer> li=Arrays.asList(1,2,3,4,5,6,7);
		li.forEach(System.out::println);
}
}