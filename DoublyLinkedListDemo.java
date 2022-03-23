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
		System.out.println(l1.get());
		l1.start();
		System.out.println(l1.get());
	}
}