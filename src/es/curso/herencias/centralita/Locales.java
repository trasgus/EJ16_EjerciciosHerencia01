package es.curso.herencias.centralita;

public class Locales extends Centralita{

	private static final double COSTE=0.05;

	public Locales() {  //constructor vacio desde la SuperClase
		super();
		
	}

	public Locales(double numLlamadas) {
		super(numLlamadas);
	
	}

	@Override
	public String toString() {
		return "Local =" +super.getNumLlamadas()* COSTE  ;
	}
	
	
	

	
	

	
	
	

}
