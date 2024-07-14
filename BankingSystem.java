import java.util.Scanner;

public class BankingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AccountManager accountManager = new AccountManager();

        while (true) {
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter account number: ");
                    String accountNumber = scanner.nextLine();
                    System.out.print("Enter account holder name: ");
                    String accountHolderName = scanner.nextLine();
                    accountManager.createAccount(accountNumber, accountHolderName);
                    break;
                case 2:
                    System.out.print("Enter account number: ");
                    accountNumber = scanner.nextLine();
                    BankAccount account = accountManager.findAccount(accountNumber);
                    if (account != null) {
                        System.out.print("Enter amount to deposit: ");
                        double amount = scanner.nextDouble();
                        account.deposit(amount);
                    } else {
                        System.out.println("Account not found!");
                    }
                    break;
                case 3:
                    System.out.print("Enter account number: ");
                    accountNumber = scanner.nextLine();
                    account = accountManager.findAccount(accountNumber);
                    if (account != null) {
                        System.out.print("Enter amount to withdraw: ");
                        double amount = scanner.nextDouble();
                        account.withdraw(amount);
                    } else {
                        System.out.println("Account not found!");
                    }
                    break;
                case 4:
                    System.out.print("Enter account number: ");
                    accountNumber = scanner.nextLine();
                    account = accountManager.findAccount(accountNumber);
                    if (account != null) {
                        System.out.println("Balance: " + account.checkBalance());
                    } else {
                        System.out.println("Account not found!");
                    }
                    break;
                case 5:
                    accountManager.saveAccounts();
                    System.out.println("Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}
