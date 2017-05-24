import java.util.*; //Esto sirve para utilizar Scanner que esta dentro de ese paquete
public class Constructor {

	public static void main(String[] args) {
		Scanner entrada= new Scanner (System.in);
		//Creamos un objeto con el constructor Scanner para poder utilizar los metodos de la clase Scanner
		System.out.println("introduce tu nombre");
		String nombre=entrada.nextLine();
		//entrada es el objeto que permite utilizar los metodos de Scanner y nextLine() es un metodo de Scanner
		System.out.println("tu nombre es "+nombre);
	}

}
