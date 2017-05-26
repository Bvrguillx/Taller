package models;

public class Cliente {
	
	protected String nombre;
	protected int cp;
	protected String apellido;
	protected String dni;
	protected int telefono;
	
	public Cliente(String nombre, int cp, String apellido, String dni, int telefono) {

		this.nombre = nombre;
		this.cp = cp;
		this.apellido = apellido;
		this.dni = dni;
		this.telefono = telefono;
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCp() {
		return cp;
	}

	public void setCp(int cp) {
		this.cp = cp;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	
	
	
}
