package Week6;

import java.util.Scanner;

public class CountingVowels {
	
	
	    public static void main(String[] args) {
	        // Step 1: Take user input
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String input = scanner.nextLine();
	        
	        // Step 2: Initialize the counter
	        int vowelCount = 0;
	        
	        // Step 3: Iterate through the string
	        for (int i = 0; i < input.length(); i++) {
	            char ch = input.charAt(i);
	            
	            // Step 4: Check for vowels
	            if (isVowel(ch)) {
	                // Step 5: Update the counter
	                vowelCount++;
	            }
	        }
	        
	        // Step 6: Display the result
	        System.out.println("Number of vowels: " + vowelCount);
	    }
	    
	    // Method to check if a character is a vowel
	    private static boolean isVowel(char ch) {
	        ch = Character.toLowerCase(ch);
	        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
	    }
	}



