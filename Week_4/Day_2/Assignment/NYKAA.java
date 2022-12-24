package Week_4.Day_2.Assignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class NYKAA 

{

	public static void main(String[] args) throws InterruptedException 
	
	{
		
		ChromeOptions op=new ChromeOptions();
		//op.addArguments("--incognito");
		//op.addArguments("--disable-notifications");
		
		ChromeDriver driver = new ChromeDriver(op);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Actions builder = new Actions(driver);
		
		//	1) Go to https://www.nykaa.com/
		driver.get("https://www.nykaa.com/");
		
		Thread.sleep(2000);
		
		//	2) Mouseover on Brands and Search L'Oreal Paris
		WebElement action = driver.findElement(By.xpath("//a[text()='brands']"));
		builder.click().perform();
		builder.moveToElement(action).perform();
		driver.findElement(By.id("brandSearchBox")).sendKeys("L'Oreal Paris",Keys.ENTER);
		
		Thread.sleep(1000);
		//	3) Click L'Oreal Paris
		WebElement topBrand = driver.findElement(By.xpath("//div[@id='list_topbrands']/following-sibling::div/a"));
		topBrand.click();
				
		//	4) Check the title contains L'Oreal Paris(Hint-GetTitle)
		System.out.println("\nTitle of the Page: "+driver.getTitle());
		
		driver.findElement(By.className("sort-name")).click();
		driver.findElement(By.xpath("//span[text()='customer top rated']")).click();
		
		//	6) Click Category and click Hair->Click haircare->Shampoo
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Category']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Hair']")).click();
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//span[text()='Hair Care']")).click();
		//Thread.sleep(2000);
		WebElement shampoo = driver.findElement(By.xpath("//label[@for='checkbox_Shampoo_316']"));
		builder.click(shampoo).perform();
		//shampoo.click();
				
		//	7) Click->Concern->Color Protection
		driver.findElement(By.xpath("//span[text()='Concern']")).click();
		driver.findElement(By.xpath("//span[text()='Color Protection']")).click();
		
		//	8)check whether the Filter is applied with Shampoo
		String filter = driver.findElement(By.xpath("//div[@id='filters-listing']//span[text()='Shampoo']")).getText();
				
		if (filter.equals("Shampoo"))
		{
			System.out.println("\nFilter is applied with Shampoo");
		}
		else
		{
			System.out.println("\nFilter is not applied with Shampoo");
		}
		
		Thread.sleep(3000);
		//	9) Click on L'Oreal Paris Colour Protect Shampoo
		driver.findElement(By.xpath("//div[@id='product-list-wrap']//a")).click();
		
		//	10) GO to the new window and select size as 175ml
		Set<String> ss = driver.getWindowHandles();
		List<String> ls = new ArrayList<String> (ss);
		
		driver.switchTo().window(ls.get(1));
		//select[@title='SIZE']
		Select dd = new Select (driver.findElement(By.xpath("//select[@title='SIZE']")));
		dd.selectByVisibleText("175ml");

		
		//	11) Print the MRP of the product
		WebElement mrp = driver.findElement(By.xpath("//div[@class='css-f5j3vf']//span[2]"));
		System.out.println("\nMRP of the product "+driver.getTitle()+": "+mrp.getText());
		
		//	12) Click on ADD to BAG
		driver.findElement(By.xpath("//div[@class='css-vp18r8']//span[text()='Add to Bag']")).click();
		
		//	13) Go to Shopping Bag 
		driver.findElement(By.xpath("//div[@class='css-0 e1ewpqpu1']//button")).click();
		
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		//	14) Print the Grand Total amount
		WebElement gt = driver.findElement(By.xpath("//span[@class='css-n8gwxi e171rb9k3']"));
		System.out.println("\nGrand Total amount: "+gt.getText());
		
		//	15) Click Proceed
		driver.findElement(By.xpath("(//button[@class='css-guysem e8tshxd0'])[2]")).click();
		
		//	16) Click on Continue as Guest
				
		//	17) Check if this grand total is the same in step 14
		
		//	18) Close all windows
		driver.quit();

	}

}
