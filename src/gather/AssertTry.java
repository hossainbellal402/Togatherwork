package gather;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertTry {

	
	@Test
	public void assertionPrec (){
		// exp - requirement or mock-up/design
		// act - build by dev
		String exp = "SignUp";
		String act = driver.findElement(By.xpath("//*[@id='content']/div/div/div/div[2]/div[1]/h2")).getText();
		System.out.println ("my actual text is: " + act);
		Assert.assertEquals(act, exp); // assert or hard assert
	}
	
	// soft assert
	



	}


