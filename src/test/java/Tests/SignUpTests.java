package Tests;

import java.time.Duration;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.HomePage;

@DisplayName("Testes Automatizados Sing Up")
public class SignUpTests {

	@Test
	@DisplayName("Registrar novo usuário")
	public void TesteRegistrarUsuário() {
		// Abrir o navegador 
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		
		// Abrir site 
		HomePage homePage = new HomePage(driver);
		homePage.AcessarSite();
		
		// Realizar o Login
		homePage.LocalAcess();
		
	
		
		driver.quit();
	
	}
}
