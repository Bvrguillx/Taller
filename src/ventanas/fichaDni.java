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

public class fichaDni {

	private JFrame frameDni;
	private JTextField textField;

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
	}

	public JFrame getFrameDni() {
		return frameDni;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frameDni = new JFrame();
		frameDni.setBounds(100, 100, 450, 300);
		frameDni.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameDni.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Introduzca DNI");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblNewLabel.setBounds(127, 0, 186, 43);
		frameDni.getContentPane().add(lblNewLabel);

		textField = new JTextField();
		textField.setBounds(164, 61, 170, 43);
		frameDni.getContentPane().add(textField);
		textField.setColumns(10);

		JLabel lblDni = new JLabel("DNI :");
		lblDni.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblDni.setBounds(99, 73, 55, 23);
		frameDni.getContentPane().add(lblDni);

		JButton btnOk = new JButton("OK");
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

				fichaClienteCrear ventanaCliente = new fichaClienteCrear();

				ventanaCliente.getFrameCliente().setVisible(true);

				frameDni.dispose();

			}
		});
		btnOk.setFont(new Font("Tahoma", Font.PLAIN, 60));
		btnOk.setBounds(94, 136, 114, 98);
		frameDni.getContentPane().add(btnOk);

		JButton btnBack = new JButton("");
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 44));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				ClienteExistente ClienteExistente1 = new ClienteExistente();

				ClienteExistente1.getFrameExistente().setVisible(true);
				frameDni.dispose();
			}

		});
		btnBack.setIcon(new ImageIcon(fichaDni.class.getResource("/com/sun/javafx/scene/web/skin/Undo_16x16_JFX.png")));
		btnBack.setBounds(249, 136, 114, 98);
		frameDni.getContentPane().add(btnBack);
	}
}
