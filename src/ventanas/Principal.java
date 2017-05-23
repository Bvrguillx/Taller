package ventanas;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Principal {

	// Atributos
	private JFrame framePrincipal;
	private JLabel lbPrincipal;
	private JButton btnBuscarVehiculo;
	private JButton btnNuevoVehiculo;

	// main para lanzarlo, borrar mas tarde
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal window = new Principal();
					window.framePrincipal.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	//get ventana
	public JFrame getFramePrincipal() {
		return framePrincipal;
	}
	
	
	/**
	 * Create the application.
	 */
	public Principal() {
		initialize();
		setPropiedades();
		setEventos();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		// ventana
		framePrincipal = new JFrame();
		framePrincipal.setTitle("Eleccion Principal");

		// label
		lbPrincipal = new JLabel("Principal");

		// boton buscar vehiculo
		btnBuscarVehiculo = new JButton("BV");

		// boton nuevo vehiculo
		btnNuevoVehiculo = new JButton("NV");

	}

	private void setPropiedades() {
		// PROPIEDADES
		framePrincipal.setBounds(100, 100, 450, 300);
		framePrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		framePrincipal.getContentPane().setLayout(null);

		// Propiedades Label "Principal"
		lbPrincipal.setFont(new Font("Tahoma", Font.PLAIN, 45));
		lbPrincipal.setBounds(131, 11, 170, 74);
		framePrincipal.getContentPane().add(lbPrincipal);

		// Propiedades Boton Buscar Vehiculo
		btnBuscarVehiculo.setFont(new Font("Tahoma", Font.PLAIN, 74));
		btnBuscarVehiculo.setBounds(47, 106, 152, 102);
		framePrincipal.getContentPane().add(btnBuscarVehiculo);

		// Propiedades Boton Nuevo Vehiculo
		btnNuevoVehiculo.setFont(new Font("Tahoma", Font.PLAIN, 74));

		btnNuevoVehiculo.setBounds(231, 106, 152, 102);
		framePrincipal.getContentPane().add(btnNuevoVehiculo);

	}

	private void setEventos() {
		// Eventos boton nuevo Vehiculo hacia elegir cliente 
		btnNuevoVehiculo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				
				 ClienteExistente ventana= new ClienteExistente();
				 
				ventana.getFrameExistente().setVisible(true);
				
				
				framePrincipal.dispose();

			}
		});
		// Eventos boton Buscar Vehiculo hacia Buscar Vehiculo

		btnBuscarVehiculo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				/*
				 * buscarVehiculo ventana= new buscarVehiculo();
				 * 
				 * ventana.getFrame().setVisible(true);
				 * 
				 */
				framePrincipal.dispose();

			}
		});

	}






}
