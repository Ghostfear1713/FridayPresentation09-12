public class AccountDetails {
    private int iD;
    private double balance;
    private boolean isActive;

    public AccountDetails(int iD, double balance, boolean isActive) {
        this.iD = iD;
        this.balance = balance;
        this.isActive = isActive;
    }

    public int getiD() {
        return iD;
    }

    public void setiD(int iD) {
        this.iD = iD;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }









}
