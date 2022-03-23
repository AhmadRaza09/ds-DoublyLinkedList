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
		l1.add(15);
	
		l1.start();
	    System.out.println("My: " + l1.get());
		l1.clear();
		l1.tail();
		l1.start();
		System.out.println("My: " + l1.get());
	}
}