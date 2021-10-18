/*
 * Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
 * Comprehensive Version (12th ed.). Pearson Education, Inc.
 * Modified by R. Krasso 2021
 * Additional modifications by A. Student 2021
 */
/*
 * Tabor, J. (2021). CIS 505 Intermediate Java Programming. 
 * Bellevue University.
 */

import java.util.LinkedList;
public class GenericQueue<E>{
	//Creates a new Linkedlist to support the GenericQueue
	private LinkedList<E> List = new LinkedList<E>();
	
	//Adds a new item to the linkedlist
	public void enqueue(E item) {
		List.addFirst(item);
	}
	
	//Removes items from the linkedlist
	public E dequeue() {
		return List.removeFirst();
	}
	
	//Returns the amount of items to the linkedlist
	public int size() {
		return List.size();
	}
}