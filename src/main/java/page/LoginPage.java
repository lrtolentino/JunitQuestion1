package page;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

	WebDriver driver;
	
	
	public LoginPage (WebDriver driver) {
		this.driver = driver;
	}
	//WebElements
	//WebElement USER_NAME_ELEMENT = driver.findElement(By.xpath("//*[@id=\"username\"]"));
	//By USER_NAME_LOCATOR = By.xpath("//*[@id=\"username\"]");
	
	@FindBy(how=How.XPATH, using="//*[@id=\"username\"]") WebElement USER_NAME_ELEMENT;
	@FindBy(how=How.XPATH, using="//*[@id=\"password\"]") WebElement PASSWORD_ELEMENT;
	@FindBy(how=How.XPATH, using="/html/body/div/div/div/form/div[3]/button") WebElement SIGNIN_ELEMENT;
	
	//Interactive Methods
	public void enterUserName(String userName) {
		USER_NAME_ELEMENT.sendKeys(userName);
	}
	
	public void enterPassWord(String passWord) {
		PASSWORD_ELEMENT.sendKeys(passWord);
	}
	
	public void clickSignInButton() {
		SIGNIN_ELEMENT.click();
	}
	
	public void performLogin(String userName, String passWord) {
		USER_NAME_ELEMENT.sendKeys(userName);
		PASSWORD_ELEMENT.sendKeys(passWord);
		SIGNIN_ELEMENT.click();
	}
}
