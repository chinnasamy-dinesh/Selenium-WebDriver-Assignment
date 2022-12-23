package Week_3.Day_1.Assignment;

public class AxisBank extends BankInfo
{

public static void main(String[] args)
{
	AxisBank a = new AxisBank();
	a.saving();
	a.fixed();
	a.deposit();
}

// Over ridden Method from BankInfo Class
public void deposit()
{
System.out.println("Minimum Deposit Amount: "+10000);	
}

}
