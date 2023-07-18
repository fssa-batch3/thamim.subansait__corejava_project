package day05.pratice;

public class IciciATM {
	public boolean deposit(Account account, double amount) {
		account.setBalance(amount);
		return true;
	}

	public boolean withdraw(Account account, double amount) throws Exception {
		if (account.getBalance() < 10000) {
			throw new Exception();
		} else {
			if (account.getBalance() < amount) {
				throw new Exception();
			} else {
				account.setBalance(account.getBalance() - (amount + 10));
				return true;
			}
		}
	}

	public double getBalance(Account account) {
		return account.getBalance();
	}
}
