
public class Ejercicio11 {

	public static void main(String[] args) {
		int t=5526584;
		System.out.println(t + " segundos son iguales a: ");
		System.out.print("->");
		System.out.print(t/3600 +" horas, ");
		t=t%3600;
		System.out.print(t/60 + " minutos, ");
		t=t%60;
		System.out.print(t+ " segundos.");
	}

}
