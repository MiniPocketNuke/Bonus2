public class Main {
    public static void main(String[] args) {
        int accountBalance = 200;
        int deposit = 1400;
        int bonus = 100;
        if (deposit > 999) {
            accountBalance = deposit + deposit / bonus + accountBalance;
        } else {
            accountBalance = deposit + accountBalance;
        }
        System.out.println(accountBalance);
    }
}