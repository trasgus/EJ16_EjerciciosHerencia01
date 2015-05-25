package es.curso.herencias.centralita;

import java.util.ArrayList;

public class Provinciales extends Centralita {
	
	private int franja;

	public Provinciales() {   //constructor vacio
		super();
	}


	public Provinciales(double numLlamadas, double coste,int franja) {
		super(numLlamadas, coste);
		this.franja = franja;
		
	}

	



	public Provinciales(double numLlamadas, double coste,
			ArrayList<Locales> listaLocales,
			ArrayList<Provinciales> listaProvincial) {
		super(numLlamadas, coste, listaLocales, listaProvincial);
		
	}







	public Provinciales(double numLlamadas) {
		super(numLlamadas);

	}



	public int getFranja() {    //getters and setters
		return franja;
	}

	public void setFranja(int franja) {
		this.franja = franja;
	}
   
//	public int getNumLlamadas(){
//		return super.getNumLlamadas();
//	}

	@Override
	public String toString() {
		return "Provincial  "+ super.getNumLlamadas()*calcularCoste(); 
	}

	public double calcularCoste(){
		double resultado = 0;
		if(getFranja()==1)
			resultado= 0.08;
		if(getFranja()==2)
			resultado= 0.12;
		if(getFranja()==3)
			resultado= 0.16;
		return resultado;
	}
	
	

}
