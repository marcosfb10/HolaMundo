import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		int euros=0;
		Scanner reader= new Scanner(System.in);
		System.out.println("introduce la cantidad que desea cambiar:\n");
		euros= reader.nextInt();
		System.out.print("El cambio en billetes es:\n\n ");
		System.out.print(euros/500 +" billetes de 500 euros\n\n ");
		euros=euros%500;
		System.out.print(euros/200 +" billetes de 200 euros\n\n ");
		euros=euros%200;
		System.out.print(euros/100 +" billetes de 100 euros\n\n ");
		euros=euros%100;
		System.out.print(euros/50 +" billetes de 50 euros\n\n ");
		euros=euros%50;
		System.out.print(euros/20 +" billetes de 20 euros\n\n ");
		euros=euros%20;
		System.out.print(euros/10 +" billetes de 10 euros\n\n ");
		euros=euros%10;
		System.out.print(euros/5 +" billetes de 5 euros\n\n ");
		euros=euros%5;
		System.out.print(euros/2 +" monedas de 2 euro\n\n ");
		euros=euros%2;
		System.out.print(euros/1 +" monedas de 1 euro\n\n ");
		euros=euros%1;
	}

}
