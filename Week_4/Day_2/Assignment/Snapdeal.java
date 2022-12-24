package Week_4.Day_2.Assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Snapdeal {

	public static void main(String[] args) throws InterruptedException, IOException 
	
	{
	
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--incognito");
		op.addArguments("--disable-notifications");
		
		ChromeDriver driver = new ChromeDriver(op);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Actions builder = new Actions(driver);
		
		//1. Go to https://www.nykaa.com/
		driver.get("https://www.snapdeal.com/");
		
		// 2. Go to Mens Fashion
		WebElement men = driver.findElement(By.linkText("Men's Fashion"));
		builder.moveToElement(men).perform();
		
		// 3. Go to Sports Shoes
		driver.findElement(By.linkText("Sports Shoes")).click();
				
		// 4. Get the count of the sports shoes
		System.out.println("\nCount of the sports shoes: "+driver.findElement(By.xpath("//div[contains(text(),'Sports Footwear')]/following-sibling::div")).getText());
		
		// 5. Click Training shoes
		driver.findElement(By.xpath("//div[text()='Training Shoes']")).click();
		
		// 6. Sort by Low to High
		driver.findElement(By.className("sort-selected")).click();
		driver.findElement(By.xpath("//ul[@class='sort-value']/li[@data-sorttype='plth']")).click();
		
		// 7. Check if the items displayed are sorted correctly
		WebElement sort = driver.findElement(By.xpath("//div[@class='sort-selected']"));
		System.out.println("\nItems displayed are sorted by: "+sort.getText());
		
		// 8.Select the price range (510-911)
		WebElement slide1 = driver.findElement(By.xpath("(//div[@data-name='Price']//a)[1]"));
		WebElement slide2 = driver.findElement(By.xpath("(//div[@data-name='Price']//a)[2]"));
		builder.dragAndDropBy(slide1, 5, 0).perform();
		Thread.sleep(1500);
		builder.dragAndDropBy(slide2, -72, 0).perform();
			
		// 9.Filter with color Navy
		Thread.sleep(1500);
		WebElement color = driver.findElement(By.xpath("//label[@for='Color_s-Navy']"));
		color.click();
		
		// 10 verify the all applied filters 
		String verify = driver.findElement(By.xpath("//span[@class='from-price-text']")).getText();
		
			if(verify.contains("510"))
			{
				System.out.println("\nFrom Price: "+verify);
			}
			else
			{
				System.out.println("\nFrom Price is not filetered");
			}
			
		verify = driver.findElement(By.xpath("//span[@class='to-price-text']")).getText();
		
			if(verify.contains("911"))
			{
				System.out.println("To Price: "+verify);
			}
			else
			{
				System.out.println("To Price is not filetered");
			}		
			
		boolean check = color.isEnabled();
				
			if(check)
			{
				System.out.println("Filtered Color: Navy");
			}
			else
			{
				System.out.println("Color is not filetered");
			}	
		
		// 11. Mouse Hover on first resulting Training shoes
			
		WebElement firstResult = driver.findElement(By.xpath("(//picture[@class='picture-elem'])[1]"));
		builder.moveToElement(firstResult).perform();
		
		Thread.sleep(2000);
		// 12. click QuickView button
		driver.findElement(By.xpath("//div[contains(text(),'Quick View')]")).click();
		
		// 13. Print the cost and the discount percentage
		String price = driver.findElement(By.xpath("//span[@class='payBlkBig']")).getText();
		String discount = driver.findElement(By.xpath("//span[@class='percent-desc ']")).getText();
		System.out.println("\nCost of the Shoe: "+price+"\nPercentage of Discount Applied: "+discount);
		
		// 14. Take the snapshot of the shoes.
		
		WebElement snapShot = driver.findElement(By.xpath("//div[@class='col-xs-11 quickViewModal ']"));
		File source = snapShot.getScreenshotAs(OutputType.FILE);
		File dest = new File("./snaps/snapdeal.png");
		FileUtils.copyFile(source, dest);
				
		// 15. Close the current window
		driver.findElement(By.xpath("//div[@class='close close1 marR10']")).click();
				
		// 16. Close the main window
		driver.close();
		
	}

}
