package testDockerPackage;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class TestDocker {
	
	@Test
	public void testMethod() throws MalformedURLException, InterruptedException{
		
//		DesiredCapabilities dc = DesiredCapabilities.chrome();
		
		ChromeOptions dc = new ChromeOptions();
		
		URL url = new URL("http://localhost:4444/wd/hub");
		
		WebDriver rw = new RemoteWebDriver(url, dc);
		
		rw.get("https://www.saucedemo.com/");
		Thread.sleep(5000);
		System.out.println("System application title in chrome:  "+rw.getTitle());
		
	}

}
