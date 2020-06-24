package gather;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Togather extends Totry {
	
public String url ="https://www.Facebook.com/";
public String fn ="//*[@id=\"u_0_m\"]";
public String fval="Billa";
public String ln ="";
public String ea ="";
public String pw ="";
public String month = "";
public String day = "";
public String year = "";
public String gender = "";
public String singup = "";
	

@BeforeTest
	
	public void OpenBrowers() {
		
System.setProperty( "webdriver.chrome.driver", "C:\\Users\\bella\\eclipse-workspace\\Togatherwork\\Drivers\\chromedriver.exe");	
    driver = new ChromeDriver();
	driver.get( "url");	
	driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait( 45, TimeUnit.SECONDS);
		 driver.close(); 
		 System.out.println("Chrome driver open");
		

	}
public void singupPage() {
	System.out.println("singup page testing......");
	driver.findElement(By.xpath(fn)).sendKeys(fval);
}


}
