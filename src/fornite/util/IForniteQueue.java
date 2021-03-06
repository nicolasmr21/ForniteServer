package fornite.util;

public interface IForniteQueue {
	
	//Pre: none
	//Post: Returns true if the queue is empty, otherwise returns false.
	public boolean isEmpty();
	
	//Pre:item is the new item to be added
	//Post: If insertion is successful, item is at the end of the queue.
	//Post:Throw QueueException if the item cannot be added to the queue.
	public void enqueue(Object item);
	
	//Pre: none
	//Post: If queue is not empty, the item at the front of a queue is returned, and the queue
	//Post: is left unchanged. Throws QueueException if the queue is empty.
	public Object dequeue( );
	
	
	//Pre: none
	//Post: If queue is not empty, the item at the front of the queue is retrieved and removed
	//Post: from the queue. Throws QueueException if the queue is empty.
	public Object front( ) throws QueueException;
	
}
