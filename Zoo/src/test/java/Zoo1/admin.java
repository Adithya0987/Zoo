package Zoo1;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Genric_lib.BaseTest;
import Genric_lib.ToReadData;
import Pom.Basepage;

public class admin extends BaseTest{
	@Test
	public void working() throws IOException, InterruptedException {
		
		aw.getUserB().click();
		aw.getPro().click();
		aw.getAdminname1().clear();
		aw.getAdminname1().sendKeys(ToReadData.fromPropertyFile("Admin"));
		String Store = aw.getAdminname1().getAttribute("value");
		Reporter.log("Admin Name Changed",true);
		Assert.assertEquals(Store,"Batman", "Not Matching ");
		aw.getUpdate1().click();
		Alert Updat=driver.switchTo().alert();
		Updat.accept();		
	
		
	}



}
