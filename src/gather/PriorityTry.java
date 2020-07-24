package gather;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class PriorityTry extends Togather{

	
		
		@Test (priority=2)
		public void loginTest(){
			// selenium code
			System.out.println (" facebook Login test");
			
			driver.findElement(By.xpath(fn)).sendKeys(fval);
			driver.findElement(By.xpath(ln)).sendKeys( lst);

		}

		@Test (priority=3)
		public void logoutTest(){
			// selenium code
			System.out.println (" facebook Logout test");
		}

		@Test (priority=1)
		public void signUpFbTest(){
			System.out.println (" facebook sign up test");
			
			driver.findElement(By.xpath(fn)).sendKeys(fval);
			driver.findElement(By.xpath(ln)).sendKeys( lst);

			// check if new user exist in database
			//		Statement stmt = conn.createStatement();
			//		ResultSet rs = stmt.executeQuery("SELECT Lname FROM Customers WHERE phone = 718");

		}
		@Test (priority=4)
		public void skipTest(){
			System.out.println (" This test is going to be skipped since no longer needed");
			// selenium code
			throw new SkipException ("skipping this test because business requiment is changed. Here is the JIRA Ticket # SF-7");
		}
		
		@Test(priority=5, enabled=false)
		public void distableTest(){
			System.out.println (" Don't want to exectue the test at all and it won't show up in report");
		}

		@Test(priority=5, enabled=true)
		public void tryCatchTest(){
			System.out.println (" try catch block test");
			String actual 		= "Hi, TalentTEK";
			String expected 	= "Hi, TalentTEK Consulting";
			try {
				Assert.assertEquals(actual, expected);
			}catch (Throwable issue){
				System.err.println ("actual is not matching with expected" + issue);
			}
			
		
		
	

	}

}
