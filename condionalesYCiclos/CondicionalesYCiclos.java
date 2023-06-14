package condionalesYCiclos;

import java.util.Scanner;

public class CondicionalesYCiclos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * Condicionales
 * 
 * 
 * if
 * else
 * else  if
 * switch
 */
		
		
		System.out.println("Programa para calcular la hora");
		
		//Equivalente al prompt en JS se llama Scanner
		
		//var hora = propmt("mensaje");
		//Nenito = new Gatito (parámetros);
		//Java, crea un nuevo objeto Scanner, llámalo hora y este será un nuevo objeto de la clase Scanner, que tiene los argumentos para guardar la información que le pase como entrada
		
		Scanner valorIngresado = new Scanner(System.in); //Declaro un objeto y le paso info
		
		System.out.println("Por favor, ingresa una hora en un formato de 24 horas");
		
		//var valorIngresado = prompt("mensaje"); en una sola linea (declaro variable, asigno al prompt, y la info del prompt la guardo en esa variable.
		
		int hora = valorIngresado.nextInt(); //usar la información del objeto, recibe puros enteros
		
		
		if(hora >= 0 && hora <= 23) {//true, se metio una hora válida
			System.out.println("Hora ingresada correctamente");
			
			if(hora>=7 && hora<=11) {
				System.out.println("Buenos días solecito");
			}else if(hora>=12 && hora <= 18) {
				System.out.println("Buenas tardes, que calor hace");
			}else if(hora>18 && hora <= 23) {
				System.out.println("Buenas noches, a mimir");
			}else {
				System.out.println("Es de madrugada, no es bueno desvelarse");
			}
			
			
			
		} else {
			System.out.println("Hora mal ingresada");
		}
		
		valorIngresado.close();

	}

}
