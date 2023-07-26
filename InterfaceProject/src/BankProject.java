
public class BankProject {

	public static void main(String[] args) {
		SavingsAccount savAccObj1 = new SavingsAccount(101,"Shubham",60000);
		SavingsAccount savAccObj2 = new SavingsAccount(102,"Ayush",75000);
		
		System.out.println("savAccObj1 : "+savAccObj1);
		System.out.println("savAccObj2 : "+savAccObj2);
		
		FundTransferService.transferFunds(savAccObj1, savAccObj2, 13000);
		
		System.out.println("savAccObj1 : "+savAccObj1);
		System.out.println("savAccObj2 : "+savAccObj2);
	}
}

class FundTransferService{
	static void transferFunds(Withdrawing source, Depositing target, float amountToTransfer) {
		System.out.println("Transfering Funds...");
		source.withdraw(amountToTransfer);
		target.deposit(amountToTransfer);
		System.out.println("Funds Transfered..");
	}
}

interface Withdrawing{
	void withdraw(float x);
}

interface Depositing{
	void deposit(float x);
}

class SavingsAccount implements Withdrawing, Depositing{
	int accountNumber;
	String accountHolder;
	float accountBalance;
	
	public SavingsAccount(int accountNumber, String accountHolder, float accountBalance) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.accountBalance = accountBalance;
	}
	
	public void withdraw(float amountToWithdraw) {
		accountBalance = accountBalance - amountToWithdraw;
	}
	
	public void deposit(float amountToDeposit) {
		accountBalance = accountBalance + amountToDeposit;
	}

	@Override
	public String toString() {
		return "SavingsAccount [accountNumber=" + accountNumber + ", accountHolder=" + accountHolder
				+ ", accountBalance=" + accountBalance + "]";
	}
	
}
