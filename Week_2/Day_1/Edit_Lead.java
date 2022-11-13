package Week_2.Day_1;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Edit_Lead {
	
	public static void chromeBrowser() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Dinesh");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Chinnasamy");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Dinesh");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Selenium Nov 2022");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("QA Test carried out using ChromeDriver");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("cdineshroshan@gmail.com");
		
		WebElement fElement = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select dd = new Select(fElement);
		dd.selectByVisibleText("New York");
		
		driver.findElement(By.name("submitButton")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_description")).clear();
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Cleared Description and Updating Lead");
		
		driver.findElement(By.name("submitButton")).click();
		
		System.out.println("\nTitle of Resulting Page: "+driver.getTitle());
		
		
	}
	public static void edgeBrowser() throws InterruptedException
	{
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Dinesh");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Chinnasamy");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Dinesh");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Selenium Nov 2022");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("QA Test carried out using ChromeDriver");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("cdineshroshan@gmail.com");
		
		WebElement fElement = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select dd = new Select(fElement);
		dd.selectByVisibleText("New York");
		
		driver.findElement(By.name("submitButton")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_description")).clear();
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Cleared Description and Updating Lead");
		
		driver.findElement(By.name("submitButton")).click();
		
		System.out.println("\nTitle of Resulting Page: "+driver.getTitle());
	}
	public static void firefoxBrowser() throws InterruptedException
	{
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Dinesh");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Chinnasamy");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Dinesh");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Selenium Nov 2022");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("QA Test carried out using ChromeDriver");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("cdineshroshan@gmail.com");
		
		WebElement fElement = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select dd = new Select(fElement);
		dd.selectByVisibleText("New York");
		
		driver.findElement(By.name("submitButton")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_description")).clear();
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Cleared Description and Updating Lead");
		
		driver.findElement(By.name("submitButton")).click();
		
		System.out.println("\nTitle of Resulting Page: "+driver.getTitle());
	}
	public static void operaBrowser() throws InterruptedException
	{
		WebDriverManager.operadriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Dinesh");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Chinnasamy");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Dinesh");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Selenium Nov 2022");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("QA Test carried out using ChromeDriver");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("cdineshroshan@gmail.com");
		
		WebElement fElement = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select dd = new Select(fElement);
		dd.selectByVisibleText("New York");
		
		driver.findElement(By.name("submitButton")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_description")).clear();
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Cleared Description and Updating Lead");
		
		driver.findElement(By.name("submitButton")).click();
		
		System.out.println("\nTitle of Resulting Page: "+driver.getTitle());
	}
	public static void safariBrowser() throws InterruptedException
	{
		WebDriverManager.safaridriver().setup();
		SafariDriver driver = new SafariDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Dinesh");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Chinnasamy");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Dinesh");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Selenium Nov 2022");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("QA Test carried out using ChromeDriver");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("cdineshroshan@gmail.com");
		
		WebElement fElement = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select dd = new Select(fElement);
		dd.selectByVisibleText("New York");
		
		driver.findElement(By.name("submitButton")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_description")).clear();
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Cleared Description and Updating Lead");
		
		driver.findElement(By.name("submitButton")).click();
		
		System.out.println("\nTitle of Resulting Page: "+driver.getTitle());
	}
	public static void browserSelection() throws InterruptedException
	
	{
		System.out.println("Option 1:- Chrome Browser");
		System.out.println("Option 2:- Edge Browser");
		System.out.println("Option 3:- Firefox Browser");
		System.out.println("Option 4:- Opera Browser");
		System.out.println("Option 5:- Safari Browser");
		System.out.printf("\nPlease Select Your Browser Option: ");
		num = sc.nextInt();
	
	if (num==1)
	{
		chromeBrowser();
	}
	else if (num==2)
	{
		edgeBrowser();
	}
	else if (num==3)
	{
		firefoxBrowser();	
	}
	else if (num==4)
	{
		operaBrowser();	
	}
	else if(num==5)
	{
		safariBrowser();
	}
}

static Scanner sc = new Scanner(System.in);
static int num;

public static void main(String[] args) throws InterruptedException 

{
	browserSelection();
}

}
