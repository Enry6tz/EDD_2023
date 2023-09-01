package Practico2;
//import java.util.EptyStackException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class main{
    public static void main(String[] args){
    	Persona a = new Persona("asd","asd");
    	Persona b = new Persona("asasdasdd","wew");
    	Persona[] arregloPersona = new Persona[2];
    	
    	arregloPersona[0]= a;
    	arregloPersona[1]=b;
    	
    	System.out.println("antes de cambiar");
    	System.out.println(arregloPersona[0].toString());
    	System.out.println(arregloPersona[1].toString());
    	invertir(arregloPersona);
    	System.out.println("despues de cambiar");
    	System.out.println(arregloPersona[0].toString());
    	System.out.println(arregloPersona[1].toString());
    	
    	
    	
    	
    	Queue<Integer> miQueue = new LinkedList<>();
    	miQueue.add(1);
    	miQueue.add(2);
    	miQueue.add(3);
    	miQueue.add(4);
    	
    	System.out.println(miQueue.size());

    	System.out.println(miQueue.peek());
    	
    	// 
    	Queue<Integer> nuevaColaImpares = colaImpares(miQueue);
    	System.out.println(nuevaColaImpares.size());

    	System.out.println(nuevaColaImpares.peek());
    	
    }
    	
    public static void invertir(Persona[] e) {
    	Stack<Persona> pilaAux = new Stack<>();
    	
    	for(int i= 0; i< e.length; i++) {
            Persona elem = e[i];
            pilaAux.push(elem);
            
            
        }
    	int cont =0;
    	while(!pilaAux.empty()) {
    		e[cont++] = pilaAux.pop();
        }  
    }
    public static Queue<Integer> colaImpares(Queue<Integer> miQueue) { 
    	Queue<Integer> aux = new LinkedList<>();
        while (!miQueue.isEmpty()) {
        	if(miQueue.peek()%2 != 0){
            	 aux.add(miQueue.poll());
        	}else {
        		miQueue.remove();
        	}
        }
        while (!aux.isEmpty()) {
        	miQueue.add(aux.poll());
        }
        return miQueue;
    }
    /*
    Implemente un método tal que reciba por parámetro dos pilas genéricas p1 y p2 y retorne una nueva pila producto
	de intercalar el contenido de las pilas p1 y p2. Tenga en cuenta que luego de ejecutarse este método ambas pilas
	quedarán vacías. Las pilas pueden tener distintos tamaños.
     */
    public static <E> Stack<E> pilasIntercaladas(Stack<E> p1, Stack<E> p2) { 
    	Stack<E> aux = new Stack<E>();
    	
        while (!p1.isEmpty() || !p2.isEmpty()) {
        	if(!p1.isEmpty()){
            	 aux.add(p1.pop());
        	}
        	if(!p2.isEmpty()){
        		aux.add(p2.pop());
       	}
        
        return aux;
    }
}