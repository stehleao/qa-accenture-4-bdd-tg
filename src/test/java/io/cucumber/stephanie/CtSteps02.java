package io.cucumber.stephanie;

import static org.junit.Assert.*;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.pt.*;
import io.cucumber.stephanie.servicos.Configuracao;

public class CtSteps02{

  @Entao("devo ver o valor e o botao de comprar agora")
  public void devo_ver_o_valor_e_o_botao_de_comprar_agora() throws InterruptedException {
    String strUrl = Configuracao.browser.getCurrentUrl();

    if(strUrl.contains("pay.hotmart.com")) {
      Thread.sleep(5000);

      Configuracao.browser.switchTo().frame(Configuracao.browser.findElement(By.xpath(".//div[@id='__layout']//iframe[1]")));

      WebElement textV = Configuracao.browser.findElement(By.xpath(".//div[@class='product-price']//span"));
      assertEquals("R$ 1.529,00", textV.getText());

      WebElement button = Configuracao.browser.findElement(By.xpath(".//div[@class='next-step-button-container']//button"));
      assertTrue(button.isDisplayed());

      Configuracao.browser.switchTo().defaultContent();

    } else {
      WebElement value = Configuracao.browser.findElement( By.xpath(".//*[text()='ou R$ 1529,00 à vista']") );
      assertEquals("ou R$ 1529,00 à vista", value.getText());
      WebElement button = Configuracao.browser.findElement( By.xpath("//img[@src='https://static.hotmart.com/img/btn-buy-green.png']" )); 
      assertTrue(button.isDisplayed());
    }

    Configuracao.fechar();
  }

  @Entao("devo ver as opcoes")
  public void devo_ver_as_opcoes(List<String> data) throws Throwable{
    for(int i = 0; i < data.size(); i++) {
      //Configuracao.browser.findElement( By.xpath(".//h6[text()='" + data.get(i) + "']") );
      System.out.println(data.get(i));
    }

    Configuracao.fechar();
  }

}