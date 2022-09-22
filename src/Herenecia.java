
public class Herenecia {
	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.setEdad(31);
		cliente.setNombre("Ana Karen");
		cliente.setNumber("5543678543");
		cliente.setCredito(32456.345);
		
		System.out.println("Cliente:" + cliente.getNombre() + ", Edad:" + cliente.getEdad()  +  ", Número:" + 
							cliente.getNumber() + ", Crédito:" + cliente.getCredito());
		
		Trabajador trabajador = new Trabajador();
		trabajador.setEdad(25);
		trabajador.setNombre("Mauricio");
		trabajador.setNumber("5533987654");
		trabajador.setCredito(10000);
		trabajador.setSalario(12345.90);
		
		System.out.println("Trabajador:" + trabajador.getNombre() + ", Edad:" + trabajador.getEdad()  +  ", Número:" + 
				trabajador.getNumber() + ", Crédito:" + trabajador.getCredito() + ", Salario: " + trabajador.getSalario());
		
	}
}

class Persona {
	
	private int edad;
	private String nombre;
	private String number;
	
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	
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
	
	
}

class Cliente extends Persona {
	private double credito;

	public double getCredito() {
		return credito;
	}

	public void setCredito(double credito) {
		this.credito = credito;
	}
}

class Trabajador extends Cliente {
	double salario;

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
}


