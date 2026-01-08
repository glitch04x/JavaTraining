package M4_Activity1;

//#1. Create a class called BankAccount
public class BankAccount {
	//#2. Create a method
	public static String getAccountName(String accountNumber) {
		if ("ACC-001".equals(accountNumber)) {
            return "Juan Dela Cruz";
        } else if ("ACC-002".equals(accountNumber)) {
            return "Maria Santos";
        } else {
            return null;
        }
    }

	//#3. Create the testCase method
	public static void testCase(String accountNumber) {
        System.out.println("Looking up account: " + accountNumber);

		try {
            String name = getAccountName(accountNumber);
            String upperName = name.toUpperCase();
            System.out.println("Account holder: " + upperName);
        } catch (NullPointerException e) {
            System.out.println("Error: Account not found!");
        }

        System.out.println();
    }

	//#4. In the main method
	public static void main(String[] args) {
        System.out.println("=== Bank Account Name Display ===");
        System.out.println();
        
        testCase("ACC-001");
        testCase("ACC-999");

        System.out.println("=== Program completed successfully! ===");
    }
}
