package Genric_lib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NormalTick {
	public WebElement getTicketId() {
		return TicketId;
	}
	public NormalTick(WebDriver driver) {
		PageFactory.initElements(driver, this);
}
	@FindBy(id="visitorname")
	private WebElement visitorName;
	
	@FindBy(id="noadult")
	private WebElement NoOfAdult;
	
	@FindBy(id="nochildren")
	private WebElement NoOfChildren;
	
	@FindBy(xpath="//button[text()='Submit']")
	private WebElement Submi;
	@FindBy(linkText="Normal Ticket")
	private WebElement NormalT;
	@FindBy(linkText="Add Ticket")
	private WebElement Addticket;
	@FindBy(linkText="Manage Ticket")
	private WebElement manage;
	public WebElement getVisitorName() {
		return visitorName;
	}
	public WebElement getNoOfAdult() {
		return NoOfAdult;
	}
	public WebElement getNoOfChildren() {
		return NoOfChildren;
	}
	public WebElement getSubmi() {
		return Submi;
	}
	public WebElement getNormalT() {
		return NormalT;
	}
	public WebElement getAddticket() {
		return Addticket;
	}
	public WebElement getManage() {
		return manage;
	}
	@FindBy(xpath="//h4[contains(@style,\"color: blue\")]")
	private WebElement TicketId;
	@FindBy(linkText = "View")
	private WebElement View;
	public WebElement getView() {
		return View;
	}
	@FindBy(xpath="(//h4[contains(text(),'Details of Normal Tickets')]/..//tr[contains(@data-expanded,'true')])[1]/td[2]")
	private WebElement TicketCom;
	@FindBy(linkText="Delete")
	private WebElement delete;
	public WebElement getTicketCom() {
		return TicketCom;
	}
	public WebElement getDelete() {
		return delete;
	}
}
