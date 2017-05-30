package ventanas;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
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
import models.Reparacion;
import models.Vehiculo;

public class FichaVehiculoCrear {

	// ATRIBUTOS
	protected JFrame frameCrearFichaVehiculo;
	private JTextField matriculaField;
	private JTextField kmField;
	private JTextField marcaField;
	private JTextField modeloField;
	private JTextField colorField;
	private JTextField motorField;
	private JLabel lblModoInsertar;
	private JLabel lblMatricula;
	private JLabel lblKm;
	private JLabel lblMarca;
	private JLabel lblModelo;
	private JLabel lblColor;
	private JLabel lblMotor;
	private JButton btnGuardar;
	private JButton btnCliente;
	private JButton btnReparar;
	private JButton btnClear;
	private JButton btnCerrar;
	private JLabel lblOpciones;
	private JLabel lblCliente;
	private JLabel lblUsuario;
	private JTextField usuarioField;
	private JButton btnAlante;
	private JButton btnAtras_1;
	private int indiceVehiculos;
	private JButton btnEditar;
	private JLabel lblTipoVehicul;

	// MENU
	private JMenu mnMenu;
	private JMenu mnCoches;
	private JMenuItem mntmCocheLeer;
	private JMenu mnClientes;
	private JMenuItem mntmClienteLeer;
	private JMenuItem mntmClienteCrear;
	private JMenuItem mntmReparacionLeer;
	private JMenu mnReparaciones;
	private JMenuBar menuBar;

	// ATRIBUTOS VEHICULO
	protected String matricula_;
	protected int km_;
	protected String marca_;
	protected String modelo_;
	protected String color_;
	protected int potencia_;
	protected JTextField clienteField;
	private JTextField tipoVehiculoField;
	// protected String dniCliente_;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FichaVehiculoCrear window = new FichaVehiculoCrear();
					window.frameCrearFichaVehiculo.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	// get frame
	public JFrame getFrameCrearFichaVehiculo() {
		return frameCrearFichaVehiculo;
	}

	/**
	 * Create the application.
	 */
	public FichaVehiculoCrear() {
		initialize();
		setPropiedades();
		setEventos();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		frameCrearFichaVehiculo = new JFrame();
		frameCrearFichaVehiculo.setResizable(false);
		lblModoInsertar = new JLabel("Modo Insertar/Crear Vehiculo");
		lblMatricula = new JLabel("Matricula");
		matriculaField = new JTextField();
		lblKm = new JLabel("KM");
		kmField = new JTextField();
		lblMarca = new JLabel("Marca");
		marcaField = new JTextField();
		lblModelo = new JLabel("Modelo");
		modeloField = new JTextField();
		lblColor = new JLabel("Color");
		colorField = new JTextField();
		lblMotor = new JLabel("Motor");
		motorField = new JTextField();
		btnGuardar = new JButton("GUARDAR");
		btnCliente = new JButton("CLIENTE");
		btnReparar = new JButton("REPARAR");
		
		btnClear = new JButton("");
		btnCerrar = new JButton("");
		lblOpciones = new JLabel("OPCIONES");
		lblCliente = new JLabel("Cliente");
		clienteField = new JTextField();
		usuarioField = new JTextField();
		lblUsuario = new JLabel("Mecanico");
		btnAtras_1 = new JButton("");
		btnAlante = new JButton("");
		btnEditar = new JButton("EDITAR");
		// MENU
		mnMenu = new JMenu("");
		mnCoches = new JMenu("");
		mntmCocheLeer = new JMenuItem("");
		mnReparaciones = new JMenu("");
		mntmReparacionLeer = new JMenuItem("");
		lblTipoVehicul = new JLabel("Tipo Vehiculo");
		menuBar = new JMenuBar();
		tipoVehiculoField = new JTextField();

	}

	public void setPropiedades() {

		frameCrearFichaVehiculo.setTitle("Vehiculos - ");// +
															// Listas.listaVehiculo.get(indiceVehiculos).getDniCliente());
		frameCrearFichaVehiculo.setBounds(100, 100, 679, 573);
		frameCrearFichaVehiculo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameCrearFichaVehiculo.getContentPane().setLayout(null);

		lblModoInsertar.setFont(new Font("Franklin Gothic Heavy", Font.PLAIN, 20));
		lblModoInsertar.setBounds(213, 11, 293, 30);
		frameCrearFichaVehiculo.getContentPane().add(lblModoInsertar);

		lblMatricula.setHorizontalAlignment(SwingConstants.CENTER);
		lblMatricula.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblMatricula.setBounds(10, 121, 157, 30);
		frameCrearFichaVehiculo.getContentPane().add(lblMatricula);

		matriculaField.setBounds(10, 162, 157, 30);
		frameCrearFichaVehiculo.getContentPane().add(matriculaField);
		matriculaField.setColumns(10);

		lblKm.setHorizontalAlignment(SwingConstants.CENTER);
		lblKm.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblKm.setBounds(213, 121, 157, 30);
		frameCrearFichaVehiculo.getContentPane().add(lblKm);

		kmField.setColumns(10);
		kmField.setBounds(213, 162, 157, 30);
		frameCrearFichaVehiculo.getContentPane().add(kmField);

		lblMarca.setHorizontalAlignment(SwingConstants.CENTER);
		lblMarca.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblMarca.setBounds(10, 203, 157, 30);
		frameCrearFichaVehiculo.getContentPane().add(lblMarca);

		marcaField.setColumns(10);
		marcaField.setBounds(10, 244, 157, 30);
		frameCrearFichaVehiculo.getContentPane().add(marcaField);

		lblModelo.setHorizontalAlignment(SwingConstants.CENTER);
		lblModelo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblModelo.setBounds(213, 203, 157, 30);
		frameCrearFichaVehiculo.getContentPane().add(lblModelo);

		modeloField.setColumns(10);
		modeloField.setBounds(213, 244, 157, 30);
		frameCrearFichaVehiculo.getContentPane().add(modeloField);

		lblColor.setHorizontalAlignment(SwingConstants.CENTER);
		lblColor.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblColor.setBounds(10, 285, 157, 30);
		frameCrearFichaVehiculo.getContentPane().add(lblColor);

		colorField.setColumns(10);
		colorField.setBounds(10, 326, 157, 30);
		frameCrearFichaVehiculo.getContentPane().add(colorField);

		lblMotor.setHorizontalAlignment(SwingConstants.CENTER);
		lblMotor.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblMotor.setBounds(213, 285, 157, 30);
		frameCrearFichaVehiculo.getContentPane().add(lblMotor);

		motorField.setColumns(10);
		motorField.setBounds(213, 326, 157, 30);
		frameCrearFichaVehiculo.getContentPane().add(motorField);

		btnGuardar.setIcon(
				new ImageIcon(FichaVehiculoCrear.class.getResource("/javax/swing/plaf/metal/icons/ocean/floppy.gif")));
		btnGuardar.setFont(new Font("Franklin Gothic Heavy", Font.PLAIN, 20));
		btnGuardar.setBounds(10, 453, 237, 81);
		frameCrearFichaVehiculo.getContentPane().add(btnGuardar);

		btnCliente.setIcon(new ImageIcon(
				FichaVehiculoCrear.class.getResource("/com/sun/javafx/scene/web/skin/Redo_16x16_JFX.png")));
		btnCliente.setFont(new Font("Franklin Gothic Heavy", Font.PLAIN, 20));
		btnCliente.setBounds(403, 234, 237, 81);
		frameCrearFichaVehiculo.getContentPane().add(btnCliente);

		btnReparar.setIcon(new ImageIcon(
				FichaVehiculoCrear.class.getResource("/com/sun/javafx/scene/web/skin/Cut_16x16_JFX.png")));
		btnReparar.setFont(new Font("Franklin Gothic Heavy", Font.PLAIN, 20));
		btnReparar.setBounds(403, 339, 237, 81);
		btnReparar.setEnabled(false);
		frameCrearFichaVehiculo.getContentPane().add(btnReparar);

		btnClear.setIcon(new ImageIcon(FichaVehiculoCrear.class.getResource("/iconos/1496111513_erase.png")));
		btnClear.setBounds(438, 453, 81, 81);
		frameCrearFichaVehiculo.getContentPane().add(btnClear);

		btnCerrar.setIcon(new ImageIcon(
				FichaVehiculoCrear.class.getResource("/com/sun/javafx/scene/control/skin/caspian/dialog-error.png")));
		btnCerrar.setBounds(559, 453, 81, 81);
		frameCrearFichaVehiculo.getContentPane().add(btnCerrar);

		lblOpciones.setFont(new Font("Franklin Gothic Heavy", Font.PLAIN, 20));
		lblOpciones.setHorizontalAlignment(SwingConstants.CENTER);
		lblOpciones.setBounds(402, 170, 238, 39);
		frameCrearFichaVehiculo.getContentPane().add(lblOpciones);

		lblCliente.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCliente.setBounds(253, 367, 81, 22);
		frameCrearFichaVehiculo.getContentPane().add(lblCliente);

		// clienteField.setText("Mirar codigo");
		// **************descomentar cuando el programa este
		// terminado***************
		clienteField.setText(Listas.dniCliente);
		clienteField.setBounds(213, 400, 157, 30);
		clienteField.setColumns(10);
		clienteField.setEditable(false);
		frameCrearFichaVehiculo.getContentPane().add(clienteField);

		lblUsuario.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblUsuario.setBounds(49, 367, 81, 22);
		frameCrearFichaVehiculo.getContentPane().add(lblUsuario);

		usuarioField.setEditable(false);
		usuarioField.setColumns(10);
		usuarioField.setBounds(10, 400, 157, 30);
		usuarioField.setText(Listas.usuario);
		frameCrearFichaVehiculo.getContentPane().add(usuarioField);

		btnAtras_1.setEnabled(false);
		btnAtras_1.setVisible(false);
		btnAtras_1.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		btnAtras_1.setIcon(new ImageIcon(FichaVehiculoCrear.class
				.getResource("/com/sun/javafx/scene/control/skin/modena/HTMLEditor-Outdent-Black.png")));
		btnAtras_1.setBounds(438, 98, 65, 53);
		frameCrearFichaVehiculo.getContentPane().add(btnAtras_1);

		btnAlante.setEnabled(false);
		btnAlante.setVisible(false);
		btnAlante.setIcon(new ImageIcon(FichaVehiculoCrear.class
				.getResource("/com/sun/javafx/scene/control/skin/modena/HTMLEditor-Outdent-Black-rtl.png")));
		btnAlante.setBounds(529, 98, 65, 53);
		frameCrearFichaVehiculo.getContentPane().add(btnAlante);

		// MENU
		menuBar.setBounds(0, 0, 157, 48);
		frameCrearFichaVehiculo.getContentPane().add(menuBar);

		menuBar.add(mnMenu);
		mnMenu.setIcon(
				new ImageIcon(FichaVehiculoCrear.class.getResource("/iconos/1495928384_dot-more-menu-hide.png")));

		mnClientes = new JMenu("");
		mntmClienteLeer = new JMenuItem("");

		mntmClienteCrear = new JMenuItem("");

		mnClientes.setIcon(new ImageIcon(FichaVehiculoCrear.class.getResource("/iconos/1495929007_104.png")));
		mnMenu.add(mnClientes);

		mntmClienteLeer.setIcon(new ImageIcon(FichaVehiculoCrear.class.getResource("/iconos/1495930663_67.png")));
		mnClientes.add(mntmClienteLeer);

		mntmClienteCrear
				.setIcon(new ImageIcon(FichaVehiculoCrear.class.getResource("/iconos/1495931018_new_product.png")));
		mnClientes.add(mntmClienteCrear);

		mnCoches.setIcon(
				new ImageIcon(FichaVehiculoCrear.class.getResource("/iconos/1495927937_solid-travel-tourism-car.png")));
		mnMenu.add(mnCoches);

		mntmCocheLeer.setIcon(new ImageIcon(FichaVehiculoCrear.class.getResource("/iconos/1495930663_67.png")));
		mnCoches.add(mntmCocheLeer);

		mnReparaciones.setIcon(new ImageIcon(FichaVehiculoCrear.class.getResource("/iconos/1495928663_wrench.png")));
		mnMenu.add(mnReparaciones);

		mntmReparacionLeer.setIcon(new ImageIcon(FichaVehiculoCrear.class.getResource("/iconos/1495930663_67.png")));
		mnReparaciones.add(mntmReparacionLeer);

		btnEditar.setEnabled(false);
		btnEditar.setFont(new Font("Dialog", Font.PLAIN, 20));
		btnEditar.setIcon(
				new ImageIcon(FichaVehiculoCrear.class.getResource("/com/sun/java/swing/plaf/motif/icons/Warn.gif")));
		btnEditar.setBounds(253, 451, 117, 82);
		frameCrearFichaVehiculo.getContentPane().add(btnEditar);

		lblTipoVehicul.setHorizontalAlignment(SwingConstants.CENTER);
		lblTipoVehicul.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTipoVehicul.setBounds(213, 52, 157, 30);
		frameCrearFichaVehiculo.getContentPane().add(lblTipoVehicul);

		tipoVehiculoField.setText(Listas.listaReparaciones.get(Listas.listaReparaciones.size() - 1).getTipoVehiculo());
		tipoVehiculoField.setEditable(false);
		tipoVehiculoField.setColumns(10);
		tipoVehiculoField.setBounds(213, 93, 157, 30);
		frameCrearFichaVehiculo.getContentPane().add(tipoVehiculoField);

	}

	public void setEventos() {

		btnReparar.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				crearReparacion();

				FichaReparar fr = new FichaReparar();
				fr.getframeFichaReparar().setVisible(true);

				frameCrearFichaVehiculo.dispose();
			}
		});
		
		btnCerrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {

				login l = new login();
				l.getLogin().setVisible(true);
				frameCrearFichaVehiculo.dispose();
			}
		});

		// boton atras hacia Principal.
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				clear();

			}
		});

		kmField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {
				char vChar = arg0.getKeyChar();
				if (!(Character.isDigit(vChar) || (vChar == KeyEvent.VK_DELETE))) {
					arg0.consume();
				}
			}
		});

		motorField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char vChar = e.getKeyChar();
				if (!(Character.isDigit(vChar) || (vChar == KeyEvent.VK_DELETE))) {
					e.consume();
				}
			}
		});

		btnGuardar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				String errores = "";
				int contErrores = 7;
				String aux;

				matricula_ = matriculaField.getText().trim().toUpperCase();

				Pattern tresLetrasFinal = Pattern.compile("^\\d{4}[A-Z]{3}");
				Matcher matricula3letras = tresLetrasFinal.matcher(matricula_);
				Pattern cuatroNumerosCentro = Pattern.compile("^\\d{1,2}[A-Z]{4}\\d{2}");
				Matcher matricula4numeros = cuatroNumerosCentro.matcher(matricula_);

				marca_ = marcaField.getText();
				modelo_ = modeloField.getText();
				color_ = colorField.getText();

				aux = kmField.getText().trim();
				if (aux == null || aux.equals("") || aux.isEmpty()) {
					errores += "Los Kms estan vacios.\n";
					contErrores--;
				} else {
					km_ = Integer.parseInt(kmField.getText());
					if (km_ <= 0) {
						errores += "La cantidad de Km no es correcta.\n";
						contErrores--;
					}
				}

				aux = motorField.getText().trim();
				if (aux == null || aux.equals("") || aux.isEmpty()) {
					errores += "La potencia esta vacia.\n";
					contErrores--;
				} else {
					potencia_ = Integer.parseInt(motorField.getText());
					if (potencia_ <= 0) {
						errores += "La cantidad de potencia no es correcta.\n";
						contErrores--;
					}
				}
				if (matricula_ == null || matricula_.equals("")) {
					errores += "La matricula esta vacia.\n";
					contErrores--;
				}
				if ((!matricula3letras.matches() && !matricula4numeros.matches())) {
					errores += "La matricula no cumple con el modelo.\n";
					contErrores--;
				}
				if (marca_ == null || marca_.equals("") || marca_.isEmpty()) {
					errores += "La marca esta vacia.\n";
					contErrores--;
				}
				if (modelo_ == null || modelo_.equals("") || modelo_.isEmpty()) {
					errores += "El modelo esta vacio.\n";
					contErrores--;
				}
				if (color_ == null || color_.equals("") || color_.isEmpty()) {
					errores += "El color esta vacio.\n";
					contErrores--;
				}

				if (contErrores == 7) {
					crearVehiculo();
					crearReparacion();

					FichaReparar fr = new FichaReparar();
					fr.getframeFichaReparar().setVisible(true);

					frameCrearFichaVehiculo.dispose();

				} else {
					JOptionPane.showMessageDialog(frameCrearFichaVehiculo, errores, "Error Campos Vehiculo",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		});

		btnAtras_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				prevVehiculo();
				mostrarVehiculo();
			}
		});

		btnAlante.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				nextVehiculo();
				mostrarVehiculo();
			}
		});

		mntmCocheLeer.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if (Listas.listaVehiculo.isEmpty() || Listas.listaVehiculo.get(0).getMarca() == null) {
					JOptionPane.showMessageDialog(frameCrearFichaVehiculo, "No hay vehiculos en registrados",
							"Error Lista Vehiculo", JOptionPane.ERROR_MESSAGE);
				} else {
					FichaVehiculoCrear fv = new FichaVehiculoCrear();
					fv.frameCrearFichaVehiculo.setVisible(true);
					fv.modoLeer();
					frameCrearFichaVehiculo.dispose();
				}
			}
		});

		mntmClienteLeer.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				fichaClienteCrear fc = new fichaClienteCrear();
				fc.frameCliente.setVisible(true);
				fc.modoLeer();
				frameCrearFichaVehiculo.dispose();

			}
		});
		mntmClienteCrear.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				fichaClienteCrear fc = new fichaClienteCrear();
				fc.frameCliente.setVisible(true);
				fc.modoCrear();
				frameCrearFichaVehiculo.dispose();

			}
		});

		mnMenu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {

				if (Listas.listaReparaciones.isEmpty()
						|| Listas.listaReparaciones.get(0).getPresupuestoField().isEmpty()) {
					mnReparaciones.setEnabled(false);
				}
				if (Listas.listaVehiculo.isEmpty() || Listas.listaVehiculo.get(0).getMarca() == null) {
					mnCoches.setEnabled(false);
				}
				if (Listas.listaClientes.isEmpty()) {
					mnClientes.setEnabled(false);
				}
			}
		});

		mntmReparacionLeer.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				FichaReparar fr = new FichaReparar();
				fr.getframeFichaReparar().setVisible(true);
				fr.modoLeer();
				fr.mostrarReparacion();
				frameCrearFichaVehiculo.dispose();
			}
		});

	}

	public void crearVehiculo() {

		int indice = Listas.listaVehiculo.size() - 1;

		Listas.listaVehiculo.get(indice).setMatricula(matricula_);
		Listas.listaVehiculo.get(indice).setColor(color_);
		Listas.listaVehiculo.get(indice).setKm(km_);
		Listas.listaVehiculo.get(indice).setMarca(marca_);
		Listas.listaVehiculo.get(indice).setModelo(modelo_);
		Listas.listaVehiculo.get(indice).setPotencia(potencia_);

		indiceVehiculos = indice;
	}

	public void crearReparacion() {
		Reparacion r = new Reparacion(Listas.usuario, matricula_,
				Listas.listaVehiculo.get(indiceVehiculos).getDniCliente(),
				Listas.listaVehiculo.get(indiceVehiculos).getTipoVehiculo());
		Listas.listaReparaciones.add(r);

	}

	public void modoLeer() {

		lblModoInsertar.setText("Modo Leer Vehiculo");
		btnAtras_1.setEnabled(true);
		btnAtras_1.setVisible(true);
		btnAlante.setEnabled(true);
		btnAlante.setVisible(true);
		btnEditar.setEnabled(true);

		lblMatricula.setEnabled(false);
		matriculaField.setEnabled(false);
		lblKm.setEnabled(false);
		kmField.setEnabled(false);
		lblMarca.setEnabled(false);
		marcaField.setEnabled(false);
		lblModelo.setEnabled(false);
		modeloField.setEnabled(false);
		lblColor.setEnabled(false);
		colorField.setEnabled(false);
		lblMotor.setEnabled(false);
		motorField.setEnabled(false);
		btnGuardar.setEnabled(false);
		btnCliente.setEnabled(false);
		btnReparar.setEnabled(true);
		btnClear.setEnabled(false);
		btnCerrar.setEnabled(true);

		indiceVehiculos = Listas.listaVehiculo.size() - 1;
		mostrarVehiculo();
	}

	public void modoEditar() {

		lblModoInsertar.setText("Modo Editar/Modificar Vehiculo");
		btnAtras_1.setEnabled(true);
		btnAtras_1.setVisible(true);
		btnAlante.setEnabled(true);
		btnAlante.setVisible(true);
		btnEditar.setEnabled(false);

		lblMatricula.setEnabled(true);
		matriculaField.setEnabled(true);
		lblKm.setEnabled(true);
		kmField.setEnabled(true);
		lblMarca.setEnabled(true);
		marcaField.setEnabled(true);
		lblModelo.setEnabled(true);
		modeloField.setEnabled(true);
		lblColor.setEnabled(true);
		colorField.setEnabled(true);
		lblMotor.setEnabled(true);
		motorField.setEnabled(true);
		btnGuardar.setEnabled(true);
		btnCliente.setEnabled(true);
		btnReparar.setEnabled(true);
		btnClear.setEnabled(true);
		btnCerrar.setEnabled(true);

	}

	public void modoCrear() {

		lblModoInsertar.setText("Modo Crear/Insertar Vehiculo");
		clear();
		btnAtras_1.setEnabled(false);
		btnAtras_1.setVisible(false);
		btnAlante.setEnabled(false);
		btnAlante.setVisible(false);
		btnEditar.setEnabled(false);

		lblMatricula.setEnabled(true);
		matriculaField.setEnabled(true);
		lblKm.setEnabled(true);
		kmField.setEnabled(true);
		lblMarca.setEnabled(true);
		marcaField.setEnabled(true);
		lblModelo.setEnabled(true);
		modeloField.setEnabled(true);
		lblColor.setEnabled(true);
		colorField.setEnabled(true);
		lblMotor.setEnabled(true);
		motorField.setEnabled(true);
		btnGuardar.setEnabled(true);
		btnCliente.setEnabled(true);
		btnReparar.setEnabled(false);
		btnClear.setEnabled(true);
		btnCerrar.setEnabled(true);

	}

	public void mostrarVehiculo() {
		if (!Listas.listaVehiculo.isEmpty()) {
			Vehiculo ve = Listas.listaVehiculo.get(indiceVehiculos);

			matriculaField.setText(ve.getMatricula());
			kmField.setText(String.valueOf(ve.getMatricula()));
			marcaField.setText(ve.getMarca());
			modeloField.setText(ve.getModelo());
			colorField.setText(ve.getColor());
			motorField.setText(String.valueOf(ve.getPotencia()));
			clienteField.setText(ve.getDniCliente());
		}
	}

	private int nextVehiculo() {
		++indiceVehiculos;
		if (indiceVehiculos == Listas.listaVehiculo.size()) {
			indiceVehiculos = 0;
		}
		return indiceVehiculos;
	}

	private int prevVehiculo() {
		--indiceVehiculos;
		if (indiceVehiculos < 0) {
			indiceVehiculos = Listas.listaVehiculo.size() - 1;
		}
		return indiceVehiculos;
	}

	private void clear() {
		matriculaField.setText("");
		kmField.setText(String.valueOf(0));
		marcaField.setText("");
		modeloField.setText("");
		colorField.setText("");
		motorField.setText(String.valueOf(0));
	}
}
