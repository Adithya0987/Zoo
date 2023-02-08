package Zoo1;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Genric_lib.BaseTest;
import Genric_lib.ToReadData;

public class Zoo_normalTick_02 extends BaseTest{
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
		String TicketI = NT.getTicketId().getText();
		TicketI = TicketI.replace("Ticket ID:","");
		TicketI=TicketI.trim();
		NT.getNormalT().click();
		NT.getManage().click();
		String Comp = NT.getTicketCom().getText();
		Assert.assertEquals(TicketI, Comp, "Ticket Is Not Found");
		Reporter.log("Ticket Gen is Macthing",true);

}
	}
