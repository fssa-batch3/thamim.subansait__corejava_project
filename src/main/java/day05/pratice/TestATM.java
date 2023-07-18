package day05.pratice;

public class TestATM {

	public static void main(String[] args) throws Exception {
		Account thamimAcc = new Account();
		thamimAcc.setAccNo("1122334455");
		thamimAcc.setBalance(50000.00);
			
		AxisATM thamim = new AxisATM();
		thamim.withdraw(thamimAcc, 5000.00);
		thamim.deposit(thamimAcc, 100.00);
		thamim.getBalance(thamimAcc);
	}

}
