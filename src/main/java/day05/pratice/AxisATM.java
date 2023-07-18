package day05.pratice;

public class AxisATM implements ATM {

	public boolean deposit(Account account, double amount) {
		account.setBalance(account.getBalance()+amount);
		return true;
	}

	public boolean withdraw(Account account, double amount) throws Exception {
		if (account.getBalance() < 5000) {
			throw new Exception("amount is less than 5000");
		} else {
			if (account.getBalance() < amount) {
				throw new Exception("insufficient account balance");
			} else {
				account.setBalance(account.getBalance() - (amount + 5));
				System.out.println("your account number: "+account.getAccNo()+" account Balance: "+account.getBalance());
				return true;
			}
		}
	}

	public double getBalance(Account account) {
		System.out.println(account.getBalance());
		return account.getBalance();
	}
}
