package FirstGuruTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ExampleGuru {

	public static void main(String[] args) {
	    System.setProperty("webdriver.gecko.driver", "C:\\Drivers\\geckodriver-v0.18.0-win64\\geckodriver.exe");
				WebDriver driver = new FirefoxDriver();
				driver.get("http://www.live.guru99.com");  
			 
			    
			    // 2. Click on Mobile menu
			    driver.findElement(By.linkText("MOBILE")).click();	
			  
			    // 3. In the list of all mobile , read the cost of Sony Xperia mobile (which is $100) 	    	      
			    String XPeriaPrice = driver.findElement(By.cssSelector("#product-price-1 > span.price")).getText();
			   
			    // 4. Click on Sony Xperia mobile 	   
			    driver.findElement(By.id("product-collection-image-1")).click();
			    
			    // 5. Read the XPeria mobile price from details page
			    String detailPrice = driver.findElement(By.cssSelector("span.price")).getText();
			    	    
			    //  Product price in list and details page should be equal ($100)
			   /* try {
			        assertEquals(XPeriaPrice, detailPrice); 
			      } catch (Exception e) {
			    	  e.printStackTrace();
			      }*/
	}

}
