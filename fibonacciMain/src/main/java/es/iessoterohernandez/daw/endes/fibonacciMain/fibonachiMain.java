package es.iessoterohernandez.daw.endes.fibonacciMain;

import java.util.Scanner;
import es.iessoterohernandez.daw.endes.fibonacci.fibonacci;
/**
 * Hello world!
 *
 */
public class fibonachiMain 
{
	  public static void main(String[] args) {
	        fibonacci fc = new fibonacci();
		
	        Scanner scanner = new Scanner(System.in);
	     
	        System.out.print("Introduce el número hasta el cual calcular la sucesión de Fibonacci: ");
	        int n = scanner.nextInt();  
	        
	        System.out.println("La sucesión de Fibonacci hasta el " + n + "-ésimo número es:");
	        
	        for (int i = 0; i < n; i++) {
	            System.out.print(fc.fibonacci(i) + " ");
	        }
	    }
}
