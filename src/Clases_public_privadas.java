
public class Clases_public_privadas {

	public static void main(String[] args) {
		
		Person persona = new Person();
		persona.setNombre("Ana Karen");
		persona.setEdad(31);
		persona.setTelefono("5567895432");
		
		System.out.println(persona.getNombre()  + ", " + persona.getEdad() + 
				             " años de edad" + " su numero telefonico es: " + persona.getTelefono());
		
	}

}

class Person{
	private int edad;
	private String nombre;
	private String telefono;
	
	
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	
}