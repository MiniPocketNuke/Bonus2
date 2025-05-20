public class Main {
    public static void main(String[] args) {
        int accountBal = 200;
        int deposit = 1400;
        int bonus = 100;
        if (deposit > 999) {
            accountBal = deposit + deposit / bonus + accountBal;
        } else {
            accountBal = deposit + accountBal;
        }
        System.out.println(accountBal);
    }
}