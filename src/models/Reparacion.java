package models;

import java.util.Date;

public class Reparacion {

	protected String responsable;
	protected String matricula;
	protected Date fechaEntrada;
	protected Date fechaSalida;	
	protected String listEstado;
	protected String presupuestoField;
	protected String comentariosArea;

	public Reparacion(String responsable, String matricula, Date fechaEntrada, Date fechaSalida, String listEstado,
			String presupuestoField, String comentariosArea) {
		this.responsable = responsable;
		this.matricula = matricula;
		this.fechaEntrada = fechaEntrada;
		this.fechaSalida = fechaSalida;
		this.listEstado = listEstado;
		this.presupuestoField = presupuestoField;
		this.comentariosArea = comentariosArea;
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

	public String getListEstado() {
		return listEstado;
	}

	public void setListEstado(String listEstado) {
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
	
}
