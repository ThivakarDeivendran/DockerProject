package testDockerPackage;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Docker_SetUp {
	
	@BeforeTest
	public void startDocker() throws IOException, InterruptedException {
		Runtime.getRuntime().exec("cmd /c start startFile.bat");
		Thread.sleep(10000);		
	}
	
	@AfterTest
   public void stopDocker() throws IOException, InterruptedException {
		Runtime.getRuntime().exec("cmd /c start stopFile.bat");
		Thread.sleep(6000);	
		Runtime.getRuntime().exec("taskkill /f /im cmd.exe");	
	}
}
