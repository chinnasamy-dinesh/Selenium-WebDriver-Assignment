package Week_4.Day_1.Assignment;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Amazon 
{

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--incognito");
		op.addArguments("--disable-notifications");
		
		ChromeDriver driver = new ChromeDriver(op);
		driver.manage().window().maximize();
		
		// 1.Load the URL https://www.amazon.in/
		driver.get("https://www.amazon.in/");
		
		// 2.search as oneplus 9 pro
		driver.findElement(By.name("field-keywords")).sendKeys("oneplus 9 pro",Keys.ENTER);
				
		// 3.Get the price of the first product
		WebElement price = driver.findElement(By.xpath("//span[@class='a-price-whole']"));
		System.out.println("\nFirst Product Price: ₹"+price.getText());
		String fprice = price.getText();
		
		// 4. Print the number of customer ratings for the first displayed product
		WebElement num = driver.findElement(By.xpath("//span[@class='a-size-base s-underline-text']"));
		System.out.println("\nTotal number of custmers rated the First Displayed Product: "+num.getText());
		
		// 5. Click the first text link of the first image
		driver.findElement(By.xpath("//div[@class='a-section aok-relative s-image-fixed-height']")).click();
		
		// 6. Take a screen shot of the product displayed
		Set<String> ss = driver.getWindowHandles();
		List<String> ls = new ArrayList<String> (ss);
		
		driver.switchTo().window(ls.get(1));
		
		File src = driver.getScreenshotAs(OutputType.FILE);
		File dst = new File ("./snaps/Snap-of-product-displayed.png");
		FileUtils.copyFile(src,dst);
		
		// 7. Click 'Add to Cart' button
		driver.findElement(By.id("add-to-cart-button")).click();
				
		// 8. Get the cart subtotal and verify if it is correct.
		
		Thread.sleep(3000);
		
		WebElement cart = driver.findElement(By.id("attach-accessory-cart-subtotal"));
		String sub = cart.getText();
		
		System.out.println("\nCart Subtotal: "+cart.getText());
		
		if((sub.contains(fprice)))
		{
		System.out.println("\nFirst Listed Mobile and Cart Subtotal is matched");		
		}
		else
		{
		System.out.println("\nFirst Listed Mobile and Cart Subtotal is not matched");
		}
		
		// 9.close the browser
		driver.close();
	}

}
