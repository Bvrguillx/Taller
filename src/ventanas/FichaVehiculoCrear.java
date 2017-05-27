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
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import container.Listas;
import models.Vehiculo;

public class FichaVehiculoCrear {

	// ATRIBUTOS
	private JFrame frameCrearFichaVehiculo;
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
	private JButton btnAtras;
	private JButton btnCerrar;
	private JLabel lblOpciones;
	private JLabel lblCliente;
	private JLabel lblUsuario;
	private JTextField usuarioField;
	private JButton btnAlante;
	private JButton btnAtras_1;
	private JMenuBar menuBar;
	private int indiceVehiculos;

	// ATRIBUTOS VEHICULO
	protected String matricula_;
	protected int km_;
	protected String marca_;
	protected String modelo_;
	protected String color_;
	protected int potencia_;
	protected JTextField clienteField;
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
		btnAtras = new JButton("");
		btnCerrar = new JButton("");
		lblOpciones = new JLabel("OPCIONES");
		lblCliente = new JLabel("Cliente");
		clienteField = new JTextField();
		usuarioField = new JTextField();
		lblUsuario = new JLabel("Mecanico");
		btnAtras_1 = new JButton("");
		btnAlante = new JButton("");
		menuBar = new JMenuBar();

	}

	public void setPropiedades() {

		frameCrearFichaVehiculo.setTitle("Crear Ficha Vehiculo");
		frameCrearFichaVehiculo.setBounds(100, 100, 679, 468);
		frameCrearFichaVehiculo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameCrearFichaVehiculo.getContentPane().setLayout(null);

		lblModoInsertar.setFont(new Font("Franklin Gothic Heavy", Font.PLAIN, 20));
		lblModoInsertar.setBounds(200, 0, 293, 30);
		frameCrearFichaVehiculo.getContentPane().add(lblModoInsertar);

		lblMatricula.setHorizontalAlignment(SwingConstants.CENTER);
		lblMatricula.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblMatricula.setBounds(10, 52, 157, 30);
		frameCrearFichaVehiculo.getContentPane().add(lblMatricula);

		matriculaField.setBounds(10, 82, 157, 30);
		frameCrearFichaVehiculo.getContentPane().add(matriculaField);
		matriculaField.setColumns(10);

		lblKm.setHorizontalAlignment(SwingConstants.CENTER);
		lblKm.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblKm.setBounds(213, 52, 157, 30);
		frameCrearFichaVehiculo.getContentPane().add(lblKm);

		kmField.setColumns(10);
		kmField.setBounds(213, 82, 157, 30);
		frameCrearFichaVehiculo.getContentPane().add(kmField);

		lblMarca.setHorizontalAlignment(SwingConstants.CENTER);
		lblMarca.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblMarca.setBounds(10, 124, 157, 30);
		frameCrearFichaVehiculo.getContentPane().add(lblMarca);

		marcaField.setColumns(10);
		marcaField.setBounds(10, 153, 157, 30);
		frameCrearFichaVehiculo.getContentPane().add(marcaField);

		lblModelo.setHorizontalAlignment(SwingConstants.CENTER);
		lblModelo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblModelo.setBounds(213, 124, 157, 30);
		frameCrearFichaVehiculo.getContentPane().add(lblModelo);

		modeloField.setColumns(10);
		modeloField.setBounds(213, 153, 157, 30);
		frameCrearFichaVehiculo.getContentPane().add(modeloField);

		lblColor.setHorizontalAlignment(SwingConstants.CENTER);
		lblColor.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblColor.setBounds(10, 195, 157, 30);
		frameCrearFichaVehiculo.getContentPane().add(lblColor);

		colorField.setColumns(10);
		colorField.setBounds(10, 223, 157, 30);
		frameCrearFichaVehiculo.getContentPane().add(colorField);

		lblMotor.setHorizontalAlignment(SwingConstants.CENTER);
		lblMotor.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblMotor.setBounds(213, 195, 157, 30);
		frameCrearFichaVehiculo.getContentPane().add(lblMotor);

		motorField.setColumns(10);
		motorField.setBounds(213, 223, 157, 30);
		frameCrearFichaVehiculo.getContentPane().add(motorField);

		btnGuardar.setIcon(
				new ImageIcon(FichaVehiculoCrear.class.getResource("/javax/swing/plaf/metal/icons/ocean/floppy.gif")));
		btnGuardar.setFont(new Font("Franklin Gothic Heavy", Font.PLAIN, 20));
		btnGuardar.setBounds(78, 335, 237, 81);
		frameCrearFichaVehiculo.getContentPane().add(btnGuardar);

		btnCliente.setIcon(new ImageIcon(
				FichaVehiculoCrear.class.getResource("/com/sun/javafx/scene/web/skin/Redo_16x16_JFX.png")));
		btnCliente.setFont(new Font("Franklin Gothic Heavy", Font.PLAIN, 20));
		btnCliente.setBounds(415, 99, 237, 81);
		frameCrearFichaVehiculo.getContentPane().add(btnCliente);

		btnReparar.setIcon(new ImageIcon(
				FichaVehiculoCrear.class.getResource("/com/sun/javafx/scene/web/skin/Cut_16x16_JFX.png")));
		btnReparar.setFont(new Font("Franklin Gothic Heavy", Font.PLAIN, 20));
		btnReparar.setBounds(415, 206, 237, 81);
		frameCrearFichaVehiculo.getContentPane().add(btnReparar);

		btnAtras.setIcon(new ImageIcon(
				FichaVehiculoCrear.class.getResource("/com/sun/javafx/scene/web/skin/Undo_16x16_JFX.png")));
		btnAtras.setBounds(432, 335, 81, 81);
		frameCrearFichaVehiculo.getContentPane().add(btnAtras);

		btnCerrar.setIcon(new ImageIcon(
				FichaVehiculoCrear.class.getResource("/com/sun/javafx/scene/control/skin/caspian/dialog-error.png")));
		btnCerrar.setBounds(554, 335, 81, 81);
		frameCrearFichaVehiculo.getContentPane().add(btnCerrar);

		lblOpciones.setFont(new Font("Franklin Gothic Heavy", Font.PLAIN, 20));
		lblOpciones.setHorizontalAlignment(SwingConstants.CENTER);
		lblOpciones.setBounds(414, 56, 238, 39);
		frameCrearFichaVehiculo.getContentPane().add(lblOpciones);

		lblCliente.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCliente.setBounds(258, 265, 81, 22);
		frameCrearFichaVehiculo.getContentPane().add(lblCliente);

		clienteField.setText("Mirar codigo");
		// **************descomentar cuando el programa este
		// terminado***************
		// clienteField.setText(Listas.listaClientes.get(Listas.listaClientes.size()-1).getDni());
		clienteField.setBounds(213, 293, 157, 30);
		clienteField.setColumns(10);
		clienteField.setEditable(false);
		frameCrearFichaVehiculo.getContentPane().add(clienteField);

		lblUsuario.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblUsuario.setBounds(55, 265, 81, 22);
		frameCrearFichaVehiculo.getContentPane().add(lblUsuario);

		usuarioField.setEditable(false);
		usuarioField.setColumns(10);
		usuarioField.setBounds(10, 293, 157, 30);
		usuarioField.setText(Listas.usuario);
		frameCrearFichaVehiculo.getContentPane().add(usuarioField);

		menuBar.setBounds(0, 0, 132, 22);
		frameCrearFichaVehiculo.getContentPane().add(menuBar);

		btnAtras_1.setEnabled(false);
		btnAtras_1.setVisible(false);
		btnAtras_1.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		btnAtras_1.setIcon(new ImageIcon(FichaVehiculoCrear.class
				.getResource("/com/sun/javafx/scene/control/skin/modena/HTMLEditor-Outdent-Black.png")));
		btnAtras_1.setBounds(531, 5, 65, 53);
		frameCrearFichaVehiculo.getContentPane().add(btnAtras_1);

		btnAlante.setEnabled(false);
		btnAlante.setVisible(false);
		btnAlante.setIcon(new ImageIcon(FichaVehiculoCrear.class
				.getResource("/com/sun/javafx/scene/control/skin/modena/HTMLEditor-Outdent-Black-rtl.png")));
		btnAlante.setBounds(608, 5, 65, 53);
		frameCrearFichaVehiculo.getContentPane().add(btnAlante);

	}

	public void setEventos() {

		btnCerrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				System.exit(0);
			}
		});

		// boton atras hacia Principal.
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Principal ventanaPrincipal = new Principal();
				ventanaPrincipal.getFramePrincipal().setVisible(true);
				frameCrearFichaVehiculo.dispose();

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
				int contErrores = 6;

				matricula_ = matriculaField.getText().trim();
				km_ = Integer.parseInt(kmField.getText());
				marca_ = marcaField.getText().trim();
				modelo_ = modeloField.getText().trim();
				color_ = colorField.getText().trim();
				potencia_ = Integer.parseInt(motorField.getText());

				Pattern tresLetrasFinal = Pattern.compile("^\\d{4}[A-Z]{3}");
				Matcher matricula3letras = tresLetrasFinal.matcher(matricula_);

				// 1 o2 letras, 4 numeros, 2 letras
				Pattern cuatroNumerosCentro = Pattern.compile("^\\d{1,2}[A-Z]{4}\\d{2}");
				Matcher matricula4numeros = cuatroNumerosCentro.matcher(matricula_);

				if (matricula_ == null || matricula_.equals("") || matricula3letras.matches()
						|| matricula4numeros.matches()) {
					errores += "La matricula no cumple con el modelo.\n";
					contErrores--;
				}
				if (km_ <= 0) {
					errores += "Los Kms estan vacios.\n";
					contErrores--;
				}
				if (marca_ == null || marca_.equals("")) {
					errores += "La marca esta vacia.\n";
					contErrores--;
				}
				if (modelo_ == null || modelo_.equals("")) {
					errores += "El modelo esta vacio.\n";
					contErrores--;
				}
				if (color_ == null || color_.equals("")) {
					errores += "El color esta vacio.\n";
					contErrores--;
				}
				if (potencia_ <= 0) {
					errores += "La potencia esta vacia.\n";
					contErrores--;
				}
				if (contErrores == 6) {
					crearVehiculo();
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
			}
		});

		btnAlante.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				nextVehiculo();
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
	}

	public void modoLeer() {

		lblModoInsertar.setText("Modo Leer Vehiculo");
		btnAtras_1.setEnabled(true);
		btnAtras_1.setVisible(true);
		btnAlante.setEnabled(true);
		btnAlante.setVisible(true);

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
		btnReparar.setEnabled(false);
		btnAtras.setEnabled(false);
		btnCerrar.setEnabled(false);

		indiceVehiculos = Listas.listaVehiculo.size() - 1;
		mostrarVehiculo();
	}

	public void modoEditar() {

		lblModoInsertar.setText("Modo Editar/Modificar Vehiculo");
		btnAtras_1.setEnabled(true);
		btnAtras_1.setVisible(true);
		btnAlante.setEnabled(true);
		btnAlante.setVisible(true);

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
		btnAtras.setEnabled(true);
		btnCerrar.setEnabled(true);

	}

	public void modoCrear() {

		lblModoInsertar.setText("Modo Crear/Insertar Vehiculo");
		btnAtras_1.setEnabled(false);
		btnAtras_1.setVisible(false);
		btnAlante.setEnabled(false);
		btnAlante.setVisible(false);

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
		btnAtras.setEnabled(true);
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
}
