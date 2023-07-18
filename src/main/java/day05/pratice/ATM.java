package day05.pratice;

public interface ATM {

	boolean deposit(Account account, double amount);

	boolean withdraw(Account account, double amount) throws Exception;

	public double getBalance(Account account);

}
