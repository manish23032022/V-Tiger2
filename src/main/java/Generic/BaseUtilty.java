package Generic;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import POM.HomePage;
import POM.droppom;

public class BaseUtilty {
	public WebDriver driver;
	public FileUtilty f=new FileUtilty();
	public  WebDriverUtility web=new WebDriverUtility();
	public HomePage home;
	public droppom d;
	
	
	@BeforeSuite
	public void DbConnection() {
		System.out.println("======connect database=====");
	}
	
	@BeforeTest
	public void ParallelExcution() {
		System.out.println("======ParallelExcution=====");
	}
	
	@BeforeClass
	public void LaunchBrowser() throws IOException {
		System.out.println("======Launch browser=====");
		driver=new ChromeDriver();
		String url=f.getdata("url");
		driver.get(url);
		driver.manage().window().maximize();
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		web.implicit(driver,10);
		home=new HomePage(driver);
		d=new droppom(driver);
				
		
	}
	
	@BeforeMethod
	public void LoginApp() throws IOException, InterruptedException {
		System.out.println("=====Login app=====");
		String user=f.getdata("usename");
		String pass=f.getdata("password");
		System.out.println(user+ "  : " +pass);
//		Thread.sleep(9000);
		home.getUsername().sendKeys(user);
		home.getPassword().sendKeys(pass);
		home.getLogin().click();
	}
	
	
	
	@AfterMethod
	public void LogoutApp() throws InterruptedException {
		web.movetoelement(driver, home.getMovetolougout());
		home.getSignout().click();
		
//		WebElement act = driver.findElement(By.xpath("//td[@onmouseover=\"fnDropDownUser(this,'ondemand_sub','~razamd260@gmail.com`');\"]"));
//		Actions action=new Actions(driver);
//		action.moveToElement(act).perform();
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
		System.out.println("=====Logout app=====");
	}
	
	@AfterClass
	public void CloseBrowser() {
		driver.close();
		System.out.println("======Close browser=====");
	}
	
	@AfterTest
	public void DisconnectParallelExcution() {
		System.out.println("======DisconnectParallelExcution=====");
	}
	
	@AfterSuite
	public void DisconnectDbConnection() {
		System.out.println("======connect database=====");
	}
	
	

}
