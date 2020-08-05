package BankInfo;
import java.util.Random;

public class BankAccount {

	private String accountNumber;
	private double checkingBalance;
	private double savingsBalance;
	public static int numberOfAccounts=0;
	public static double totalMoney=0;
	
	public BankAccount() {
		//create a new account and increament account count 
		accountNumber = generateAccount();
		
		numberOfAccounts++;
		//System.out.println(numberOfAccounts);
	}
	
	public String generateAccount() {
		String result ="";
		Random rand = new Random();
		while(result.length() < 10) {result += rand.nextInt(9); }
		return result;
	}
	
	
	//users checkingact balance method
	
	public double getcheckingBalance() {
		return checkingBalance;
	}
	
	public double getsavingsBalance() {
		return savingsBalance;
		
	}
	
	public static double gettotalMoney() {
		return totalMoney;
	}
	
	
	public void deposit(String str, int amt) {
		//totalMoney = amountDeposit + currentBalance
		
		try {
				if(str =="checking") {  //if str checking deposit and update bal
					checkingBalance +=amt;  
					totalMoney+=amt;
				}
				else if(str=="savings") { //if str savings deposit & update bal
					savingsBalance+=amt; 
					totalMoney+=amt;
				}
				else {throw new Exception("Invalid account, cannot find acct....");}
			
				}catch(Exception e) {System.out.println(e);}
		
		
		
	}
	
	
	public void withddraw(String str, int amt) {
		try {
			if(str =="checking") {  
				if(amt<=checkingBalance) {
					checkingBalance -=amt;  
					totalMoney-=amt;
				}
				else {throw new Exception("Insufficient funds in checking....");}
			}
			else if(str=="savings") { 
				if(amt<=savingsBalance) {
					savingsBalance-=amt; 
					totalMoney-=amt;
				} else {throw new Exception("Insufficient funds in savings....");}
			}
			
			else {throw new Exception("Invalid account Type...");}
		}	catch(Exception e) {System.out.println(e);}
		
		}	

}
	
	
	

