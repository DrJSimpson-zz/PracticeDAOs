package edu.daos;

public class Sala implements Identifiable {

	private int id;
	private int cantButacas;
	private String nombre;
	
	public int getCantButacas() {
		return cantButacas;
	}

	public void setCantButacas(int cantButacas) {
		this.cantButacas = cantButacas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return id;
	}

}
