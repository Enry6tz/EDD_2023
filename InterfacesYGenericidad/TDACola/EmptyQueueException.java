package TDACola;

@SuppressWarnings("serial")
public class EmptyQueueException extends Exception {
	public EmptyQueueException() {
	        super("La cola está vacía.");
	    }
	
}
