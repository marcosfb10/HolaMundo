
class Test {
	public static char getLetras() { //metodo para declarar variables
		return (char) (Math.random()*26 + 'a'); //26 es el rango y 'a' convierte los caracteres a letras
}
	public static void main(String[] args) { // metodo principal
		System.out.println(getLetras()); //Muestra los valores obtenidos
		System.out.println(getLetras());
		System.out.println(getLetras());
		System.out.println(getLetras());
		System.out.println(getLetras());
	}

}
