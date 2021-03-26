package io.cucumber.stephanie;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.pt.*;
import io.cucumber.stephanie.servicos.Configuracao;

public class CompartilhadoSteps {

  @Quando("eu acesso o site da gama academy {string}")
	public void eu_acesso_o_site_da_gama_academy(String string) {
		Configuracao.abrir(string);
	}

	@Quando("clico para fechar a propaganda")
	public void clico_para_fechar_a_propaganda() throws InterruptedException {
	  Thread.sleep(5000);

		WebElement input = Configuracao.browser.findElement( By.cssSelector(".ub-emb-close") );
		input.click();
	}

	@Quando("clico na opcao {string}")
	public void clico_na_opcao(String string) {
		WebElement element = Configuracao.browser.findElement( By.xpath(".//*[text()= '" + string + "']"));
		element.click();
	}
  
}
