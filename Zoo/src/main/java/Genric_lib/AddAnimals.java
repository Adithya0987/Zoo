package Genric_lib;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddAnimals  {
	public AddAnimals(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText="Animals Details")
	private WebElement AnimalD;
	@FindBy(xpath = "//h4[contains(@data-toggle,\"dropdown\")]")
	private WebElement adminlog;
	@FindBy(linkText = "Log Out")
	private WebElement Log;
	public WebElement getAdminlog() {
		return adminlog;
	}

	public WebElement getLog() {
		return Log;
	}

	public WebElement getManageimals() {
		return Manageimals;
	}
	@FindBy(linkText="Add Animals")
	private WebElement Ad;
	@FindBy(xpath="//button[contains(@name,'submit')]")
	private WebElement submi;
	public WebElement getSubmit() {
		return submi;
	}

	public WebElement getAnimalD() {
		return AnimalD;
	}

	public WebElement getAdd() {
		return Ad;
	}
	@FindBy(id="aname")
	private WebElement AnimalName;
	
	@FindBy(id="image")
	private WebElement uploadImage;
	
	@FindBy(id="cnum")
	private WebElement cageNumber;
	
	@FindBy(id="fnum")
	private WebElement feedNumber;
	
	@FindBy(id="breed")
	private WebElement breed;
	
	@FindBy(id="desc")
	private WebElement description;
	@FindBy(xpath="(//h4[contains(text(),'Manage Animals')]/..//tr[contains(@data-expanded,'true')])[1]/td[2]")
	private WebElement animalinmanage;
	@FindBy(linkText="Edit")
	private WebElement editbutton;
	@FindBy(linkText="Delete")
	private WebElement Deletebutton;
	@FindBy(partialLinkText ="Manage Animals")
	private WebElement Manageimals;
	

	public WebElement getManageAnimals() {
		return Manageimals;
	}

	public WebElement getAd() {
		return Ad;
	}

	public WebElement getSubmi() {
		return submi;
	}

	public WebElement getAnimalinmanage() {
		return animalinmanage;
	}

	public WebElement getEditbutton() {
		return editbutton;
	}

	public WebElement getDeletebutton() {
		return Deletebutton;
	}

	public WebElement getAnimalName() {
		return AnimalName;
	}

	public WebElement getUploadImage() {
		return uploadImage;
	}

	public WebElement getCageNumber() {
		return cageNumber;
	}

	public WebElement getFeedNumber() {
		return feedNumber;
	}

	public WebElement getBreed() {
		return breed;
	}

	public WebElement getDescription() {
		return description;
	}
	
}



