package com.cg.inheritance;

public class MainModule {
	
	public static void main(String[] args) {
		Mobile mobj = new Mobile("Nokia","Andorid","JF-00445",9000d);
		System.out.println(mobj.getModel());
		
		Blackberry blackObj = new Blackberry("BlackBerry","BlackBerry","GT00-GH",40000d);
		System.out.println(blackObj.getModel());
		System.out.println(blackObj);
		
		Andorid andObj = new Andorid("Google","Andorid","Pixle 3",90000d);
		System.out.println(andObj.getModel());
				
	}

}
