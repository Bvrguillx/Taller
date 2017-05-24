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
import javax.swing.SwingConstants;

import container.Listas;
import models.Cliente;

public class fichaClienteCrear {

	protected JFrame frameCliente;
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

	protected String nombre_;
	protected int cp_;
	protected String apellido_;
	protected String dni_;
	protected int telefono_;

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

	// get frameCliente
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

	public void setPropiedades() {

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

		btnCrear.setIcon(
				new ImageIcon(fichaClienteCrear.class.getResource("/com/sun/javafx/scene/web/skin/Cut_16x16_JFX.png")));
		btnCrear.setFont(new Font("Franklin Gothic Heavy", Font.PLAIN, 15));
		btnCrear.setBounds(261, 236, 116, 80);
		frameCliente.getContentPane().add(btnCrear);

		btnAtras.setIcon(new ImageIcon(
				fichaClienteCrear.class.getResource("/com/sun/javafx/scene/web/skin/Undo_16x16_JFX.png")));
		btnAtras.setBounds(388, 236, 67, 80);
		frameCliente.getContentPane().add(btnAtras);
	}

	public void setEventos() {
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				ClienteExistente ClienteExistente1 = new ClienteExistente();

				ClienteExistente1.getFrameExistente().setVisible(true);
				frameCliente.dispose();

			}
		});

		btnCrear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				boolean seguir=false;
				
				seguir = crearCliente();
				if (seguir){
				FichaVehiculoCrear ventanaVehiculo = new FichaVehiculoCrear();

				ventanaVehiculo.getFrameCrearFichaVehiculo().setVisible(true);
				frameCliente.dispose();
				}
			}
		});

	}

	public boolean crearCliente() {

		boolean correcto=false;
		String cp = codpostalField.getText();
		nombre_ = nombreField.getText();
		apellido_ = apellidoField.getText();
		dni_ = dniField.getText();
		String telefono = telefonoField.getText();

		Pattern patron = Pattern.compile("[^A-Za-z ]");
		Pattern patronCP = Pattern.compile("^([1-9]{2}|[0-9][1-9]|[1-9][0-9])[0-9]{3}$");
		Pattern patronDNI = Pattern.compile("[0-9A-Z][0-9]{7}[A-Z]");
		Pattern patronTLFN = Pattern.compile("^(0034|\\+34)?(\\d\\d\\d)-? ?(\\d\\d)-? ?(\\d)-? ?(\\d)-? ?(\\d\\d)$");

		Matcher nombre__ = patron.matcher(nombre_);
		Matcher apellido__ = patron.matcher(nombre_);
		Matcher cp__ = patronCP.matcher(cp);
		Matcher dni__ = patronDNI.matcher(dni_);
		Matcher telefono__ = patronTLFN.matcher(telefono);

		if (!nombre__.matches()) {
			JOptionPane.showMessageDialog(frameCliente, "El nombre no acepta numeros", "Insane error",
					JOptionPane.ERROR_MESSAGE);
		}
		if (!apellido__.matches()) {
			JOptionPane.showMessageDialog(frameCliente, "El apellido no acepta numeros", "Insane error",
					JOptionPane.ERROR_MESSAGE);
		}
		if (!cp__.matches()) {
			JOptionPane.showMessageDialog(frameCliente, "El Cp no cumple con el modelo", "Insane error",
					JOptionPane.ERROR_MESSAGE);
		}else cp_ = Integer.parseInt(cp);
		
		if (!dni__.matches()) {
			JOptionPane.showMessageDialog(frameCliente, "El DNI no cumple con el modelo", "Insane error",
					JOptionPane.ERROR_MESSAGE);
		}
		if (!telefono__.matches()) {
			JOptionPane.showMessageDialog(frameCliente, "El Telefono no cumple con el modelo", "Insane error",
					JOptionPane.ERROR_MESSAGE);
		}else telefono_ = Integer.parseInt(telefono);
		
		if (nombre__.matches() && apellido__.matches() && cp__.matches() && dni__.matches() && telefono__.matches()){
			correcto=true;
			
			Cliente c = new Cliente (nombre_, cp_ ,apellido_, dni_, telefono_);
			
			Listas.listaClientes.add(c);
			
		}
		return correcto;
	}
}
