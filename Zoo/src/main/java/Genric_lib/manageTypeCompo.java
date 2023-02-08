package Genric_lib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class manageTypeCompo {
	public manageTypeCompo(WebDriver driver) {
		PageFactory.initElements(driver, this);
		}
	@FindBy(id="tickettype")
	private WebElement TicketType;
	@FindBy(linkText = "Edit")
	private WebElement edit;
	public WebElement getEdit() {
		return edit;
	}
	@FindBy(id="tprice")
	private WebElement coast;
	
	@FindBy(xpath="//button[text()='Update']")
	private WebElement submit;
	@FindBy(xpath  = "//span[contains(text(),'Manage Type Ticket')]")
	private WebElement ClickMange;

	public WebElement getClickMange() {
		return ClickMange;
	}

	public WebElement getTicketType() {
		return TicketType;
	}

	public WebElement getCoast() {
		return coast;
	}

	public WebElement getSubmit() {
		return submit;
	}


}
