package Zoo1;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Genric_lib.BaseTest;
import Genric_lib.ToReadData;

public class Zoo_Foreingers_04 extends BaseTest {
	@Test
	public void working() throws IOException {

	FT.getClick_on_Foreigners_Ticket().click();//Foreigners_Ticket
	FT.getClick_on_Add_Ticket().click();
	FT.getVisitorName().sendKeys(ToReadData.fromPropertyFile("Foreigner_name"));
	Reporter.log(FT.getVisitorName().getText(),true);
	Assert.assertEquals(FT.getVisitorName().getAttribute("value"),"Adithya" ,"Wrong Name Entered");
	FT.getNoOfChildren().sendKeys(ToReadData.fromPropertyFile("NoOfChild"));
	Reporter.log("Entered Name is matching ",true);
	Assert.assertEquals(FT.getNoOfChildren().getAttribute("value"),"2" ,"wrong Child count Entered");
	Reporter.log("Entered Child count is matching ",true);
	FT.getNoOfAdult().sendKeys(ToReadData.fromPropertyFile("NoOfAdult"));
	Assert.assertEquals(FT.getNoOfAdult().getAttribute("value"),"1" ,"wrong Adult count Entered");
	Reporter.log("Entered Adult count is matching ",true);
	FT.getSubmi().click();
	Alert Delet= driver.switchTo().alert();
	Reporter.log(Delet.getText(),true);
	Delet.accept();
	FT.getClick_on_Foreigners_Ticket().click();
	FT.getClick_On_Manage_Ticket().click();
	FT.getDelete().click();
	Delet.accept();
	Reporter.log(Delet.getText(),true);
	Delet.accept();
	ad.getAdminlog().click();
	ad.getLog().click();
	Reporter.log("Admin Logged Out",true);
	driver.quit();
	driver.quit();
}
}
