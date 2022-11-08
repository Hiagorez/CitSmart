package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import br.com.servicostic.BasePage;

public class AcessoAoSistema extends BasePage{

	private By AcessarSistema = By.xpath("//*[@id=\"header-toolbar-access-system\"]//a[@href=\"/citsmart/pages/index/index.load\"]");
	
	public AcessoAoSistema (WebDriver driver) {
		super (driver);
	}
	public void AcessarSistema(){
		driver.findElement(AcessarSistema).click();
	}
	public void VerificarTitulo() {
		
	}
}
