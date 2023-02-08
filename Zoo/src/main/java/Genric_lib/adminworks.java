package Genric_lib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class adminworks {
	public  adminworks(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//h4[@class='user-name dropdown-toggle']")
	private WebElement UserB;
	@FindBy(linkText="Profile")
	private WebElement Pro;
	@FindBy(xpath="//i[@class='fa fa-angle-down']")
	private WebElement adminButton;
	public WebElement getAdminButton() {
		return adminButton;
	}
	@FindBy(id="adminname")
	private WebElement adminname1;
	@FindBy(xpath="//a[text()='Settings']")
	private WebElement setting;
	@FindBy(id="currentpassword")
	private WebElement currentpwd;
	
	@FindBy(id="newpassword")
	private WebElement newpwd;
	
	@FindBy(id="confirmpassword")
	private WebElement confirmpwd;
	
	@FindBy(xpath="//button[text()='Change']")
	private WebElement change;

	public WebElement getSetting() {
		return setting;
	}
	public WebElement getCurrentpwd() {
		return currentpwd;
	}
	public WebElement getNewpwd() {
		return newpwd;
	}
	public WebElement getConfirmpwd() {
		return confirmpwd;
	}
	public WebElement getChange() {
		return change;
	}
	@FindBy(xpath="//button[@name='submit']")
	private WebElement update1;
	@FindBy(linkText ="Home ")
	private	WebElement homeNavBar;
	
	@FindBy(linkText ="About")
	private	WebElement aboutNavBar;
	
	@FindBy(linkText ="Contact")
	private	WebElement contactNavBar;
	
	@FindBy(linkText ="Admin")
	private	WebElement adminNavBar;
	
	@FindBy(linkText ="Animals")
	private	WebElement animalsNavBar;
	
	public WebElement getHomeNavBar() {
		return homeNavBar;
	}
	public WebElement getAboutNavBar() {
		return aboutNavBar;
	}
	public WebElement getContactNavBar() {
		return contactNavBar;
	}
	public WebElement getAdminNavBar() {
		return adminNavBar;
	}
	public WebElement getAnimalsNavBar() {
		return animalsNavBar;
	}
	public WebElement getUserB() {
		return UserB;
	}
	public WebElement getPro() {
		return Pro;
	}
	public WebElement getAdminname1() {
		return adminname1;
	}
	public WebElement getUpdate1() {
		return update1;
	}
}
