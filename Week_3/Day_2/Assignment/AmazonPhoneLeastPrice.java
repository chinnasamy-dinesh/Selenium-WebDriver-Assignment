package Week_3.Day_2.Assignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonPhoneLeastPrice {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Phones", Keys.ENTER);
		
		List<WebElement> allMblEles = driver.findElements(By.className("a-price-whole"));
		
		List<Integer> priceList = new ArrayList<Integer>();
		
		for (int i = 0; i < allMblEles.size()-1; i++) 
		{
		WebElement price = allMblEles.get(i);
		String text = price.getText().replace(",", "");
		int mprice = Integer.parseInt(text);
		priceList.add(mprice);
		}
		
		Collections.sort(priceList);
		System.out.println("Cheapest Mobile Price: "+priceList.get(0));
			 
	}
}