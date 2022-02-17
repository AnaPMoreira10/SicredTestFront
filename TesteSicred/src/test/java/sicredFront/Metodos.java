package sicredFront;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Metodos {

	Elementos credito = new Elementos();
	public static WebDriver driver;

	public void abrirBrowser(String site) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(site);
		driver.manage().window().maximize();

	}

	public void click(By elemento) throws InterruptedException {

		driver.findElement(elemento).click();

	}

	public void esperarElemento(By el) {

		(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOfElementLocated((el)));

	}

	public void validaTexto(By elemento, String txtEsperado) {

		String texto = driver.findElement(elemento).getText();
		System.out.println("Texto apresentado na tela: " + texto);
		assertEquals(txtEsperado, texto);

	}

	public void preencherDadosUsuario(String name, String lastname, String firstname, String phone, String lineA,
			String lineB, String city, String state, String postalcode, String country, String employee,
			String creditlimit) {

		driver.findElement(By.id("field-customerName")).sendKeys(name);
		driver.findElement(By.id("field-contactLastName")).sendKeys(lastname);
		driver.findElement(By.id("field-contactFirstName")).sendKeys(firstname);
		driver.findElement(By.id("field-phone")).sendKeys(phone);
		driver.findElement(By.id("field-addressLine1")).sendKeys(lineA);
		driver.findElement(By.id("field-addressLine2")).sendKeys(lineB);
		driver.findElement(By.id("field-city")).sendKeys(city);
		driver.findElement(By.id("field-state")).sendKeys(state);
		driver.findElement(By.id("field-country")).sendKeys(country);
		driver.findElement(By.id("field-postalCode")).sendKeys(postalcode);
		driver.findElement(By.id("field-salesRepEmployeeNumber")).sendKeys(employee);
		driver.findElement(By.id("field-creditLimit")).sendKeys(creditlimit);

	}

	public void Scroll() {
		((JavascriptExecutor) driver).executeScript("scroll(0,500)");
	}

	public void fecharBrowser() throws InterruptedException {
		driver.quit();
	}
}
