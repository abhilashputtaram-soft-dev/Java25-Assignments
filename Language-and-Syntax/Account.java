public class Account {

	private final String accountId;
	private final int balance;

	public Account(String accountId, int balance) {
		if (accountId == null || accountId.isBlank()) {
			throw new IllegalArgumentException("Account ID is required");
		}
		if (balance < 0) {
			throw new IllegalArgumentException("Balance cannot be negative");
		}
		this.accountId = accountId;
		this.balance = balance;
	}

	public String accountId() {
		return accountId;
	}

	public int balance() {
		return balance;
	}
}
