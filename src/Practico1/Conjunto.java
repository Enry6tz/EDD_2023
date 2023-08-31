package Ejercicio1;

public interface Conjunto<E> {
	public int size(); 
	public int capacity(); 
	public boolean isEmpty(); 
	public E get(int i); // 
	public void put(E elem); 
	public boolean pertenece(E elem);
	Conjunto<E> interseccion(Conjunto<E> otroConjunto);
	public void delete(int i);
	public String toString();
	public boolean perteneceRecursivo(E e);
}
