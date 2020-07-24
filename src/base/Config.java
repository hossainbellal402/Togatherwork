package base;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;



public class Config extends WDFunction {
	
	
	
	
	@BeforeSuite
	public void Startbeforesuite() {
		
	}
 @BeforeMethod
 public void OpenEachTestMethod(){
	 
	 System.setProperty( "webdriver.chrome.driver",System.getProperty( "user.dir")+ "/Drivers/chromedriver.exe");
	 driver=new ChromeDriver();
	 driver.get("http://Airbnb.com");
 }
 @AfterMethod
 public void CloseEachTestMethod(){
	 driver.close();
	 System.out.println("This closeing EachTesting+++++++++++closingEachTest...");
	 
 }
 @AfterSuite
 public void tearDown() {
	 driver.quit();
	 System.out.println("This Quit all Browser+++++++++++  Terminated work");
 }

}
