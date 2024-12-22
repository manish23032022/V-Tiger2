package Generic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

    /**
     * @author Manish
     */

public class WebDriverUtility {

	/**
	 *  @param driver
	 *  @param element
	 *  
	 *  Action MoveToElemenet
	 */
	
	 public Actions action;
	 public void movetoelement(WebDriver driver,WebElement element) {

		 action=new Actions(driver);
		 action.moveToElement(element).perform();
	 }
	 
	 /**
	  * 
	  * @param driver
	  * @param element
	  * 
	  *  Double click
	  */
	 
	 public void doubleclick(WebDriver driver,WebElement element) {
		 action=new Actions(driver);
		 action.doubleClick(element).perform();
	 }
	 
	 
	 /**
	  * 
	  * @param driver
	  * @param element
	  * 
	  *  Right click
	  */
	 
	 public void RightClick(WebDriver driver,WebElement element) {
		 action=new Actions(driver);
		 action.contextClick(element).perform();
	 }
	
	 /**
	  *  select by index
	  */
	public Select s;
	 public void selctbyindex(WebElement element, int index) {
		    s=new Select(element);
			s.selectByIndex(index);
	 }
	
	 /**
	  *  implicit wait 
	  */
	 
	 public void implicit(WebDriver driver,long num) {
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(num));
	 }
}
