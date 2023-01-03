package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	private By LoginInicial = By.id("user_login");
	private By SenhaInicial = By.id("password");
	private By BotaoEnter = By.id("btnEntrar");


	public void Login(String login, String senha, WebDriver driver) {
		driver.findElement(LoginInicial).sendKeys(login);
		driver.findElement(SenhaInicial).sendKeys(senha);
		driver.findElement(BotaoEnter).click();
	}
}
