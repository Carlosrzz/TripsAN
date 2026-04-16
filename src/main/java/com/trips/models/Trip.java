package com.trips.models;
import java.util.Date;

public class Trip {
    private String nombre;
    private Date fecha;
    private double costo;
    private boolean vigente;

    public Trip(String nombre, Date fecha, double costo, boolean vigente) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.costo = costo;
        this.vigente = vigente;
    }

    // ¡ESTO ES LO QUE TE FALTA! Los Getters:
    public String getNombre() { return nombre; }
    public Date getFecha() { return fecha; }
    public double getCosto() { return costo; }
    public boolean isVigente() { return vigente; }

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public void setCosto(double costo) {
		this.costo = costo;
	}

	public void setVigente(boolean vigente) {
		this.vigente = vigente;
	}
}