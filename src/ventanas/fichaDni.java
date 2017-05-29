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
import models.Cliente;
import models.Vehiculo;

public class fichaDni {

	private JFrame frameDni;
	private JTextField dniField;
	private JLabel lblTitulo;
	private JLabel lblDni;
	private JButton btnOk;
	private JButton btnAtras;
	private String dnientrada;
	private boolean esCorrecto;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					fichaDni window = new fichaDni();
					window.frameDni.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public fichaDni() {
		initialize();
		setPropiedades();
		setEventos();
	}

	public JFrame getFrameDni() {
		return frameDni;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		frameDni = new JFrame();
		lblTitulo = new JLabel("Introduzca DNI");
		dniField = new JTextField();
		lblDni = new JLabel("DNI :");
		btnOk = new JButton("OK");
		btnAtras = new JButton("");

	}

	public void setPropiedades() {

		frameDni.setBounds(100, 100, 450, 300);
		frameDni.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameDni.getContentPane().setLayout(null);

		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblTitulo.setBounds(127, 0, 186, 43);
		frameDni.getContentPane().add(lblTitulo);

		dniField.setBounds(164, 61, 170, 43);
		frameDni.getContentPane().add(dniField);
		dniField.setColumns(10);

		lblDni.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblDni.setBounds(99, 73, 55, 23);
		frameDni.getContentPane().add(lblDni);

		btnOk.setFont(new Font("Tahoma", Font.PLAIN, 60));
		btnOk.setBounds(94, 136, 114, 98);
		frameDni.getContentPane().add(btnOk);

		btnAtras.setFont(new Font("Tahoma", Font.PLAIN, 44));

		btnAtras.setIcon(
				new ImageIcon(fichaDni.class.getResource("/com/sun/javafx/scene/web/skin/Undo_16x16_JFX.png")));
		btnAtras.setBounds(249, 136, 114, 98);
		frameDni.getContentPane().add(btnAtras);

	}

	public void setEventos() {

		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// a�adir condicion de si existe o no existe el dni y enlazar a
				// ventana.
				// si existe
				/*
				 * FichaVehiculoCrear ventanaVehiculo = new
				 * FichaVehiculoCrear();
				 * 
				 * ventanaVehiculo.getFrameCrearFichaVehiculo().setVisible(true)
				 * ;
				 * 
				 * frameDni.dispose();
				 */
				// si no existe

				/* Comprobar formato DNI */

				dnientrada = dniField.getText().toUpperCase().replaceAll(" ", "");
				esCorrecto = false;

				Pattern dniunaletra8numeros = Pattern.compile("^\\d{8}[A-Z]{1}");
				Matcher dni1letra = dniunaletra8numeros.matcher(dnientrada);

				if (dni1letra.matches()) {
					for (Cliente c : Listas.listaClientes) {
						if (c.getDni().equals(dnientrada)) {
							Vehiculo v = new Vehiculo(c.getDni());
							Listas.listaVehiculo.add(v);
							esCorrecto = true;
							fichaClienteCrear ventana = new fichaClienteCrear();
							
							ventana.getFrameCliente().setVisible(true);
							
							frameDni.dispose();
						}
					}
					if (!esCorrecto) {
						JOptionPane.showMessageDialog(frameDni, "El dni " + dnientrada + " no se encuentra registrado.",
								"Error del trVp", JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(null, "Formato Dni  Incorrecto");

					// fichaClienteCrear ventanaCliente = new
					// fichaClienteCrear();
					// ventanaCliente.getFrameCliente().setVisible(true);
					// frameDni.dispose();
				}

			}
		});

		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				ClienteExistente ClienteExistente1 = new ClienteExistente();
				ClienteExistente1.getFrameExistente().setVisible(true);
				frameDni.dispose();
			}

		});

	}
}
