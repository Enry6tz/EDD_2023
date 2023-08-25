package Ejercicio1;
import java.util.ArrayList;

public class ConjuntoArreglo<E> implements Conjunto<E> {
	
	//constuctor sin array list
	private E [] elements;
	
   @SuppressWarnings("unchecked")
   public ConjuntoArreglo(int dimension){
	   elements = (E[]) new Object[dimension];  
   }

    @Override
    public int size() {
    	int c=0;
    	for(int i=0; i<elements.length; i++) {
    		if(elements[i] != null )
    			c++;
    	}
    	return c;
    }

	@Override
	public int capacity() {
		return elements.length;
	}

	@Override
	public boolean isEmpty() {
		return size() == 0;
	}

	@Override
	public E get(int i) {
		return elements[i];
	}

	@Override
	public void put(E elem) {
		boolean res= true;

			for(int i=0; i< elements.length && res; i++) 
				if(elements[i] == null) 
					elements[i] = elem;
					res = false;
				}
			
	@Override
	public boolean pertenece(E elem) {
		boolean res = false;
			for(int i=0; i< elements.length && res; i++) 
				if(elements[i].equals(elem)) 
					res = true;
				return res;}

	

	@Override
	public Conjunto<E> intersección(Conjunto<E> otroConjunto) {
		int dim=0;
		boolean encontro= false;
		for(int i=0; i<elements.length; i++ ) {//this
			encontro= false;
			for(int j=0;j<otroConjunto.capacity() && !encontro;i++ ) { //conj
				if(elements[i].equals(otroConjunto.get(j)))
					dim++;
					encontro= true;
			}
		}
		Conjunto<E> nuevoConjunto = new ConjuntoArreglo<E>(dim);
		
		for(int i=0; i<elements.length; i++ ) {//this
			encontro= false;
			for(int j=0;j<otroConjunto.capacity() && !encontro;i++ ) //conj
				if(elements[i].equals(otroConjunto.get(j))) {
					nuevoConjunto.put(elements[i]); // el encotro se supone que es requerimiento para que se pueda agregar
					
				}
		}				
		return nuevoConjunto;
	}
	
	


}
