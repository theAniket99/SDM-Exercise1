package labexam.exercise1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App 
{
	WebDriver drive;
	
	@SuppressWarnings("deprecation")
	public void runBrowser() {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		drive = new ChromeDriver();
		
		drive.manage().window().maximize();
		drive.manage().deleteAllCookies();
		
		drive.manage().timeouts().pageLoadTimeout(80, TimeUnit.SECONDS);
		drive.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);

		drive.get("http://www.flipkart.com");
	}
	
	public void loginToFlipkart() {
		drive.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("shindeAniket@abc.com");
		
		drive.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']")).sendKeys("Aniket@1234");
		
		drive.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
		
		//sir it's working on xpath but login will fail here cause of wrong password & username
	}
	
    public static void main( String[] args )
    {
    	App obj = new App();
    	
    	obj.runBrowser();
    	obj.loginToFlipkart();
    }
}
