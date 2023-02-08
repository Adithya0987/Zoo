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

public class Zoo_Foreingers_07 extends BaseTest {
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
	WebElement IDTitle = driver.findElement(By.xpath("//h4[contains(text(),'Ticket ID:')]"));
	String id = IDTitle.getText();
	id=id.replace("Ticket ID: ", "");
	Reporter.log(id,true);
	Sp.getSerch().click();
	Sp.getForeinn().click();
	Sp.getTicketID().sendKeys(id);
	Sp.getSubmit().click();
	WebElement IDTitleinsearch = driver.findElement(By.xpath("//td[text()='1']/..//td[2]"));
	String idInSearch = IDTitleinsearch.getText();
	Reporter.log(idInSearch,true);
	Assert.assertEquals(id,idInSearch,"booked ticked is not displayed in search");
	Reporter.log("booked ticked is displayed in search",true);
	
}
}