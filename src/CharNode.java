/**
 * Programmed by: Noah Daniels
 * January 24, 2014
 * CharNode.java
 *
 * User-defined node which is implemented in the
 * Stack and Queue classes.
 * 
 */ 

public class CharNode
{
	//declare variables to keep track of the character data
	//and the node that follows the current one
	char data;
	CharNode next;
	
	//CharNode constructor
	public CharNode()
	{
		//set the next CharNode to null because the value is unknown
		next = null;
	}
	
	//CharNode constructor with inputs
	public CharNode(char data, CharNode next)
	{
		//initialize the variables with inputs
		this.data = data;
		this.next = next;
	}
}