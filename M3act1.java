package M3_Activity1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class M3act1 {
		
		public static void main(String[] args) {
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
