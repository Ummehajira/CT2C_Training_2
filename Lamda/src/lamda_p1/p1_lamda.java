package lamda_p1;
interface lamda{
	
	void display();
	
}
public class p1_lamda {
public static void main(String[] args) {
	lamda obj=()->{
		System.out.println("hello everyone");
	};
	obj.display();
}
}
