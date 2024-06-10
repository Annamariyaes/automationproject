package pagepkg;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import basepkg.Baseclass;

public class Shopymixaccount {
	 WebDriver driver;

	    @FindBy(name = "register[firstName]")
	    WebElement firstName;

	    @FindBy(name = "register[lastName]")
	    WebElement lastName;

	    @FindBy(name = "register[email]")
	    WebElement email;

	    @FindBy(name = "register[password]")
	    WebElement password;

	    @FindBy(name = "register[street]")
	    WebElement street;

	    @FindBy(name = "register[zip]")
	    WebElement zip;

	    @FindBy(name = "register[city]")
	    WebElement city;

	    @FindBy(name = "register[billing][country]")
	    WebElement country;

	    @FindBy(name = "submit")
	    WebElement submitButton;
	    
	    
	    @FindBy(name = "register[designation]")
	    WebElement designationDropdown;

	    @FindBy(name = "register[salutation]")
	    WebElement salutationDropdown;


	    public Shopymixaccount(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }

	    public void setvalues(String fName, String lName, String mail, String pwd, String streetName, String zipCode, String cityName) {
	        firstName.sendKeys(fName);
	        lastName.sendKeys(lName);
	        email.sendKeys(mail);
	        password.sendKeys(pwd);
	        street.sendKeys(streetName);
	        zip.sendKeys(zipCode);
	        city.sendKeys(cityName);
	    }

	    public void selectCountry(String countryName) {
	        Select con = new Select(country);
	        con.selectByVisibleText(countryName);
	    }
	    public void selectDesignation(String designation) {
	        Select des = new Select(designationDropdown);
	        des.selectByVisibleText(designation);
	    }

	    public void selectSalutation(String salutation) {
	        Select sal = new Select(salutationDropdown);
	        sal.selectByVisibleText(salutation);
	  
	    }

	    public void submit() {
	        submitButton.click();
	    }
	}
	
	
	

