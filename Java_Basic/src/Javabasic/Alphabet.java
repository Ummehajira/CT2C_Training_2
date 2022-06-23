package Javabasic;


	import java.util.Scanner;

	public class Alphabet {
		
		public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        System.out.println("Enter the value ");
	        int ch = in.next().charAt(0);
	        if(ch>=(int)'a' && ch<=(int)'z' || ch>=(int)'A' && ch<=(int)'Z'){
	            System.out.println("The enter value is character");
	        }
	        else{
	            System.out.println("The enter value is not character");
	        }

	    }
}
