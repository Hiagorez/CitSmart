package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import br.com.servicostic.BasePage;

public class AcessoAoSistema extends BasePage{
	
	@FindBy(xpath = "//*[@id=\"header-toolbar-access-system\"]//a[@href=\"/citsmart/pages/index/index.load\"]")
	private WebElement AcessarSistema;
	
	public AcessoAoSistema (WebDriver driver) {
		super (driver);
	}
	public void AcessarSistema(){
		AcessarSistema.click();
	}

}
