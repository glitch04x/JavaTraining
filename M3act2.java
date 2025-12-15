package M3_Activity2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import ph.com.bpi.training.Student;

public class M3act2 {

    public static void main(String[] args) {
    	

        Set<String> products = new HashSet<>();
        products.add("CPU");
        products.add("GPU");
        products.add("Monitor");
        products.add("Mouse");
        products.add("Keyboard");
    	
        String choice = "";   
        while (!choice.equalsIgnoreCase("4")) {
            Scanner input = new Scanner(System.in);    
            printMenu();
            System.out.print("Enter Choice: ");
            choice = input.nextLine().trim();
            
            Student istudyante= new Student();
            switch (choice){
		          case "1" -> {
						System.out.println("");
						System.out.print("Enter product name to search:");
						
				        String searcher = input.nextLine() ;   		        
				
				        if (products.contains(searcher)) {
				            System.out.println("Product found: " + searcher);
				        } else {
				            System.out.println("Product not found.");
				        }
		          }
		          case "2" -> {
						System.out.println("");
						System.out.print("Add name of Product:");
				        String adder = input.nextLine().trim() ;   
				        products.add(adder);
				
		          }
		          
		          case "3" -> {
				          System.out.println("\nAll products:");
				          for (String product : products) {
				              System.out.println(product);
				          }	
				          System.out.println("Number of products:" + products.size());

			          }
		          case "4" ->System.out.println("Exiting... Thank you!");
		          default -> System.out.println("Invalid choice. Please try again.");
            }
        }
    }
            
    private static void printMenu() {
		System.out.println("\nSelect an option:");
		System.out.println("1. Search a product");
		System.out.println("2. Add a product");
		System.out.println("3. Print all products and count");
		System.out.println("4. Exit");
    }	

    
    public static void choice1() {
    	System.out.println("1");//addStudent();
    }
    
    public static void choice2() {
    	System.out.println("2");//addStudent();
    	
    }

    public static void choice3() {
//        System.out.println("All products:");
//        for (int i = 0; i < products.size(); i++) {
//            System.out.println((i+1) + ". " + products.get(i));
//        }
    	
    }
    
    
	public static void choiceA() {
			List<String> listahan = new ArrayList();
			listahan.add("Laptop");
			listahan.add("Mouse");
			listahan.add("Keyboard");
			listahan.add("Monitor");
			listahan.add("Printer");
			
	
	        System.out.println("All products:");
	        for (int i = 0; i < listahan.size(); i++) {
	            System.out.println((i+1) + ". " + listahan.get(i));
	        }
	
			listahan.add("Webcam");
			listahan.remove("Mouse");
			
			System.out.println("");
			
	        System.out.println("All products:");
	        for (int i = 0; i < listahan.size(); i++) {
	            System.out.println((i+1) + ". " + listahan.get(i));
	        }
	        
			System.out.println("");
			System.out.print("Enter product name to search:");
			
	        Scanner input = new Scanner(System.in);
	        String searcher = input.nextLine() ;   		        
	
	        if (listahan.contains(searcher)) {
	            System.out.println("Product found: " + searcher);
	        } else {
	            System.out.println("Product not found.");
	        }
			
		}
	
}
