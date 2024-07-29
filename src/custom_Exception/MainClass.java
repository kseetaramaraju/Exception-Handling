package custom_Exception;

import java.util.Scanner;


public class MainClass {
	int balance=10000;

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println(" enter amount to withdraw ");
		int a = sc.nextInt();
		MainClass s=new MainClass();

		try {
			s.withdrawAmount(a);	
		} catch (InSufficientBalanceException e) {
			System.out.println(e.getMessage());
		}
	}

	public void withdrawAmount(int a) throws InSufficientBalanceException 
	{
		if(a<=balance)
		{
			balance=balance-a;
			System.out.println(" Amount "+a+" is WithDrawn Sucessfully ");
			System.out.println(" Remaining Balance Is "+balance);
		}
		else
		{
			throw new InSufficientBalanceException(" Insufficient Balance !!"); 
		}
	}

}
