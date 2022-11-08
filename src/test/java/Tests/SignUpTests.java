package Tests;

import java.time.Duration;

import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.AcessoAoSistema;
import Pages.HomePage;
import Pages.LoginPage;

@DisplayName("Testes Automatizados Sing Up")
public class SignUpTests {

	private WebDriver driver;
	
	@BeforeEach
	public void setUp() {
		// Abrir o navegador
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
	}

	@Test
	@DisplayName("Registrar novo usuário")
	public void TesteLoginUsuário() {

		// Abrir site
		HomePage homePage = new HomePage(driver);
		homePage.AcessarSite();
		homePage.LocalAcess();

		// Realizar o Login
		LoginPage loginPage = new LoginPage(driver);
		loginPage.Login("05587686108", "Rezende2309@");

		// Acessar o sistema
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		AcessoAoSistema acessoAoSistema = new AcessoAoSistema(driver);
		acessoAoSistema.AcessarSistema();

	}

	@AfterEach
	public void tearDown() {
		driver.quit();
	}
}
