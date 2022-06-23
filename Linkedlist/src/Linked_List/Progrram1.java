package Linked_List;

import java.util.LinkedList;

public class Progrram1 {
	public static void main(String[] args) {
		LinkedList<Integer> li = new LinkedList<>();
		li.add(8);
		li.add(12);
		li.add(34);
		li.add(67);
		
	    System.out.println(li);
	    
	    
	    li.addFirst(90);
	    
	    li.addLast(78);
	    
	    System.out.println(li);
	}
}
