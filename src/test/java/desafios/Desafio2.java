package desafios;


import java.net.MalformedURLException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Desafio2 {
	private WebDriver driver;

	@BeforeTest()
	public void setUp() {
		//!!IMPORTANT!! Modify following path to your correct chromedriver location and uncomment the follow line.
		//System.setProperty("webdriver.chrome.driver", "E:\\java-workspace\\ProvaSicredi\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@AfterTest()
	public void tearDown() {
		// Quits driver.
		driver.quit();
	}
	
	@Test
	public void desafio1() throws InterruptedException, MalformedURLException {
		driver.get("https://www.grocerycrud.com/v1.x/demo/my_boss_is_in_a_hurry/bootstrap-v4");
		
		// Gets select element
		Select themeSelect = new Select(driver.findElement(By.id("switch-version-select")));
		themeSelect.selectByValue("/v1.x/demo/my_boss_is_in_a_hurry/bootstrap-v4");
				
		driver.findElement(By.linkText("Add Record")).click();
		driver.findElement(By.id("field-customerName")).sendKeys("Teste Sicredi");
		driver.findElement(By.id("field-contactLastName")).sendKeys("Teste");
		driver.findElement(By.id("field-contactFirstName")).sendKeys("Alex");
		driver.findElement(By.id("field-phone")).sendKeys("51 9999-9999");
		driver.findElement(By.id("field-addressLine1")).sendKeys("Av Assis Brasil, 3970");
		driver.findElement(By.id("field-addressLine2")).sendKeys("Torre D");
		driver.findElement(By.id("field-city")).sendKeys("Porto Alegre");
		driver.findElement(By.id("field-state")).sendKeys("RS");
		driver.findElement(By.id("field-postalCode")).sendKeys("91000-000");
		driver.findElement(By.id("field-country")).sendKeys("Brasil");
		driver.findElement(By.id("field-salesRepEmployeeNumber")).sendKeys("Fixter");
		driver.findElement(By.id("field-creditLimit")).sendKeys("200");
		driver.findElement(By.id("form-button-save")).click();

		// Gets link element that back user to the list page
		WebElement backToListLink = new WebDriverWait(driver, Duration.ofSeconds(2)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@href='/v1.x/demo/my_boss_is_in_a_hurry/bootstrap-v4/']")));
		backToListLink.click();

		// Gets table's filter by name input
		WebElement searchByNameInput = new WebDriverWait(driver, Duration.ofSeconds(2)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@name='customerName']")));
		searchByNameInput.sendKeys("Teste Sicredi");

		driver.findElement(By.xpath("//input[@type='checkbox' and @class='select-row']")).click();
		driver.findElement(By.className("delete-selected-button")).click();
		driver.findElement(By.className("delete-multiple-confirmation-button")).click();

		// Gets modal message
		WebElement modalMessage = new WebDriverWait(driver, Duration.ofMillis(100)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='modal-body']//p[@class='alert-delete-multiple-one']")));
		// Verifies modal message text
		modalMessage.getText().equals("Are you sure that you want to delete this 1 item?");

		// Gets animated success alert message
		WebElement animatedSuccessAlert = new WebDriverWait(driver, Duration.ofMillis(100)).until(ExpectedConditions.presenceOfElementLocated(By.className("alert-success")));
		// Verifies alert message text
		animatedSuccessAlert.getText().equals("Your data has been successfully deleted from the database.");
	}
}
