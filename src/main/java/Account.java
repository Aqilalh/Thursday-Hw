public class Account {
    public int getBalance() {

        return this.balance;
    }

    public void setBalance(int balance) {
if (balance > 0)
            this.balance = balance;
        }

    private int balance;
}
