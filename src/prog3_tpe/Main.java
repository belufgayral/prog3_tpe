package prog3_tpe;

import java.io.File;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		
		File file = new File("/prog3_tpe/src/prog3_tpe/csv/tareas.csv");
		System.out.println("Ruta de: " +file.getCanonicalFile());
        
		Servicios service = new Servicios("", "C:\\prog3_tpe\\src\\prog3_tpe\\csv\\tareas.csv");
		
	}

}
