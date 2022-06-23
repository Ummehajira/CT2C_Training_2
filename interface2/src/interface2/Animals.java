package interface2;

class Animals implements organs{
	
	private int eye;
	private String name;
	private int teeth;
	private int lambs;
	private int iqs;
	
	
	Animals(String name,int eye,int teeth, int lambs, int iqs){
		this.name = name;
		this.eye = eye;
		this.teeth = teeth;
		this.lambs = lambs;
		this.iqs = iqs;
	}
	
	 public void eyes() {
		 System.out.println("The number eyes for "+this.name +" is "+ this.eye);
	 }
	 public void teeths() {
		 System.out.println("The number teeth for is "+ this.teeth);
	 }
	 public void lamb() {
		 System.out.println("The number of lambs is "+ this.lambs);
	 }
	 public void iq() {
		 System.out.println("The iq of the animal is "+ this.iqs);
	 }
	

}