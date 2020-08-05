package BankInfo;

public class Test {

	public static void main(String[] args) {
	
		BankAccount account = new BankAccount();
		//System.out.println(account.generateAccount());
		
		
		account.deposit("checking", 500);
		System.out.println(account.getcheckingBalance());
		account.withddraw("checking", 200);
		System.out.println(account.getcheckingBalance());
		
		account.withddraw("savings", 10);
		//System.out.println(account.getsavingsBalance());
		System.out.println(BankAccount.gettotalMoney());
		
	}
	

}
