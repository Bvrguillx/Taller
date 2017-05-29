package ventanas;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import container.Listas;
import models.Vehiculo;

public class BuscarVehiculo {

	private JFrame frameBuscarMatricula;
	private JTextField textField;
	private JButton btnOk;
	private JButton btnBack;
	private JLabel lblMatricula;
	private JLabel lblIntroducirMatricula;
	private JButton btnNuevo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BuscarVehiculo window = new BuscarVehiculo();
					window.frameBuscarMatricula.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	// get BuscarMatricula
	public JFrame getFrameBuscarMatricula() {
		return frameBuscarMatricula;
	}

	/**
	 * Create the application.
	 */
	public BuscarVehiculo() {
		initialize();
		setEventos();
		setPropiedades();

	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		// frame
		frameBuscarMatricula = new JFrame();

		// label Titulo

		lblMatricula = new JLabel("Introduzca Matr\u00EDcula");

		// Label matricula
		lblIntroducirMatricula = new JLabel("Matr\u00EDcula :");

		// botn ok
		btnOk = new JButton("OK");

		// campo texto
		textField = new JTextField();

		// boton atras
		btnBack = new JButton("");
		
		//boton Nuevo
		btnNuevo = new JButton("Nuevo");
		btnNuevo.setVisible(false);
		

	}

	private void setPropiedades() {

		// Propiedades frame
		frameBuscarMatricula.setTitle("Busqueda Matr\u00EDcula");
		frameBuscarMatricula.setBounds(100, 100, 450, 300);
		frameBuscarMatricula.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameBuscarMatricula.getContentPane().setLayout(null);

		// propieades Label Titulo
		lblMatricula.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblMatricula.setBounds(94, 0, 269, 43);
		frameBuscarMatricula.getContentPane().add(lblMatricula);

		// Propiedades texto
		textField.setBounds(119, 61, 170, 43);
		frameBuscarMatricula.getContentPane().add(textField);
		textField.setColumns(10);

		// Propiedades label matricula
		lblIntroducirMatricula.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblIntroducirMatricula.setBounds(10, 73, 99, 23);
		frameBuscarMatricula.getContentPane().add(lblIntroducirMatricula);

		// Propiedades Boton ok
		btnOk.setFont(new Font("Tahoma", Font.PLAIN, 60));
		btnOk.setBounds(94, 136, 114, 98);
		frameBuscarMatricula.getContentPane().add(btnOk);

		// Propiedades boton back
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 44));
		btnBack.setIcon(
				new ImageIcon(BuscarVehiculo.class.getResource("/com/sun/javafx/scene/web/skin/Undo_16x16_JFX.png")));
		btnBack.setBounds(249, 136, 114, 98);
		frameBuscarMatricula.getContentPane().add(btnBack);
		
		
		
		btnNuevo.setBounds(302, 57, 122, 50);
		frameBuscarMatricula.getContentPane().add(btnNuevo);
	}

	private void setEventos() {
		// Eventos boton atras hacia principal
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Principal ventanaPrincipal = new Principal();

				ventanaPrincipal.getFramePrincipal().setVisible(true);
				frameBuscarMatricula.dispose();
			}

		});

		// Eventos boton Matricula introducida hacia destino

		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String entrada = textField.getText().replaceAll(" ", "");
				boolean esCorrecto = false;

				// 4 numeros, 3 letras al final
				Pattern tresLetrasFinal = Pattern.compile("^\\d{4}[A-Za-z]{3}");
				Matcher matricula3letras = tresLetrasFinal.matcher(entrada);

				// 1 o2 letras, 4 numeros, 2 letras
				Pattern cuatroNumerosCentro = Pattern.compile("^\\d{1,2}[A-Za-z]{4}\\d{2}");
				Matcher matricula4numeros = cuatroNumerosCentro.matcher(entrada);

				if (matricula3letras.matches() || matricula4numeros.matches()) {
					JOptionPane.showMessageDialog(null, entrada + "  Formato Matricula correcto");

					for (Vehiculo c : Listas.listaVehiculo) {

						if (c.getMatricula().contains(entrada)) {
							esCorrecto = true;
							JOptionPane.showMessageDialog(null, "La matricula " + entrada + "  esta guardada");

							FichaReparar ventanaReparar = new FichaReparar();

							ventanaReparar.getframeFichaReparar().setVisible(true);

							frameBuscarMatricula.dispose();
						}
						if (!esCorrecto) {

							JOptionPane.showMessageDialog(null, "La matricula " + entrada + " no esta guardada");

							FichaVehiculoCrear ventanaVehiculo = new FichaVehiculoCrear();

							ventanaVehiculo.getFrameCrearFichaVehiculo().setVisible(true);

							frameBuscarMatricula.dispose();
							btnNuevo.setVisible(true);

						}

					}

				} else {
					JOptionPane.showMessageDialog(null, "Formato Matricula INcorrecto",
							"Error de formato", JOptionPane.ERROR_MESSAGE);
					
					
				}

			}
		});

		btnNuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				fichaClienteCrear ventana = new fichaClienteCrear();

				ventana.getFrameCliente().setVisible(true);

				frameBuscarMatricula.dispose();
			}
		});
		
		
	}

}
