package core;

import static core.DriverFactory.getDriver;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

public class BasePage {

	// FUNCOES DE AGUARDAR

	private WebElement aguardaElemento(WebElement elemento, int tempoEmSegundos) {
		WebElement webElement = null;

		Wait<WebDriver> wait = new FluentWait<WebDriver>(DriverFactory.getDriver())
				.withTimeout(tempoEmSegundos, TimeUnit.SECONDS)
				.pollingEvery(200, TimeUnit.MILLISECONDS)
				.ignoring(NoSuchElementException.class)
				.ignoring(TimeoutException.class)
				.ignoring(StaleElementReferenceException.class);
		
		try {
			webElement = wait.until(ExpectedConditions.visibilityOf(elemento));
			
		} catch (TimeoutException e) {
			return null;
		}

		return elemento;
	}

	// RADIOS

	public void clicarRadio(By by) {
		getDriver().findElement(by).click();
	}

	public void clicarRadio(String id) {
		clicarRadio(By.id(id));
	}

	public boolean verificaRadioClicado(String id) {
		return getDriver().findElement(By.id(id)).isSelected();
	}

	// Selecionar combos

	public void selecionaCombo(String id, String valor) {
		WebElement element = getDriver().findElement(By.id(id));
		Select combo = new Select(element);
		combo.selectByVisibleText(valor);
	}

	// ALERTS

	public String obtemTextoAlert() {
		Alert alert = getDriver().switchTo().alert();
		return alert.getText();
	}

	public String obtemTextoEAceitaAlert() {
		Alert alert = getDriver().switchTo().alert();
		String texto = alert.getText();
		alert.accept();
		return texto;
	}

	public void escreveAlertPrompt(String valor) {
		Alert alert = getDriver().switchTo().alert();
		alert.sendKeys(valor);
		alert.accept();
	}

	// FRAMES

	public void entrarFrame(String id) {
		getDriver().switchTo().frame(id);
	}

	public void sairFrame() {
		getDriver().switchTo().defaultContent();
	}

	public void trocaJanela(String id) {
		getDriver().switchTo().window(id);
	}

	// Java Script

	public Object executaJavaScript(String cmd, Object... param) {
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		return js.executeScript(cmd, param);
	}

	// TABELAS

	public WebElement obterCelula(String colunaBusca, String valor, String colunaBotao, String idTabela) {

		// Procurar coluna do registro
		WebElement tabela = getDriver().findElement(By.xpath("//*[@id='" + idTabela + "']"));
		int idColuna = obterIndiceColuna(colunaBusca, tabela);

		// Encontrar a linha do registro
		int idLinha = obterIndiceLinha(valor, tabela, idColuna);

		// Procurar coluna do botao
		int idColunaBotao = obterIndiceColuna(colunaBotao, tabela);

		// Clicar no botao da celula encontrada
		WebElement celula = tabela.findElement(By.xpath(".//tr[" + idLinha + "]/td[" + idColunaBotao + "]"));
		return celula;
	}

	public void clicarBotaoTabela(String colunaBusca, String valor, String colunaBotao, String idTabela) {
		WebElement celula = obterCelula(colunaBusca, valor, colunaBotao, idTabela);
		celula.findElement(By.xpath(".//input")).click();
	}

	protected int obterIndiceLinha(String valor, WebElement tabela, int idColuna) {
		List<WebElement> linhas = tabela.findElements(By.xpath("./tbody/tr/td[" + idColuna + "]"));
		int idLinha = -1;
		for (int i = 0; i < linhas.size(); i++) {
			if (linhas.get(i).getText().equals(valor)) {
				idLinha = i + 1;
				break;
			}
		}
		return idLinha;
	}

	protected int obterIndiceColuna(String coluna, WebElement tabela) {
		List<WebElement> colunas = tabela.findElements(By.xpath(".//th"));
		int idColuna = -1;
		for (int i = 0; i < colunas.size(); i++) {
			if (colunas.get(i).getText().equals(coluna)) {
				idColuna = i + 1;
				break;
			}
		}
		return idColuna;
	}
}