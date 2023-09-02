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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void enqueue(E element) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public E dequeue() throws EmptyQueueException {
		// TODO Auto-generated method stub
		return null;
	}
	
}
