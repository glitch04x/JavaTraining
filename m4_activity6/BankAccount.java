package m4_activity6;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BankAccount {

    // Logger: LoggerFactory.getLogger(M4Activity6.class)
    private static final Logger log = LoggerFactory.getLogger(BankAccount.class);

    private double balance = 10000.00; // Initial balance: ₱10,000

    public double getBalance() {
        return balance;
    }

    public void withdraw(double amount) throws InvalidAmountException, InsufficientFundsException {
        log.info("Withdrawal requested: ₱{}", amount);

        if (amount < 0) {
            log.error("Invalid withdrawal amount: ₱{}", amount);
            throw new InvalidAmountException("Amount must be non-negative");
        }

        if (amount > balance) {
            log.warn("Insufficient funds: ₱{} available", balance);
            throw new InsufficientFundsException("Insufficient funds", balance, amount);
        }

        balance -= amount;
        log.info("Withdrawal completed: ₱{}, New balance: ₱{}", amount, balance);
    }

    public void deposit(double amount) throws InvalidAmountException {
        log.info("Deposit requested: ₱{}", amount);

        if (amount <= 0) {
            log.error("Invalid deposit amount: ₱{}", amount);
            throw new InvalidAmountException("Deposit amount must be positive");
        }

        if (amount > 50_000) {
            log.warn("Large deposit detected ₱{} - requires verification", amount);
        }

        balance += amount;
        log.info("Deposit completed: ₱{}, New balance: ₱{}", amount, balance);
    }
    
    public static void runTest(BankTestOperation operation, String operationName) {
        try {
            operation.execute();
        } catch (InvalidAmountException e) {
            log.error("{} failed: Deposit amount must be positive.", operationName, e);
        } catch (InsufficientFundsException e) {
            log.error("{} failed: Insufficient funds for withdrawal",
                    operationName, e);
        }
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        runTest(() -> account.deposit(5000), "Deposit");
        runTest(() -> account.withdraw(3000), "Withdrawal");
        runTest(() -> account.deposit(-500), "Deposit");
        runTest(() -> account.withdraw(20000), "Withdrawal");
        runTest(() -> account.deposit(60000), "Deposit");
    }
   
}

