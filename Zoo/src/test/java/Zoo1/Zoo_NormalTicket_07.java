package Zoo1;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Genric_lib.BaseTest;
import Genric_lib.ToReadData;

public class Zoo_NormalTicket_07 extends BaseTest{
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
	WebElement IDTitle = driver.findElement(By.xpath("//h4[contains(text(),'Ticket ID:')]"));
	String id = IDTitle.getText();
	id=id.replace("Ticket ID: ", "");
	Reporter.log(id,true);
	Sp.getSerch().click();
	Sp.getClickNorm().click();
	Sp.getTicketID().sendKeys(id);
	Sp.getSubmit().click();
	WebElement IDTitleinsearch = driver.findElement(By.xpath("//td[text()='1']/..//td[2]"));
	String idInSearch = IDTitleinsearch.getText();
	Reporter.log(idInSearch,true);
	Assert.assertEquals(id,idInSearch,"booked ticked is not displayed in search");
	Reporter.log("booked ticked is displayed in search",true);
	
}
}
