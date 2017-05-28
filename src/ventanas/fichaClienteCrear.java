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
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import container.Listas;
import models.Cliente;
import models.Vehiculo;

public class fichaClienteCrear {

	protected JFrame frameCliente;
	private JTextField nombreField;
	private JTextField apellidoField;
	private JTextField codpostalField;
	private JTextField telefonoField;
	private JTextField dniField;
	private JLabel lblNombre;
	private JLabel lblApellido;
	private JLabel lblTelefono;
	private JLabel lblCodPostal;
	private JLabel lblDNI;
	private JButton btnCrear;
	private JButton btnAtras;
	private JButton btnLimpiar;

	protected String nombre_;
	protected int cp_;
	protected String apellido_;
	protected String dni_;
	protected int telefono_;

	
	
	// MENU
	private JMenu mnMenu;
	private JMenu mnCoches;
	private JMenuItem mntmCocheLeer;
	private JMenuItem mntmCocheEditar;
	private JMenuItem mntmCocheCrear;
	private JMenu mnClientes;
	private JMenuItem mntmClienteLeer;
	private JMenuItem mntmClienteCrear;
	private JMenuItem mntmReparacionCrear;
	private JMenuItem mntmReparacionEditar;
	private JMenuItem mntmReparacionLeer;
	private JMenuItem mntmClienteEditar;
	private JMenu mnReparaciones;
	private JMenuBar menuBar;
	private JButton btnFlechaIzq;
	private JButton btnFlechaDer;
	
	
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
		telefonoField = new JTextField();
		lblDNI = new JLabel("DNI");
		dniField = new JTextField();
		btnCrear = new JButton("CREAR");
		btnAtras = new JButton("");
		btnLimpiar = new JButton("");
	
		// MENU
		mnMenu = new JMenu("");
		mnCoches = new JMenu("");
		mntmCocheLeer = new JMenuItem("");
		mntmCocheEditar = new JMenuItem("");
		mntmCocheCrear = new JMenuItem("");
		mnClientes = new JMenu("");
		mntmClienteLeer = new JMenuItem("");
		mntmClienteCrear = new JMenuItem("");
		mntmClienteEditar = new JMenuItem("");
		mnReparaciones = new JMenu("");
		mntmReparacionCrear = new JMenuItem("");
		mntmReparacionEditar = new JMenuItem("");
		mntmReparacionLeer = new JMenuItem("");

	}

	public void setPropiedades() {

		frameCliente.setTitle("Crear Ficha Cliente");
		frameCliente.setBounds(100, 100, 524, 424);
		frameCliente.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameCliente.getContentPane().setLayout(null);

		lblNombre.setHorizontalAlignment(SwingConstants.CENTER);
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNombre.setBounds(10, 50, 227, 42);
		frameCliente.getContentPane().add(lblNombre);

		nombreField.setHorizontalAlignment(SwingConstants.CENTER);
		nombreField.setBounds(10, 118, 227, 42);
		frameCliente.getContentPane().add(nombreField);
		nombreField.setColumns(10);

		lblApellido.setHorizontalAlignment(SwingConstants.CENTER);
		lblApellido.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblApellido.setBounds(261, 50, 227, 42);
		frameCliente.getContentPane().add(lblApellido);

		apellidoField.setHorizontalAlignment(SwingConstants.CENTER);
		apellidoField.setColumns(10);
		apellidoField.setBounds(261, 118, 227, 42);
		frameCliente.getContentPane().add(apellidoField);

		lblTelefono.setHorizontalAlignment(SwingConstants.CENTER);
		lblTelefono.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTelefono.setBounds(10, 171, 227, 42);
		frameCliente.getContentPane().add(lblTelefono);

		codpostalField = new JTextField();
		codpostalField.setHorizontalAlignment(SwingConstants.CENTER);
		codpostalField.setColumns(10);
		codpostalField.setBounds(261, 224, 227, 42);
		frameCliente.getContentPane().add(codpostalField);

		lblCodPostal.setHorizontalAlignment(SwingConstants.CENTER);
		lblCodPostal.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCodPostal.setBounds(261, 171, 227, 42);
		frameCliente.getContentPane().add(lblCodPostal);

		telefonoField.setHorizontalAlignment(SwingConstants.CENTER);
		telefonoField.setColumns(10);
		telefonoField.setBounds(10, 224, 227, 42);
		frameCliente.getContentPane().add(telefonoField);

		lblDNI.setHorizontalAlignment(SwingConstants.CENTER);
		lblDNI.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblDNI.setBounds(10, 277, 227, 42);
		frameCliente.getContentPane().add(lblDNI);

		dniField.setHorizontalAlignment(SwingConstants.CENTER);
		dniField.setColumns(10);
		dniField.setBounds(10, 330, 227, 42);
		frameCliente.getContentPane().add(dniField);

		btnCrear.setIcon(
				new ImageIcon(fichaClienteCrear.class.getResource("/com/sun/javafx/scene/web/skin/Cut_16x16_JFX.png")));
		btnCrear.setFont(new Font("Franklin Gothic Heavy", Font.PLAIN, 15));
		btnCrear.setBounds(261, 291, 107, 80);
		frameCliente.getContentPane().add(btnCrear);

		btnAtras.setIcon(new ImageIcon(
				fichaClienteCrear.class.getResource("/com/sun/javafx/scene/web/skin/Undo_16x16_JFX.png")));
		btnAtras.setBounds(444, 291, 49, 80);
		frameCliente.getContentPane().add(btnAtras);

		btnLimpiar.setIcon(new ImageIcon(
				fichaClienteCrear.class.getResource("/com/sun/javafx/scene/control/skin/modena/dialog-error.png")));
		btnLimpiar.setBounds(378, 291, 56, 81);
		frameCliente.getContentPane().add(btnLimpiar);
		
		
		
		menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 157, 48);
		frameCliente.getContentPane().add(menuBar);

		menuBar.add(mnMenu);
		mnMenu.setIcon(
				new ImageIcon(FichaVehiculoCrear.class.getResource("/iconos/1495928384_dot-more-menu-hide.png")));

		mnCoches.setIcon(
				new ImageIcon(FichaVehiculoCrear.class.getResource("/iconos/1495927937_solid-travel-tourism-car.png")));
		mnMenu.add(mnCoches);

		mntmCocheLeer.setIcon(new ImageIcon(FichaVehiculoCrear.class.getResource("/iconos/1495930663_67.png")));
		mnCoches.add(mntmCocheLeer);

		mntmCocheEditar.setIcon(new ImageIcon(FichaVehiculoCrear.class.getResource("/iconos/1495930865_pen.png")));
		mnCoches.add(mntmCocheEditar);

		mntmCocheCrear
				.setIcon(new ImageIcon(FichaVehiculoCrear.class.getResource("/iconos/1495931018_new_product.png")));
		mnCoches.add(mntmCocheCrear);

		mnClientes.setIcon(new ImageIcon(FichaVehiculoCrear.class.getResource("/iconos/1495929007_104.png")));
		mnMenu.add(mnClientes);

		mntmClienteLeer.setIcon(new ImageIcon(FichaVehiculoCrear.class.getResource("/iconos/1495930663_67.png")));
		mnClientes.add(mntmClienteLeer);

		mntmClienteEditar.setIcon(new ImageIcon(FichaVehiculoCrear.class.getResource("/iconos/1495930865_pen.png")));
		mnClientes.add(mntmClienteEditar);

		mntmClienteCrear
				.setIcon(new ImageIcon(FichaVehiculoCrear.class.getResource("/iconos/1495931018_new_product.png")));
		mnClientes.add(mntmClienteCrear);

		mnReparaciones.setIcon(new ImageIcon(FichaVehiculoCrear.class.getResource("/iconos/1495928663_wrench.png")));
		mnMenu.add(mnReparaciones);

		mntmReparacionLeer.setIcon(new ImageIcon(FichaVehiculoCrear.class.getResource("/iconos/1495930663_67.png")));
		mnReparaciones.add(mntmReparacionLeer);

		mntmReparacionEditar.setIcon(new ImageIcon(FichaVehiculoCrear.class.getResource("/iconos/1495930865_pen.png")));
		mnReparaciones.add(mntmReparacionEditar);

		mntmReparacionCrear
				.setIcon(new ImageIcon(FichaVehiculoCrear.class.getResource("/iconos/1495931018_new_product.png")));
		mnReparaciones.add(mntmReparacionCrear);
		
		btnFlechaIzq = new JButton("");
		btnFlechaIzq.setIcon(new ImageIcon(fichaClienteCrear.class.getResource("/com/sun/javafx/scene/control/skin/modena/HTMLEditor-Indent-Black-rtl.png")));
		btnFlechaIzq.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnFlechaIzq.setBounds(261, 14, 49, 34);
		frameCliente.getContentPane().add(btnFlechaIzq);
		
		btnFlechaDer = new JButton("");
		btnFlechaDer.setIcon(new ImageIcon(fichaClienteCrear.class.getResource("/com/sun/javafx/scene/control/skin/modena/HTMLEditor-Indent-Black.png")));
		btnFlechaDer.setBounds(439, 14, 49, 34);
		frameCliente.getContentPane().add(btnFlechaDer);
		
		JLabel lblFlechas = new JLabel("Cliente");
		lblFlechas.setHorizontalAlignment(SwingConstants.CENTER);
		lblFlechas.setBounds(320, 14, 110, 34);
		frameCliente.getContentPane().add(lblFlechas);

		
		
		
		
		
		
		
		
		
		
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

				boolean seguir = false;

				seguir = crearCliente();
				if (seguir) {
					FichaVehiculoCrear ventanaVehiculo = new FichaVehiculoCrear();

					ventanaVehiculo.getFrameCrearFichaVehiculo().setVisible(true);
					frameCliente.dispose();
				}
			}
		});

		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				nombreField.setText("");
				dniField.setText("");
				telefonoField.setText("");
				apellidoField.setText("");
				codpostalField.setText("");

			}
		});

	}

	public boolean crearCliente() {

		String errores = "";
		boolean correcto = false;
		String telefono = telefonoField.getText();
		String cp = codpostalField.getText();
		nombre_ = nombreField.getText();
		apellido_ = apellidoField.getText();
		dni_ = dniField.getText();

		Pattern patron = Pattern.compile("^[A-Za-z]");
		Pattern patronCP = Pattern.compile("^([1-9]{2}|[0-9][1-9]|[1-9][0-9])[0-9]{3}$");
		Pattern patronDNI = Pattern.compile("^\\d{8}[A-Z]{1}");
		Pattern patronTLFN = Pattern.compile("^(0034|\\+34)?(\\d\\d\\d)-? ?(\\d\\d)-? ?(\\d)-? ?(\\d)-? ?(\\d\\d)$");

		Matcher nombre__ = patron.matcher(nombre_);
		Matcher apellido__ = patron.matcher(apellido_);
		Matcher cp__ = patronCP.matcher(cp);
		Matcher dni__ = patronDNI.matcher(dni_);
		Matcher telefono__ = patronTLFN.matcher(telefono);

		if (nombre_.isEmpty()) {
			errores += "Introduzca nombre \n";

		} else {
			if (!nombre__.matches()) {

				errores += "El nombre no acepta numeros.\n";

			}
		}

		if (apellido_.isEmpty()) {
			errores += "Introduzca apellido \n";

		} else {
			if (!apellido__.matches()) {
				errores += "El apellido no acepta numeros.\n";
			}
		}

		if (cp.isEmpty()) {
			errores += "Introduzca codigo postal \n";
		} else {
			if (!cp__.matches()) {
				errores += "El CP no cumple con el modelo NNNNN.\n";
			} else
				cp_ = Integer.parseInt(cp);

		}

		if (dni_.isEmpty()) {
			errores += "Introduzca DNI \n";
		} else {
			if (!dni__.matches()) {
				errores += "El DNI no cumple con el modelo NNNNNNNNL.\n";
			}
		}

		if (telefono.isEmpty()) {
			errores += "Introduzca telefono \n";
		} else {
			if (!telefono__.matches()) {
				errores += "El telefono no cumple con el modelo.\n";
			} else
				telefono_ = Integer.parseInt(telefono);

		}

		if (nombre__.matches() && apellido__.matches() && cp__.matches() && dni__.matches() && telefono__.matches()) {
			correcto = true;

			Cliente c = new Cliente(nombre_, cp_, apellido_, dni_, telefono_);
			Vehiculo v = new Vehiculo(dni_);
			Listas.listaClientes.add(c);
			Listas.listaVehiculo.add(v);

		} else {
			JOptionPane.showMessageDialog(frameCliente, errores, "Error del trVp", JOptionPane.ERROR_MESSAGE);
		}
		return correcto;
	}
}
