package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
										
	private By AcessarCitsLocal = By.xpath("//*[@id=\"formlogin\"]/div[2]/div/div/div/div/span");
	private By SelectCitsLocal = By.xpath("//*[@id=\"formlogin\"]//a[@onclick=\"LOGIN.domains.setDomain('citsmart.local');\"]");

	public void LocalAcess(WebDriver driver) {
		driver.findElement(AcessarCitsLocal).click();
		driver.findElement(SelectCitsLocal).click();
	}
}

