package ventanas;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.AbstractListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.JTextArea;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import com.toedter.calendar.JDateChooser;

import container.Listas;

public class FichaReparar {

	private JFrame frameFichaReparar;
	private JTextField responsableField;
	private JTextField matriculaField;
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
	private JButton btnAtras;
	private JTextField presupuestoField;
	private JLabel lblPresupuesto;
	private JTextArea comentariosArea;
	private JDateChooser fechaEntradaDC;
	private JDateChooser fechaSalidaDC;
	protected login g;
	private JButton btnEditar;
	private JButton btnSiguiente;
	private JButton btnAnterior;
	private JButton btnPrincipal;
	private JButton btnGuardar;
	private JButton btnLeer;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FichaReparar window = new FichaReparar();
					window.frameFichaReparar.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	//get BuscarMatricula
		public JFrame getframeFichaReparar() {
			return frameFichaReparar;
		}
	
	
	/**
	 * Create the application.
	 */
	public FichaReparar() {
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
		lblClientesicosDelTrvpller = new JLabel("Clientesicos del Trvpller");
		lblResponsable = new JLabel("Responsable");
		responsableField = new JTextField();
		lblMatricula = new JLabel("Matricula");
		matriculaField = new JTextField();
		lblFechaEntrada = new JLabel("Fecha Entrada");
		lblFechaSalida = new JLabel("Fecha Salida");
		lblComentarios = new JLabel("Comentarios");
		lblEstado = new JLabel("Estado");
		listEstado = new JList();
		btnCrearFicha = new JButton("CREAR FICHA");
		btnVaciar = new JButton("VACIAR");
		lblOpciones = new JLabel("Opciones");
		btnAtras = new JButton("");
		presupuestoField = new JTextField();
		lblPresupuesto = new JLabel("Presupuesto");
		comentariosArea = new JTextArea();
		fechaEntradaDC = new JDateChooser();
		fechaSalidaDC = new JDateChooser();
		btnLeer = new JButton("LEER");
		btnEditar = new JButton("EDITAR");
		btnSiguiente = new JButton("SIGUIENTE");
		btnAnterior = new JButton("ANTERIOR");
		btnGuardar = new JButton("GUARDAR");
		btnPrincipal = new JButton("");
	}

	@SuppressWarnings({ "unchecked", "rawtypes", "serial" })
	public void setPropiedades() {

		frameFichaReparar.setTitle("Reparacion de Vehiculos");
		frameFichaReparar.setBounds(100, 100, 743, 495);
		frameFichaReparar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameFichaReparar.getContentPane().setLayout(null);

		lblClientesicosDelTrvpller.setFont(new Font("Franklin Gothic Heavy", Font.PLAIN, 20));
		lblClientesicosDelTrvpller.setHorizontalAlignment(SwingConstants.CENTER);
		lblClientesicosDelTrvpller.setBounds(10, 11, 707, 46);
		frameFichaReparar.getContentPane().add(lblClientesicosDelTrvpller);
		frameFichaReparar.setResizable(false);

		lblResponsable.setHorizontalAlignment(SwingConstants.CENTER);
		lblResponsable.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblResponsable.setBounds(10, 15, 209, 36);
		frameFichaReparar.getContentPane().add(lblResponsable);

		responsableField.setBounds(10, 51, 209, 46);
		frameFichaReparar.getContentPane().add(responsableField);
		responsableField.setColumns(10);
		// ESTO ES NUEVO, EL TEXTFIELD ESTARA VISIBLE PERO NO EDITABLE
		responsableField.setText(Listas.usuario);
		responsableField.setEditable(false);

		lblMatricula.setHorizontalAlignment(SwingConstants.CENTER);
		lblMatricula.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblMatricula.setBounds(10, 97, 209, 36);
		frameFichaReparar.getContentPane().add(lblMatricula);

		matriculaField.setColumns(10);
		matriculaField.setBounds(10, 133, 209, 46);
		frameFichaReparar.getContentPane().add(matriculaField);
		// ESTO ES NUEVO, EL TEXTFIELD ESTARA VISIBLE PERO NO EDITABLE
		matriculaField.setText("1234-ABC");
		matriculaField.setEditable(false);

		lblFechaEntrada.setHorizontalAlignment(SwingConstants.CENTER);
		lblFechaEntrada.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblFechaEntrada.setBounds(10, 182, 209, 36);
		frameFichaReparar.getContentPane().add(lblFechaEntrada);

		lblFechaSalida.setHorizontalAlignment(SwingConstants.CENTER);
		lblFechaSalida.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblFechaSalida.setBounds(231, 182, 209, 36);
		frameFichaReparar.getContentPane().add(lblFechaSalida);

		lblComentarios.setHorizontalAlignment(SwingConstants.CENTER);
		lblComentarios.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblComentarios.setBounds(458, 68, 259, 36);
		frameFichaReparar.getContentPane().add(lblComentarios);

		lblEstado.setHorizontalAlignment(SwingConstants.CENTER);
		listEstado.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblEstado.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblEstado.setBounds(10, 270, 209, 36);
		frameFichaReparar.getContentPane().add(lblEstado);
		listEstado.setLayoutOrientation(JList.HORIZONTAL_WRAP);
		listEstado.setFont(new Font("Tahoma", Font.PLAIN, 20));
		listEstado.setModel(new AbstractListModel() {
			String[] values = new String[] { "Terminado", "Pendiente de Recoger (T)", "Reparando", "En Espera",
					"Presupuesto Rechazado" };

			public int getSize() {
				return values.length;
			}

			public Object getElementAt(int index) {
				return values[index];
			}
		});
		listEstado.setBounds(10, 317, 250, 139);
		frameFichaReparar.getContentPane().add(listEstado);

		btnCrearFicha.setIcon(new ImageIcon(
				FichaReparar.class.getResource("/com/sun/javafx/scene/control/skin/caspian/images/capslock-icon.png")));
		btnCrearFicha.setFont(new Font("Franklin Gothic Heavy", Font.PLAIN, 20));
		btnCrearFicha.setBounds(451, 321, 259, 57);
		frameFichaReparar.getContentPane().add(btnCrearFicha);

		btnVaciar.setIcon(new ImageIcon(
				FichaReparar.class.getResource("/com/sun/javafx/scene/control/skin/modena/dialog-confirm.png")));
		btnVaciar.setFont(new Font("Franklin Gothic Heavy", Font.PLAIN, 20));
		btnVaciar.setBounds(451, 389, 259, 57);
		frameFichaReparar.getContentPane().add(btnVaciar);

		lblOpciones.setHorizontalAlignment(SwingConstants.CENTER);
		lblOpciones.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblOpciones.setBounds(452, 277, 256, 36);
		frameFichaReparar.getContentPane().add(lblOpciones);

		btnAtras.setIcon(
				new ImageIcon(FichaReparar.class.getResource("/com/sun/javafx/scene/control/skin/caspian/dialog-error.png")));
		btnAtras.setBounds(628, 11, 82, 46);
		frameFichaReparar.getContentPane().add(btnAtras);

		lblPresupuesto.setHorizontalAlignment(SwingConstants.CENTER);
		lblPresupuesto.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPresupuesto.setBounds(239, 97, 209, 36);
		frameFichaReparar.getContentPane().add(lblPresupuesto);

		presupuestoField.setColumns(10);
		presupuestoField.setBounds(239, 133, 209, 46);
		frameFichaReparar.getContentPane().add(presupuestoField);

		comentariosArea.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		comentariosArea.setBounds(468, 107, 249, 157);
		frameFichaReparar.getContentPane().add(comentariosArea);
		
		fechaEntradaDC.setBounds(20, 218, 199, 46);
		frameFichaReparar.getContentPane().add(fechaEntradaDC);
		
		fechaSalidaDC.setBounds(249, 218, 199, 46);
		frameFichaReparar.getContentPane().add(fechaSalidaDC);
 
		btnLeer.setIcon(new ImageIcon(FichaReparar.class.getResource("/com/sun/javafx/scene/web/skin/Copy_16x16_JFX.png")));
		btnLeer.setFont(new Font("Franklin Gothic Heavy", Font.PLAIN, 16));
		btnLeer.setBounds(270, 402, 169, 54);
		frameFichaReparar.getContentPane().add(btnLeer);
		
		btnEditar.setFont(new Font("Franklin Gothic Heavy", Font.PLAIN, 16));
		btnEditar.setIcon(new ImageIcon(FichaReparar.class.getResource("/com/sun/javafx/scene/web/skin/Cut_16x16_JFX.png")));
		btnEditar.setBounds(270, 337, 169, 54);
		frameFichaReparar.getContentPane().add(btnEditar);
		
		btnSiguiente.setEnabled(false);
		btnSiguiente.setVisible(false);
		btnSiguiente.setFont(new Font("Franklin Gothic Heavy", Font.PLAIN, 16));
		btnSiguiente.setIcon(new ImageIcon(FichaReparar.class.getResource("/com/sun/javafx/scene/web/skin/Redo_16x16_JFX.png")));
		btnSiguiente.setBounds(451, 321, 257, 57);
		frameFichaReparar.getContentPane().add(btnSiguiente);
		
		btnAnterior.setEnabled(false);
		btnAnterior.setVisible(false);
		btnAnterior.setFont(new Font("Franklin Gothic Heavy", Font.PLAIN, 16));
		btnAnterior.setIcon(new ImageIcon(FichaReparar.class.getResource("/com/sun/javafx/scene/web/skin/Undo_16x16_JFX.png")));
		btnAnterior.setBounds(451, 389, 259, 54);
		frameFichaReparar.getContentPane().add(btnAnterior);
		
		btnPrincipal.setIcon(new ImageIcon(FichaReparar.class.getResource("/com/sun/javafx/scene/web/skin/Paste_16x16_JFX.png")));
		btnPrincipal.setEnabled(false);
		btnPrincipal.setVisible(false);
		btnPrincipal.setBounds(572, 11, 46, 46);
		frameFichaReparar.getContentPane().add(btnPrincipal);
		
		btnGuardar.setEnabled(false);
		btnGuardar.setVisible(false);
		btnGuardar.setIcon(new ImageIcon(FichaReparar.class.getResource("/com/sun/java/swing/plaf/windows/icons/UpFolder.gif")));
		btnGuardar.setFont(new Font("Franklin Gothic Heavy", Font.PLAIN, 16));
		btnGuardar.setBounds(270, 281, 169, 46);
		frameFichaReparar.getContentPane().add(btnGuardar);
	}

	public void setEventos() {

		btnVaciar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				// responsableField.setText("");
				// matriculaField.setText("");
				fechaEntradaDC.setDate(null);
				fechaSalidaDC.setDate(null);
				listEstado.setSelectedIndex(-1);
				listEstado.clearSelection();
				presupuestoField.setText("");
				comentariosArea.setText("");
				listEstado.setEnabled(false);	
			}
		});
		btnAtras.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				JOptionPane.showMessageDialog(frameFichaReparar, "Adios " + responsableField.getText() +
						"! Hasta la proxima! Gracias por su trabajo!", "Volviendo al LogIn",
						JOptionPane.INFORMATION_MESSAGE);
				frameFichaReparar.dispose();
				g = new login();
				g.getLogin().setVisible(true);
			}
		});
		btnLeer.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				presupuestoField.setEnabled(false);
				presupuestoField.setEditable(false);
				fechaEntradaDC.setEnabled(false);
				fechaSalidaDC.setEnabled(false);
				comentariosArea.setEnabled(false);
				comentariosArea.setEditable(false);
				btnCrearFicha.setEnabled(false);
				btnCrearFicha.setVisible(false);
				btnVaciar.setEnabled(false);
				btnVaciar.setVisible(false);
				btnSiguiente.setEnabled(true);
				btnSiguiente.setVisible(true);
				btnAnterior.setEnabled(true);
				btnAnterior.setVisible(true);
				btnPrincipal.setEnabled(true);
				btnPrincipal.setVisible(true);
				lblClientesicosDelTrvpller.setText("Clientesicos del Trvpller - LECTVRA");
				// FALTA AÑADIR LOS SETTEXT A LOS CAMPOS DE LAS REPARACIONES DISPONIBLES
				btnGuardar.setEnabled(false);
				btnGuardar.setVisible(false);
			}
		});
		btnEditar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				presupuestoField.setEnabled(true);
				presupuestoField.setEditable(true);
				fechaEntradaDC.setEnabled(true);
				fechaSalidaDC.setEnabled(true);
				comentariosArea.setEnabled(true);
				comentariosArea.setEditable(true);
				btnCrearFicha.setEnabled(false);
				btnCrearFicha.setVisible(false);
				btnVaciar.setEnabled(false);
				btnVaciar.setVisible(false);
				btnSiguiente.setEnabled(true);
				btnSiguiente.setVisible(true);
				btnAnterior.setEnabled(true);
				btnAnterior.setVisible(true);
				lblClientesicosDelTrvpller.setText("Clientesicos del Trvpller - EDITAR");
				btnPrincipal.setEnabled(true);
				btnPrincipal.setVisible(true);
				// FALTA RECORRER LA LISTA CON LAS REPARACIONES, Y PONER LOS SETTERS DEL MODELO REPARACION
				btnGuardar.setEnabled(true);
				btnGuardar.setVisible(true);
			}
		});
		btnPrincipal.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				presupuestoField.setEnabled(true);
				presupuestoField.setEditable(true);
				presupuestoField.setText("");
				fechaEntradaDC.setEnabled(true);
				// MIRAR A VER SI HAY ALGUN METODO PARA DEJARLO VACIO EL CAMPO
				fechaSalidaDC.setEnabled(true);
				// MIRAR A VER SI HAY ALGUN METODO PARA DEJARLO VACIO EL CAMPO
				comentariosArea.setEnabled(true);
				comentariosArea.setEditable(true);
				comentariosArea.setText("");
				listEstado.setSelectedIndex(-1);
				listEstado.clearSelection();
				btnCrearFicha.setEnabled(true);
				btnCrearFicha.setVisible(true);
				btnVaciar.setEnabled(true);
				btnVaciar.setVisible(true);
				btnSiguiente.setEnabled(false);
				btnSiguiente.setVisible(false);
				btnAnterior.setEnabled(false);
				btnAnterior.setVisible(false);
				lblClientesicosDelTrvpller.setText("Clientesicos del Trvpller");
				btnPrincipal.setEnabled(false);
				btnPrincipal.setVisible(false);
				btnGuardar.setEnabled(false);
				btnGuardar.setVisible(false);
			}
		});
		btnGuardar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(frameFichaReparar, "¡¡ Cambios Aplicados con Exito !!", "GUARDANDO",
						JOptionPane.INFORMATION_MESSAGE);
			}
		});
	}
}
