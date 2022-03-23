/**
	Created By: Ahmad Raza
	Date: 22 Mar 2022
**/

public class DoublyLinkedListDemo
{
	
	public static void main(String [] args) throws ListEmptyException
	{
		DoublyLinkedList l1 = new DoublyLinkedList();
		l1.add(4);
		l1.add(7);
		l1.add(10);
		if(l1.find(11))
		{
			System.out.println(l1.get() + ": is found.");
		}
		else
		{
			System.out.println("Not found");
		}
		
	}
}