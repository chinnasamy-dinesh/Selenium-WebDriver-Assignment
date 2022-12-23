package Week_2.Day_1.Class_Room;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel {

	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriverManager.operadriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		WebElement findEle = driver.findElement(By.className("decorativeSubmit"));
		findEle.click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Test First Name");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Test Last Name");
		Thread.sleep(1000);
		WebElement fEle = driver.findElement(By.name("submitButton"));
		fEle.click();
		Thread.sleep(2000);	
		driver.close();

		

	}

}
