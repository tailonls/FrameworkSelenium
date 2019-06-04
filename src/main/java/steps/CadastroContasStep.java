package steps;

import org.junit.Assert;

import core.BasePage;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pages.ContasPage;
import pages.LoginPage;

public class CadastroContasStep extends BasePage {

	private static LoginPage loginPage = new LoginPage();
	private static ContasPage contasPage = new ContasPage();

	@Dado("^que acesso o sistema e realizo login$")
	public void queAcessoOSistemaERealizoLogin() {
		loginPage.acessarPaginaInicial();
		loginPage.realizaLogin();
	}

	@Quando("^seleciono o menu \"([^\"]*)\"$")
	public void selecionoOMenu(String menu) {
		contasPage.acessaMenu(menu);
	}

	@Quando("^seleciono \"([^\"]*)\"$")
	public void seleciono(String opcao) {
		contasPage.selecionaOpcao(opcao);
	}

	@Quando("^informo a conta \"([^\"]*)\"$")
	public void informoAConta(String nomeConta) {
		contasPage.informaConta(nomeConta);
	}

	@Então("^verifico que a mensagem \"([^\"]*)\" foi mostrada na tela$")
	public void verificoQueAMensagemFoiMostradaNaTela(String mensagem) {
		Assert.assertTrue("Mensagem nao apareceu conforme esperado!", contasPage.verificaMensagem(mensagem));
	}

	@Quando("^seleciono a opcao \"([^\"]*)\" no menu \"([^\"]*)\"$")
	public void selecionoAOpcaoNoMenu(String submenu, String menu) {
		contasPage.acessaMenu(menu);
		contasPage.acessaSubmenu(submenu);
	}

}