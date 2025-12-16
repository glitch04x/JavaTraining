package M3_Activity3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.*;


import ph.com.bpi.training.Student;

public class M3act3 {
   	
    public static void main(String[] args) {
    	

    	TreeMap<String, Integer> products = new TreeMap<>();
        products.put("CPU", 1500);
        products.put("GPU", 2500);
        products.put("Monitor", 3000);
        products.put("Mouse", 350);
        products.put("Keyboard", 200);
    	
        String choice = "";   
        while (!choice.equalsIgnoreCase("5")) {
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
				        if(products.containsKey(searcher)){  		        
				        	System.out.println("Product's price is " + products.get(searcher));
				        }
				        		
				        

		          }
		          case "2" -> {
						System.out.println("");
						System.out.print("Enter product name to add:");
				        String adder = input.nextLine().trim() ;  
						System.out.print("Enter price:");
				        int adderint = Integer.parseInt(input.nextLine().trim()) ;  
				        
				        products.put(adder, adderint);
						System.out.println("Product added: " + adder);
				
		          }
		          
		          case "3" -> {

		              System.out.println("\nAll products and prices:");
		              for (Map.Entry<String, Integer> entry : products.entrySet()) {
		                  System.out.println(entry.getKey() + " - " + entry.getValue());
		              }
		          }

		          case "4" -> {
		        	  
		        	  String smallKey = "";
		        	  int smallValue = 99999;
		              for (Map.Entry<String, Integer> entry : products.entrySet()) {
		            	  if(entry.getValue()< smallValue) {
		            		  smallKey = entry.getKey();
		            		  smallValue = entry.getValue();
		            	  }
		              }
		              
		              System.out.println("\n");
		              for (Map.Entry<String, Integer> entry : products.entrySet()) {
		            	  if (entry.getValue() == smallValue) {
		            		  System.out.println("Cheapest product: " + entry.getKey() + " - " + entry.getValue());
		              }
		              }
		          }
		              

		          case "5" ->System.out.println("Exiting... Thank you!");
		          default -> System.out.println("Invalid choice. Please try again.");
            }
        }
    }
            
    private static void printMenu() {
		System.out.println("\nSelect an option:");
		System.out.println("1. Search a product");
		System.out.println("2. Add a product");
		System.out.println("3. Print all products and prices");
		System.out.println("4. Find the cheapest product");
		System.out.println("5. Exit");
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