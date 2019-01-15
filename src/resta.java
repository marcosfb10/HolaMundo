import java.util.Scanner;

/**
 * 
 */

/**
 * @author Marcos
 *
 */

public class resta {
	public static void main (String[] args) {
		int s1= 10, s2= 20;
		Scanner reader= new Scanner(System.in);
		System.out.println("introduce el primer numero");
		s1= reader.nextInt();
		System.out.println("introduce el segundo numero");
		s2= reader.nextInt();
		System.out.println("EL RESULTADO DE LA RESTA DE " + s1 + " MENOS " + s2 + " ES: " + (s1-s2) +". " );
	}
}




