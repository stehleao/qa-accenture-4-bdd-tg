package io.cucumber.stephanie;

import static org.junit.Assert.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.pt.*;
import io.cucumber.stephanie.servicos.Configuracao;

public class CtSteps01{

	@Entao("devo ver o item {string}")
	public void devo_ver_o_item(String string) {
		WebElement element = Configuracao.browser.findElement( By.xpath(".//*[text()= '" + string + "']"));
		assertEquals(string, (element.getText()).toLowerCase());
		Configuracao.fechar();
	}
	
}