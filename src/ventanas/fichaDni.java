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
	private JButton btnNuevo;
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
		btnNuevo = new JButton("Nuevo");
		btnNuevo.setVisible(false);
	}

	public void setPropiedades() {

		frameDni.setBounds(100, 100, 450, 300);
		frameDni.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameDni.getContentPane().setLayout(null);

		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblTitulo.setBounds(127, 0, 186, 43);
		frameDni.getContentPane().add(lblTitulo);

		dniField.setBounds(88, 64, 170, 43);
		frameDni.getContentPane().add(dniField);
		dniField.setColumns(10);

		lblDni.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblDni.setBounds(23, 76, 55, 23);
		frameDni.getContentPane().add(lblDni);

		btnOk.setFont(new Font("Tahoma", Font.PLAIN, 60));
		btnOk.setBounds(94, 136, 114, 98);
		frameDni.getContentPane().add(btnOk);

		btnAtras.setFont(new Font("Tahoma", Font.PLAIN, 44));

		btnAtras.setIcon(
				new ImageIcon(fichaDni.class.getResource("/com/sun/javafx/scene/web/skin/Undo_16x16_JFX.png")));
		btnAtras.setBounds(249, 136, 114, 98);
		frameDni.getContentPane().add(btnAtras);
		
		btnNuevo.setFont(new Font("Tahoma", Font.PLAIN, 26));
		
		btnNuevo.setBounds(278, 54, 146, 60);
		frameDni.getContentPane().add(btnNuevo);

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

				dnientrada = dniField.getText().replaceAll(" ", "");
				esCorrecto = false;

				Pattern dniunaletra8numeros = Pattern.compile("^\\d{8}[A-Za-z]{1}");
				Matcher dni1letra = dniunaletra8numeros.matcher(dnientrada);

				if (dni1letra.matches()) {
					for (Cliente c : Listas.listaClientes) {
						if (c.getDni().contains(dnientrada)) {
							esCorrecto = true;
							JOptionPane.showMessageDialog(null, "El dni " + dnientrada + "  esta guardada");
														
							fichaClienteCrear ventana = new fichaClienteCrear();
							
							ventana.getFrameCliente().setVisible(true);
							//ventana.mostrarCliente(c);
							
							frameDni.dispose();
						}
					}
					if (!esCorrecto) {
						JOptionPane.showMessageDialog(frameDni, "El dni " + dnientrada + " no se encuentra registrado.",
								"Error del trVp", JOptionPane.ERROR_MESSAGE);
						btnNuevo.setVisible(true);
						 
					}
				} else {
					JOptionPane.showMessageDialog(null, "Formato Dni  Incorrecto");

					
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
		
		btnNuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				fichaClienteCrear ventana = new fichaClienteCrear();

				ventana.getFrameCliente().setVisible(true);

				frameDni.dispose();
			}
		});
		
		

	}
}
