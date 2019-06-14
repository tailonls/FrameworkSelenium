package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import core.BasePage;

public class FuncionalidadePageElementMap extends BasePage {

	@FindBy(xpath = "//a[text()='Todas']")
	WebElement abaTodas;

	@FindBy(xpath = "//a[text()='Imagens']")
	WebElement abaImagens;

	@FindBy(xpath = "//a[text()='Vídeos']")
	WebElement abaVideos;

	@FindBy(xpath = "//a[text()='Maps']")
	WebElement abaMaps;

	@FindBy(xpath = "//*[@id='searchboxinput']")
	WebElement campoPesquisarMaps;
	
	@FindBy(xpath = "//*[@class='vdLsw gsfi']/following-sibling::input")
	WebElement campoPesquisarGoogle;
	
	@FindBy(xpath = "//*[@id='tsf']//div[3]//input[1]")
	WebElement botaoPesquisarGoogle;

	@FindBy(xpath = "//*[@id='resultStats']")
	WebElement lblStatusResultado;
}
