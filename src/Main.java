//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    int accountBal = 200;
    int deposit = 1400;
    if (deposit > 999) {
        accountBal = deposit + deposit / 100 + accountBal;
    }
        else{
            accountBal = deposit + accountBal;
    }
    System.out.println(accountBal);
    }
}