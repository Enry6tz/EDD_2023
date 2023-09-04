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
<<<<<<< HEAD:InterfacesYGenericidad/src/TDAPila/PilaConCola.java
		if(size()>1)
			for(int i=0; i<size()-1; i++) {//girando la cola y modificando su estado interno 
					pilaLinked.add(pilaLinked.poll());
			}
		E aux =  pilaLinked.peek();
		pilaLinked.add(pilaLinked.poll());
		return aux;
	}
	
	
=======
		girar();
		return pilaLinked.peek();
	}
	
	private void girar() {
		if(size()>0)
		for(int i=0; i<size()-1; i++) {//girando la cola y modificando su estado interno 
			pilaLinked.add(pilaLinked.poll());
		}
	}
>>>>>>> 68ffd3dbc4d8bb920914803a89b63a2abb1f06ec:InterfacesYGenericidad/TDAPila/PilaConCola.java
	
	@Override
	public void push(E element) {
		pilaLinked.add( element);
<<<<<<< HEAD:InterfacesYGenericidad/src/TDAPila/PilaConCola.java
		
=======
		girar();
>>>>>>> 68ffd3dbc4d8bb920914803a89b63a2abb1f06ec:InterfacesYGenericidad/TDAPila/PilaConCola.java
	}

	@Override
	public E pop() throws EmptyStackException {
		if (isEmpty()) {
	        throw new EmptyStackException();
	    }
<<<<<<< HEAD:InterfacesYGenericidad/src/TDAPila/PilaConCola.java
		if(size()>1)
			for(int i=0; i<size()-1; i++) {//girando la cola y modificando su estado interno 
						pilaLinked.add(pilaLinked.poll());
				}
			
			return  pilaLinked.poll();
=======
		return pilaLinked.poll();
>>>>>>> 68ffd3dbc4d8bb920914803a89b63a2abb1f06ec:InterfacesYGenericidad/TDAPila/PilaConCola.java
	}

}
