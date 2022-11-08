package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import br.com.servicostic.BasePage;

public class HomePage extends BasePage {
	
	
	@FindBy(xpath = "//*[@id=\\\"formlogin\\\"]/div[2]/div/div/div/div/span")
	private WebElement CitsLocal;
	
	@FindBy(xpath = "//*[@id=\"formlogin\"]//a[@onclick=\"LOGIN.domains.setDomain('citsmart.local');\"]")
	private WebElement BotaoCitsLocal;
	
	public HomePage(WebDriver driver) {
		super(driver);
	}

	public void AcessarSite() {
		driver.get("https://servicostic2.homologa.unb.br/citsmart/webmvc/login");

	}

	public void LocalAcess() {
		CitsLocal.click();
		BotaoCitsLocal.click();
		
	}
}

