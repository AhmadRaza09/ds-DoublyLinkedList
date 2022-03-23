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
	
		l1.tail();
		for(int i = 1; i <= l1.getSize(); i++)
		{
			System.out.print(l1.get());
			if(i < l1.getSize())
			{
				System.out.print("->");
			}
			l1.back();
		}
		System.out.println();
	
		System.out.println(l1.get());
		l1.tail();
		do
		{
			System.out.println(l1.get());
		}
		while(l1.back());
	}
}