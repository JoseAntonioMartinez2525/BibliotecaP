
public class Persona {
	
	//Atributos
	private String nombres;
	private String nacionalidad;
	private String genero;
	private int edad;
	
	//Constructores
	
	public Persona() {
		nombres="";
	}

	public Persona(String nombres, String nacionalidad, String genero, int edad) {
		
		this.nombres = nombres;
		this.nacionalidad = nacionalidad;
		this.genero = genero;
		this.edad = edad;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	
	public String toString() {
		System.out.println("Información del autor: ");
		return "\nAutor:" + nombres + "\nnacionalidad=" + nacionalidad + "\ngenero=" + genero + "\nedad="
				+ edad ;
	}
	
	
}
