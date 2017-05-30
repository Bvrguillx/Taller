package models;

import java.util.Date;

public class Reparacion {

	protected String responsable;
	protected String matricula;
	protected String dniDuenio;
	protected Date fechaEntrada;
	protected Date fechaSalida;
	protected int listEstado;
	protected String presupuestoField;
	protected String comentariosArea;
	protected String tipoVehiculo;

	public Reparacion(String responsable, String matricula, String dniDuenio, String tipoVehiculo) {
		this.responsable = responsable;
		this.matricula = matricula;
		this.dniDuenio = dniDuenio;
		this.tipoVehiculo= tipoVehiculo;
	}

	public Reparacion(String responsable, String matricula, String dniDuenio, String tipoVehiculo,Date fechaEntrada, Date fechaSalida,
			int listEstado, String presupuestoField, String comentariosArea) {
		this.responsable = responsable;
		this.matricula = matricula;
		this.dniDuenio = dniDuenio;
		this.fechaEntrada = fechaEntrada;
		this.fechaSalida = fechaSalida;
		this.listEstado = listEstado;
		this.presupuestoField = presupuestoField;
		this.comentariosArea = comentariosArea;
		this.tipoVehiculo= tipoVehiculo;
	}

	public String getResponsable() {
		return responsable;
	}

	public void setResponsable(String responsable) {
		this.responsable = responsable;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public Date getFechaEntrada() {
		return fechaEntrada;
	}

	public void setFechaEntrada(Date fechaEntrada) {
		this.fechaEntrada = fechaEntrada;
	}

	public Date getFechaSalida() {
		return fechaSalida;
	}

	public void setFechaSalida(Date fechaSalida) {
		this.fechaSalida = fechaSalida;
	}

	public int getListEstado() {
		return listEstado;
	}

	public void setListEstado(int listEstado) {
		this.listEstado = listEstado;
	}

	public String getPresupuestoField() {
		return presupuestoField;
	}

	public void setPresupuestoField(String presupuestoField) {
		this.presupuestoField = presupuestoField;
	}

	public String getComentariosArea() {
		return comentariosArea;
	}

	public void setComentariosArea(String comentariosArea) {
		this.comentariosArea = comentariosArea;
	}

	public String getDniDuenio() {
		return dniDuenio;
	}

	public void setDniDuenio(String dniDuenio) {
		this.dniDuenio = dniDuenio;
	}

	public String getTipoVehiculo() {
		return tipoVehiculo;
	}

	public void setTipoVehiculo(String tipoVehiculo) {
		this.tipoVehiculo = tipoVehiculo;
	}

}
