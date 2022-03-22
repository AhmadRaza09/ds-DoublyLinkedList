/**
	Created By: Ahmad Raza
	Date: 22 Mar 2022
**/


public class DoublyNode
{
	
	//store the actual data
	private int value;
	
	//store the refrence of the next node
	private DoublyNode next;
	
	//store the refrence of the previous node
	private DoublyNode prev;
	
	public void setValue(int value)
	{
		
		this.value = value;
	}
	
	public int getValue()
	{
		return value;
	}
	
	public void setNext(DoublyNode next)
	{
		
		this.next = next;
	}
	
	public DoublyNode getNext()
	{
		
		return next;
	}
	
	public void setPrev(DoublyNode prev)
	{
		
		this.prev = prev;
	}
	
	public DoublyNode getPrev()
	{
		
		return prev;
	}
}