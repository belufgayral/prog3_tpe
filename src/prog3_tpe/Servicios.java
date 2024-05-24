package prog3_tpe;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

public class Servicios {
	private HashMap<String, Tarea> tareas;
	
	//   /prog3_tpe/src/prog3_tpe/csv/procesadores.csv
	//   /prog3_tpe/src/prog3_tpe/csv/tareas.csv
	public Servicios(String pathProcesadores, String pathTareas) {
		tareas = new HashMap<>();
		cargaDatosTareas(pathTareas);
		//cargaDatosProcesadores(pathProcesadores);
	}
	
	//Expresar la complejidad temporal del servicio 1.
	public Tarea servicio1(String ID) {
		return null;
	}
	
	//Expresar la complejidad temporal del servicio 2.
	public List<Tarea> servicio2(boolean esCritica) {
		return null;
	}
	
	//Expresar la complejidad temporal del servicio 3.
	public List<Tarea> servicio3(int prioridadInferior, int prioridadSuperior) {
		return null;
	}
	
	private void cargaDatosTareas(String pathTareas) {
		try {
			CSVReader csvReader = new CSVReader(new FileReader(pathTareas));
		
			for(String[] nextLine : csvReader) {
		        // nextLine[] is an array of values from the line
		        System.out.println(nextLine[0] + nextLine[1]);
		     }
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	private void cargaDatosProcesadores(String pathProcesadores) {
		
	}
}
