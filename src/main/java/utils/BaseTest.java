package utils;

import static core.DriverFactory.killDriver;

import java.io.IOException;

import org.junit.Rule;
import org.junit.rules.TestName;

import cucumber.api.java.After;

public class BaseTest {

	@After
	public void fecha() throws IOException {
		// logica para usar o mesmo browser em varios testes
		if (Propriedades.FECHAR_BROWSER) {
			killDriver();
		}
	}

	/*
	 * @AfterClass public static void finaliza() { killDriver(); }
	 */

	
	//ADICIONAR PRINTSCREENS
}