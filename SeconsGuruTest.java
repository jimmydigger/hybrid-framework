package FirstGuruTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeconsGuruTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "C:\\Drivers\\geckodriver-v0.18.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.live.guru99.com");
		WebElement mobile = driver.findElement(By.xpath("//div[@id='header-nav']//a[text()='Mobile']"));
		mobile.click();
		
		WebElement price1 = driver.findElement(By.xpath("//span[@id='product-price-1']/span"));
		String xperiaprice = price1.getText();
		WebElement image = driver.findElement(By.xpath("//img[@id='product-collection-image-1']"));
		image.click();
		
		WebElement price2 = driver.findElement(By.xpath("//span[@id='product-price-1']/span[text()='$100.00']"));
		String detailprice = price2.getText();
		
		if (xperiaprice == detailprice ) {
			System.out.println("Product value in list and details page are equal" );
		}else
			System.out.println("Product value in list and details page are different." );
		
		System.out.println(xperiaprice);
		
		driver.quit();

	}

}
