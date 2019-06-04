package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import core.BasePage;

public class ContasPageElementMap extends BasePage {

	@FindBy(xpath = "//*[@id='email']")
	WebElement emailLogin;
	
	@FindBy(xpath = "//*[@id='senha']")
	WebElement senhaLogin;
	
	@FindBy(xpath = "//button[text()='Entrar']")
	WebElement botaoEntrar;

}