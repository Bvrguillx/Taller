package ventanas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;

public class ClienteExistente {

	// Atributos
	private JFrame frameExistente;
	private JLabel lbExisteCliente;
	private JButton btnClienteSi;
	private JButton btnClienteNo;

	// main para lanzarlo, borrar mas tarde
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClienteExistente window = new ClienteExistente();
					window.frameExistente.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	//Getter para la ventana.
		public JFrame getFrameExistente() {
			return frameExistente;
		}

	/**
	 * Create the application.
	 */
	public ClienteExistente() {
		initialize();
		setPropiedades();
		setEventos();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		// ventana
		frameExistente = new JFrame();
		frameExistente.setTitle("Existe Cliente");

		// label
		lbExisteCliente = new JLabel("\u00BFExiste el Cliente?");

		// boton Cliente SI existe 
		btnClienteSi = new JButton("SI");

		// boton Cliente NO existe
		btnClienteNo = new JButton("NO");

	}

	private void setPropiedades() {
		// PROPIEDADES
		frameExistente.setBounds(100, 100, 450, 300);
		frameExistente.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameExistente.getContentPane().setLayout(null);

		// Propiedades Label "Existe cliente"
		lbExisteCliente.setFont(new Font("Tahoma", Font.PLAIN, 45));
		lbExisteCliente.setBounds(36, 11, 370, 74);
		frameExistente.getContentPane().add(lbExisteCliente);

		// Propiedades Boton Si
		btnClienteSi.setFont(new Font("Tahoma", Font.PLAIN, 74));
		btnClienteSi.setBounds(47, 106, 152, 102);
		frameExistente.getContentPane().add(btnClienteSi);

		// Propiedades Boton NO
		btnClienteNo.setFont(new Font("Tahoma", Font.PLAIN, 74));

		btnClienteNo.setBounds(231, 106, 152, 102);
		frameExistente.getContentPane().add(btnClienteNo);

	}

	private void setEventos() {
		// Eventos boton NO Hacia Crear Cliente.
		btnClienteNo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				 fichaClienteCrear ventana= new fichaClienteCrear();
				 
				  ventana.getFrameCliente().setVisible(true);
				 
				 
				frameExistente.dispose();

			}
		});
		// Eventos boton SI hacia Buscar cliente por DNI

		btnClienteSi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				//Enlazar a la ventana de alejandro buscar DNI
				/*
				 * nuevoVehiculo ventana= new nuevoVehiculo();
				 * 
				 * ventana.getFrame().setVisible(true);
				 * 
				 */
				frameExistente.dispose();
				 

			}
		});

	}

}
