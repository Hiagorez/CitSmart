package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AcessoAoSistema {
	
	private By AcessarSistema = By.xpath("//*[@id=\"header-toolbar-access-system\"]//a[@href=\"/citsmart/pages/index/index.load\"]");
 	private By AcessarTicket = By.xpath("//*[@id=\"smartDecision\"]//a[.=\"Ticket\"]");
 	
	public void AcessarSistema(WebDriver driver){
		driver.findElement(AcessarSistema).click();
	}

	public void AcessarTicket(WebDriver driver) {
		driver.findElement(AcessarTicket).click();
	}
	
}
