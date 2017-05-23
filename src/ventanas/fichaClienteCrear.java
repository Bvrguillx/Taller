package ventanas;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class fichaClienteCrear {

	private JFrame frameCliente;
	private JTextField nombreField;
	private JTextField apellidoField;
	private JTextField telefonoField;
	private JTextField codpostalField;
	private JTextField dniField;
	private JLabel lblNombre;
	private JLabel lblApellido;
	private JLabel lblTelefono;
	private JLabel lblCodPostal;
	private JLabel lblDNI;
	private JButton btnCrear;
	private JButton btnAtras;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					fichaClienteCrear window = new fichaClienteCrear();
					window.frameCliente.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	
	//get frameCliente
	public JFrame getFrameCliente() {
		return frameCliente;
	}




	/**
	 * Create the application.
	 */
	public fichaClienteCrear() {
		initialize();
		setPropiedades();
		setEventos();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
	
		frameCliente = new JFrame();
		frameCliente.setResizable(false);
		lblNombre = new JLabel("Nombre");
		nombreField = new JTextField();
		lblApellido = new JLabel("Apellido");
		apellidoField = new JTextField();
		lblTelefono = new JLabel("Telefono");
		lblCodPostal = new JLabel("Codigo Postal");
		codpostalField = new JTextField();
		lblDNI = new JLabel("DNI");
		dniField = new JTextField();
		btnCrear = new JButton("CREAR");
		btnAtras = new JButton("");
	}
		
	public void setPropiedades(){
		
		frameCliente.setTitle("Crear Ficha Cliente");
		frameCliente.setBounds(100, 100, 491, 366);
		frameCliente.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameCliente.getContentPane().setLayout(null);
		
		lblNombre.setHorizontalAlignment(SwingConstants.CENTER);
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNombre.setBounds(10, 11, 194, 42);
		frameCliente.getContentPane().add(lblNombre);
			
		nombreField.setHorizontalAlignment(SwingConstants.CENTER);
		nombreField.setBounds(10, 63, 194, 42);
		frameCliente.getContentPane().add(nombreField);
		nombreField.setColumns(10);
		
		lblApellido.setHorizontalAlignment(SwingConstants.CENTER);
		lblApellido.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblApellido.setBounds(261, 11, 194, 42);
		frameCliente.getContentPane().add(lblApellido);
		
		apellidoField.setHorizontalAlignment(SwingConstants.CENTER);
		apellidoField.setColumns(10);
		apellidoField.setBounds(261, 63, 194, 42);
		frameCliente.getContentPane().add(apellidoField);
		
		lblTelefono.setHorizontalAlignment(SwingConstants.CENTER);
		lblTelefono.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTelefono.setBounds(10, 116, 194, 42);
		frameCliente.getContentPane().add(lblTelefono);
		
		telefonoField = new JTextField();
		telefonoField.setHorizontalAlignment(SwingConstants.CENTER);
		telefonoField.setColumns(10);
		telefonoField.setBounds(10, 169, 194, 42);
		frameCliente.getContentPane().add(telefonoField);
		
		lblCodPostal.setHorizontalAlignment(SwingConstants.CENTER);
		lblCodPostal.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCodPostal.setBounds(261, 116, 194, 42);
		frameCliente.getContentPane().add(lblCodPostal);
		
		codpostalField.setHorizontalAlignment(SwingConstants.CENTER);
		codpostalField.setColumns(10);
		codpostalField.setBounds(261, 169, 194, 42);
		frameCliente.getContentPane().add(codpostalField);
		
		lblDNI.setHorizontalAlignment(SwingConstants.CENTER);
		lblDNI.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblDNI.setBounds(10, 222, 194, 42);
		frameCliente.getContentPane().add(lblDNI);
		
		dniField.setHorizontalAlignment(SwingConstants.CENTER);
		dniField.setColumns(10);
		dniField.setBounds(10, 275, 194, 42);
		frameCliente.getContentPane().add(dniField);
		
		btnCrear.setIcon(new ImageIcon(fichaClienteCrear.class.getResource("/com/sun/javafx/scene/web/skin/Cut_16x16_JFX.png")));
		btnCrear.setFont(new Font("Franklin Gothic Heavy", Font.PLAIN, 15));
		btnCrear.setBounds(261, 236, 116, 80);
		frameCliente.getContentPane().add(btnCrear);
		
		btnAtras.setIcon(new ImageIcon(fichaClienteCrear.class.getResource("/com/sun/javafx/scene/web/skin/Undo_16x16_JFX.png")));
		btnAtras.setBounds(388, 236, 67, 80);
		frameCliente.getContentPane().add(btnAtras);
	}
	
	public void setEventos(){

	}
}
