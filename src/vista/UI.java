package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class UI extends JFrame {

	private JPanel contentPane;

	private JTextArea textArea;

	private JTextField textRuta;

	private JButton btnAvanzar;
	private JButton btnRetroceder;
	private JButton btnMarcarPagina;
	private JButton btnCargar;
	private JButton btnNuevoLibro;

	private ImageIcon imgAvanzar = ajustarImagen("./img/flechaDer.png", 100, 40);
	private ImageIcon imgRetroceder = ajustarImagen("./img/flechaIzq.png", 100, 40);

	public UI() {
		setTitle("Lector Libros");
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 577, 828);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.DARK_GRAY));
		setContentPane(contentPane);
		setLocationRelativeTo(null);
		setResizable(false);

		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(64, 64, 64)));

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);

		textRuta = new JTextField();
		textRuta.setHorizontalAlignment(SwingConstants.CENTER);
		textRuta.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)));
		textRuta.setFont(new Font("Monospaced", Font.BOLD, 15));
		textRuta.setColumns(10);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(gl_contentPane
				.createParallelGroup(
						Alignment.LEADING)
				.addGroup(
						gl_contentPane.createSequentialGroup().addContainerGap()
								.addGroup(
										gl_contentPane.createParallelGroup(Alignment.LEADING)
												.addGroup(gl_contentPane.createSequentialGroup()
														.addComponent(panel, GroupLayout.DEFAULT_SIZE,
																GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
														.addGap(11))
												.addGroup(gl_contentPane.createSequentialGroup()
														.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 551,
																Short.MAX_VALUE)
														.addContainerGap())
												.addGroup(gl_contentPane.createSequentialGroup()
														.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, 551,
																Short.MAX_VALUE)
														.addContainerGap())))
				.addGroup(gl_contentPane.createSequentialGroup().addContainerGap().addComponent(textRuta)
						.addContainerGap()));
		gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup().addContainerGap()
						.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(textRuta, GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE).addGap(10)
						.addComponent(panel, GroupLayout.DEFAULT_SIZE, 644, Short.MAX_VALUE).addGap(10)
						.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE).addGap(20)));
		panel_2.setLayout(new GridLayout(1, 0, 0, 0));

		btnCargar = new JButton("Cargar");
		btnCargar.setBackground(Color.CYAN);
		btnCargar.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)));
		btnCargar.setFont(new Font("Monospaced", Font.BOLD, 20));
		btnCargar.setDefaultCapable(false);
		btnCargar.setRequestFocusEnabled(false);
		panel_2.add(btnCargar);

		btnNuevoLibro = new JButton("Nuevo Libro");
		btnNuevoLibro.setFont(new Font("Monospaced", Font.BOLD, 20));
		btnNuevoLibro.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)));
		btnNuevoLibro.setBackground(Color.CYAN);
		btnNuevoLibro.setRequestFocusEnabled(false);
		panel_2.add(btnNuevoLibro);
		panel_1.setLayout(new GridLayout(1, 0, 20, 20));

		btnRetroceder = new JButton("");
		btnRetroceder.setRequestFocusEnabled(false);
		btnRetroceder.setBackground(Color.WHITE);
		btnRetroceder.setOpaque(false);
		btnRetroceder.setDefaultCapable(false);
		btnRetroceder.setIcon(imgRetroceder);
		btnRetroceder.setBorder(null);
		panel_1.add(btnRetroceder);

		btnMarcarPagina = new JButton("Marcar Pagina");
		btnMarcarPagina.setRequestFocusEnabled(false);
		btnMarcarPagina.setFont(new Font("Monospaced", Font.BOLD, 20));
		panel_1.add(btnMarcarPagina);
		btnMarcarPagina.setBorder(null);
		btnMarcarPagina.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.DARK_GRAY));
		btnMarcarPagina.setBackground(Color.cyan);

		btnAvanzar = new JButton("");
		btnAvanzar.setRequestFocusEnabled(false);
		btnAvanzar.setBackground(Color.WHITE);
		btnAvanzar.setOpaque(false);
		btnAvanzar.setIcon(imgAvanzar);
		btnAvanzar.setBorder(null);
		panel_1.add(btnAvanzar);

		panel.setLayout(new BorderLayout(0, 0));

		textArea = new JTextArea();
		textArea.setFocusable(false);
		textArea.setWrapStyleWord(true);
		textArea.setForeground(Color.WHITE);
		textArea.setBackground(Color.DARK_GRAY);
		textArea.setFont(new Font("Monospaced", Font.BOLD, 18));
		textArea.setLineWrap(true);
		panel.add(textArea, BorderLayout.CENTER);

		contentPane.setLayout(gl_contentPane);
		getContentPane().repaint();

	}

	public void actualizarJTextArea(String cadena) {
		this.getTextArea().setText(cadena);
	}

	private ImageIcon ajustarImagen(String url, int width, int height) {
		ImageIcon img = new ImageIcon(url);
		Image a = img.getImage();
		Image imgReescalada = a.getScaledInstance(width, height, Image.SCALE_SMOOTH);
		ImageIcon imgAjustada = new ImageIcon(imgReescalada);
		return imgAjustada;
	}

	public JPanel getContentPane() {
		return contentPane;
	}

	public JTextArea getTextArea() {
		return textArea;
	}

	public JButton getBtnAvanzar() {
		return btnAvanzar;
	}

	public JButton getBtnRetroceder() {
		return btnRetroceder;
	}

	public JTextField getTextRuta() {
		return textRuta;
	}

	public JButton getBtnMarcarPagina() {
		return btnMarcarPagina;
	}

	public JButton getBtnCargar() {
		return btnCargar;
	}

	public JButton getBtnNuevoLibro() {
		return btnNuevoLibro;
	}

}
