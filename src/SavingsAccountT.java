import java.util.Scanner;
public class SavingsAccountT {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	Scanner Y=new Scanner(System.in);	
		
	SavingsAccount S= new SavingsAccount("Jay",100135,100.25);
	SavingsAccount T=new SavingsAccount("Aileen",100190,1000.36);
	SavingsAccount U=new SavingsAccount("John",100153,3213.66);
	
	
	System.out.println(S.username);
	System.out.println(S.Pin);
	System.out.println(S.Balance);
	
	System.out.println(T.username);
	System.out.println(T.Pin);
	System.out.println(T.Balance);
	
	System.out.println(U.username);
	System.out.println(U.Pin);
	System.out.println(U.Balance);
	
	
	System.out.println("Type in the current account information");
	String A=Y.nextLine();
	int B=Y.nextInt();
	double C=Y.nextInt();
	
	SavingsAccount CurrentAccount=new SavingsAccount(A,B,C);
	
	System.out.println(CurrentAccount.username);
	System.out.println(CurrentAccount.Pin);
	System.out.println(CurrentAccount.Balance);
	
	
	System.out.println("Type in the overdraft account infomation");
	String D=Y.next();
	int E=Y.nextInt();
	double F=Y.nextInt();
	
	SavingsAccount OverdraftAccount=new SavingsAccount(D,E,F);
	
	System.out.println(OverdraftAccount.username);
	System.out.println(OverdraftAccount.Pin);
	System.out.println(OverdraftAccount.Balance);
	
	System.out.println("How much will you deposit");
	double K=Y.nextDouble();
	
	System.out.println(S.Balance+K);
	System.out.println(T.Balance+K);
	System.out.println(U.Balance+K);
	System.out.println(CurrentAccount.Balance+K);
	System.out.println(OverdraftAccount.Balance+K);
	
	System.out.println("How much will you withdraw?");
	double L=Y.nextDouble();
	
	
	System.out.println(S.Balance-L);
	System.out.println(T.Balance-L);
	System.out.println(U.Balance-L);
	System.out.println(CurrentAccount.Balance-L);
	System.out.println(OverdraftAccount.Balance-L);
	
		
	}

}
