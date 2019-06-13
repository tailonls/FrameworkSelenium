package steps;

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
	public void informoTermoNoCampoDePesquisa(String termo) {

	}

	@Quando("^clico no botao \"([^\"]*)\"$")
	public void clicoNoBotao(String botao) {

	}

	@Entao("^deve carregar a pagina com resultados da pesquisa$")
	public void deveCarregarPaginaComResultadosDaPesquisa() {

	}

	@Entao("^deve aparecer um label com o resultado aproximado de ocorrencias na tela$")
	public void deveAparecerFraseNaTela() {

	}

}