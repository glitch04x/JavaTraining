package M4_Activity4;

//#1. Create a class AccountValidator
public class AccountValidator {

		//#2. Create method
		public void validateAccountNumber(String accountNumber) throws Exception {
	        	

				if (accountNumber == null) {
					throw new NullPointerException("Cannot be null");
				} else {
					int length = accountNumber.length();

				if (length != 10) {
				    throw new Exception("Must be 10 digits");
				}}
				
				System.out.println("Valid account: " + accountNumber);
        	}

		public static void main(String[] args) {
	        
			AccountValidator validator = new AccountValidator();

	        String[] cases = { "1234567890", "123", null };

	        for (String accountNumber : cases) {
	            try {
	                validator.validateAccountNumber(accountNumber);
		            } catch (NullPointerException npe) {
		                System.out.println("Error: " + npe.getMessage());
		            } catch (Exception e) {
		                System.out.println("Error: " + e.getMessage());
		            }

	        	}
			}
		}
		
		
		
		
		
