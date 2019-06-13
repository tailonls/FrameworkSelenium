package pages;

import org.openqa.selenium.support.PageFactory;

import core.DriverFactory;

public class FuncionalidadePage extends FuncionalidadePageElementMap {

	public FuncionalidadePage() {
		PageFactory.initElements(DriverFactory.getDriver(), this);
	}

	public void acessarPaginaInicial() {
		DriverFactory.getDriver().get("https://www.google.com.br/");
		aguardarSegundos(10);
		System.out.println("Aguardou !!!!!!!!!!!");

	}

	public void realizaLogin() {
		emailLogin.sendKeys("");
		senhaLogin.sendKeys("");
		botaoEntrar.click();
	}
}