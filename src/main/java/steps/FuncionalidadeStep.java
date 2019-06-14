package steps;

import org.junit.Assert;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import pages.FuncionalidadePage;

public class FuncionalidadeStep {

	private static FuncionalidadePage funcionalidade = new FuncionalidadePage();

	@Dado("^que acesso o site do google$")
	public void queAcessoSiteDoGoogle() {
		funcionalidade.acessarPaginaInicial();
	}

	@E("^informo o termo \"([^\"]*)\" no campo de pesquisa$")
	public void informoTermoNoCampoDePesquisa(String termoPesquisa) {
		funcionalidade.informarTermoPesquisa(termoPesquisa);
	}

	@Quando("^clico no botao \"([^\"]*)\"$")
	public void clicoNoBotao(String botao) {
		funcionalidade.clicarBotaoPesquisa(botao);
	}

	@Entao("^deve carregar a pagina com resultados da pesquisa$")
	public void deveCarregarPaginaComResultadosDaPesquisa() {
		Assert.assertTrue("Nao carregou pagina com resultados da pesquisa",
				funcionalidade.validaCarregametoPaginaPesquisa());
	}

	@Entao("^deve aparecer um label com o resultado aproximado de ocorrencias na tela$")
	public void deveAparecerFraseNaTela() {

	}

}