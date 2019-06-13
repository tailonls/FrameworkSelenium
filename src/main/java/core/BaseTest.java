package core;

import static core.DriverFactory.killDriver;

import org.junit.AfterClass;
import org.junit.Rule;
import org.junit.rules.TestName;

public class BaseTest {

	@Rule
	public TestName testName = new TestName(); // nome do teste q esta sendo

	@AfterClass
	public static void finaliza() {
		// Fecha browser no final de todos os testes
		killDriver();
	}

}