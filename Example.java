package week7;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * 
 */
public class Example {
public static void main(String [] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\cmr\\Desktop\\22r01a6710\\chromedriver.exe");
	WebDriver d=new ChromeDriver();
d.get("https://www.youtube.com");
Thread.sleep(1000);
WebElement searchBar=d.findElement(By.name("search_query"));
searchBar.sendKeys("array object in js");
searchBar.sendKeys(Keys.ENTER);
Thread.sleep(2000);
//d.quit();

}
}
