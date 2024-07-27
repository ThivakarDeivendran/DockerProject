package testDockerPackage;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class TestDocker2 {
	
	@Test
	public void testMethod2() throws Exception{
		
//		 DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		
		FirefoxOptions dc = new FirefoxOptions();
		
		URL url = new URL("http://localhost:4444/wd/hub");
		WebDriver rw = new RemoteWebDriver(url, dc);
		
		rw.get("https://demoqa.com/");
		Thread.sleep(5000);
		System.out.println("System application title in Firefox :  "+rw.getTitle());
	}
	

}
