package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import core.BasePage;

public class ResumoMensalPageElementMap extends BasePage {
	
	@FindBy(xpath = "//*[@id='teste']")
	WebElement elemento;
}