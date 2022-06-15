package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chromebrowser {
	public void openBrowser() throws InterruptedException {
		
	

	}
	public static void main(String[] args) throws InterruptedException {
		System.setProperty(
	            "webdriver.chrome.driver",
	            "C:\\Users\\Dell\\Documents\\chorme driver\\chromedriver_win32\\chromedriver.exe");
	        // Instantiate a ChromeDriver class.
	        WebDriver driver = new ChromeDriver();
	       
	        Thread.sleep(5000);
	        
	        driver.get("https://www.naukri.com");
	        driver.manage().window().minimize();
	        Thread.sleep(5000);
	        
	        String u = driver.getCurrentUrl();
	        System.out.println(u);
	        driver.findElement(By.xpath("(//div[@class='mTxt'])[5]")).click();
	        Thread.sleep(5000);
	        driver.findElement(By.xpath("//*[contains(text(),'Please enter your Email ID / Username')]/parent::div/input")).sendKeys("test");
	        Thread.sleep(5000);
	}
	
	
}
