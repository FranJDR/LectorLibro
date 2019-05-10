package modelo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Libro {

	private FileReader libro = null;
	private String ruta;
	private int marca;
	private int marcaAux;

	public Libro(String ruta) {
		super();
		this.ruta = ruta;
		if (getValidarLibro(this.ruta)) {
			libro = getAbrirLibro(new File(this.ruta));
		}
	}

	public void getMarcarPagina() {
		this.marca = this.marcaAux;
		System.out.println("Marca : " + marca);
	}

	public String getCaracter() throws IOException {
		this.marcaAux = libro.read();
		System.out.println("lectura " + libro.read());
		return String.valueOf((char) libro.read());
	}

	private boolean getValidarLibro(String ruta2) {
		File file = new File(ruta2);
		return file.exists() && file.canRead();
	}

	private FileReader getAbrirLibro(File ruta2) {
		assert ruta2.exists() && ruta2.canRead();
		try {
			return new FileReader(ruta2);
		} catch (FileNotFoundException e) {
			return null;
		}
	}

}
