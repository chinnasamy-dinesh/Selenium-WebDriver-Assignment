package Week_4.Day_2.Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestLeaf_Actions 
{

	public static void main(String[] args) throws InterruptedException
	
	{
		ChromeDriver driver = new ChromeDriver ();
		driver.get("https://leafground.com/drag.xhtml;jsessionid=node01qey7o6oowt9dc09s8l9hc4bu437441.node0");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Actions builder = new Actions (driver);
		
		// 1. Draggable
		WebElement ele = driver.findElement(By.id("form:conpnl"));
		builder.dragAndDropBy(ele, 300,0).perform();
		
		// 2. Droppable
		WebElement trgt = driver.findElement(By.id("form:drop_content"));
		WebElement src = driver.findElement(By.id("form:drag"));
		builder.dragAndDrop(src, trgt).perform();
		
		// 3. Draggable Columns
		src = driver.findElement(By.id("form:j_idt94:j_idt99"));
		trgt = driver.findElement(By.id("form:j_idt94:j_idt95"));
		builder.dragAndDrop(src, trgt).perform();
		
		// 4. Draggable Rows
		trgt = driver.findElement(By.xpath("//tbody[@id='form:j_idt111_data']/tr[1]"));
		src = driver.findElement(By.xpath("//tbody[@id='form:j_idt111_data']/tr[9]"));
		builder.dragAndDrop(src, trgt).perform();
		
		// 5. Resize Image
		src = driver.findElement(By.id("form:logo"));
		builder.dragAndDropBy(ele, 50,50).perform();
		
		// 6. Progress Bar
		WebElement progress = driver.findElement(By.xpath("//span[text()='Start']"));
		progress.click();

		WebElement progresBar = driver.findElement(By.xpath("//div[@class='ui-progressbar-label']"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.textToBePresentInElement(progresBar, "100"));
		System.out.println("Progress Bar Percentage: "+progresBar.getText());
				
		// 7. Range Slider
		WebElement slide1 = driver.findElement(By.xpath("(//span[@tabindex='0'])[1]"));
		builder.dragAndDropBy(slide1, -80,0).perform(); 
		
		WebElement slide2 = driver.findElement(By.xpath("(//span[@tabindex='0'])[2]"));
		builder.dragAndDropBy(slide2, 40,0).perform();
	
		String range1 = slide1.getAttribute("style").replace("left: ", "").replace(";", "");
		String range2 = slide2.getAttribute("style").replace("left: ", "").replace(";", "");
		System.out.println("Range Slider is between: "+range1+" and "+range2);
	
		
		
	}

}
