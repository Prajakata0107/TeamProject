package testcases;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {
	WebDriver driver;
	
	public void time(int durationInSecond) {
		long startTime = System.currentTimeMillis();
		long endTime = startTime + (durationInSecond * 1000);
		while (startTime <= endTime) {
			startTime = System.currentTimeMillis();

		}
	}
	
	@Test
	public void m1() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.myntra.com/men-sweatshirts");
		String parent=driver.getWindowHandle();
		driver.findElement(By.xpath("//img[@title=\"H&M Men Black Relaxed Fit Hoodie\"]")).click();
		
		time(10);
		
		Set<String> ele=driver.getWindowHandles();
		
		for(String s:ele)
		{
			if(!parent.equals(s)) {
				driver.switchTo().window(s);
				System.out.println("switch to window");			}
		}
		
		time(10);
		driver.findElement(By.xpath("//button[@class=\"size-buttons-size-button-selected size-buttons-size-button size-buttons-size-button-default\"]")).click();
//		Alert alert=driver.switchTo().alert();
//		alert.dismiss();
	}
}
