/**
 * Programmed by: Noah Daniels
 * January 24, 2014
 * Queue.java
 *
 * User-defined Queue class to implement when
 * checking the first half of the palindrome.
 *
 */ 

import java.util.ArrayList;

public class Queue
{
	//declare variables to keep track of the first and last elements of the queue
	CharNode firstNode, lastNode;
	
	//Queue constructor
	public Queue()
	{
		//set variables to null because the queue is empty
		firstNode = null;
		lastNode = null;
	}
	
	//method to add a new node to the end of the queue
	public void enqueue(CharNode obj)
	{
		//store the last node of the queue in a temporary variable
		CharNode temp = lastNode;
		//set the last node to the new node at the end of the stack
		//with no node after it
		lastNode = obj;
		//if there is no first node, the last node is the same as the first node
		if (isEmpty())
			firstNode = lastNode;
		//if there is a first node, set temp to be in the queue just before the new last node
		else
			temp.next = lastNode;
	}
	
	//method to remove the element at the beginning of the queue
	public CharNode dequeue()
	{
		//store the first node in a temporary variable
		CharNode nodeToRemove = firstNode;
		//set the first node to be the second node in the queue
		firstNode = firstNode.next;
		//if there is no first node, set last node to null
		if(isEmpty())
			lastNode = null;
		//return the first node's data
		return nodeToRemove;
	}
	
	//method to check if the queue is empty
	public boolean isEmpty()
	{
		//returns true if there are no nodes, returns false otherwise
		return firstNode == null;
	}
}