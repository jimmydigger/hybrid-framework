package FirstGuruTest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;

public class GurutestingTitle {

	

	public static void main(String[] args) throws Exception{

		System.setProperty("webdriver.gecko.driver", "C:\\Drivers\\geckodriver-v0.18.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.live.guru99.com");
	
		String mainpage = driver.getTitle();

		if (mainpage.equalsIgnoreCase("Home Page")) {

			System.out.println("'THIS IS DEMO SITE' shown in home page ");

		} else {
			System.out.println("Wrong page");
		}
		WebElement mobile = driver.findElement(By.xpath("//div[@id='header-nav']//a[text()='Mobile']"));
		mobile.click();
		String mobilepage = driver.getTitle();

		if (mobilepage.equalsIgnoreCase("Mobile")) {

			System.out.println("Title 'Mobile'is shown on mobile list page ");

		} else {
			System.out.println("Wrong page");
		}

		WebElement drop = driver.findElement(By.xpath("//div[@class='sort-by']/select[@title='Sort By']"));
		
		String dropname = "Name";

		Select name = new Select(drop);

		name.selectByVisibleText("Name");		
		
		WebElement drop1 = driver.findElement(By.xpath("//div[@class='sort-by']/select[@title='Sort By']"));
		
		String dropname1=drop1.getAttribute("Name");
				
		if (dropname1 == dropname) {
			System.out.println("Sorted by other selection.");
		}else {
			System.out.println("All 3 products sorted by name.");
		}

		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("./Screenshots2/Guru.png"));

		driver.quit();

	}

	
	}

	
	


