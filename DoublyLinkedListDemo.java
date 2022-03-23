/**
	Created By: Ahmad Raza
	Date: 22 Mar 2022
**/

public class DoublyLinkedListDemo
{
	
	public static void main(String [] args) throws ListEmptyException
	{
		DoublyLinkedList l1 = new DoublyLinkedList();
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(4);
		l1.add(5);
		l1.add(6);
		l1.add(7);
		l1.add(8);
		l1.add(9);
		l1.add(10);
	
		l1.start();
		for(int i = 1; i <= l1.getSize(); i++)
		{
			System.out.print(l1.get());
			if(i < l1.getSize())
			{
				System.out.print("->");
			}
			l1.next();
		}
		
		System.out.println("Tail");
		l1.tail();
		l1.remove();
		l1.remove();
		System.out.println("Current: " + l1.get());
		l1.start();
		for(int i = 1; i <= l1.getSize(); i++)
		{
			System.out.print(l1.get());
			if(i < l1.getSize())
			{
				System.out.print("->");
			}
			l1.next();
		}
		
		System.out.println("Start");
		l1.start();
		l1.remove();
		l1.remove();
		System.out.println("Current: " + l1.get());
		l1.start();
		for(int i = 1; i <= l1.getSize(); i++)
		{
			System.out.print(l1.get());
			if(i < l1.getSize())
			{
				System.out.print("->");
			}
			l1.next();
		}
		
		System.out.println("Any");
		l1.start();
		l1.next();
		l1.next();
		l1.next();
		System.out.println("Current: " + l1.get());
		l1.remove();
		l1.remove();
		System.out.println("Current: " + l1.get());
		l1.start();
		for(int i = 1; i <= l1.getSize(); i++)
		{
			System.out.print(l1.get());
			if(i < l1.getSize())
			{
				System.out.print("->");
			}
			l1.next();
		}
	}
}