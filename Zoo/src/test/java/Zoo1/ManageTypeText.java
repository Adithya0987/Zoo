package Zoo1;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Genric_lib.BaseTest;

public class ManageTypeText extends BaseTest{
	@Test
	public void ToManageTicket() {
	MT.getClickMange().click();
	MT.getEdit().click();
	MT.getCoast().clear();
	MT.getCoast().sendKeys("150");
	MT.getSubmit().click();
	Alert coastPopup = driver.switchTo().alert();
	String popupTitle = coastPopup.getText();
	Reporter.log(coastPopup.getText(),true);
	// checking weather the data updated 
	Assert.assertEquals(coastPopup.getText(),popupTitle,"coast of the ticket is not updated");
	Reporter.log("coast of the ticket is updated",true);
	coastPopup.accept();
	}
}
