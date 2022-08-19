package keywords;

import java.sql.Time;
import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.InvalidElementStateException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import keywords.UIKeywords;

public class Waitfor {
	private static FluentWait<WebDriver> wait = null;
	{
		wait = new FluentWait<WebDriver>(UIKeywords.driver);
		wait.withTimeout(Duration.ofSeconds(30));
		wait.pollingEvery(Duration.ofMillis(500));
		wait.withMessage("wait is finish and element is not loded or available");
	}

	public static void elementToBePresent(By locator) {
		wait.ignoring(NoSuchElementException.class, ElementClickInterceptedException.class);
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}

	public static void elementToBePresent(String locatorType, String locatorValue) {
		wait.ignoring(NoSuchElementException.class, ElementClickInterceptedException.class);
	}

	public static void elementToBelickabale(WebElement element) {
		wait.ignoring(NoSuchElementException.class,ElementClickInterceptedException.class);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	public static void time(int durationInSecond) {
		long startTime = System.currentTimeMillis();
		long endTime = startTime + (durationInSecond * 1000);
		while (startTime <= endTime) {
			startTime = System.currentTimeMillis();

		}
	}

	public static void elementToBePresent(String string) {
		// TODO Auto-generated method stub

	}

	public static void elementToBePresent(WebElement element) {
		// wait.ignoring(NullPointerException.class);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

}
