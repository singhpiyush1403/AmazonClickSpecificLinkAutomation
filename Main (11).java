
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://Google.com");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		for(int i=0; i<links.size(); i++) {
			if(links.get(i).getText().equals("Today Deals")) {
			}
		links.get(i).click();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		driver.close();
		
	}
	}
}
