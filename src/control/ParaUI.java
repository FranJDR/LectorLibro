package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.util.ArrayList;

import modelo.Libro;
import modelo.Mostrador;
import vista.UI;

public class ParaUI extends UI {

	private Mostrador mostrador;

	public ParaUI() {
		super();
		this.mostrador = new Mostrador("./libros/juegotronos.txt");
		action();
	}

	private void action() {

		getTextArea().addFocusListener(new FocusAdapter() {
			public void focusGained(FocusEvent e) {
				mostrador.getMostrarPagina(getTextArea());
			}
		});

		getBtnCargar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});

		getBtnNuevoLibro().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostrador = new Mostrador(getTextRuta().getText());

			}
		});

		getBtnAvanzar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostrador.getMostrarPagina(getTextArea());
			}
		});

		getBtnRetroceder().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostrador.getMostrarPagina(getTextArea());
			}
		});

		getBtnMarcarPagina().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostrador.getMarcarPagina();
			}
		});
	}

}
