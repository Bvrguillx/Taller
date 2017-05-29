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
	private JLabel lblModo;
	private JButton btnEditar;
	private int indiceClientes;
	private JLabel lblFlechas;

	// ATRIBUTOS Cliente
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
	private JButton btnAtras_1;
	private JButton btnAlante;

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
		btnEditar = new JButton("Editar");
		btnAtras_1 = new JButton("");

		btnAlante = new JButton("");
		lblFlechas = new JLabel("Cliente");
		lblModo = new JLabel("Modo");

			
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
		lblNombre.setBounds(10, 65, 227, 42);
		frameCliente.getContentPane().add(lblNombre);

		nombreField.setHorizontalAlignment(SwingConstants.CENTER);
		nombreField.setBounds(10, 118, 227, 42);
		frameCliente.getContentPane().add(nombreField);
		nombreField.setColumns(10);

		lblApellido.setHorizontalAlignment(SwingConstants.CENTER);
		lblApellido.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblApellido.setBounds(261, 65, 227, 42);
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
		btnCrear.setBounds(261, 291, 107, 48);
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
		menuBar.setBounds(0, 0, 142, 48);
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

		btnAtras_1.setIcon(new ImageIcon(fichaClienteCrear.class
				.getResource("/com/sun/javafx/scene/control/skin/modena/HTMLEditor-Indent-Black-rtl.png")));

		btnAtras_1.setBounds(277, 14, 49, 34);
		btnAtras_1.setVisible(false);
		frameCliente.getContentPane().add(btnAtras_1);

		btnAlante.setIcon(new ImageIcon(fichaClienteCrear.class
				.getResource("/com/sun/javafx/scene/control/skin/modena/HTMLEditor-Indent-Black.png")));
		btnAlante.setBounds(439, 14, 49, 34);
		btnAlante.setVisible(false);
		frameCliente.getContentPane().add(btnAlante);

		lblFlechas.setHorizontalAlignment(SwingConstants.CENTER);
		lblFlechas.setVisible(false);
		lblFlechas.setBounds(334, 14, 101, 34);
		frameCliente.getContentPane().add(lblFlechas);

		lblModo.setBounds(168, 14, 89, 40);
		lblModo.setText("Modo Crear");
		frameCliente.getContentPane().add(lblModo);

		btnEditar.setBounds(271, 350, 89, 23);
		btnEditar.setEnabled(false);
		frameCliente.getContentPane().add(btnEditar);

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

		// Botones modo Lectura
		mntmClienteLeer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (Listas.listaClientes.isEmpty()) {
					JOptionPane.showMessageDialog(frameCliente, "No hay clientes  registrados", "Error Lista Clientes",
							JOptionPane.ERROR_MESSAGE);
				} else {
					modoLeer();

				}
			}
		});

		btnAtras_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				prevCliente();
				mostrarCliente();
			}
		});

		btnAlante.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				nextCliente();
				mostrarCliente();
			}
		});

		
		mntmClienteEditar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (Listas.listaClientes.isEmpty()) {
					JOptionPane.showMessageDialog(frameCliente, "No hay clientes  registrados para editar", "Error Lista Clientes",
							JOptionPane.ERROR_MESSAGE);
				} else {
					modoEditar();

				}
			}
		});
		

		btnEditar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (Listas.listaClientes.isEmpty()) {
					JOptionPane.showMessageDialog(frameCliente, "No hay clientes registrados para editar", "Error Lista Clientes",
							JOptionPane.ERROR_MESSAGE);
				} else {
					modoEditar();

				}
			}
		});
		
		

		mntmClienteCrear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				btnLimpiar.doClick();
				modoCrear();

				
			}
		});
		
	}

	public void modoLeer() {
		lblModo.setVisible(true);
		lblModo.setText("Modo Leer Cliente");
		btnAtras_1.setEnabled(true);
		btnAtras_1.setVisible(true);
		lblFlechas.setVisible(true);
		btnAlante.setEnabled(true);
		btnAlante.setVisible(true);
		btnEditar.setEnabled(true);

		lblNombre.setEnabled(false);
		nombreField.setEnabled(false);
		lblApellido.setEnabled(false);
		apellidoField.setEnabled(false);
		codpostalField.setEnabled(false);
		lblCodPostal.setEnabled(false);
		lblDNI.setEnabled(false);
		dniField.setEnabled(false);
		lblTelefono.setEnabled(false);
		telefonoField.setEnabled(false);
		btnLimpiar.setEnabled(false);
		btnAtras.setEnabled(false);
		
		indiceClientes = Listas.listaClientes.size() - 1;
		mostrarCliente();
	}

	public void mostrarCliente() {
		if (!Listas.listaClientes.isEmpty()) {
			Cliente c = Listas.listaClientes.get(indiceClientes);

			nombreField.setText(c.getNombre());
			lblFlechas.setText(c.getNombre());

			telefonoField.setText(String.valueOf(c.getTelefono()));
			apellidoField.setText(c.getApellido());
			dniField.setText(c.getDni());
			codpostalField.setText(String.valueOf(c.getTelefono()));
			
		}
	}

	private int nextCliente() {
		++indiceClientes;
		if (indiceClientes == Listas.listaClientes.size()) {
			indiceClientes = 0;
		}
		return indiceClientes;
	}

	private int prevCliente() {
		--indiceClientes;
		if (indiceClientes < 0) {
			indiceClientes = Listas.listaClientes.size() - 1;
		}
		return indiceClientes;
	}

	
	
	public void modoEditar() {
		lblModo.setVisible(true);
		lblModo.setText("Modo Editar");
		btnAtras_1.setEnabled(true);
		btnAtras_1.setVisible(true);
		lblFlechas.setVisible(true);
		btnAlante.setEnabled(true);
		btnAlante.setVisible(true);
		btnEditar.setEnabled(false);

		lblNombre.setEnabled(true);
		nombreField.setEnabled(true);
		lblApellido.setEnabled(true);
		apellidoField.setEnabled(true);
		codpostalField.setEnabled(true);
		lblCodPostal.setEnabled(true);
		lblDNI.setEnabled(true);
		dniField.setEnabled(true);
		lblTelefono.setEnabled(true);
		telefonoField.setEnabled(true);
		btnLimpiar.setEnabled(true);
		btnAtras.setEnabled(true);

		indiceClientes = Listas.listaClientes.size() - 1;
		mostrarCliente();
	}
	
	
	
	public void modoCrear() {
		
		lblModo.setVisible(true);
		lblModo.setText("Modo Crear");
		btnAtras_1.setEnabled(false);
		btnAtras_1.setVisible(false);
		lblFlechas.setVisible(false);
		btnAlante.setEnabled(false);
		btnAlante.setVisible(false);
		btnEditar.setEnabled(false);

		lblNombre.setEnabled(true);
		nombreField.setEnabled(true);
		lblApellido.setEnabled(true);
		apellidoField.setEnabled(true);
		codpostalField.setEnabled(true);
		lblCodPostal.setEnabled(true);
		lblDNI.setEnabled(true);
		dniField.setEnabled(true);
		lblTelefono.setEnabled(true);
		telefonoField.setEnabled(true);
		btnLimpiar.setEnabled(true);
		btnAtras.setEnabled(true);
	
	}
	
	
	
//	public void crearCliente1() {
//
//		int indice = Listas.listaClientes.size() - 1;
//
//		Listas.listaClientes.get(indice).setNombre(nombre_);
//		Listas.listaClientes.get(indice).setApellido(apellido_);
//		Listas.listaClientes.get(indice).setCp(cp_);
//		Listas.listaClientes.get(indice).setDni(dni_);
//		Listas.listaClientes.get(indice).setTelefono(telefono_);
//
//		indiceClientes = indice;
//	}

	
	
	
	
	
	public boolean crearCliente() {

		String errores = "";
		boolean correcto = false;
		String telefono = telefonoField.getText();
		String cp = codpostalField.getText();
		nombre_ = nombreField.getText().toUpperCase();
		apellido_ = apellidoField.getText().toUpperCase();
		dni_ = dniField.getText().toUpperCase();
		int contErrores = 0;

		Pattern patronCP = Pattern.compile("^([1-9]{2}|[0-9][1-9]|[1-9][0-9])[0-9]{3}$");
		Pattern patronDNI = Pattern.compile("^\\d{8}[A-Z]{1}");
		Pattern patronTLFN = Pattern.compile("^(0034|\\+34)?(\\d\\d\\d)-? ?(\\d\\d)-? ?(\\d)-? ?(\\d)-? ?(\\d\\d)$");

		Matcher cp__ = patronCP.matcher(cp);
		Matcher dni__ = patronDNI.matcher(dni_);
		Matcher telefono__ = patronTLFN.matcher(telefono);

		if (nombre_.isEmpty()) {
			errores += "Introduzca nombre \n";
			contErrores++;
		}

		if (apellido_.isEmpty()) {
			errores += "Introduzca apellido \n";
			contErrores++;
		}

		if (cp.isEmpty()) {
			errores += "Introduzca codigo postal \n";
			contErrores++;
		} else {
			if (!cp__.matches()) {
				errores += "El CP no cumple con el modelo NNNNN.\n";
				contErrores++;
			} else
				cp_ = Integer.parseInt(cp);

		}

		if (dni_.isEmpty()) {
			errores += "Introduzca DNI \n";
			contErrores++;
		} else {
			if (!dni__.matches()) {
				errores += "El DNI no cumple con el modelo NNNNNNNNL.\n";
				contErrores++;
			}
		}

		if (telefono.isEmpty()) {
			errores += "Introduzca telefono \n";
			contErrores++;
		} else {
			if (!telefono__.matches()) {
				errores += "El telefono no cumple con el modelo.\n";
				contErrores++;
			} else
				telefono_ = Integer.parseInt(telefono);

		}

		if (contErrores == 0) {
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
