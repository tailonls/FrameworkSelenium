package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;

import core.DriverFactory;

public class FuncionalidadePage extends FuncionalidadePageElementMap {

	public FuncionalidadePage() {
		PageFactory.initElements(DriverFactory.getDriver(), this);
	}

	public void acessarPaginaInicial() {
		DriverFactory.getDriver().get("https://www.google.com.br/");
		aguardarSegundos(3);
		System.out.println("Acessou página https://www.google.com.br/");
	}

	public void informarTermoPesquisa(String termoPesquisa) {
		aguardaElemento(campoPesquisarGoogle, 3);
		campoPesquisarGoogle.sendKeys(termoPesquisa);
		campoPesquisarGoogle.sendKeys(Keys.TAB);
		System.out.println("Informou o termo de pesquisa " + termoPesquisa);
	}

	public void clicarBotaoPesquisa(String botao) {
		botaoPesquisarGoogle.click();
		System.out.println("Clicou no botão de pesquisar");
	}

	public boolean validaCarregametoPaginaPesquisa() {
		aguardarSegundos(3);

		// trocar por regex
		if (lblStatusResultado.getText().contains("Aproximadamente ")) {
			return true;
		}
		return false;
	}
}