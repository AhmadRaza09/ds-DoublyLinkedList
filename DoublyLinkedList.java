/**
	Created By: Ahmad Raza
	Date: 22 Mar 2022
**/

public class DoublyLinkedList
{
	//store the refrence of the first node
	private DoublyNode head;
	
	//store the refrence of the last node
	private DoublyNode tail;
	
	//store the refrence of the current node this node move anywhere in the chain
	private DoublyNode current;
	
	//store the size of the node in the chain
	private int size;
	
	public DoublyLinkedList()
	{
		head = null;
		tail = null;
		current = null;
		size = 0;
	}
	
	//return the size of the chain
	public int getSize()
	{
		return size;
	}
	
	//add the node in the chain after the current node
	public void add(int addValue)
	{
		DoublyNode newNode = new DoublyNode();
		newNode.setValue(addValue);
		
		if(current == null)
		{
			current = newNode;
			head = newNode;
			tail = newNode;
			current.setNext(null);
			current.setPrev(null);
		}
		else
		{
			if(current.getNext() == null)
			{
				newNode.setNext(current.getNext());
				newNode.setPrev(current);
				current.setNext(newNode);
				current = newNode;
				tail = current;
			}
			else
			{
				newNode.setNext(current.getNext());
				newNode.setPrev(current.getNext().getPrev());
				current.setNext(newNode);
				newNode.getNext().setPrev(newNode);
				current = newNode;
			}
		}
		
		size = size + 1;
		
		
	}
	
	//find the value if find then point current to that node
	public boolean find(int findValue)
	{
		//for set current and lastCurrentNode
		DoublyNode temp = head;
		
		for(int i = 1; i <= size; i++)
		{
			
			if(temp.getValue() == findValue)
			{
				current = temp;
				return true;
			
			}
			temp = temp.getNext();
		}
		
		return false;	
		
	}
	
	//update the value on which current node refer
	public void update(int updateValue)
	{
		if(current != null)
		{
			current.setValue(updateValue);
		}
	}
	
	//get the value where current node piont, if current node is null then throws ListEmptyException
	public int get() throws ListEmptyException
	{
		if(current != null)
		{
			return current.getValue();
		}
		
		throw new ListEmptyException("List is empty");
		
	}
	
	//traversing list operation
	
	//move the current reference to the next node in the chain
	public boolean next()
	{
		
		
		if(head != null)
		{
			//if current is connected to the next node then return true
			if(current.getNext() != null)
			{
				current = current.getNext();
				return true;
			}
		}
	
		//if current is not connected to the next node then return false
		return false;
	}
	
	//piont the current to the head
	public void start()
	{
		current = head;
	}
	
	//point the current to the tail
	public void tail()
	{
		current = tail;
	}
	
}