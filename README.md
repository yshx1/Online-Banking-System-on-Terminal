

# Basic Online Banking System

## Project Description

The Basic Banking System project is a simple Java application that simulates a banking system. It allows users to perform basic banking operations such as creating accounts, depositing money, withdrawing money, and checking account balances. The system ensures persistence of account details by saving them to a file, allowing data to be retained between sessions.

## Features

- **Account Creation:** Users can create new bank accounts by providing necessary details.
- **Deposit and Withdrawal:** Functionality to deposit money into and withdraw money from accounts.
- **Account Balance:** Check the current balance of any account.

## Getting Started

### Prerequisites

- Java Development Kit (JDK) installed
- Integrated Development Environment (IDE) like Eclipse or IntelliJ IDEA
- Git installed (optional, for cloning the repository)

### Installation and Setup

1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/basic-banking-system.git
   cd basic-banking-system
   ```

2. Open the project in your IDE.

3. Compile the Java files:
   ```bash
   javac *.java
   ```

4. Run the application:
   ```bash
   java BankingSystem
   ```

### Usage

1. **Creating an Account:**
   - Enter a unique account number, account holder name, and initial deposit amount.

2. **Deposit Money:**
   - Enter the account number and the amount to deposit.

3. **Withdraw Money:**
   - Enter the account number and the amount to withdraw.

4. **Check Account Balance:**
   - Enter the account number to view the current balance.

5. **Exiting the Program:**
   - Use the exit option to close the application and save all changes.

### Example

```bash
1. Create Account
2. Deposit
3. Withdraw
4. Check Balance
5. Exit

Choose an option: 1
Enter account number: ACC12345
Enter account holder name: John Doe
Enter initial deposit amount: 1000
Account created successfully!

Choose an option: 2
Enter account number: ACC12345
Enter amount to deposit: 500
Deposited: 500

Choose an option: 3
Enter account number: ACC12345
Enter amount to withdraw: 200
Withdrew: 200

Choose an option: 4
Enter account number: ACC12345
Balance: 1300.0

Choose an option: 5
Exiting...
```
