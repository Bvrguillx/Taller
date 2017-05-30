package models;

public class Vehiculo {
	
	// ATRIBUTOS
	protected String matricula;
	protected int km;
	protected String marca;
	protected String modelo;
	protected String color;
	protected int potencia;
	protected String tipoVehiculo;
	protected String dniCliente;
	
	public Vehiculo(String dniCliente) {
		
		this.dniCliente = dniCliente;
		
	}

	public Vehiculo(String matricula, int km, String marca, String modelo, String color, int potencia,
			String tipoVehiculo, String dniCliente) {
		
		setMatricula(matricula);
		setKm(km);
		setMarca(marca);
		setModelo(modelo);
		setColor(color);
		setPotencia(potencia);
		setTipoVehiculo(tipoVehiculo);
		this.dniCliente = dniCliente;
		
	}


	public String getTipoVehiculo() {
		return tipoVehiculo;
	}

	public void setTipoVehiculo(String tipoVehiculo) {
		if (tipoVehiculo == null || tipoVehiculo.equals("")) throw new RuntimeException("Campo TipoVehiculo Vacio");
		this.tipoVehiculo = tipoVehiculo;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		
		if (matricula == null || matricula.equals("")) throw new RuntimeException("Campo Matricula Vacio");
		// ESTO TENEMOS QUE MIRARLO MA�ANA TRIBOGA
		// if (!comprobarString(matricula)) throw new RuntimeException("Matricula Introducida No Valida");
		
		this.matricula = matricula;
		
	}

	public int getKm() {
		return km;
	}

	public void setKm(int km) {
		
		if (km < 0) throw new RuntimeException("Los Kilometros NO pueden ser Negativos");
				
		this.km = km;
	}

	public String getMarca() { 
		return marca;
	}

	public void setMarca(String marca) {
		
		if (marca == null || marca.equals("")) throw new RuntimeException("Campo Marca Vacio");
		if (!comprobarString(marca)) throw new RuntimeException("Marca Introducida No Valida");
		
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		
		if (modelo == null || modelo.equals("")) throw new RuntimeException("Campo Modelo Vacio");
		if (!comprobarString(modelo)) throw new RuntimeException("Modelo Introducido No Valido");
		
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		
		if (color == null || color.equals("")) throw new RuntimeException("Campo Color Vacio");
		if (!comprobarString(color)) throw new RuntimeException("Color Introducido No Valido");
		
		this.color = color;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		
		if (potencia < 0) throw new RuntimeException("La Potencia NO puede ser Negativa");
		
		this.potencia = potencia;
	}

	public String getDniCliente() {
		return dniCliente;
	}

	public void setDniCliente(String dniCliente) {
		this.dniCliente = dniCliente;
	}
	
	private boolean comprobarString(String texto){
		boolean resultado = true;
		char cadena[] = texto.toCharArray();
		
		for(char i: cadena){
			if(!((i >= 'a' && i <= 'z')||(i >= 'A' && i <= 'Z' ))){
				resultado = false;
				break;
			}
		}
		
		return resultado;
	}

}
