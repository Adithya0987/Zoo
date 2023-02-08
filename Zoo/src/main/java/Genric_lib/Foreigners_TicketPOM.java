package Genric_lib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Foreigners_TicketPOM {
	public Foreigners_TicketPOM(WebDriver driver) {
		PageFactory.initElements(driver, this);
		}
	@FindBy(linkText = "Foreigners Ticket")
	private WebElement click_on_Foreigners_Ticket;
	@FindBy(linkText = "Add Ticket")
	private WebElement click_on_Add_Ticket;
	@FindBy(id="visitorname")
	private WebElement visitorName;
	
	@FindBy(id="noadult")
	private WebElement NoOfAdult;
	
	@FindBy(id="nochildren")
	private WebElement NoOfChildren;
	
	@FindBy(xpath="//button[text()='Submit']")
	private WebElement Submi;
	@FindBy(xpath="(//h4[contains(@style,'color: blue')][1])")
	private WebElement TicketGenID;
	@FindBy(linkText = "View")
	private WebElement View;
	public WebElement getView() {
		return View;
	}
	public WebElement getTicketGenID() {
		return TicketGenID;
	}

	public WebElement getClick_On_Manage_Ticket() {
		return Click_On_Manage_Ticket;
	}

	public WebElement getCompareTicketID() {
		return compareTicketID;
	}
	@FindBy(linkText = "Manage Ticket")
	private WebElement Click_On_Manage_Ticket;
	@FindBy(xpath = "//tr//td[text()=1]/..//td[2]")
	private WebElement compareTicketID;
	@FindBy(linkText="Delete")
	private WebElement delete;
	public WebElement getDelete() {
		return delete;
	}

	public WebElement getClick_on_Foreigners_Ticket() {
		return click_on_Foreigners_Ticket;
	}

	public WebElement getClick_on_Add_Ticket() {
		return click_on_Add_Ticket;
	}

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
}