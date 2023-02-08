package Zoo1;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Genric_lib.BaseTest;
import Genric_lib.ToReadData;

public class Zoo_addanimal_01 extends BaseTest{
	public Alert Delet;
	@Test
	public void working() throws IOException{
		ad.getAnimalD().click();//Add Animal
		ad.getAdd().click();
		ad.getAnimalName().sendKeys(ToReadData.fromPropertyFile("Animal"));
		Assert.assertEquals(ad.getAnimalName().getAttribute("value"), "Dog", "The Entered Data Is Not Macthing");
		Reporter.log("The Entered Animal name  is Macthing",true);
		ad.getUploadImage().sendKeys("C:\\Users\\sbadi\\Downloads\\Lab.jpg");
		ad.getCageNumber().sendKeys(ToReadData.fromPropertyFile("cagenum"));
		Assert.assertEquals(ad.getCageNumber().getAttribute("value"), "50", "The Entered Data Is Not Macthing");
		Reporter.log("The Entered cage number  is Macthing",true);
		ad.getFeedNumber().sendKeys(ToReadData.fromPropertyFile("Feed"));
		Assert.assertEquals(ad.getFeedNumber().getAttribute("value"), "60", "The Entered Data Is Not Macthing");
		Reporter.log("The Entered Feed number  is Macthing",true);
		ad.getBreed().sendKeys(ToReadData.fromPropertyFile("Breed"));
		Assert.assertEquals(ad.getBreed().getAttribute("value"), "Lab", "The Entered Data Is Not Macthing");
		Reporter.log("The Entered Breed name  is ",true);
		ad.getDescription().sendKeys(ToReadData.fromPropertyFile("Des"));
		Assert.assertEquals(ad.getDescription().getAttribute("value"), "Its intel Dog which is used in armys", "The Entered Data Is Not Macthing");
		Reporter.log("The Entered data is correct",true);
		ad.getSubmit().click();
		Delet=driver.switchTo().alert();
		Reporter.log(Delet.getText(),true);
		Delet.accept();
		driver.navigate().back();
		driver.navigate().back();
		ad.getAnimalD().click();
		ad.getManageAnimals().click();
		ad.getDeletebutton().click();
		Delet.accept();
		Reporter.log(Delet.getText(),true);
		Delet.accept();
		
	
}
}
