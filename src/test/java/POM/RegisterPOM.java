package POM;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseTest;

public class RegisterPOM {
     
	@FindBy(className ="ico-register") WebElement register;
	@FindBy(id="gender-male") WebElement genderMale;
	@FindBy(id ="gender-female") WebElement genderFemale;
	@FindBy(id ="FirstName") WebElement firstName;
	@FindBy(id = "LastName") WebElement lastName;
	@FindBy(id = "Email") WebElement email;
	@FindBy(id = "Password") WebElement pass;
	@FindBy(id = "ConfirmPassword") WebElement cpass;
	
	
	
	
	public RegisterPOM(WebDriver driver){
		
		PageFactory.initElements(driver, this);
	}
	
	public void registerLink() {
		register.click();
	}
	public void clickGender(String gender) {
		if(gender.equalsIgnoreCase("male")) {
			genderMale.click();
		}
		else {
			genderFemale.click();
			
		}
	
	}
	public void enterName(String fname) {
		firstName.sendKeys(fname);
	}
	public void enterLast(String lname) {
		lastName.sendKeys(lname);
	}
	public void enterEmail(String email) {
		this.email.sendKeys(email);
	}
	public void enterpass(String pass) {
		this.pass.sendKeys(pass);
	}
	
	public void entercpass(String cpass) {
		this.cpass.sendKeys(cpass);
	}
	
	public void registerclick() {
		register.click();
	}
	
}
