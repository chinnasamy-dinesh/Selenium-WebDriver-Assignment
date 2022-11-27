package Week_4.Day_1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Frame

{

	public static void main(String[] args) 
	
	{
	
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.switchTo().frame("frame1");
		driver.findElement(By.xpath("//b[@id='topic']/following-sibling::input")).sendKeys("Testleaf");
		
		driver.switchTo().frame("frame3");
		WebElement cBox = driver.findElement(By.xpath("//input[@type='checkbox']"));
		cBox.click();
		if (cBox.isSelected())
		{
			System.out.println("Checkbox is Selected");
		}
		else
		{
			System.out.println("Checkbox is not Selected");
		}
		
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frame2");
		
		Select dd = new Select (driver.findElement(By.xpath("//select[@class='col-lg-3']")));
		dd.selectByIndex(2);
				

	}

}
