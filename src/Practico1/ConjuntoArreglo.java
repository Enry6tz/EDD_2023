package Ejercicio1;

//ConjuntoArreglo<E> con esto empezamos a usar la genericidad parametrica.
//public class ConjuntoArreglo<E ,F> implements Conjunto<E> otroConjunto<F> {....}
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
				if(elements[i] == null) {
					elements[i] = elem;
					res = false;
					}
				}
			
	@Override
	public boolean pertenece(E elem) {
		boolean res = false;
			for(int i=0; i< elements.length && res; i++) 
				if(elements[i].equals(elem)) 
					res = true;
				return res;}
	/*
	CR: e pertenece a A si e es igual al ultimo elemento de A o si e pertenece a A'.

	donde A' es A sin el ultimo elemento.
	CB: si A' no tiene elementos entonces e no pertenece a A*/

	public boolean perteneceRecursivo(E e){
	    return perteneceRec(e, elements.length);
	}
	//metodo privado perteneceRec(e, A.length)

	private boolean perteneceRec(E e, int n){
	    boolean res ;
	    if(n == 0){
	        res= false;
	    }else{
	    	if (elements[n-1] != null)
	        res = elements[n-1].equals(e) ||perteneceRec(e, n-1);
	    	else {
	    		res = perteneceRec(e, n-1);
	    	}
	    }
	    return res;
	}

	@Override
	public Conjunto<E> interseccion(Conjunto<E> otroConjunto) {
		int dim=0;
		boolean encontro= false;
		for(int i=0; i<elements.length; i++ ) {//this
			encontro= false;
			for(int j=0;j<otroConjunto.capacity() && !encontro;j++ ) { //conj
				if(elements[i] !=null && otroConjunto.get(j)!= null && elements[i].equals(otroConjunto.get(j))) {
					dim++;
					encontro= true;}
			}
		}
		Conjunto<E> nuevoConjunto = new ConjuntoArreglo<E>(dim);
		
		for(int i=0; i<elements.length; i++ ) {//this
			encontro= false;
			for(int j=0;j<otroConjunto.capacity() && !encontro;j++ ) //conj
				if(elements[i] !=null && otroConjunto.get(j)!= null && elements[i].equals(otroConjunto.get(j))) {
					nuevoConjunto.put(elements[i]); // el encotro se supone que es requerimiento para que se pueda agregar
				}
		}				
		return nuevoConjunto;
	}
	@Override
	public String toString() {
	    StringBuilder sb = new StringBuilder();
	    sb.append("[");
	    
	    for (int i = 0; i < capacity(); i++) {
	        if (i > 0) {
	            sb.append(", ");
	        }
	        
	        E element = get(i);
	        if (element != null) {
	            sb.append(element.toString());
	        } else {
	            sb.append("null");
	        }
	    }
	    
	    sb.append("]");
	    return sb.toString();
	}


	public void delete(int i) {
		if (i<= elements.length) {
			elements[i] =null;
		}
	}


}
