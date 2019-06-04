package pages;

import static core.DriverFactory.getDriver;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MovimentacaoPage extends MovimentacaoPageElementMap {

	public List<String> obtemErrosCampoEmBranco() {

		List<WebElement> erros = getDriver().findElements(By.xpath("//div[@class='alert alert-danger']//li"));
		List<String> lista = new ArrayList<String>();

		for (WebElement listando : erros) {
			lista.add(listando.getText());
		}

		return lista;
	}
}