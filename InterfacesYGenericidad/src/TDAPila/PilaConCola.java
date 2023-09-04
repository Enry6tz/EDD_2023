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
		if(size()>1)
			for(int i=0; i<size()-1; i++) {//girando la cola y modificando su estado interno 
					pilaLinked.add(pilaLinked.poll());
			}
		E aux =  pilaLinked.peek();
		pilaLinked.add(pilaLinked.poll());
		return aux;
	}
	
	
	
	@Override
	public void push(E element) {
		pilaLinked.add( element);
		
	}

	@Override
	public E pop() throws EmptyStackException {
		if (isEmpty()) {
	        throw new EmptyStackException();
	    }
		if(size()>1)
			for(int i=0; i<size()-1; i++) {//girando la cola y modificando su estado interno 
						pilaLinked.add(pilaLinked.poll());
				}
			
			return  pilaLinked.poll();
	}

}
