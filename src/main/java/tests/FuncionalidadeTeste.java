package tests;

import org.junit.Assert;
import org.junit.Test;

import core.BaseTest;
import pages.FuncionalidadePage;

public class FuncionalidadeTeste extends BaseTest {

	private static FuncionalidadePage funcionalidade = new FuncionalidadePage();

	@Test
	public void pesquisarNaAbaTodas() {
		funcionalidade.acessarPaginaInicial();
		funcionalidade.informarTermoPesquisa("Teste");
		funcionalidade.clicarBotaoPesquisa("Pesquisar");
		Assert.assertTrue(funcionalidade.validaCarregametoPaginaPesquisa("Todas"));
	}

	@Test
	public void pesquisarNaAbaImagens() {
		funcionalidade.acessarPaginaInicial();
		funcionalidade.informarTermoPesquisa("Teste");
		funcionalidade.clicarBotaoPesquisa("Pesquisar");
		funcionalidade.clicarAbaPesquisa("Imagens");
		Assert.assertTrue(funcionalidade.validaCarregametoPaginaPesquisa("Imagens"));

	}
}