package chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googlesearch {
	
		public static void chrome1() throws InterruptedException { // error handling for Thread.sleep()
			System.setProperty("webdriver.chrome.driver", "C:\\JUNO\\SELENIUM\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			driver.get("http://www.google.com");
			driver.manage().window().maximize();
			WebElement searchBox = driver.findElement(By.name("q"));
			searchBox.sendKeys("hello");
			Thread.sleep(2000); // wait 2 seconds
			searchBox.submit();
			Thread.sleep(2000);
			
			driver.close();
		}
	
		public static void main(String[] args) throws InterruptedException { // error handling for Thread.sleep()
			
			chrome1();
		}

}
