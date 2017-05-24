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

public class BuscarVehiculo {

	private JFrame frameBuscarMatricula;
	private JTextField textField;
	private JButton btnOk;
	private JButton btnBack;
	private JLabel lblMatricula;
	private JLabel lblIntroducirMatricula;

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

	}

	private void setPropiedades() {
		
		//Propiedades frame
		frameBuscarMatricula.setTitle("Busqueda Matr\u00EDcula");
		frameBuscarMatricula.setBounds(100, 100, 450, 300);
		frameBuscarMatricula.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameBuscarMatricula.getContentPane().setLayout(null);

		//propieades Label Titulo
		lblMatricula.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblMatricula.setBounds(94, 0, 269, 43);
		frameBuscarMatricula.getContentPane().add(lblMatricula);

		//Propiedades texto
		textField.setBounds(164, 61, 170, 43);
		frameBuscarMatricula.getContentPane().add(textField);
		textField.setColumns(10);

		//Propiedades label matricula
		lblIntroducirMatricula.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblIntroducirMatricula.setBounds(55, 73, 99, 23);
		frameBuscarMatricula.getContentPane().add(lblIntroducirMatricula);

		//Propiedades Boton ok
		btnOk.setFont(new Font("Tahoma", Font.PLAIN, 60));
		btnOk.setBounds(94, 136, 114, 98);
		frameBuscarMatricula.getContentPane().add(btnOk);

		//Propiedades boton back
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 44));
		btnBack.setIcon(
				new ImageIcon(BuscarVehiculo.class.getResource("/com/sun/javafx/scene/web/skin/Undo_16x16_JFX.png")));
		btnBack.setBounds(249, 136, 114, 98);
		frameBuscarMatricula.getContentPane().add(btnBack);
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


				//4 numeros, 3 letras al final
				Pattern tresLetrasFinal = Pattern.compile("^\\d{4}[A-Z]{3}");
				Matcher matricula3letras = tresLetrasFinal.matcher(textField.getText().toUpperCase().replaceAll(" ", ""));	
				
				//1 o2 letras, 4 numeros, 2 letras
				Pattern cuatroNumerosCentro = Pattern.compile("^\\d{1,2}[A-Z]{4}\\d{2}");
				Matcher matricula4numeros = cuatroNumerosCentro.matcher(textField.getText().toUpperCase().replaceAll(" ", ""));	
				
				if(matricula3letras.matches()||matricula4numeros.matches()){
					JOptionPane.showMessageDialog(null, "Matricula correcta");
				}
				else{
					JOptionPane.showMessageDialog(null, "Matricula incorrecta");

				}
						
				
			
				// si NO existe la matricula
				/*
				 * FichaVehiculoCrear ventanaVehiculo = new FichaVehiculoCrear();
				 * 
				 * ventanaVehiculo.getFrameCrearFichaVehiculo().setVisible(true);
				 * 
				 * frameBuscarMatricula.dispose();
				 
				// Si existe la matricula

				FichaReparar ventanaReparar = new FichaReparar();

				ventanaReparar.getframeFichaReparar().setVisible(true);

				frameBuscarMatricula.dispose();
*/
			}
		});

	}

}