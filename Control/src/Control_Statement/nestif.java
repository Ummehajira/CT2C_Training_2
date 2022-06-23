package Control_Statement;

public class nestif {
public static void main(String[] args) {
	String lang="Java";
	if(lang=="HLL & IL") {
		if(lang=="python") {
			System.out.println("language is python");
		}
	}
	else if(lang=="C++") {
		System.out.println("language is c++");
	}
	else if(lang=="java") {
		System.out.println("language is java");
	}
	else {
		System.out.println(lang);
	}
}

}
