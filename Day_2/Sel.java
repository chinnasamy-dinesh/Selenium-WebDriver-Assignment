package week_1.Day_2;


import org.openqa.selenium.opera.OperaDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		OperaDriver driver=new OperaDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");


	}

}
