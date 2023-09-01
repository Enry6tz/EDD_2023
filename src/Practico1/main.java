
public class main {
	public static void main (String[] args) {
		
		//declaracion de variables
		//Array 
		Conjunto<Integer> arregloNumerico1 =  new ConjuntoArreglo<>(10);
		Conjunto<Integer> arregloNumerico2 =  new ConjuntoArreglo<>(10);
		Conjunto<Persona> arregloPersona1 =  new ConjuntoArreglo<>(10);
		Conjunto<Persona> arregloPersona2 =  new ConjuntoArreglo<>(10);
		
		//ArrayList
		Conjunto<Float> arregloFloat1 =  new ConjuntoArregloAL<>(5);

		
		
		System.out.println("Verificacion de la intancia arreglo A");
		System.out.println(arregloNumerico1.toString());
		System.out.println(arregloNumerico1.size());
		System.out.println(arregloNumerico1.capacity());
		
		
		System.out.println("Verificacion de la intancia arreglo B");
		System.out.println(arregloNumerico2.toString());
		System.out.println(arregloNumerico2.size());
		System.out.println(arregloNumerico2.capacity());
		
		System.out.println("prueba de metodos put, delete e interseccion"); 
		//requiere que no este el valor dos veces en el mismo conjunto     
	        try {
	        	arregloNumerico1.put(1);
	        	arregloNumerico1.put(2);
	        	arregloNumerico1.put(3);
	        	arregloNumerico1.put(4);
	        	arregloNumerico1.put(5);
	        	arregloNumerico1.put(6);
	    		arregloNumerico1.delete(2);// espera la posicion
	        	arregloNumerico1.put(7);
	        	System.out.println("arreglo A: "+ arregloNumerico1.toString());
	        	
	        	arregloNumerico2.put(2);
	        	arregloNumerico2.put(3);
	        	arregloNumerico2.put(4);
	        	arregloNumerico2.delete(2);
	        	arregloNumerico2.put(5);
	        	System.out.println("arreglo B: "+ arregloNumerico2.toString());
	        	
	        
	        	Conjunto<Integer>nuevoArr = arregloNumerico2.interseccion(arregloNumerico1);
	        	System.out.println("interseccion de A y B: "+ nuevoArr.toString());

	        	}
	        catch (Exception e) {
	            System.out.println("Ocurrió una excepción: " + e.getMessage());
	        }
	        
	    // interseccion arreglo persona
	        Persona a= new Persona("A", "B");
	        Persona b= new Persona("C", "D");
	        arregloPersona1.put(a);
	        arregloPersona2.put(a);
	        arregloPersona2.put(a);
	        try {
	        	System.out.println("interseccion personas: "+ arregloPersona1.interseccion(arregloPersona2));
	        	}
	        
	        catch (Exception e) {
	            System.out.println("Ocurrió una excepción: " + e.getMessage());
	        }
	   
	        
	   // prueba interseccion usando recursividad
	        try {
	        	System.out.println("interseccion personas(esperado:true): "+ arregloPersona1.perteneceRecursivo(a));
	        	}
	        catch (Exception e) {
	            System.out.println("Ocurrió una excepción: " + e.getMessage());
	        }
	        try {
	        	System.out.println("interseccion personas(esperado:false): "+ arregloPersona1.perteneceRecursivo(b));
	        	}
	        catch (Exception e) {
	            System.out.println("Ocurrió una excepción: " + e.getMessage());
	        }
	        try {
	        	System.out.println("interseccion personas: "+ arregloPersona1.perteneceRecursivo(arregloPersona2.get(11)));
	        	}
	        catch(ArrayIndexOutOfBoundsException e) {
	        	System.out.println("fuera de rango");
	        }
	        catch (Exception e) {
	            e.printStackTrace();
	        }
	        
	        
	    //tester clase usando arrayList
	    
	    arregloFloat1.put(1f);
	    arregloFloat1.put(1f);
	    arregloFloat1.put(1f); 
	    arregloFloat1.put(0f); 
	    arregloFloat1.put(3.2f); 
	    arregloFloat1.put(55.3f);
	    
		System.out.println("Verificacion de la intancia arrayList");
		System.out.println(arregloFloat1.toString());
		System.out.println(arregloFloat1.size());
		System.out.println(arregloFloat1.capacity());
		
		arregloFloat1.delete(0);
		arregloFloat1.delete(1);
		arregloFloat1.delete(2);
		System.out.println("arrayList despues de eliminar las primeras 3 componentes");
		System.out.println(arregloFloat1.toString());
		System.out.println(arregloFloat1.size());
		System.out.println(arregloFloat1.capacity());
		
		try {
			System.out.println(arregloFloat1.pertenece(0f));
		}
	     catch (Exception e) {
	            System.out.println("Ocurrió una excepción: " + e.getMessage());
	     }
	}

	private static void printStackTrace() {
		// TODO Auto-generated method stub
		
	}
	
}