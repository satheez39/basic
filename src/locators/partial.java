package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class partial {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/GSK-PC/Desktop/dummy.html");
		Thread.sleep(2000);
		
		driver.findElement(By.partialLinkText("Fli")).click();
		Thread.sleep(2000);
		driver.close();

	}

}