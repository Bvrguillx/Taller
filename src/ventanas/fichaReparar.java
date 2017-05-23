package ventanas;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.AbstractListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;

public class fichaReparar {

	private JFrame frameFichaReparar;
	private JTextField responsableField;
	private JTextField matriculaField;
	private JTextField fechaentradaField;
	private JTextField fechasalidaField;
	private JTextField textField;
	private JLabel lblClientesicosDelTrvpller;
	private JLabel lblResponsable;
	private JLabel lblMatricula;
	private JLabel lblFechaEntrada;
	private JLabel lblFechaSalida;
	private JLabel lblComentarios;
	private JLabel lblEstado;
	@SuppressWarnings("rawtypes")
	private JList listEstado;
	private JButton btnCrearFicha;
	private JButton btnVaciar;
	private JLabel lblOpciones;
	private JButton btnNewButton;
	private JTextField presupuestoField;
	private JLabel lblPresupuesto;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					fichaReparar window = new fichaReparar();
					window.frameFichaReparar.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public fichaReparar() {
		initialize();
		setPropiedades();
		setEventos();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	@SuppressWarnings({ "rawtypes", })
	private void initialize() {
	
		frameFichaReparar = new JFrame();
		frameFichaReparar.setResizable(false);
		lblClientesicosDelTrvpller = new JLabel("Clientesicos del Trvpller");
		lblResponsable = new JLabel("Responsable");
		responsableField = new JTextField();
		lblMatricula = new JLabel("Matricula");
		matriculaField = new JTextField();
		lblFechaEntrada = new JLabel("Fecha Entrada");
		fechaentradaField = new JTextField();
		lblFechaSalida = new JLabel("Fecha Salida");
		fechasalidaField = new JTextField();
		lblComentarios = new JLabel("Comentarios");
		textField = new JTextField();
		lblEstado = new JLabel("Estado");
		listEstado = new JList();
		btnCrearFicha = new JButton("CREAR FICHA");
		btnVaciar = new JButton("VACIAR");
		lblOpciones = new JLabel("Opciones");
		btnNewButton = new JButton("");
		presupuestoField = new JTextField();
		lblPresupuesto = new JLabel("Presupuesto");
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes", "serial" })
	public void setPropiedades(){
		
		frameFichaReparar.setTitle("Reparacion de Vehiculos");
		frameFichaReparar.setBounds(100, 100, 743, 495);
		frameFichaReparar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameFichaReparar.getContentPane().setLayout(null);
		
		lblClientesicosDelTrvpller.setFont(new Font("Franklin Gothic Heavy", Font.PLAIN, 20));
		lblClientesicosDelTrvpller.setHorizontalAlignment(SwingConstants.CENTER);
		lblClientesicosDelTrvpller.setBounds(10, 11, 707, 46);
		frameFichaReparar.getContentPane().add(lblClientesicosDelTrvpller);
		
		lblResponsable.setHorizontalAlignment(SwingConstants.CENTER);
		lblResponsable.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblResponsable.setBounds(10, 15, 209, 36);
		frameFichaReparar.getContentPane().add(lblResponsable);
			
		responsableField.setBounds(10, 51, 209, 46);
		frameFichaReparar.getContentPane().add(responsableField);
		responsableField.setColumns(10);
		
		lblMatricula.setHorizontalAlignment(SwingConstants.CENTER);
		lblMatricula.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblMatricula.setBounds(10, 97, 209, 36);
		frameFichaReparar.getContentPane().add(lblMatricula);
		
		matriculaField.setColumns(10);
		matriculaField.setBounds(10, 133, 209, 46);
		frameFichaReparar.getContentPane().add(matriculaField);
		
		lblFechaEntrada.setHorizontalAlignment(SwingConstants.CENTER);
		lblFechaEntrada.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblFechaEntrada.setBounds(10, 182, 209, 36);
		frameFichaReparar.getContentPane().add(lblFechaEntrada);
		
		fechaentradaField.setColumns(10);
		fechaentradaField.setBounds(10, 219, 209, 46);
		frameFichaReparar.getContentPane().add(fechaentradaField);
		
		lblFechaSalida.setHorizontalAlignment(SwingConstants.CENTER);
		lblFechaSalida.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblFechaSalida.setBounds(239, 172, 209, 36);
		frameFichaReparar.getContentPane().add(lblFechaSalida);
		
		fechasalidaField.setColumns(10);
		fechasalidaField.setBounds(239, 219, 209, 46);
		frameFichaReparar.getContentPane().add(fechasalidaField);
		
		lblComentarios.setHorizontalAlignment(SwingConstants.CENTER);
		lblComentarios.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblComentarios.setBounds(458, 68, 259, 36);
		frameFichaReparar.getContentPane().add(lblComentarios);
		
		textField.setBounds(458, 115, 259, 150);
		frameFichaReparar.getContentPane().add(textField);
		textField.setColumns(10);
		
		lblEstado.setHorizontalAlignment(SwingConstants.CENTER);
		lblEstado.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblEstado.setBounds(10, 270, 209, 36);
		frameFichaReparar.getContentPane().add(lblEstado);
		
		listEstado.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		listEstado.setLayoutOrientation(JList.HORIZONTAL_WRAP);
		listEstado.setFont(new Font("Tahoma", Font.PLAIN, 20));
		listEstado.setModel(new AbstractListModel() {
			String[] values = new String[] {"Terminado", "Pendiente de Recoger (T)", "Reparando", "En Espera", "Presupuesto Rechazado"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		listEstado.setBounds(10, 317, 250, 139);
		frameFichaReparar.getContentPane().add(listEstado);
		
		btnCrearFicha.setIcon(new ImageIcon(fichaReparar.class.getResource("/com/sun/javafx/scene/control/skin/caspian/images/capslock-icon.png")));
		btnCrearFicha.setFont(new Font("Franklin Gothic Heavy", Font.PLAIN, 20));
		btnCrearFicha.setBounds(451, 321, 259, 57);
		frameFichaReparar.getContentPane().add(btnCrearFicha);
		
		btnVaciar.setIcon(new ImageIcon(fichaReparar.class.getResource("/com/sun/javafx/scene/control/skin/modena/dialog-confirm.png")));
		btnVaciar.setFont(new Font("Franklin Gothic Heavy", Font.PLAIN, 20));
		btnVaciar.setBounds(451, 389, 259, 57);
		frameFichaReparar.getContentPane().add(btnVaciar);
		
		lblOpciones.setHorizontalAlignment(SwingConstants.CENTER);
		lblOpciones.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblOpciones.setBounds(452, 277, 256, 36);
		frameFichaReparar.getContentPane().add(lblOpciones);
		
		btnNewButton.setIcon(new ImageIcon(fichaReparar.class.getResource("/com/sun/javafx/scene/web/skin/Undo_16x16_JFX.png")));
		btnNewButton.setBounds(628, 11, 82, 46);
		frameFichaReparar.getContentPane().add(btnNewButton);
		
		lblPresupuesto.setHorizontalAlignment(SwingConstants.CENTER);
		lblPresupuesto.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPresupuesto.setBounds(239, 97, 209, 36);
		frameFichaReparar.getContentPane().add(lblPresupuesto);
		
		presupuestoField.setColumns(10);
		presupuestoField.setBounds(239, 133, 209, 46);
		frameFichaReparar.getContentPane().add(presupuestoField);
	}
	
	public void setEventos(){
		
	}
}
