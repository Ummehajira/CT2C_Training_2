package Oop;

class Demo2Inner{
	int x;
}

public class Demo2 {
	
	public static void main(String[] args) {
		Demo2Inner obj = new Demo2Inner();
		obj.x = 100;
		Demo2Inner obj1 = new Demo2Inner();
		obj1 = obj;
		System.out.println(obj1.x);
		
		Demo2Inner obj2 = new Demo2Inner();
		obj1 = obj2;
		System.out.println(obj1.x);
		
	}

}




