package core;

import static core.DriverFactory.killDriver;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.Rule;
import org.junit.rules.TestName;

import cucumber.api.java.After;

public class BaseTest {

	@Rule
	public TestName testName = new TestName(); // nome do teste q esta sendo

	@After
	public void fecha() throws IOException {
		// logica para usar o mesmo browser em varios testes
		if (Propriedades.REAPROVEITAR_BROWSER) {
			killDriver();
		}
	}

	@AfterClass
	public static void finaliza() {
		// Fecha browser no final de todos os testes
		killDriver();
	}

}