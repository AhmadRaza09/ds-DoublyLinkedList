public class DoublyNode
{
	
	//store the actual data
	private int value;
	
	//store the refrence of the next node
	private Node next;
	
	//store the refrence of the previous node
	private Node prev;
	
	public void setValue(int value)
	{
		
		this.value = value;
	}
	
	public int getValue()
	{
		return value;
	}
	
	public void setNext(Node next)
	{
		
		this.next = next;
	}
	
	public Node getNext()
	{
		
		return next;
	}
	
	public void setPrev(Node prev)
	{
		
		this.prev = prev;
	}
	
	public Node getPrev()
	{
		
		return prev;
	}
}