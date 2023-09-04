package TDACola;

import java.util.Stack;

public class ColaConPila<E> implements Queue<E>{
	Stack<E> colaStack;
	
	public ColaConPila() {
		colaStack = new Stack<E>(); 
	}
	
	
	@Override
	public int size() {
		
		return colaStack.size();
	}

	@Override
	public boolean isEmpty() {
		
		return colaStack.isEmpty();
	}

	@Override
	public E front() throws EmptyQueueException {
	    Stack<E> auxStack = new Stack<>(); 

	    if (isEmpty()) {
	        throw new EmptyQueueException();
	    }
	    
	    int size = colaStack.size(); 
	    
	  
	    for (int i = 0; i < size - 1; i++) {
	        auxStack.push(colaStack.pop());
	    }
	    
	    E res = colaStack.peek(); 
	    for (int i = 0; i < size - 1; i++) {
	        colaStack.push(auxStack.pop());
	    }
	    return res;
	}

	@Override
	public void enqueue(E element) {
		colaStack.push(element);
		
	}

	@Override
	public E dequeue() throws EmptyQueueException {
		Stack<E> auxStack = new Stack<>(); 

		if (isEmpty()) {
			throw new EmptyQueueException();
		 }
		    
		    int size = colaStack.size(); 
		    
		  
		    for (int i = 0; i < size - 1; i++) {
		        auxStack.push(colaStack.pop());
		    }
		    
		    E res = colaStack.pop(); 
		    for (int i = 0; i < size - 1; i++) {
		        colaStack.push(auxStack.pop());
		    }
		    return res;
	}
	
}
