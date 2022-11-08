package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import br.com.servicostic.BasePage;

public class LoginPage extends BasePage{
	
	private By localizadorLogin = By.id(("user_login"));
	private By localizadorSenha = By.id(("password"));
	private By localizadorBotaoEntrar = By.id(("btnEntrar"));
	
	public LoginPage (WebDriver driver) {
		super (driver);
	}

	public void Login(String Login, String senha) {
		driver.findElement(localizadorLogin).sendKeys(Login);
		driver.findElement(localizadorSenha).sendKeys(senha);
		driver.findElement(localizadorBotaoEntrar).click();
	}
}
