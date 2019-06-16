package core;

import static core.DriverFactory.killDriver;

import cucumber.api.java.After;

public class BaseStep {

	public BaseStep() {// mudar nome? Base step não faz sentido mais
	}

	@After
	public void posCenario() { // Usar o mesmo browser em varios testes
		if (Propriedades.FECHAR_BROWSER) {
			killDriver();
		}
	}
}