
public class EjercicioTema8 {
	
	public static void main(String[] args){
		
		Persona persona = new Persona();
		persona.setEdad(42);
		persona.setNombre("Rodrigo");
		persona.setTelefono(676365377);
		System.out.println("Edad: " + persona.getEdad());
		System.out.println("Nombre: " + persona.getNombre());
		System.out.println("Telefono: " + persona.getTelefono());
	
	}

	
}
class Persona{
	private int edad;
	private String nombre;
	private int telefono;
	
	public void setEdad(int edad) {
		this.edad=edad;
	}
	public int getEdad() {
		return this.edad;
	}
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	public String getNombre() {
		return this.nombre;
	}
	
	public void setTelefono(int telefono) {
		this.telefono=telefono;
	}
	public int getTelefono() {
		return this.telefono;
	}
	
}

	

