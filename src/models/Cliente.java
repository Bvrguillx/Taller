package models;

public class Cliente {
	
	protected String nombre;
	protected int cp;
	protected String apellido;
	protected String dni;
	protected float telefono;
	
	public Cliente(String nombre, int cp, String apellido, String dni, float telefono) {

		this.nombre = nombre;
		this.cp = cp;
		this.apellido = apellido;
		this.dni = dni;
		this.telefono = telefono;
		
	}
	
	
	
}
