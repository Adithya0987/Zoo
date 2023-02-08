package Pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Genric_lib.BaseTest;

public class Basepage {
	public Basepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
}
	public WebElement getAdmin() {
		return Admin;
	}
	@FindBy(linkText="Admin")
	private WebElement Admin;
	@FindBy(id="username")
	private WebElement UN;
	@FindBy(id="password")
	private WebElement PS;
	@FindBy(id="form_submit")
	private WebElement Submit;


	public WebElement getUN() {
		return UN;
	}
	public WebElement getPS() {
		return PS;
	}
	public WebElement getSubmit() {
		return Submit;
	}
	

	
	}

	
