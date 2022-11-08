package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import br.com.servicostic.BasePage;

public class LoginPage extends BasePage{
	
	@FindBy(id = "user_login")
	private WebElement LoginInicial;
	
	@FindBy(id = "password")
	private WebElement SenhaInicial;
	
	@FindBy(id = "btnEntrar")
	private WebElement BotaoEnter;
	
	public LoginPage (WebDriver driver) {
		super (driver);
	}

	public void Login(String Login, String senha) {
		LoginInicial.sendKeys(Login);
		SenhaInicial.sendKeys(senha);
		BotaoEnter.click();
	}
}
