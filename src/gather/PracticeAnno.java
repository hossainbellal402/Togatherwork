package gather;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


public class PracticeAnno extends Totry {
	public String url ="https://www.facebook.com/";
	public String fn ="//input[@id='u_0_m']";
	public String fval="Bella";
	public String ln ="//input[@id='u_0_o']";
	public String lst = "Hossain";
	
	
@BeforeSuite
  public void db () {
	

	}
@BeforeMethod
  public void openBrowers() {
	System.setProperty("webdriver.chrome.driver", "C:/Users/TalentTEK/Documents/GitHub/SFW2020/drivers/chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
	driver.get(url);
	System.out.println (" chrome driver open ++++++++++++++++ ");

}
   @Test
   public void SingUp () {
	   System.out.println("singup page testing......");
		driver.findElement(By.xpath(fn)).sendKeys(fval);
		driver.findElement(By.xpath(ln)).sendKeys( lst);

  System.out.println("This is test singUP++++++++++++++++++++");	
  }

@Test
 public void LongIn() {
	System.out.println("This is test case is LongIn++++++++++++++++++");
  }
@AfterMethod
 public void browerClose() {
	driver.close();
	System.out.println("This is close method+++++++++++++");
	
}
@AfterSuite
 public void tearDown() {
	driver.quit();
	System.out.println("This is tearDown test case+++++++++++++");

}

}
