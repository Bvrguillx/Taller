package ventanas;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class BuscarVehiculo {

	private JFrame frameBuscarMatricula;
	private JTextField textField;

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
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frameBuscarMatricula = new JFrame();
		frameBuscarMatricula.setTitle("Busqueda Matr\u00EDcula");
		frameBuscarMatricula.setBounds(100, 100, 450, 300);
		frameBuscarMatricula.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameBuscarMatricula.getContentPane().setLayout(null);

		JLabel lblMatricula = new JLabel("Introduzca Matr\u00EDcula");
		lblMatricula.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblMatricula.setBounds(94, 0, 269, 43);
		frameBuscarMatricula.getContentPane().add(lblMatricula);

		textField = new JTextField();
		textField.setBounds(164, 61, 170, 43);
		frameBuscarMatricula.getContentPane().add(textField);
		textField.setColumns(10);

		JLabel lblIntroducirMatricula = new JLabel("Matr\u00EDcula :");
		lblIntroducirMatricula.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblIntroducirMatricula.setBounds(55, 73, 99, 23);
		frameBuscarMatricula.getContentPane().add(lblIntroducirMatricula);

		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// añadir condicion de si existe o no existe matricula y enlazar
				// a
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

				FichaReparar ventanaReparar = new FichaReparar();

				ventanaReparar.getframeFichaReparar().setVisible(true);

				frameBuscarMatricula.dispose();

			}
		});
		btnOk.setFont(new Font("Tahoma", Font.PLAIN, 60));
		btnOk.setBounds(94, 136, 114, 98);
		frameBuscarMatricula.getContentPane().add(btnOk);

		JButton btnBack = new JButton("");
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 44));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Principal ventanaPrincipal = new Principal();

				ventanaPrincipal.getFramePrincipal().setVisible(true);
				frameBuscarMatricula.dispose();
			}

		});
		btnBack.setIcon(
				new ImageIcon(BuscarVehiculo.class.getResource("/com/sun/javafx/scene/web/skin/Undo_16x16_JFX.png")));
		btnBack.setBounds(249, 136, 114, 98);
		frameBuscarMatricula.getContentPane().add(btnBack);
	}
}
