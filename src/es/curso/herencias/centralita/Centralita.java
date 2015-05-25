package es.curso.herencias.centralita;

import java.util.ArrayList;

public class Centralita {
	
	private double numLlamadas;
	private double coste;
	
	private ArrayList<Locales> listaLocales;
	private ArrayList<Provinciales> listaProvinciales;
	
	
	public Centralita() {  //constructor vacio
		super();
	}
	public Centralita(double numLlamadas) {
		this.numLlamadas = numLlamadas;;

	}

	public double getNumLlamadas() {
		return numLlamadas;
	}
	public void setNumLlamadas(double numLlamadas) {
		this.numLlamadas = numLlamadas;
	}
	public double getCoste() {
		return coste;
	}
	public void setCoste(double coste) {
		this.coste = coste;
	}
	public ArrayList<Locales> getListaLocales() {
		return listaLocales;
	}
	public void setListaLocales(ArrayList<Locales> listaLocales) {
		this.listaLocales = listaLocales;
	}
	public ArrayList<Provinciales> getListaProvinciales() {
		return listaProvinciales;
	}
	public void setListaProvinciales(ArrayList<Provinciales> listaProvinciales) {
		this.listaProvinciales = listaProvinciales;
	}
	
	
	public Centralita(double numLlamadas, double coste,
			ArrayList<Locales> listaLocales,
			ArrayList<Provinciales> listaProvinciales) {
		super();
		this.numLlamadas = numLlamadas;
		this.coste = coste;
		this.listaLocales = listaLocales;
		this.listaProvinciales = listaProvinciales;
	}
	public Centralita(double numLlamadas, double coste) {
		super();
		this.numLlamadas = numLlamadas;
		this.coste = coste;
	}
	@Override
	public String toString() {
		return "Centralita [numLlamadas=" + numLlamadas + ", coste=" + coste
				+ ", listaLocales=" + listaLocales + ", listaProvinciales="
				+ listaProvinciales + "]";
	}
	



	
	
	
	
	
	
}
