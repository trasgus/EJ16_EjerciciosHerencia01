package es.curso.herencias.centralita;

import java.util.ArrayList;

public class Principal {
	
	/*
	  EJERCIO- CENTRALITA DE LLAMADAS - Desarrollar una Centralita
	  telefónica en la cual se van registrando llamadas. Registrar una
	  llamada consiste en contabilizar el número de llamadas realizadas así
	  como el coste total de todas las llamadas realizadas. Las llamadas se
	  irán mostrando por pantalla según se vayan registrando. Existen dos
	  tipos de llamadas: las locales que cuestan 5 céntimos el segundo y
	  las provinciales, que dependiendo de la franja horaria cuestan por
	  segundo: 8 céntimos en la franja 1, 12 céntimos en la franja 2 y 16
	  céntimos en la franja 3. Los datos de cada llamada son: el número de
	  origen de la llamada, el número de destino y su duración en segundos.
	  Crear una centralita, que registre llamadas de distintos tipos. Para
	  esto cree una clase con método main en dicho método crear un objeto
	  tipo Centralita y varias llamadas Locales y Provinciales. Agregar las
	  a la centralita. Para poder agregar las llamadas a la centralita, la
	  clase Centralita debe tener un método para agregar una llamada. Por
	  lo tanto la Centralita debe tener internamente una estructura de
	  datos que permita agregar varias llamadas ya sean locales o
	  provinciales.
	  CREAR EL DIAGRAMA UML para el ejercicio de la Centralita. Con ArgoUML o Intreprise Arquitect.
	 */

	public static void main(String[] args) {
		
		Locales l0 = new Locales(4);
		Locales l1 = new Locales(5);
		
		Provinciales p0 = new Provinciales(4,0.04,2);
		Provinciales p1 = new Provinciales(5,0.04,1);
		
		ArrayList<Locales> arrayLocales= new ArrayList<Locales>();
		ArrayList<Provinciales> arrayProvinciales= new ArrayList<Provinciales>();
		
		arrayLocales.add(l1);
		arrayProvinciales.add(p1);
		
		
		Centralita c = new Centralita(4,0.04,arrayLocales,arrayProvinciales);
		                           //(numero de llamada, coste llamada,
		
		c.toString();
		
	
	
		


	}

}
