/**
 * Programmed by: Noah Daniels
 * January 24, 2014
 * PalindromeDriver.java
 *
 * The main driver code for CA1.
 * Uses user-defined stack and queue class to determine if
 * input words are palindromes.
 *
 */ 

import java.io.IOException;
import java.util.Scanner;

public class PalindromeDriver
{
	// Main method to handle user input and call is_palindrome
    public static void main(String[] args) throws IOException
    {
    	//initialize variables
        String[] results;
        int num_phrases;

        Scanner stdin = new Scanner(System.in);
        String line;
        num_phrases = Integer.parseInt(stdin.nextLine());
        results = new String[num_phrases];
        
        //loop through palindrome inputs
        for (int i = 0; i < num_phrases; i++)
        {
        	 line = stdin.nextLine();
        	 //manipulate line variable so that it is all lower case
        	 //and does not contain any spaces or other special symbols/punctuation
        	 line = line.toLowerCase();
        	 line = line.replaceAll("\\W", "");
        	 //check if line is a palindrome and add the result to the results array
        	 if (is_palindrome(line))
        		 results[i] = "Palindrome";
        	 else
        		 results[i] = "Not a Palindrome";
        }
        
        //loop through the results array and print each element
        for (String s : results)
        {
        	System.out.println(s);
        }
    }
    
    //method to check String input and return true if input is a palindrome
    public static boolean is_palindrome(String input)
    {
    	//initialize variables
    	Stack stack = new Stack();
    	Queue queue = new Queue();
		//add character at index i to queue for each character in the first half of input
    	for (int i = 0; i < input.length() / 2; i++)
    	{
    		queue.enqueue(new CharNode(input.charAt(i), null));
    	}
    	
    	//check if input length is even to check for even length palindrome
    	if (input.length() % 2 == 0)
    	{
	    	//add character at index i to stack for each character in the second half of input
	    	for (int i = (input.length() / 2) + 1; i < input.length(); i++)
	    	{
	    		stack.push(new CharNode(input.charAt(i), null));
	    	}
    	}
    	//if input length is not even, check for odd length palindrome
    	else
    	{	
    		//add character at index i to stack for each character in the second half of input
    		//including the middle character
	    	for (int i = input.length() / 2; i < input.length(); i++)
	    	{
	    		stack.push(new CharNode(input.charAt(i), null));
	    	}
    	}
	    	
    	//while both the queue and the stack have elements in them,
    	//loop through elements in both queue and stack
    	while(!queue.isEmpty() && !stack.isEmpty())
    	{
    		//if the character in the front of the queue and the top of the stack match
    		//remove both and continue to check next characters
    		if (queue.firstNode.data == stack.firstNode.data)
    		{
    			queue.dequeue();
    			stack.pop();
    		}
    		//if the characters don't match, input is not a palindrome and return false
    		else
    			return false;
    	}
    	//if all elements in queue and stack match, input is a palindrome and return true
    	return true;
    }
}
