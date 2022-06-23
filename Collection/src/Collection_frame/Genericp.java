package Collection_frame;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;


public class Genericp {
public static void main(String[] args) {
	List<Integer> li=new ArrayList<>();
	li.add(43);
	li.add(34);
	li.add(13);
	li.add(73);
	li.add(47);
	li.add(98);
	System.out.println(li);
	System.out.println(li.size());
	
	Iterator ele=li.iterator();
	
	while(ele.hasNext()) {
		System.out.println(ele.next());
	}
}
}
