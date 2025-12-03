package ph.com.bpi.helloworld.isg;
import java.util.Scanner;

public class HelloworldMain {

	public static void main(String[] args) {

    //    Scanner input = new Scanner(System.in);
    //    System.out.print("Enter your name: ");
    //    String name = input.nextLine();
    //    System.out.println("Hello, " + name + "!");

	    Scanner input = new Scanner(System.in);
	    System.out.print("Enter your age: ");
	    String age0 = input.nextLine();
	    int age1 = Integer.parseInt(age0);
	    double age2 = Double.parseDouble(age0);
	    System.out.println("Your age as int " + age1);
	    System.out.println("Your age as double " + age2);
	}

}
