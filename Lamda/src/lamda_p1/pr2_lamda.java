package lamda_p1;

public class pr2_lamda {
	public static void main(String[] args) {
		
		Thread t=new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("this is 1st thread");
			}
			
		});
		t.start();
}
}