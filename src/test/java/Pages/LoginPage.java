package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import br.com.servicostic.BasePage;

public class LoginPage extends BasePage{
	
	public LoginPage (WebDriver driver) {
		super (driver);
	}

	public void Login (String nome, String senha) {
		driver.findElement(By.xpath("//*[@id=\"formlogin\"]//a[@onclick=\"LOGIN.domains.setDomain('citsmart.local');\"]")).click();
		driver.findElement(By.id("user_login")).sendKeys("05587686108");
		driver.findElement(By.id("password")).sendKeys("Rezende@2309");
		driver.findElement(By.id("btnEntrar")).click();
	}
}
