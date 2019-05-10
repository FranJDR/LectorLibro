package modelo;

import java.io.IOException;

import javax.swing.JTextArea;

public class Mostrador {

	private Libro libro;

	public Mostrador(String ruta) {
		super();
		this.libro = new Libro(ruta);
	}

	public void getMarcarPagina() {
		this.libro.getMarcarPagina();
	}

	public void getMostrarPagina(JTextArea textArea) {
		StringBuilder cadena = new StringBuilder();
		double height2 = 18;
		boolean salir = false;
		do {
			try {
				cadena.append(libro.getCaracter());
				textArea.setText(cadena.toString());
			} catch (IOException e) {
				salir = true;
			}
		} while (textArea.getPreferredSize().getHeight() + height2 <= textArea.getHeight() && !salir);
	}

}
