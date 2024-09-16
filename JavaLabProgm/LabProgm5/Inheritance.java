package LabProgm5;
import java.io.*;

public class Inheritance {
	
	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		int ch;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter Account Number :");
		int acno=Integer.parseInt(br.readLine());

		System.out.println("Enter Account Holder Name :");
		String acnm=br.readLine();

		System.out.println("Enter Account Holder Address :");
		String acad=br.readLine();

		System.out.println("Enter Account Holder Phone :");
		String acph=br.readLine();

		System.out.println("Enter Initial Balance :");
		double acbl=Double.parseDouble(br.readLine());
		
		savings_Account sa=new savings_Account(acno,acnm, acad,acph,acbl);
		sa.accountholder();
		
		System.out.println("1. DEPOSIT");
		System.out.println("2. WITHDRAW");
		System.out.println("3. TOTAL INTEREST\n");
		
		System.out.println("\nEnter Process Choice(1-3):");
		ch=Integer.parseInt(br.readLine());
		
		if(ch==1) {
			System.out.println("Enter deposit amount :");
			double dep=Double.parseDouble(br.readLine());
			sa.deposit(dep);
		}
		if(ch==2) {
			System.out.println("Enter Withdrawal amount :");
			double acw=Double.parseDouble(br.readLine());
			sa.withdraw(acw);			
		}
		if(ch==3) {
			System.out.println("Enter Account Intrest :");
			double acin=Double.parseDouble(br.readLine());
			sa.calculateintrest(acin);
		}
	
	}
    
}
