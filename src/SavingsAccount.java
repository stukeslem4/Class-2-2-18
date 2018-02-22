
public class SavingsAccount {

	String username;
	int Pin;
	double Balance;
	
	
	
	public SavingsAccount(String username2, int Pin2, double Balance2) {
		// TODO Auto-generated constructor stub

	username=username2;
	Pin=Pin2;
	Balance=Balance2;
	
}
public double Deposit( double Depo){
		
		double amount = (Balance + Depo);
		return amount;
}
		
	public double Withdraw( double With){
	double amount=(Balance-With);
			return amount;
	}
	

	}
	
	

