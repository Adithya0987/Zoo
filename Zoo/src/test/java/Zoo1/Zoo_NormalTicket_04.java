package Zoo1;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Genric_lib.BaseTest;
import Genric_lib.ToReadData;

public class Zoo_NormalTicket_04 extends BaseTest{
	@Test
	public void working() throws IOException {
		NT.getNormalT().click();//Normal Ticket
		NT.getAddticket().click();
		NT.getVisitorName().sendKeys(ToReadData.fromPropertyFile("Vistorn"));
		Assert.assertEquals(NT.getVisitorName().getAttribute("value"),"Adi" ,"Wrong Name Entered");
		Reporter.log("Entered Name is matching ",true);
		NT.getNoOfAdult().sendKeys(ToReadData.fromPropertyFile("Adult"));
		Assert.assertEquals(NT.getNoOfAdult().getAttribute("value"),"1" ,"wrong Adult count Entered");
		Reporter.log("Entered Adult count is matching ",true);
		NT.getNoOfChildren().sendKeys(ToReadData.fromPropertyFile("Child"));
		Assert.assertEquals(NT.getNoOfChildren().getAttribute("value"),"0" ,"wrong Child count Entered");
		Reporter.log("Entered Child count is matching ",true);
		NT.getSubmi().click();
		Alert vistorup=driver.switchTo().alert();
		Reporter.log(vistorup.getText(),true);
		vistorup.accept();
		NT.getNormalT().click();
		NT.getManage().click();
		NT.getDelete().click();
		Alert Delet= driver.switchTo().alert();
		Reporter.log(Delet.getText(),true);
		Delet.accept();
		Reporter.log(Delet.getText(),true);
		Delet.accept();
		ad.getAdminlog().click();
		ad.getLog().click();
		Reporter.log("Admin Logged Out",true);
		driver.quit();
	}

}
