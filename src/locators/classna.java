package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class classna {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/GSK-PC/Desktop/dummy.html");
		Thread.sleep(2000);
		//driver.findElement(By.className("c3")).click();
		//driver.findElement(By.id("a2")).click();
		driver.findElement(By.linkText("Flipkart")).click();
		Thread.sleep(2000);
		driver.close();

	}

}
