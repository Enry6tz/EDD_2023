
public class ConjuntoArreglo<E> implements Conjunto<E> {
	
	//constuctor sin array list
	protected E [] elements;
	
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
		for(int i=0; i< elements.length && res; i++) {
			if(elements[i] == null) { 
				elements[i] = elem;
				res = false;
			}
		}
	}
			
	@Override
	public boolean pertenece(E elem) {
		boolean res = false;
			for(int i=0; i< elements.length && res; i++) {
				if(elements[i].equals(elem)) {
					res = true;
				}
			}
		return res;		
	}

	

	@Override
	public Conjunto<E> intersección(Conjunto<E> otroConjunto) {
	    int dim = 0;
	    boolean encontro;
	    // armar la dimension del arreglo (inecesario si usamos ArrayList<E> )
	    for (int i = 0; i < elements.length; i++) {
	        encontro = false;
	        if (elements[i] != null) {
	            for (int j = 0; j < otroConjunto.capacity() && !encontro; j++) {
	                if (otroConjunto.get(j) != null && elements[i].equals(otroConjunto.get(j))) {
	                    dim++;
	                    encontro = true;
	                }
	            }
	        }
	    }

	    Conjunto<E> nuevoConjunto = new ConjuntoArreglo<>(dim);

	    for (int i = 0; i < elements.length; i++) {
	        encontro = false;
	        if (elements[i] != null) {
	            for (int j = 0; j < otroConjunto.capacity() && !encontro; j++) {
	                if (otroConjunto.get(j) != null && elements[i].equals(otroConjunto.get(j))) {
	                    nuevoConjunto.put(elements[i]);
	                    encontro = true;
	                }
	            }
	        }
	    }
	    return nuevoConjunto;
	}

	
	
}
