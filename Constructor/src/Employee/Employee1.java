package Employee;

public class Employee1 {
	
int id;
String name;
float salary;
Employee1(int id,String name,float salary){
	this.id=id;
	this.name=name;
	this.salary=salary;
}

void display() {
	System.out.println(name+" "+id+" "+salary);
}
public static void main(String[] args) {
	Employee1 emp=new Employee1(102,"asd",2000f);
	Employee1 emp1=new Employee1(123,"wer",8000f);
	Employee1 emp2=new Employee1(765,"cvb",4000f);
	
	emp.display();
	emp1.display();
	emp2.display();
}
}
