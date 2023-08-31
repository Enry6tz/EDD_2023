
import java.util.ArrayList;
//ConjuntoArreglo<E> con esto empezamos a usar la genericidad parametrica.
//EXPLICACION CLASE 24/8
//dos parametros genericos
//public class ConjuntoArreglo<E ,F> implements Conjunto<E> otroConjunto<F> {....}


public class ConjuntoArregloAL<E> implements Conjunto<E> {
	
	protected ArrayList<E> elementos;
	
	//
	public ConjuntoArregloAL() {
		this.elementos = new ArrayList<>();
	}
	
	public ConjuntoArregloAL(int capacidad) {
		this.elementos = new ArrayList<>(capacidad);
	}
	
	
	//ejemplo en clase 24/8
	
	/*
	public void add(E elementos) {
		this.elementos.add(elementos);
	}
*/


    @Override
    public int size() {
      return 1;
    }

	@Override
	public int capacity() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public E get(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void put(E elem) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean pertenece(E elem) {
		//bucle, recorrer el arreglo y preguntar si son iguales 	
		return this.elementos.contains(elem);

	}

	@Override
	public Conjunto<E> intersección(Conjunto<E> otroConjunto) {
		// TODO Auto-generated method stub
		return null;
	}

	public Object[] getElementos() {
		return new Object[1];
	}

	


}
