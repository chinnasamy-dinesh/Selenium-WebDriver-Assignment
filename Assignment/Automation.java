package Week_3.Day_1.Assignment;

public class Automation extends MultipleLangauge implements TestTool, Language
{
	
public static void main(String[] args)
{
	Automation a = new Automation();
	a.Java();
	a.Selenium();
	a.python();
	a.ruby();
}

//Abstract Method from extended class MultipleLangauge
public void ruby() 
{
System.out.println("Language: Ruby");	
}

// Interface Method implemented from Language
public void Java() {
	System.out.println("Language: Java");
	
}

//Interface Method implemented from Testtool
public void Selenium() {
	System.out.println("Webdriver: Selenium");
	
}

}
