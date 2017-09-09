/*
 A class given to us by our instructor, which we were using at the time
 */

public class GenericNode<G>
{
	GenericNode<G>	next;
	G			value;

	public GenericNode()
	{
		next = null;
		value = null;
	}

	public GenericNode (G val)
	{
		value = val;
		next = null;
	}

	public GenericNode (G val, GenericNode nxt)
	{
		value = val;
		next = nxt;
	}

	public GenericNode getNext()
	{
		return next;
	}

	public G getValue()
	{
		return value;
	}

	public void setNext (GenericNode nxt)
	{
		next = nxt;
	}

	public void setValue (G val)
	{
		value = val;
	}
}
