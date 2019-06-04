package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import core.BasePage;

public class HomePageElementMap extends BasePage {

	@FindBy(xpath = "//*[@id='teste']")
	WebElement elemento;
}