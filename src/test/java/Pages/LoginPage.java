package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import br.com.servicostic.BasePage;

public class LoginPage extends BasePage{
	
	private By LoginInicial = By.id("user_login");
	private By SenhaInicial = By.id("password");
	private By BotaoEnter = By.id("btnEntrar");
	
	public LoginPage (WebDriver driver) {
		super(driver);
	}

	public void Login(String login, String senha) {
		driver.findElement(LoginInicial).sendKeys(login);
		driver.findElement(SenhaInicial).sendKeys(senha);
		driver.findElement(BotaoEnter).click();
	}
}
