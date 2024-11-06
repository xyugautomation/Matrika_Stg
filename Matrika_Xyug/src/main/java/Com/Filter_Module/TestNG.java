package Com.Filter_Module;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG {

	@Test
	public void m1() {
		System.out.println("Test methods..1");
	}

	@BeforeClass
	public void m2() {
		System.out.println("BeforeClass method..");

	}

	@AfterClass
	public void m3() {
		System.out.println("Afterclass method..");

	}

	@BeforeMethod
	public void m4() {

		System.out.println("BeforeMethod method..");

	}

	@AfterMethod
	public void m5() {

		System.out.println("AfterMethod method..");

	}

}
