package LabProgm5;
public class account_detail {
// 1st Variable
	int ac;
	String nm,ad,ph;
	double bl;
	// Constructors Declare
	account_detail(int i, String n, String a, String p, double d)
	{
	ac=i;
	nm=n;
	ad=a;
	ph=p;
	bl=d;
	}

	// Method Declare
	public void accountholder()
	{
		System.out.println("------------------------");
		System.out.println("     ACCOUNT DETAILS    ");
		System.out.println("------------------------");
		System.out.println("Account Number :"+ac);
		System.out.println("Account Holder Name :"+nm);
		System.out.println("Account Holder Address :"+ad);
		System.out.println("Account Holder Phone :"+ph);
		System.out.println("Account Holder Balance :"+bl);
	}
}