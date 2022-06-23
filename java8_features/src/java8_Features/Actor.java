package java8_Features;

public interface Actor {
void act();
void speak();
 default void comedy() {
	 System.out.println("sonuby can comedy");
 }
}
