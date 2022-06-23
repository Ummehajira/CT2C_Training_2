package java8_Features;

public class Main {
	

	public static void main(String[] args) {
		Hero sonuby=new Hero();
		Villain abc=new Villain();
		System.out.println("Hero\n");
		sonuby.act();
		sonuby.comedy();
		sonuby.speak();
		System.out.println("\nVillain\n");
		abc.act();
		abc.comedy();
		abc.speak();
}
}