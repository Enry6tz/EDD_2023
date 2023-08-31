package Ejercicio1;
import java.util.ArrayList;



public class ConjuntoArregloAL<E> implements Conjunto<E> {

    protected ArrayList<E> elementos;

    public ConjuntoArregloAL() {
        this.elementos = new ArrayList<>();
    }

    public ConjuntoArregloAL(int capacidad) {
        this.elementos = new ArrayList<>(capacidad);
    }

    @Override
    public int size() {
        return elementos.size(); // Usa el método size() de ArrayList
    }

    @Override
    public int capacity() {
        return elementos.size(); // En un ArrayList, la capacidad es igual al tamaño
    }

    @Override
    public boolean isEmpty() {
        return elementos.isEmpty(); // Usa el método isEmpty() de ArrayList
    }

    @Override
    public E get(int i) {
        return elementos.get(i); // Usa el método get() de ArrayList
    }

    @Override
    public void put(E elem) {
        elementos.add(elem); // Usa el método add() de ArrayList para agregar elementos
    }


			
    @Override
    public boolean pertenece(E elem) {
        for (int i = 0; i < elementos.size(); i++) {
            E elemento = elementos.get(i);		// usa el metodo get() para guardar el elemento de la poscion, despues compara por equivalencia.
            if (elemento != null && elemento.equals(elem)) {
                return true;
            }
        }
        return false;
    }
    public boolean perteneceRecursivo(E e){
	    return perteneceRec(e, elementos.size());
	}
	//metodo privado perteneceRec(e, A.length)

	private boolean perteneceRec(E e, int n){
	    boolean res ;
	    if(n == 0){
	        res= false;
	    }else{
	        res = elementos.get(n-1).equals(e) ||perteneceRec(e, n-1);
	    }
	    return res;
	}


	@Override
	public Conjunto<E> interseccion(Conjunto<E> otroConjunto) {
			boolean encontro= false;
		   Conjunto<E> nuevoConjunto = new ConjuntoArregloAL<>();

		    for (int i = 0; i < elementos.size(); i++) {
		    	encontro = false;
		    	for (int j = 0; j < otroConjunto.size() && !encontro; j++) {
		            if (elementos.get(i) != null && elementos.get(i).equals(otroConjunto.get(j))) {
		                nuevoConjunto.put(elementos.get(i));
		                encontro= true;
		                }
		        }
		    }

		    return nuevoConjunto;
		}
	public void delete(int i) {
	    if (i >= 0 && i < elementos.size()) {
	        elementos.remove(i);
	    }
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


}
	
	

