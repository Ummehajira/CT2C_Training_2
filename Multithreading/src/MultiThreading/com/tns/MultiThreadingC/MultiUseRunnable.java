package MultiThreading.com.tns.MultiThreadingC;
class Eclipse1 implements Runnable {
	 public void run() {
		 //for(int i=0;i<5;i++) {
		 System.out.println("Eclipse thread id is "+ Thread.currentThread().getId());
		 System.out.println("Eclipse1 Thread priority"+Thread.currentThread().getPriority());
		 }
	 }
//}
class PPT1 implements Runnable{
	 public void run() {
		// for(int i=0;i<5;i++) {
		 
		 System.out.println("PPT thread id is "+ Thread.currentThread().getId());
		 System.out.println("PPT1 Thread priority"+Thread.currentThread().getPriority());
		 }
	 } 
//}
class Notepad1 implements Runnable{
	 public void run() {
//		 for(int i=0;i<5;i++) {
		 System.out.println("Notepad thread id is "+ Thread.currentThread().getId());
		 System.out.println("Notepad1 Thread priority"+Thread.currentThread().getPriority());
	 } 
}
		
//}


public class MultiUseRunnable {
	public static void main(String[] args) {
		Eclipse1 obj=new Eclipse1();
		Thread t=new Thread(obj);
		t.start();
		t.setPriority(5);
		PPT1 obj1=new PPT1();
		Thread t2=new Thread(obj1);
		t2.start();
		t2.setPriority(2);
		Notepad1 obj2=new Notepad1();
		Thread t3=new Thread(obj2);
		t3.start();
		t3.setPriority(1);
}
}
