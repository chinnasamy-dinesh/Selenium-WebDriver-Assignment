package Marathon_2;


import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class RedBus 

{

	public static void main(String[] args) throws IOException, InterruptedException 
	
	{
	
		//ChromeOptions op=new ChromeOptions();
		FirefoxOptions op=new FirefoxOptions();
		op.addArguments("--incognito");
		op.addArguments("--disable-notifications");
		
		//	ChromeDriver driver = new ChromeDriver(op);
		FirefoxDriver driver = new FirefoxDriver (op);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		
	//	02) Load https://www.redbus.in/
		driver.get("https://www.redbus.in/");
		
	//	03) Type ""Chennai"" in the FROM text box and select the first option
		driver.findElement(By.xpath("//input[@tabindex='1']")).sendKeys("Chennai");
		driver.findElement(By.xpath("//li[text()='Chennai']")).click();
		
	//	04) Type ""Bangalore"" in the To text box and select the first option
		driver.findElement(By.xpath("//input[@tabindex='2']")).sendKeys("Bangalore");
		driver.findElement(By.xpath("//li[text()='Bangalore']")).click();
		
	//	05) Select tomorrow's date in the Date field
		driver.findElement(By.xpath("//input[@tabindex='3']")).click();
		driver.findElement(By.xpath("//td[@class='next']")).click();
		driver.findElement(By.xpath("//td[text()='1']")).click();
			
	//	06) Click Search Buses
		driver.findElement(By.xpath("//button[text()='Search Buses']")).click();
		
	//	07) Print the number of buses shown as results
		Thread.sleep(3000);
		String noBuses = driver.findElement(By.xpath("//span[@class='f-bold busFound']")).getText();
		System.out.println("\n\nNo of Buses found: "+noBuses);
				
	//	08) Choose SLEEPER in the left menu 
		driver.findElement(By.xpath("//label[@for='bt_SLEEPER']")).click();
		
	//	09) Print the name of the second resulting bus 
		noBuses = driver.findElement(By.xpath("(//div[@class='travels lh-24 f-bold d-color'])[2]")).getText();
		System.out.println("\nName of Second Resulting Buses found: "+noBuses);
		
	//	10) Click the VIEW SEATS of that bus
		driver.findElement(By.xpath("(//div[text()='View Seats'])[2]")).click();
		
	//	11) Take screenshot and close browser
		
		WebElement ele = driver.findElement(By.xpath("//li[@class='row-sec clearfix fix active scrollActive']"));
		File src = ele.getScreenshotAs(OutputType.FILE);
		File dst = new File ("./snaps/RedBus-ViewSeat.png");
		FileUtils.copyFile(src,dst);
	
	}

}
