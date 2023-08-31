
public interface Conjunto<E> {
	public int size(); 
	public int capacity(); 
	public boolean isEmpty(); 
	public E get(int i); // 
	public void put(E elem); 
	public boolean pertenece(E elem);
<<<<<<< HEAD:src/Practico1/Conjunto.java
	Conjunto<E> interseccion(Conjunto<E> otroConjunto);
	public void delete(int i);
	public String toString();
	public boolean perteneceRecursivo(E e);
=======
	Conjunto<E> intersección(Conjunto<E> otroConjunto);
	
>>>>>>> 2392925f27314fc5f45fdef3033597a63aafd760:TP1/Conjunto.java
}
