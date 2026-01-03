public class Application {

	public static void main(String[] args) {
		System.out.println("Application started");

		int processedValue = NumberService.process(50);
		Account account = new Account("ACC123", processedValue);

		System.out.println("Account: " + account.accountId() + ", Balance: " + account.balance());
	}
}
