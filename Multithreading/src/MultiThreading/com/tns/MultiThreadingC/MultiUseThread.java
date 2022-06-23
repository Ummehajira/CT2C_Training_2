package MultiThreading.com.tns.MultiThreadingC;
 class Eclipse extends Thread{
	 public void run() {
		 System.out.println("Eclipse thread id is "+ Thread.currentThread().getId());
	 }
 }
 class PPT extends Thread{
	 public void run() {
		 System.out.println("PPT thread id is "+ Thread.currentThread().getId());
	 } 
 }
 class Notepad extends Thread{
	 public void run() {
		 System.out.println("Notepad thread id is "+ Thread.currentThread().getId());
	 } 
 }
public class MultiUseThread {
	public static void main(String[] args) {
		Eclipse obj=new Eclipse();
		obj.start();
		PPT obj1=new PPT();
		obj1.start();
		Notepad obj2=new Notepad();
		obj2.start();
		
		
	}

}
