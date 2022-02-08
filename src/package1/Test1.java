package package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// DesiredCapabilities -->Class
		
		DesiredCapabilities cap = DesiredCapabilities.chrome();
		cap.acceptInsecureCerts();
		cap.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);

		// ChromeOptions --> Class
		ChromeOptions options = new ChromeOptions();
		options.merge(cap);

		System.setProperty("webdriver.chrome.driver", "./Drivers//chromedriver.exe");

		WebDriver driver = new ChromeDriver(options);

		driver.manage().window().maximize();
		driver.get("https://expired.badssl.com/");
		Thread.sleep(2000);
		System.out.println("user2 has updated this code");
		System.out.println("user3 has updated this code in GitHub");
		System.out.println("user2 has updated this code second time");
		

		driver.quit();

	}

}
