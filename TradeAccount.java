import java.util.Scanner;

class TradeAccount {

    String accountNumber;
    double amount;
    boolean isCashAccount;

    TradeAccount(String accountNumber, double amount, boolean isCashAccount) {
        this.accountNumber = accountNumber;
        this.amount = amount;
        this.isCashAccount = isCashAccount;
    }

    void display() {
        if (isCashAccount) {
            System.out.printf("Account %s Cash Balance: %.2f%n",
                    accountNumber, amount);
        } else {
            System.out.printf("Account %s Margin: %.2f%n",
                    accountNumber, amount);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of accounts: ");
        int n = sc.nextInt();

        TradeAccount[] accounts = new TradeAccount[n];

        for (int i = 0; i < n; i++) {

            System.out.println("\nEnter details for account " + (i + 1));

            System.out.print("Account Number: ");
            String accNo = sc.next();

            System.out.print("Amount: ");
            double amount = sc.nextDouble();

            System.out.print("Account Type (1 = Cash, 2 = Margin): ");
            int type = sc.nextInt();

            boolean isCash = (type == 1);

            accounts[i] = new TradeAccount(accNo, amount, isCash);
        }

        System.out.println("\n--- Account Details ---");
        for (TradeAccount acc : accounts) {
            acc.display();
        }

        sc.close();
    }
}
