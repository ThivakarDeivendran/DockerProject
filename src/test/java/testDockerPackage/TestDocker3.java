package testDockerPackage;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class TestDocker3 {
	
	
	@Test
	public void testMethod3() throws Exception{
		
//		DesiredCapabilities capabilities = DesiredCapabilities.edge();
		
//		InternetExplorerOptions dc = new InternetExplorerOptions();
		
		EdgeOptions dc = new EdgeOptions();
		
		URL url = new URL("http://localhost:4444/wd/hub");
		WebDriver rw = new RemoteWebDriver(url, dc);
		
		rw.get("https://www.amazon.in/");
		Thread.sleep(5000);
		System.out.println("System application title in Edge :  "+rw.getTitle());
	}

}
