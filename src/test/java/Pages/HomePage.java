package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import br.com.servicostic.BasePage;

public class HomePage extends BasePage {
	
	private By LocalizadorCitsLocal = By.xpath("//*[@id=\"formlogin\"]/div[2]/div/div/div/div/span");
	private By CitsLocal = By.xpath("//*[@id=\"formlogin\"]//a[@onclick=\"LOGIN.domains.setDomain('citsmart.local');\"]");
	
	public HomePage(WebDriver driver) {
		super(driver);
	}

	public void AcessarSite() {
		driver.get("https://servicostic2.homologa.unb.br/citsmart/webmvc/login");

	}

	public void LocalAcess() {
		driver.findElement(LocalizadorCitsLocal).click();
		driver.findElement(CitsLocal).click();
		
	}
}

