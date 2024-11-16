package Task4;

import java.time.Year;
import java.util.Scanner;

public class Question9 {

	public static void main(String[] args) {
		  System.out.print("Enter your Year of Birth: ");
		    
          Scanner sc = new Scanner(System.in);
          int birthYear = sc.nextInt();
  
          int age = Year.now().getValue() - birthYear;
  
          System.out.println("Your are " +age+" years old.");
  
          if (age>=60) {
                      System.out.println("You are eligble to be senior citizen.");    
               } 
          else {
          System.out.println("You are not eligible to be senior citizen.");
  }
  }
  

	}


