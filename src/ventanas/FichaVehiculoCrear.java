package ventanas;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

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
	
	// ATRIBUTOS VEHICULO
	protected String matricula_;
	protected int km_;
	protected String marca_;
	protected String modelo_;
	protected String color_;
	protected int potencia_;
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
		lblModoInsertar = new JLabel("Modo    Insertar    -    Crear    Vehiculo");
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

	}

	public void setPropiedades() {

		frameCrearFichaVehiculo.setTitle("Crear Ficha Vehiculo");
		frameCrearFichaVehiculo.setBounds(100, 100, 679, 468);
		frameCrearFichaVehiculo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameCrearFichaVehiculo.getContentPane().setLayout(null);

		lblModoInsertar.setFont(new Font("Franklin Gothic Heavy", Font.PLAIN, 20));
		lblModoInsertar.setBounds(10, 11, 360, 30);
		frameCrearFichaVehiculo.getContentPane().add(lblModoInsertar);

		lblMatricula.setHorizontalAlignment(SwingConstants.CENTER);
		lblMatricula.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblMatricula.setBounds(10, 52, 157, 30);
		frameCrearFichaVehiculo.getContentPane().add(lblMatricula);

		matriculaField.setBounds(10, 93, 157, 30);
		frameCrearFichaVehiculo.getContentPane().add(matriculaField);
		matriculaField.setColumns(10);

		lblKm.setHorizontalAlignment(SwingConstants.CENTER);
		lblKm.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblKm.setBounds(213, 52, 157, 30);
		frameCrearFichaVehiculo.getContentPane().add(lblKm);

		kmField.setColumns(10);
		kmField.setBounds(213, 93, 157, 30);
		frameCrearFichaVehiculo.getContentPane().add(kmField);

		lblMarca.setHorizontalAlignment(SwingConstants.CENTER);
		lblMarca.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblMarca.setBounds(10, 134, 157, 30);
		frameCrearFichaVehiculo.getContentPane().add(lblMarca);

		marcaField.setColumns(10);
		marcaField.setBounds(10, 175, 157, 30);
		frameCrearFichaVehiculo.getContentPane().add(marcaField);

		lblModelo.setHorizontalAlignment(SwingConstants.CENTER);
		lblModelo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblModelo.setBounds(213, 134, 157, 30);
		frameCrearFichaVehiculo.getContentPane().add(lblModelo);

		modeloField.setColumns(10);
		modeloField.setBounds(213, 175, 157, 30);
		frameCrearFichaVehiculo.getContentPane().add(modeloField);

		lblColor.setHorizontalAlignment(SwingConstants.CENTER);
		lblColor.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblColor.setBounds(10, 216, 157, 30);
		frameCrearFichaVehiculo.getContentPane().add(lblColor);

		colorField.setColumns(10);
		colorField.setBounds(10, 257, 157, 30);
		frameCrearFichaVehiculo.getContentPane().add(colorField);

		lblMotor.setHorizontalAlignment(SwingConstants.CENTER);
		lblMotor.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblMotor.setBounds(213, 216, 157, 30);
		frameCrearFichaVehiculo.getContentPane().add(lblMotor);

		motorField.setColumns(10);
		motorField.setBounds(213, 257, 157, 30);
		frameCrearFichaVehiculo.getContentPane().add(motorField);

		btnGuardar.setIcon(
				new ImageIcon(FichaVehiculoCrear.class.getResource("/javax/swing/plaf/metal/icons/ocean/floppy.gif")));
		btnGuardar.setFont(new Font("Franklin Gothic Heavy", Font.PLAIN, 20));
		btnGuardar.setBounds(78, 335, 237, 81);
		frameCrearFichaVehiculo.getContentPane().add(btnGuardar);

		btnCliente.setIcon(new ImageIcon(
				FichaVehiculoCrear.class.getResource("/com/sun/javafx/scene/web/skin/Redo_16x16_JFX.png")));
		btnCliente.setFont(new Font("Franklin Gothic Heavy", Font.PLAIN, 20));
		btnCliente.setBounds(415, 93, 237, 81);
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
		lblOpciones.setBounds(415, 37, 238, 39);
		frameCrearFichaVehiculo.getContentPane().add(lblOpciones);

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
				if (!(Character.isDigit(vChar) ||
						(vChar == KeyEvent.VK_DELETE)))
				{
					arg0.consume(); 
					}
			}
		});
	
		motorField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char vChar = e.getKeyChar();
				if (!(Character.isDigit(vChar) ||
						(vChar == KeyEvent.VK_DELETE)))
				{
					e.consume(); 
					}
			}
		});
		
		btnGuardar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				matricula_ = matriculaField.getText().trim();
				km_ = Integer.parseInt(kmField.getText());
				marca_ = marcaField.getText().trim();
				modelo_ = modeloField.getText().trim();
				color_ = colorField.getText().trim();
				potencia_ = Integer.parseInt(motorField.getText());
				
				if (matricula_== null || matricula_.equals("") || matricula_ == ""){
					JOptionPane.showMessageDialog(frameCrearFichaVehiculo, "Campo Matricula Vacio", "Matricula",
							JOptionPane.ERROR_MESSAGE);
				}
				if (km_ <= 0){
					JOptionPane.showMessageDialog(frameCrearFichaVehiculo, "Campo Km Vacio", "Kilometros",
							JOptionPane.ERROR_MESSAGE);
				}
				if (marca_ == null || marca_.equals("") || marca_ == ""){
					JOptionPane.showMessageDialog(frameCrearFichaVehiculo, "Campo Marca Vacio", "Marca",
							JOptionPane.ERROR_MESSAGE);
				}
				if (modelo_ == null || modelo_.equals("") || modelo_ == ""){
					JOptionPane.showMessageDialog(frameCrearFichaVehiculo, "Campo Modelo Vacio", "Modelo",
							JOptionPane.ERROR_MESSAGE);
				}
				if (color_ == null || color_.equals("") || color_ == ""){
					JOptionPane.showMessageDialog(frameCrearFichaVehiculo, "Campo Color Vacio", "Color",
							JOptionPane.ERROR_MESSAGE);
				}
				if (potencia_ <= 0){
					JOptionPane.showMessageDialog(frameCrearFichaVehiculo, "Campo Potencia Negativo", "Potencia",
							JOptionPane.ERROR_MESSAGE);
				
				}
			}
		});
	}
	public boolean crearVehiculo(){
		
		boolean continua =false;
		String errores="";
		String km__ = kmField.getText();
		String potencia__ = motorField.getText();
		matricula_ = matriculaField.getText().trim();
		marca_ = marcaField.getText().trim();
		modelo_ = modeloField.getText().trim();
		color_ = colorField.getText().trim();

		
		
		return continua;
	}
}
