package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class droppom {
    @FindBy(id="qccombo")
    private WebElement dropdown;
    
    public droppom(WebDriver driver) {
	    PageFactory.initElements(driver, this);
	}

	public WebElement getDropdown() {
		return dropdown;
	}

	public void setDropdown(WebElement dropdown) {
		this.dropdown = dropdown;
	}
    
    
}
