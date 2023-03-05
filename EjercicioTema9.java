
public class EjercicioTema9 {

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.edad=42;
		cliente.telefono=676365377;
		cliente.nombre="Rodrigo";
		cliente.credito=1000;
		System.out.println(cliente.nombre +" tiene "+ cliente.edad+" años, su telefono es "+cliente.telefono+" y su credito es de: "+ cliente.credito);
		

	}

}

class Persona{
	int edad;
	String nombre;
	int telefono;
	
}

class Cliente extends Persona{
	int credito;
	
}
class Trabajador extends Persona{
	private int salario;
	
}

