package gather;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Totry {
	
	
	WebDriver driver;
	
  
	public  void main(String[] args) {
		
   	
		
	  driver = new ChromeDriver();
		  
		driver.getCurrentUrl();
		
		

	}
	public void dbConnection() throws SQLException{
		String connectionUrl =
				"jdbc:sqlserver://yourserver.database.windows.net:1433;"
						+ "database=AdventureWorks;"
						+ "user=yourusername@yourserver;"
						+ "password=yourpassword;"
						+ "encrypt=true;"
						+ "trustServerCertificate=false;"
						+ "loginTimeout=30;";

		Connection connection = DriverManager.getConnection(connectionUrl);
		System.out.println ("my database is connected now" + connection);
	}
	public void getCurrentTime() {
		SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");  
		Date date = new Date();  
		System.out.println(formatter.format(date)); 
		System.out.println (" my test suite started at this time --> " +formatter.format(date));

	}
}
