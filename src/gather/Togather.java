package gather;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Togather extends Totry {
	
public String url ="https://www.facebook.com/";
public String fn ="//input[@id='u_0_m']";
public String fval="Billa";
public String ln ="//input[@id='u_0_o']";
public String lst = "Hossain";

//  public String ea ="";
//  public String pw ="";
//  public String month = "";
//  public String day = "";
//  public String year = "";
//  public String gender = "";
//  public String singup = 

@BeforeTest
	
	public void OpenBrowers() throws InterruptedException {
		
System.setProperty( "webdriver.chrome.driver", "C:\\Users\\bella\\eclipse-workspace\\Togatherwork\\Drivers\\chromedriver.exe");
  Thread.sleep(3000);
// System.setProperty("webdriver.opera.driver", "C:\Users\bella\eclipse-workspace\Togatherwork\Drivers\operadriver.exe");
 //System.setProperty("webdriver.gecko.driver", "C:\\Users\\bella\\eclipse-workspace\\Togatherwork\\Drivers\\operadriver.exe");

   driver = new ChromeDriver();
  //  driver = new OperaDriver();
   // driver = new FirefoxDriver();
    		
	driver.get( url);	
	driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait( 45, TimeUnit.SECONDS);
		 
		 System.out.println("Chrome driver open");
		}
@Test
public void singUp() {
	System.out.println("singup page testing......");
	driver.findElement(By.xpath(fn)).sendKeys(fval);
	driver.findElement(By.xpath(ln)).sendKeys( lst);
}
@AfterMethod
public void closeBrowers() {
	System.out.println("This is the close Browers testing==========");
	driver.close();
	System.out.println("This is the Browers close+++++++++++");
	}
@AfterSuite
public void TearDown(){
	driver.quit();
	System.out.println("Termanated ...........");

	
	

	
}

}
