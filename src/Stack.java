/**
 * Programmed by: Noah Daniels
 * January 24, 2014
 * Stack.java
 *
 * User-defined Stack class to implement when
 * checking the latter half of the palindrome.
 * 
 */ 

import java.util.ArrayList;

public class Stack
{
	//declare variables to keep track of the element on top of the stack
	CharNode firstNode;
	
	//constructor for Stack
	public Stack()
	{
		//set firstNode to null because the stack is empty
		firstNode = null;
	}
	
	//method to add an object to the stack
	public CharNode push(CharNode obj)
	{
		//store the firstNode to a temporary variable
		CharNode temp = firstNode;
		//set the firstNode to be the new node obj on top of the stack
		firstNode = obj;
		//set the second node to be the old first node
		firstNode.next = temp;
		//return the object at the top of the stack
		return obj;
	}
	
	//method to remove the object on top of the stack
	public CharNode pop()
	{
		//store the first node in a temporary variable
		CharNode nodeToRemove = firstNode;
		//set the second node to be the first node at the top of the stack
		firstNode = firstNode.next;
		//return the char data of the old first node
		return nodeToRemove;
	}
	
	//method to check if the stack is empty
	public boolean isEmpty()
	{
		//returns true if there are no nodes, returns false otherwise
		return firstNode == null;
	}
}