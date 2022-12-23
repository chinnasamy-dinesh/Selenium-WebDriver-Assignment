package Marathon_2;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.sukgu.Shadow;

public class ServiceNow 

{

	public static void main(String[] args) throws InterruptedException 
	
	{
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--incognito");
		op.addArguments("--disable-notifications");
		
		ChromeDriver driver = new ChromeDriver(op);
		Shadow dom = new Shadow (driver);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//	1. Launch ServiceNow application
		driver.get("https://dev138589.service-now.com/");
				
		//	2. Login with valid credentials username as admin and password as 
		driver.findElement(By.xpath("//input[@id='user_name']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("mc/-vASs9V1E");
		driver.findElement(By.xpath("//button[@id='sysverb_login']")).click();
		
		Thread.sleep(5000);
		//	3. Click-All Enter Service catalog in filter navigator and press enter or Click the ServiceCatalog
		dom.findElementByXPath("//div[text()='All']").click();
		Thread.sleep(2000);
		dom.findElementByXPath("//span[text()='Service Catalog']").click();
		
		//	4. Click on mobiles
		WebElement frameDom = dom.findElementByXPath("//iframe[@id='gsft_main']");
		driver.switchTo().frame(frameDom);
		driver.findElement(By.xpath("//h2[contains(text(),'Mobiles')]")).click();
		
		//	5. Select Apple iphone6s
		driver.findElement(By.xpath("//strong[text()='iPhone 6s']")).click();
		
		//	6. Update color field to rose gold and storage field to 128GB
		Select ddColor = new Select(driver.findElement(By.xpath("//select[@name='IO:8350086e4f334200086eeed18110c7cd']")));
		ddColor.selectByValue("gold");
		
		Select ddStorage = new Select(driver.findElement(By.xpath("//select[@name='IO:32e0886e4f334200086eeed18110c738']")));
		ddStorage.selectByVisibleText("128");
		
		//	7. Select  Order now option
		driver.findElement(By.id("oi_order_now_button")).click();
		
		//	8. Verify order is placed and copy the request number"
		WebElement verifyingOrder =  driver.findElement(By.xpath("//div[@class='order_summary']//span[@aria-live='assertive']"));
		WebElement requestNumber =  driver.findElement(By.xpath("//a[@id='requesturl']//b"));
		System.out.println("\n Order Status: "+verifyingOrder.getText());
		System.out.println("\n Request Number: "+requestNumber.getText());
		
	}

}
