package testPackage;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssumptionDemo {

	@Test
	void testDrive() {
		System.setProperty("ENV","DGH");
		Assumptions.assumeTrue("DGH".equals(System.getProperty("ENV")));
	}

	@Test
	void testDrive2() {
		System.setProperty("SDF","ERT");
		Assumptions.assumeTrue("ERT".equals(System.getProperty("SDF")),AssumptionDemo::message);
	}
	static String message() {
		return"Test Execution Failed";
	}
}
