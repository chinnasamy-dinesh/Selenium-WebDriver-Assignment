package Week_3.Day_2.Assignment;

import java.time.Duration;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AjioPrintBagList 
{
	public static void main(String[] args) throws InterruptedException 
	
	{
	
	ChromeOptions op = new ChromeOptions();
	op.addArguments("--incognito");
	op.addArguments("--disable-notifications");
	
	ChromeDriver driver = new ChromeDriver(op);
	
	//Maximise Window
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	// URL
	driver.get("https://www.ajio.com/");
	
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@name='searchVal']")).sendKeys("bags",Keys.ENTER);
	
	driver.findElement(By.xpath("//input[@id='Men']/following::label[@for='Men']")).click();
	
	Thread.sleep(3000);
	driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
	
	Thread.sleep(3000);
	WebElement total = driver.findElement(By.xpath("//div[@class='length']"));
	
	System.out.println("Number of Bags: "+total.getText());
	
	List<WebElement> brand = driver.findElements(By.xpath("//div[@class='brand']"));
	
	Set<String> brandList = new LinkedHashSet<String>();

	for (int i = 0; i < brand.size()-1; i++) 
	{
	WebElement brandName = brand.get(i);
	brandList.add(brandName.getText());
	}
	
	System.out.println("List of Brands:\n"+brandList);
	
	List<WebElement> bagName = driver.findElements(By.xpath("//div[@class='nameCls']"));
	
	Set<String> bagList = new LinkedHashSet<String>();

	for (int i = 0; i < bagName.size()-1; i++) 
	{
	WebElement bag = bagName.get(i);
	bagList.add(bag.getText());
	}
	
	System.out.println("List of Bags:\n"+bagList);
	
	
	}
	

}
