package Tests;

import java.time.Duration;

import org.junit.jupiter.api.DisplayName;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Pages.AcessoAoSistema;
import Pages.HomePage;
import Pages.LoginPage;

@DisplayName("Testes Automatizados")
public class Base {

	
	public void TesteLoginUsuário(WebDriver driver) {

		// Abrir site
		HomePage homePage = new HomePage();
		homePage.LocalAcess(driver);

		// Realizar o Login
		LoginPage loginPage = new LoginPage();
		loginPage.Login("05587686108", "Rezende2309@", driver);

		// Acessar o sistema
		
		AcessoAoSistema acessoAoSistema = new AcessoAoSistema();
		acessoAoSistema.AcessarSistema(driver);
		acessoAoSistema.AcessarTicket(driver);
		
	}

	public void AcessarFilaG1 (WebDriver driver) {
		Base base = new Base();
		base.TesteLoginUsuário(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		driver.findElement(By.id("open-advanced-search")).click();
		driver.findElement(By.id("select-grupo-executor")).click();
		driver.findElement(By.xpath("//*[@id=\"select-grupo-executor\"]/option[6]")).click();
		driver.findElement(By.id("button-filtro-pesquisar")).click();
	}
}
