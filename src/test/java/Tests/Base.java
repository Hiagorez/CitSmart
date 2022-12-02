package Tests;

import java.time.Duration;

import org.junit.jupiter.api.DisplayName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.AcessoAoSistema;
import Pages.HomePage;
import Pages.LoginPage;

@DisplayName("Testes Automatizados Sing Up")
public class Base {

	
	WebDriver driver = new ChromeDriver();
	
	public void TesteLoginUsuário() {

		// Abrir site
		HomePage homePage = new HomePage(driver);
		homePage.LocalAcess();

		// Realizar o Login
		LoginPage loginPage = new LoginPage(driver);
		loginPage.Login("05587686108", "Rezende2309@");

		// Acessar o sistema
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		AcessoAoSistema acessoAoSistema = new AcessoAoSistema(driver);
		acessoAoSistema.AcessarSistema();
		acessoAoSistema.AcessarTicket();
	}

}
