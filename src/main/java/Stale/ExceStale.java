package Stale;

import java.time.Duration;

import javax.sql.rowset.WebRowSet;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExceStale {
   
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost:8888");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		driver.findElement(By.name("user_name")).sendKeys("admin",Keys.TAB+"admin",Keys.ENTER);
		WebElement send = driver.findElement(By.name("query_string"));
		send.sendKeys("manish");
		driver.navigate().refresh();
		WebElement send1 = driver.findElement(By.name("query_string"));
		send1.clear();
		send1.sendKeys("manish");
		driver.navigate().refresh();
		send1.clear();
		send1.sendKeys("hello");
	}
}
