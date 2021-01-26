package Test.vk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class sample {

WebDriver driver;
	
	@Test
	public void launch() throws InterruptedException {
//	System.setProperty("webdriver.chrome.driver","E:\\chromedriver_win32 (5)\\chromedriver.exe");  
//	 WebDriver driver =new ChromeDriver(); 
	 
	 System.setProperty("webdriver.gecko.driver", "E:\\Gecko\\chromedriver_win32\\FF\\geckodriver.exe");
	    driver = new FirefoxDriver();
//	 System.setProperty("webdriver.ie.driver","E:\\IEDriverServer_x64_2.48.0\\IEDriverServer.exe");
//	 WebDriver driver = new InternetExplorerDriver();
	 driver.manage().window().maximize();
	 driver.get(" https://classic.crmpro.com");
	Thread.sleep(5000);
	
		driver.findElement(By.name("username")).sendKeys("batchautomation");
	    driver.findElement(By.name("password")).sendKeys("Test@12345");
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div/input")).click();
	}


}
