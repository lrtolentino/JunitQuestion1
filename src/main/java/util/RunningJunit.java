package util;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RunningJunit {

	static WebDriver driver;

	@Before
	public void init() {

		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://techfios.com/test/101/");
		//return driver;

	}

	@Test
	public void JunitAutomation () {

		// xpath = //input[@name = 'allbox']
		driver.findElement(By.name("allbox")).click();

		WebElement CATEGORY_DROPDOWN_ELEMENT = driver.findElement(By.xpath("//select[@name = 'category']"));

		Select sel = new Select(CATEGORY_DROPDOWN_ELEMENT);
		sel.selectByVisibleText("AutoTest46");
		
		WebElement DUE_DAY_DROPDOWN_ELEMENT = driver.findElement(By.xpath("//select[@name = 'due_day']"));

		Select sel1 = new Select(DUE_DAY_DROPDOWN_ELEMENT);
		sel1.selectByVisibleText("17");
		
		WebElement DUE_MONTH_DROPDOWN_ELEMENT = driver.findElement(By.xpath("//select[@name = 'due_month']"));

		Select sel2 = new Select(DUE_MONTH_DROPDOWN_ELEMENT);
		sel2.selectByVisibleText("Dec");
		
		WebElement DUE_YEAR_DROPDOWN_ELEMENT = driver.findElement(By.xpath("//select[@name = 'due_year']"));

		Select sel3 = new Select(DUE_YEAR_DROPDOWN_ELEMENT);
		sel3.selectByVisibleText("2021");
		
		WebElement ADD_CATEGORY_DROPDOWN_ELEMENT = driver.findElement(By.xpath("//select[@name = 'colour']"));

		Select sel4 = new Select(ADD_CATEGORY_DROPDOWN_ELEMENT);
		sel4.selectByVisibleText("Gray");

	}
	
	
	public void tearDown() {
		driver.close();
		driver.quit();
	}

}
