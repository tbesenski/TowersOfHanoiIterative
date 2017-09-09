
//This is just a class given to us by our instructor which we were using at the time


public class Stack<G>{
	
	
	GenericNode<G> head;
	
	int count;
	public Stack()
	{
		head = null;
		count = 0;
	}
	
	public void push(G value)
	{
		GenericNode<G> n = new GenericNode<G>(value);
		
		if (head ==null)
		{
			
			head= n;
			count++;
		}
		else
		{
			n.next = head;
			head= n;
			count++;
		}
		
	}
	
	
	public G pop() throws NullPointerException
	{
		if (count == 0)
		{
			throw new NullPointerException("Cannot pop when head ==null");
		}
		
		else
		{
			GenericNode<G> p = head;
			head = head.next;
			count--;
			return p.value;
		}
	}
	
	public G peek() throws NullPointerException
	{
		if (count == 0)
		{
			throw new NullPointerException("Cannot peek when head ==null");
		}
		else
		{
			return head.value;
		}
		
	}
	
	public void makeEmpty()
	{
		head =null;
		count--;
	}
	
	public boolean isEmpty()
	{
		if(head ==null || count ==0)
			return true;
		else{
			return false;
		}
	}
	
	public String toString()
	{
		GenericNode<G> p=head;
		if (head == null)
				return ("{}");
		
		String s = "{";
		for (int i =1; i < count; i++ )
		{
			s = s + p.value + ",";
			p = p.next;
		}
		s = s + p.value + "}";
		return s;
	}
	
	
/*	public static void main(String[] args)
	{
		Stack<Integer> s1 = new Stack();
		s1.push(1);
		
		System.out.println(s1.peek());
		s1.push(2);
		System.out.println(s1.peek());
		System.out.println(s1.toString());
		s1.pop();
		System.out.println(s1.toString());
	}
	
	*/

}
