package test;

import org.testng.annotations.Test;

import POM.RegisterPOM;

import base.BaseTest;
import testData.DataProviderClass;

public class Register extends BaseTest {

	@Test(dataProvider ="registrationData", dataProviderClass =DataProviderClass.class)
	public void register(String gender, String fname, String lname, String email,String pass ) throws InterruptedException {
		RegisterPOM pm =new RegisterPOM(driver);
		pm.registerLink();
		pm.clickGender(gender);
	
		pm.enterName(fname);
		pm.enterLast(lname);
		pm.enterEmail(email);
		pm.enterpass(pass);
		pm.entercpass(pass);
		Thread.sleep(3000);
		pm.registerclick();
		

	}
}
