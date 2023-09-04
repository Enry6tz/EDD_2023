package TDAPila;

@SuppressWarnings("serial")
public class EmptyStackException extends Exception {
    public EmptyStackException() {
        super("La pila está vacía.");
    }
}
