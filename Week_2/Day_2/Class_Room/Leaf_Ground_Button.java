package Week_2.Day_2.Class_Room;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Leaf_Ground_Button 

{

	public static void main(String[] args) 

	{
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://leafground.com/button.xhtml");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//span[text()='Click']")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//span[text()='Submit']")).click();
		WebElement chkbox = driver.findElement(By.id(""));
		boolean chkEnabled = chkbox.isEnabled();
		System.out.println(chkEnabled);

	}

}
