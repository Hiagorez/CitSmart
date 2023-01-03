package Tests;

import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testes {

	WebDriver driver = new ChromeDriver();

	@Before
	public void setUp() {
		// Abrir o navegador
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		driver.get("https://servicostic2.homologa.unb.br/citsmart/webmvc/login");
	}

	@After
	public void tearDown() {
		// Fechar navegador
	//	driver.quit();
	}

	@Test
	public void ChamadoTest() {
		Base base = new Base();
		base.TesteLoginUsuário(driver);
	}

	@Test
	public void AcessarGrupos() {
		Base base = new Base();
		base.AcessarFilaG1(driver);
	}
}
