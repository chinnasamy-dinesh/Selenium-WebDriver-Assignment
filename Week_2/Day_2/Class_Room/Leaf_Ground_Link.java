package Week_2.Day_2.Class_Room;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class Leaf_Ground_Link 

{

	public static void main(String[] args) 
	
	{
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://leafground.com/link.xhtml");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Go to Dashboard")).click();
		driver.findElement(By.linkText("Find the URL without clicking me.")).click();
		driver.findElement(By.linkText("Find the URL without clicking me.")).click();
		driver.findElement(By.linkText("Broken?")).click();
		driver.findElement(By.linkText("Go to Dashboard")).click();
		driver.findElement(By.linkText("How many links in this page?")).click();
		driver.findElement(By.linkText("How many links in this layout?")).click();


	}

}
