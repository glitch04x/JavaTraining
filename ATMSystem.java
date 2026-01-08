package M4_Activity2;

//#1. Create a class called ATMSystem 
public class ATMSystem {

	//#2. Create an array of account balances
    private static double[] accounts = {10000, 15000, 20000};

	//#3. Create method
	public static void processWithdrawal(String accountIndex, String amountInput) {
    	System.out.println("Account=" + accountIndex + ", Amount=" + amountInput);
        try {
            int index = Integer.parseInt(accountIndex);

            double balance = accounts[index];
            double amount = Double.parseDouble(amountInput);

			if (amount > balance) {
                System.out.println("Current balance: ₱" +  balance);
                System.out.println("Withdrawal: ₱" +  amount);
                System.out.println("Insufficient funds! Cannot withdraw ₱" +  amount);  
                System.out.println();   
                return;
            }
            double newBalance = balance - amount;    
            System.out.println("Current balance: ₱" +  balance);
            System.out.println("Withdrawal: ₱" +  amount);
            System.out.println("New balance: ₱" +  newBalance);    
            
            //#update of balance not in specs
            //accounts[index] = newBalance;
            System.out.println("Withdrawal successful!");

		//#4. Use TWO catch blocks (actually, 3)
		} catch (NumberFormatException e) {
            System.out.println("Error: Invalid input!");
            System.out.println("Please enter valid numbers.");
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Account not found!");
            System.out.println("Invalid account index.");
            
        } catch (Exception e) {
            System.out.println("Transaction failed");
        }
        System.out.println();
    }

	//#5. Test FOUR scenarios in main
	public static void main(String[] args) {
		System.out.println("=== ATM Withdrawal System ===");
        System.out.println();

        System.out.println("--- Test 1: Valid Withdrawal ---");
        processWithdrawal("1", "5000");

        System.out.println("--- Test 2: Invalid Account Index ---");
        processWithdrawal("abc", "5000");

        System.out.println("--- Test 3: Account Not Found ---");
        processWithdrawal("10", "5000");

        System.out.println("--- Test 4: Insufficient Funds ---");
        processWithdrawal("1", "20000");

    	System.out.println("=== All tests completed! ===");
    }
}

