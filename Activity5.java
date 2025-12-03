package ph.com.bpi.helloworld.isg;
import java.util.Scanner;

public class HelloworldMain {

	public static void main(String[] args) {

    //    Scanner input = new Scanner(System.in);
    //    System.out.print("Enter your name: ");
    //    String name = input.nextLine();
    //    System.out.println("Hello, " + name + "!");

    //    Scanner input = new Scanner(System.in);
    //    System.out.print("Enter your age: ");
    //    String age0 = input.nextLine();
    //    int age1 = Integer.parseInt(age0);
    //    double age2 = Double.parseDouble(age0);
    //    System.out.println("Your age as int " + age1);
    //    System.out.println("Your age as double " + age2);
		
        Scanner input = new Scanner(System.in);
        
/*
        for (int i = 0; i <= 10; i++) {
        	
	        System.out.print("Enter your age: ");
	        String int0 = input.nextLine();
	        int int1 = Integer.parseInt(int0);
			if (int1 < 18) {
				System.out.println("Minor");
			} else if (int1 < 59) {
				System.out.println("Adult");
			} else {
				System.out.println("Senior");
			}
        }
*/
        int sum = 0;
        for (int i = 0; i <= 50; i++) { 
        	sum = sum + i;
        }
        
        System.out.println("Sum = " + sum);
        
        
	}

}

