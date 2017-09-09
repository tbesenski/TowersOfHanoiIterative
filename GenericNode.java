/*
 * GenericNode.java
 *
 * An implementation of a node class for a singly-linked list of integers.
 *
 * This implementation does not make the instance variables private because
 * Jason prefers to write things like:
 *
 *	n.next = null;
 *
 * Rather than:
 *
 *	n.setNext(null);
 *
 * In this course you are free to use whichever
 * method you find most comfortable.
 *
 * J. Corless, September 2016
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