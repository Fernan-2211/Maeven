package es.iessoterohernandez.daw.endes.fibonacci;

public class fibonacci {
	
	public int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
   }
}
