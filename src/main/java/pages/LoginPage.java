package pages;

import core.DriverFactory;

public class LoginPage extends LoginPageElementMap {

	public void acessarPaginaInicial() {
		DriverFactory.getDriver().get("https://srbarriga.herokuapp.com/login");
	}

	public void realizaLogin() {
		emailLogin.sendKeys("projeto@basico.com.br");
		senhaLogin.sendKeys("projeto@basico.com.br");
		botaoEntrar.click();
	}
}