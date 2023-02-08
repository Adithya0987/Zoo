package Zoo1;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Genric_lib.BaseTest;
import Genric_lib.ToReadData;
import Genric_lib.adminworks;

public class Upadatepasw extends BaseTest{
	@Test
	public void ToUpdatePassword() {
		aw.getAdminButton().click();
		aw. getSetting().click();
		aw.getCurrentpwd().clear();
		aw.getCurrentpwd().sendKeys("Test@1234");
		aw.getNewpwd().sendKeys("Test@123");
		aw.getConfirmpwd().sendKeys("Test@123");
		aw.getChange().click();
		Alert pwdchangedMsg = driver.switchTo().alert();
		String Popupmsg = pwdchangedMsg.getText();
		Reporter.log(Popupmsg,true);
		Assert.assertEquals(Popupmsg,"Your password successully changed","password not updated");
		Reporter.log("password updated",true);
		pwdchangedMsg.accept();
		driver.quit();
	}

}
