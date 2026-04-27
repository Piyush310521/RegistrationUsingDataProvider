package testData;

import org.testng.annotations.DataProvider;

public class DataProviderClass {

	@DataProvider(name = "registrationData")
	public Object [][] getData(){
		
		return new Object[][] {
		     { "male",   "Vrushali", "Lokhande", "vrushali1@gmail.com", "HappyFOrYou@12" },
	            { "female", "Sneha",    "Patil",    "sneha2@gmail.com",    "HappyFOrYou@12" },
	            { "male",   "Rahul",    "Sharma",   "rahul3@gmail.com",    "HappyFOrYou@12" }
	        };
	}
	
}
