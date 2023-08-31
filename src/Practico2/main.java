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
    public static void colaImpares(LinkedList<Integer> e) {
    	
		Queue<Integer> aux = new LinkedList<>();
        while (!e.isEmpty() && e. %2 != 0 ){
            
            colaAuxiliar.add(elem);
        }

        while (!colaAuxiliar.isEmpty()){
            String elem = colaAuxiliar.remove();
            e.add(elem);
        }
   }
}