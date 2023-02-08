package Genric_lib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_pom {
	public Search_pom(WebDriver driver) {
		PageFactory.initElements(driver, this);
}
	
	@FindBy(linkText="Search")
	private WebElement serch;
	@FindBy(linkText = "Foreigner Ticket Search")
	private WebElement foreinn;
	public WebElement getForeinn() {
		return foreinn;
	}

	@FindBy(linkText = "Normal Ticket Search")
	private WebElement clickNorm;
	@FindBy(id="searchdata")
	private WebElement TicketID;
	
	@FindBy(id="submit")
	private WebElement submit;
	public WebElement getTicketID() {
		return TicketID;
	}
	public WebElement getSubmit() {
		return submit;
	}
	public WebElement getSerch() {
		return serch;
	}
	public WebElement getClickNorm() {
		return clickNorm;
	}
 
}
