public class Account {
    private static int accountsOpen = 1;
    private int accountId;
    private String accountHolder;
    private double accountBalance;

    public Account(String accountHolder) {
        this.accountId = accountsOpen++;
        this.accountHolder = accountHolder;
        this.accountBalance = 100;
    }
}
