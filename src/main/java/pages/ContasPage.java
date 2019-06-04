package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import core.DriverFactory;

public class ContasPage extends ContasPageElementMap {

	private WebDriver driver = DriverFactory.getDriver();

	public void acessaMenu(String menu) {
		driver.findElement(By.xpath("//a[text()='" + menu + "']")).click();
	}

	public void selecionaOpcao(String opcao) {
		
	}

	public void informaConta(String nomeConta) {
		driver.findElement(By.xpath("//*[@id='nome']")).sendKeys(nomeConta);
	}

	public boolean verificaMensagem(String mensagem) {
		
		return false;
	}

	public void acessaSubmenu(String submenu) {
		driver.findElement(By.xpath("//a[text()='" + submenu + "']")).click();
	}

}