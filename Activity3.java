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
        System.out.print("Enter your int1: ");
        String int0 = input.nextLine();
        int int1 = Integer.parseInt(int0);
        System.out.print("Enter your int2: ");
        int0 = input.nextLine();
        int int2 = Integer.parseInt(int0) ;
        int sum1 = int1 + int2;
        
        //MyClass obj = new MyClass();
        HelloworldMain.sum1(int1, int2);
        HelloworldMain.diff(int1, int2);
        HelloworldMain.prod1(int1, int2);
    
	}
	public static void sum1(int int1, int int2) 
	{

		double ans1 = int1 + int2;
        System.out.println("Sum: " + ans1);
	}
	public static void diff(int int1, int int2) 
	{
		double ans1 = int1 - int2;
        System.out.println("Difference: " + ans1);
	}
	public static void prod1(int int1, int int2) 
		{
		double ans1 = int1 * int2;
        System.out.println("Product: " + ans1);
//		return ans1;
		}
}

