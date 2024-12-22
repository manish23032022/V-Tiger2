package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic.WebDriverUtility;

public class HomePage {
	
	
	
	public HomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@name='user_name']")
	private WebElement username;
	
	@FindBy(xpath="//input[@name='user_password']")
	private WebElement password;
	
	@FindBy(xpath = "//td[@onmouseover=\"fnDropDownUser(this,'ondemand_sub','~razamd260@gmail.com`');\"]")
	//td[@onmouseover='fnDropDownUser(this,'ondemand_sub','~razamd260@gmail.com`');']
	private WebElement movetolougout;
	
	@FindBy(xpath = "//a[text()='Sign Out']")
	private WebElement signout;
	
	
	public WebElement getMovetolougout() {
		return movetolougout;
	}

	public void setMovetolougout(WebElement movetolougout) {
		this.movetolougout = movetolougout;
	}

	public WebElement getSignout() {
		return signout;
	}

	public void setSignout(WebElement signout) {
		this.signout = signout;
	}

	@FindBy(id="submitButton")
	private WebElement login;

	public WebElement getUsername() {
		return username;
	}

	public void setUsername(WebElement username) {
		this.username = username;
	}

	public WebElement getPassword() {
		return password;
	}

	public void setPassword(WebElement password) {
		this.password = password;
	}

	public WebElement getLogin() {
		return login;
	}

	public void setLogin(WebElement login) {
		this.login = login;
	}
	
	
	
	

}
