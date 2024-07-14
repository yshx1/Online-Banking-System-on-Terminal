import java.io.*;
import java.util.HashMap;
import java.util.Scanner;

public class AccountManager {
    private HashMap<String, BankAccount> accounts;
    private static final String FILE_NAME = "accounts.txt";

    public AccountManager() {
        accounts = new HashMap<>();
        loadAccounts();
    }

    public void createAccount(String accountNumber, String accountHolderName) {
        if (accounts.containsKey(accountNumber)) {
            System.out.println("Account already exists!");
        } else {
            BankAccount account = new BankAccount(accountNumber, accountHolderName);
            accounts.put(accountNumber, account);
            System.out.println("Account created successfully!");
        }
    }

    public BankAccount findAccount(String accountNumber) {
        return accounts.get(accountNumber);
    }

    public void saveAccounts() {
        try (PrintWriter writer = new PrintWriter(new FileWriter(FILE_NAME))) {
            for (BankAccount account : accounts.values()) {
                writer.println(account);
            }
        } catch (IOException e) {
            System.out.println("Error saving accounts: " + e.getMessage());
        }
    }

    public void loadAccounts() {
        try (Scanner scanner = new Scanner(new File(FILE_NAME))) {
            while (scanner.hasNextLine()) {
                String[] accountData = scanner.nextLine().split(",");
                String accountNumber = accountData[0];
                String accountHolderName = accountData[1];
                double balance = Double.parseDouble(accountData[2]);
                BankAccount account = new BankAccount(accountNumber, accountHolderName);
                account.deposit(balance);  // Initial deposit to set the balance
                accounts.put(accountNumber, account);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Accounts file not found, starting fresh.");
        }
    }
}
