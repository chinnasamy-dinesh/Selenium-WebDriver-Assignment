package Marathon_3;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class Login

{
	public static ChromeDriver driver;
	public String filename;

	@Parameters({ "URL", "UNAME", "PWD" })
	@BeforeMethod(alwaysRun = true)
	public void login(@Optional("https://login.salesforce.com/") String url,
			@Optional("hari.radhakrishnan@qeagle.com") String uName, @Optional("Testleaf$321") String pwd)

	{

		ChromeOptions op = new ChromeOptions();
		op.addArguments("--incognito");
		op.addArguments("--disable-notifications");
		driver = new ChromeDriver(op);

		// Maximise Window
		driver.manage().window().maximize();

		// Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// URL
		driver.get(url);

		// Username
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys(uName);

		// Password
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(pwd);

		// Login
		driver.findElement(By.xpath("//input[@type='submit']")).click();

		// App Launcher
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();

		// select View All
		driver.findElement(By.xpath("//button[text()='View All']")).click();

	}

	@AfterMethod(alwaysRun = true)
	public void closeBrowser()

	{
		// Close the Browser
		driver.close();
	}

	
	  @DataProvider (name="data") 
	  public String[][] data() throws IOException 
	  {
	  
	  @SuppressWarnings("resource") 
	  
	  XSSFWorkbook wb = new XSSFWorkbook("./src/main/resources/Marathon 3/"+filename+".xlsx"); 
	  XSSFSheet ws = wb.getSheetAt(0); 
	  int noRow = ws.getLastRowNum(); 
	  int noCell = ws.getRow(0).getLastCellNum(); 
	  
	  String[][] data = new String[noRow][noCell];
	  for (int i = 1; i <= noRow ; i++) 
	  { 
	  for (int j = 0; j < noCell; j++) 
	  {
	  XSSFRow row = ws.getRow(i); 
	  XSSFCell cell = row.getCell(j); 
	  String value =cell.getStringCellValue();
	  data[i-1][j] = value; 
	  } 
	  }
	  
	  return data; 
	  }
	 

}
