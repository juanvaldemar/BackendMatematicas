package com.daniel.AppMatematicas;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class AppMatematicasApplication  implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(AppMatematicasApplication.class, args);
	}
/*
	Por lo tanto ArrayList :
	usa internamente un arreglo dinámico para almacenar los elementos.
	proporciona una manipulación lenta
	es la mejor opción para almacenar y acceder a datos o elementos consecutivos.

	Por lo tanto LinkedList:
	proporciona una manipulación más rápida porque utiliza una lista doblemente enlazada.
	se puede utilizar como lista y cola porque implementa interfaz de List, Deque y Queue.
	es mejor para manipulación de elementos, es decir, para insertar y eliminar elementos.
	Por lo tanto si necesitamos agregar elementos consecutivos y recorrerlos debemos utilizar ArrayList y si en cambio necesitamos insertar y eliminar valores no consecutivos debemos usar LinkedList.

	La respuesta va a depender de 2 puntos de vista:
	Primero: Preguntaría si a parte de almacenar, accederíamos a los datos para este caso usaría ArrayList
	ya que proporciona una manipulación lenta.
	Segundo: Preguntaría si requerimos una manipulación rápida referente a insertar y/o eliminar para este
	caso sería LinkedList.

	En resumen para este caso utilizaría LinkedList que es más rápido para insertar 100 000 registros
	que ArrayList.


	*/

	@Override
	public void run(String... args) throws Exception {
		String dictionary[] = {"Java", "Class", "Prueba"};
		String letters[] = {"A", "L", "P", "A", "B", "J", "V", "S", "R", "E", "U"};

		wordsPresent(dictionary,letters);
	}

	private void wordsPresent(String[] dictionary, String[] letters) {

		char temporalLetras[];
		int sizeLetter;
		List<String> palabrasCumplidas = new ArrayList<String>();

		for (int i = 0; i < dictionary.length; i ++) {
			sizeLetter = dictionary[i].length();
			temporalLetras = dictionary[i].toCharArray();

			System.out.println(letters.toString());
			int contador = 0;

			for(int j = 0; j < letters.length; j++){
				String comparador = String.valueOf(temporalLetras[i]);
				if(letters[j].equalsIgnoreCase(comparador)){
					contador++;
					if(contador == temporalLetras.length){
						palabrasCumplidas.add(dictionary[i]);
					}
				}
			}

		}
		System.out.println("palabrasCumplidas: "+palabrasCumplidas);

	}
}
