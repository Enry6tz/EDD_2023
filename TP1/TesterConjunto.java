package Ejercicio1;

public class TesterConjunto {
    public static void main(String[] args) {
        // Crear conjuntos de números enteros
        ConjuntoArreglo<Integer> conjNumA = new ConjuntoArreglo<Integer>(10);
        //estas dos formas son igual de validas desde java 7
        ConjuntoArreglo<Integer> conjNumB = new ConjuntoArreglo<>(10);

        // Crear conjuntos de Strings
        ConjuntoArreglo<String> conjStrA = new ConjuntoArreglo<>(10);
        ConjuntoArreglo<String> conjStrB = new ConjuntoArreglo<>(10);

        // Crear conjuntos de personas
        ConjuntoArreglo<Persona> conjPersonaA = new ConjuntoArreglo<>(10);
        ConjuntoArreglo<Persona> conjPersonaB = new ConjuntoArreglo<>(10);
				
        Persona persona1 = new Persona("asasd", 25);
        Persona persona2 = new Persona("qweqwe", 30);

        conjPersonaA.put(persona1);
        conjPersonaA.put(persona2);
	
        
			
			
		
	}
	
}
