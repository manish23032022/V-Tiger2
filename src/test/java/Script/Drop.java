package Script;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


import Generic.BaseUtilty;

public class Drop extends BaseUtilty{
	@Test	
	public void test() throws InterruptedException {
	   web.selctbyindex(d.getDropdown(),1);
		
	
		
		System.out.println("Script");
	}
}
