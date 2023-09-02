package TDAPila;

import java.util.Queue;
import java.util.LinkedList;

public class PilaConCola<E> implements Stack<E>{
	Queue<E> pilaLinked;
	
	public PilaConCola() {
		pilaLinked = new LinkedList<E>();
	}
	
	@Override
	public int size() {
		return pilaLinked.size();
	}

	@Override
	public boolean isEmpty() {
		return pilaLinked.isEmpty();
	}

	@Override
	public E top() throws EmptyStackException {
		
		 if (isEmpty()) {
		        throw new EmptyStackException();
		    }
		for(int i=0; i<size()-1; i++) {
			pilaLinked.add(pilaLinked.poll());
		}
		return pilaLinked.peek();
	}
	//girando la cola y modificando su estado interno 
	@Override
	public void push(E element) {
		try {
			
			
		} catch (EmptyStackException e) {
			e.printStackTrace();
		}
	}

	@Override
	public E pop() throws EmptyStackException {
		return null;
	}

}
