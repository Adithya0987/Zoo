package Genric_lib;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import Pom.Basepage;


public class BaseTest {
	
	public WebDriver driver;
	public Basepage bp;
	public AddAnimals ad;
	public NormalTick NT;
	public Foreigners_TicketPOM FT;
	public  adminworks aw;
	public manageTypeCompo MT;
	public Search_pom Sp;
	
	@BeforeMethod
	public void launchBrowser() throws IOException {
		 driver= new ChromeDriver();
		 driver.manage().window().maximize();
		 Reporter.log("Browser Maximized");
		 driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		 
		driver.get(ToReadData.fromPropertyFile("Url"));
		MT=new manageTypeCompo(driver);
		Sp= new Search_pom(driver);
		bp=new Basepage(driver);
		 NT= new NormalTick(driver);
		 ad=new AddAnimals (driver);
		 FT= new Foreigners_TicketPOM(driver);
		  aw= new adminworks(driver);
		 	bp.getAdmin().click();//login 
			bp.getUN().sendKeys("admin",Keys.TAB);
			bp.getPS().sendKeys("Test@123");
			bp.getSubmit().click();
		//assert.assertEquals(TicketI, , TicketI);
		
	}
}
