package Ejercicio1;

public interface Conjunto<E> {
	public int size(); 
	public int capacity(); 
	public boolean isEmpty(); 
	public E get(int i); // 
	public void put(E elem); 
	public boolean pertenece(E elem);
	Conjunto<E> intersección(Conjunto<E> otroConjunto);
	
	//ejemplo en clase 24/8
	/*
	public void add(E elementos);*/
}
