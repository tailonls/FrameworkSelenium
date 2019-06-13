package core;

import static core.DriverFactory.killDriver;

import cucumber.api.java.After;

public class BaseStep {

	public BaseStep() {//mudar nome? Base step não faz sentido mais
	}

	@After
	public void fecha() { // Logica para usar o mesmo browser em varios testes
		if (Propriedades.FECHAR_BROWSER) {
			System.out.println("Fechou o browser!");
			killDriver();
		}
	}
}