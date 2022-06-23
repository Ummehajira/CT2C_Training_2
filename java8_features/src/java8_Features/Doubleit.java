package java8_Features;

import java.util.Arrays;
import java.util.List;

public class Doubleit {
	public void doubleit(int i) {
		System.out.println(i*2);
	}
	
	
	
public static void main(String[] args) {
	List<Integer> list=Arrays.asList(1,2,3,4,5,6);
	
	Doubleit obj=new Doubleit();
	
	list.forEach(v ->obj.doubleit(v));
	list.forEach(obj::doubleit);
}
}
