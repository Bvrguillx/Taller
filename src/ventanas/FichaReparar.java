package ventanas;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.MenuBar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.swing.AbstractListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;

import com.toedter.calendar.JDateChooser;

import container.Listas;
import models.Reparacion;
import models.Vehiculo;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

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
	protected login g;
	private JButton btnSiguiente;
	private JButton btnAnterior;
	private JButton btnGuardar;
	private JTextField txtCliente;
	private JLabel lblCliente;
	private int indiceLista;
	private Calendar calendario1;
	private Calendar calendario2;
	private int hora1, minutos1, segundos1;
	private int hora2, minutos2, segundos2;
	private JButton btnEditar; 
	
	private JLabel lblManodeobra;

	// start y stop
	private JButton btnStart;
	private JButton btnStop;
	private JLabel lblTipoVehiculo;
	private JLabel lblPiezas;
	private JTextField textField;
	private JTextField txtPiezas;
	private long time_start;
	private long time_end;
	private JTextField txtManodeobra;
	private JTextField txtHoraentrada;
	private JTextField txtHorasalida;

	// menu
	private JMenu mnMenu;
	private JMenu mnCoches;
	private JMenuItem mntmCocheLeer;
	private JMenu mnClientes;
	private JMenuItem mntmClienteLeer;
	private JMenuItem mntmClienteCrear;
	private JMenuItem mntmReparacionLeer;
	private JMenu mnReparaciones;
	private JMenuBar menuBar;
	private JButton btnBorrar;
	private JButton btnNueva;

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

	// get BuscarMatricula
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
		lblClientesicosDelTrvpller = new JLabel("Reparaciones del Trvpller");
		lblResponsable = new JLabel("Responsable");
		responsableField = new JTextField();
		lblMatricula = new JLabel("Matricula");
		matriculaField = new JTextField();
		lblFechaEntrada = new JLabel("Hora Entrada");
		lblFechaSalida = new JLabel("Hora Salida");
		lblComentarios = new JLabel("Comentarios");
		lblEstado = new JLabel("Estado");
		listEstado = new JList();
		btnCrearFicha = new JButton("CREAR FICHA");
		btnCrearFicha.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});

		btnVaciar = new JButton("VACIAR");
		lblOpciones = new JLabel("Opciones");
		btnAtras = new JButton("");
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		presupuestoField = new JTextField();
		presupuestoField.setText("0");
		presupuestoField.setEditable(false);
		lblPresupuesto = new JLabel("Presupuesto");
		comentariosArea = new JTextArea();
		btnSiguiente = new JButton("SIGUIENTE");

		btnAnterior = new JButton("ANTERIOR");
		btnNueva = new JButton("Nueva");
		
		btnGuardar = new JButton("GUARDAR");
		lblCliente = new JLabel("Cliente");
		txtCliente = new JTextField();
		txtCliente.setEditable(false);
		calendario1 = new GregorianCalendar();
		calendario2 = new GregorianCalendar();
		btnEditar = new JButton("Editar");
		btnBorrar = new JButton("Eliminar");
		btnBorrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
			}
		});
		
		// MENU
		mnMenu = new JMenu("");
		mnCoches = new JMenu("");
		mntmCocheLeer = new JMenuItem("");
		mnReparaciones = new JMenu("");
		mntmReparacionLeer = new JMenuItem("");
		lblManodeobra= new JLabel("Mano De Obra");

		// Start y stop
		btnStart = new JButton("");
		btnStop = new JButton("");
		lblTipoVehiculo = new JLabel("Tipo Vehiculo");
		lblPiezas = new JLabel("Piezas");
		txtPiezas = new JTextField();
		
		txtPiezas.setText("0");
		textField = new JTextField();
		textField.setEditable(false);
	}

	@SuppressWarnings({ "unchecked", "rawtypes", "serial" })
	public void setPropiedades() {

		frameFichaReparar.setTitle("Reparacion de Vehiculos");
		frameFichaReparar.setBounds(100, 100, 743, 621);
		frameFichaReparar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameFichaReparar.getContentPane().setLayout(null);

		lblClientesicosDelTrvpller.setFont(new Font("Franklin Gothic Heavy", Font.PLAIN, 20));
		lblClientesicosDelTrvpller.setHorizontalAlignment(SwingConstants.CENTER);
		lblClientesicosDelTrvpller.setBounds(169, 0, 305, 46);
		frameFichaReparar.getContentPane().add(lblClientesicosDelTrvpller);
		frameFichaReparar.setResizable(false);

		lblResponsable.setHorizontalAlignment(SwingConstants.CENTER);
		lblResponsable.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblResponsable.setBounds(6, 46, 209, 36);
		frameFichaReparar.getContentPane().add(lblResponsable);

		responsableField.setBounds(6, 82, 209, 46);
		frameFichaReparar.getContentPane().add(responsableField);
		responsableField.setColumns(10);
		// ESTO ES NUEVO, EL TEXTFIELD ESTARA VISIBLE PERO NO EDITABLE
		responsableField.setText(Listas.usuario);
		responsableField.setEditable(false);

		lblMatricula.setHorizontalAlignment(SwingConstants.CENTER);
		lblMatricula.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblMatricula.setBounds(6, 128, 209, 36);
		frameFichaReparar.getContentPane().add(lblMatricula);

		matriculaField.setColumns(10);
		matriculaField.setBounds(6, 164, 209, 46);
		frameFichaReparar.getContentPane().add(matriculaField);
		// ESTO ES NUEVO, EL TEXTFIELD ESTARA VISIBLE PERO NO EDITABLE
		matriculaField.setText(Listas.matricula);
		matriculaField.setEditable(false);

		lblFechaEntrada.setHorizontalAlignment(SwingConstants.CENTER);
		lblFechaEntrada.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblFechaEntrada.setBounds(6, 213, 209, 36);
		frameFichaReparar.getContentPane().add(lblFechaEntrada);

		lblFechaSalida.setHorizontalAlignment(SwingConstants.CENTER);
		lblFechaSalida.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblFechaSalida.setBounds(-2, 308, 209, 36);
		frameFichaReparar.getContentPane().add(lblFechaSalida);

		lblComentarios.setHorizontalAlignment(SwingConstants.CENTER);
		lblComentarios.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblComentarios.setBounds(454, 82, 259, 36);
		frameFichaReparar.getContentPane().add(lblComentarios);

		lblEstado.setHorizontalAlignment(SwingConstants.CENTER);
		listEstado.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblEstado.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblEstado.setBounds(5, 407, 209, 36);
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
		listEstado.setBounds(5, 454, 249, 139);
		frameFichaReparar.getContentPane().add(listEstado);

		btnCrearFicha.setIcon(new ImageIcon(
				FichaReparar.class.getResource("/com/sun/javafx/scene/control/skin/caspian/images/capslock-icon.png")));
		btnCrearFicha.setFont(new Font("Franklin Gothic Heavy", Font.PLAIN, 20));
		btnCrearFicha.setBounds(454, 291, 259, 57);
		frameFichaReparar.getContentPane().add(btnCrearFicha);

		btnVaciar.setIcon(new ImageIcon(
				FichaReparar.class.getResource("/com/sun/javafx/scene/control/skin/modena/dialog-confirm.png")));
		btnVaciar.setFont(new Font("Franklin Gothic Heavy", Font.PLAIN, 20));
		btnVaciar.setBounds(454, 519, 169, 58);
		frameFichaReparar.getContentPane().add(btnVaciar);

		lblOpciones.setHorizontalAlignment(SwingConstants.CENTER);
		lblOpciones.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblOpciones.setBounds(448, 308, 256, 36);
		frameFichaReparar.getContentPane().add(lblOpciones);

		btnAtras.setIcon(new ImageIcon(
				FichaReparar.class.getResource("/com/sun/javafx/scene/control/skin/caspian/dialog-error.png")));
		btnAtras.setBounds(655, 525, 82, 68);
		frameFichaReparar.getContentPane().add(btnAtras);

		lblPresupuesto.setHorizontalAlignment(SwingConstants.CENTER);
		lblPresupuesto.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPresupuesto.setBounds(233, 361, 209, 36);
		frameFichaReparar.getContentPane().add(lblPresupuesto);

		presupuestoField.setColumns(10);
		presupuestoField.setBounds(233, 397, 209, 46);
		frameFichaReparar.getContentPane().add(presupuestoField);

		comentariosArea.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		comentariosArea.setBounds(464, 121, 249, 157);
		frameFichaReparar.getContentPane().add(comentariosArea);

		btnSiguiente.setEnabled(false);
		btnSiguiente.setVisible(false);
		btnSiguiente.setFont(new Font("Franklin Gothic Heavy", Font.PLAIN, 16));
		btnSiguiente.setIcon(
				new ImageIcon(FichaReparar.class.getResource("/com/sun/javafx/scene/web/skin/Redo_16x16_JFX.png")));
		btnSiguiente.setBounds(464, 27, 70, 57);
		frameFichaReparar.getContentPane().add(btnSiguiente);

		btnAnterior.setEnabled(false);
		btnAnterior.setVisible(false);
		btnAnterior.setFont(new Font("Franklin Gothic Heavy", Font.PLAIN, 16));
		btnAnterior.setIcon(
				new ImageIcon(FichaReparar.class.getResource("/com/sun/javafx/scene/web/skin/Undo_16x16_JFX.png")));
		btnAnterior.setBounds(643, 28, 70, 54);
		frameFichaReparar.getContentPane().add(btnAnterior);

		btnGuardar.setEnabled(false);
		btnGuardar.setVisible(false);
		btnGuardar.setIcon(
				new ImageIcon(FichaReparar.class.getResource("/com/sun/java/swing/plaf/windows/icons/UpFolder.gif")));
		btnGuardar.setFont(new Font("Franklin Gothic Heavy", Font.PLAIN, 16));
		btnGuardar.setBounds(454, 360, 259, 58);
		frameFichaReparar.getContentPane().add(btnGuardar);

		lblCliente.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCliente.setBounds(294, 46, 111, 36);
		frameFichaReparar.getContentPane().add(lblCliente);

		txtCliente.setBounds(235, 82, 201, 46);
		frameFichaReparar.getContentPane().add(txtCliente);
		txtCliente.setColumns(10);
		txtCliente.setText(Listas.dniCliente);

		menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 157, 48);
		// menu
		frameFichaReparar.getContentPane().add(menuBar);

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

		btnStart.setIcon(new ImageIcon(FichaReparar.class.getResource("/iconos/1496159860_Cancel_Icon.png")));
		btnStart.setBounds(454, 421, 111, 95);
		frameFichaReparar.getContentPane().add(btnStart);

		btnStop.setIcon(new ImageIcon(FichaReparar.class.getResource("/iconos/1496160128_stop.png")));
		btnStop.setBounds(582, 421, 111, 92);
		frameFichaReparar.getContentPane().add(btnStop);

		lblTipoVehiculo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTipoVehiculo.setBounds(278, 128, 127, 36);
		frameFichaReparar.getContentPane().add(lblTipoVehiculo);
		lblTipoVehiculo.setText(Listas.tipoVehiculo);

		textField.setBounds(233, 164, 209, 41);
		frameFichaReparar.getContentPane().add(textField);
		textField.setColumns(10);
		textField.setText(Listas.tipoVehiculo);

		lblPiezas.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPiezas.setBounds(294, 202, 169, 36);
		frameFichaReparar.getContentPane().add(lblPiezas);

		txtPiezas.setBounds(227, 232, 209, 46);
		frameFichaReparar.getContentPane().add(txtPiezas);
		txtPiezas.setColumns(10);

		
		lblManodeobra.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblManodeobra.setBounds(266, 275, 146, 36);
		frameFichaReparar.getContentPane().add(lblManodeobra);

		txtManodeobra = new JTextField();
		txtManodeobra.setText("0");
		txtManodeobra.setEditable(false);
		txtManodeobra.setBounds(233, 316, 209, 46);
		frameFichaReparar.getContentPane().add(txtManodeobra);
		txtManodeobra.setColumns(10);

		txtHoraentrada = new JTextField();
		txtHoraentrada.setEditable(false);
		txtHoraentrada.setBounds(16, 250, 201, 46);
		frameFichaReparar.getContentPane().add(txtHoraentrada);
		txtHoraentrada.setColumns(10);

		txtHorasalida = new JTextField();
		txtHorasalida.setEditable(false);
		txtHorasalida.setBounds(16, 342, 201, 46);
		frameFichaReparar.getContentPane().add(txtHorasalida);
		txtHorasalida.setColumns(10);
		
		btnEditar.setIcon(new ImageIcon(FichaReparar.class.getResource("/com/sun/javafx/scene/web/skin/FontBackgroundColor_16x16_JFX.png")));
		btnEditar.setFont(new Font("Lucida Grande", Font.PLAIN, 19));
		btnEditar.setBounds(266, 459, 174, 46);
		frameFichaReparar.getContentPane().add(btnEditar);
		btnEditar.setEnabled(false);
		
		
		btnBorrar.setIcon(new ImageIcon(FichaReparar.class.getResource("/com/sun/javafx/scene/web/skin/Cut_16x16_JFX.png")));
		btnBorrar.setFont(new Font("Lucida Grande", Font.PLAIN, 19));
		btnBorrar.setBounds(266, 519, 174, 46);
		frameFichaReparar.getContentPane().add(btnBorrar);
		btnBorrar.setEnabled(false);
		
		
		btnNueva.setBounds(553, 27, 70, 57);
		frameFichaReparar.getContentPane().add(btnNueva);

	}

	public void mostrarVehiculo(Reparacion c) {
		if (!Listas.listaVehiculo.isEmpty()) {
			// Borrar si tira bien.
			// Vehiculo ve = Listas.listaVehiculo.get(indiceVehiculos);

			matriculaField.setText(String.valueOf(c.getMatricula()));
			txtCliente.setText(c.getDniDuenio());
			presupuestoField.setText(String.valueOf(c.getPresupuestoField()));
			textField.setText(c.getTipoVehiculo());

			// si guarda el presupuesto en piezas a�adirlo aqui, si se crea en
			// directo no.
			// txtPiezas.
			comentariosArea.setText(c.getComentariosArea());

		}
	}

	public void setEventos() {

		btnNueva.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				
				BuscarVehiculo bv = new BuscarVehiculo();
				bv.getFrameBuscarMatricula().setVisible(true);
				frameFichaReparar.dispose();
			}
		});
		
		btnBorrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				Listas.listaReparaciones.remove(indiceLista);
				nextReparacion();
				mostrarReparacion();
			}
		});
		
		btnVaciar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				clear();
			}
		});

		btnAnterior.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				prevReparacion();
				mostrarReparacion();
			}
		});

		btnSiguiente.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				nextReparacion();
				mostrarReparacion();
			}
		});

		btnAtras.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				JOptionPane.showMessageDialog(frameFichaReparar,
						"Adios " + responsableField.getText() + "! Hasta la proxima! Gracias por su trabajo!",
						"Volviendo al LogIn", JOptionPane.INFORMATION_MESSAGE);
				frameFichaReparar.dispose();
				g = new login();
				g.getLogin().setVisible(true);
			}
		});
		

		btnCrearFicha.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				indiceLista = Listas.listaReparaciones.size() - 1;

				
				int Estado = listEstado.getSelectedIndex();
				String comentarios = comentariosArea.getText();

				
				Listas.listaReparaciones.get(indiceLista).setListEstado(Estado);
				Listas.listaReparaciones.get(indiceLista).setComentariosArea(comentarios);

				frameFichaReparar.dispose();
				Principal p = new Principal();
				p.getFramePrincipal().setVisible(true);
			}
		});

		btnGuardar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				int Estado = listEstado.getSelectedIndex();
				Listas.listaReparaciones.get(indiceLista).setListEstado(Estado);
				Listas.listaReparaciones.get(indiceLista).setComentariosArea(comentariosArea.getText());
				Listas.listaReparaciones.get(indiceLista).setFechaEntrada(txtHoraentrada.getText());
				
				Principal p = new Principal();
				p.getFramePrincipal().setVisible(true);
				frameFichaReparar.dispose();
			}
		});

		mntmCocheLeer.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if (Listas.listaVehiculo.isEmpty() || Listas.listaVehiculo.get(0).getMarca() == null) {
					JOptionPane.showMessageDialog(frameFichaReparar, "No hay vehiculos en registrados",
							"Error Lista Vehiculo", JOptionPane.ERROR_MESSAGE);
				} else {
					FichaVehiculoCrear fv = new FichaVehiculoCrear();
					fv.frameCrearFichaVehiculo.setVisible(true);
					fv.modoLeer();
					frameFichaReparar.dispose();
				}
			}
		});

		mntmClienteLeer.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				fichaClienteCrear fc = new fichaClienteCrear();
				fc.frameCliente.setVisible(true);
				fc.modoLeer();
				frameFichaReparar.dispose();

			}
		});
		mntmClienteCrear.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				fichaClienteCrear fc = new fichaClienteCrear();
				fc.frameCliente.setVisible(true);
				fc.modoCrear();
				frameFichaReparar.dispose();

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
				frameFichaReparar.dispose();
			}
		});

		btnStart.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				start();
				modoCrono();
				hora1 =calendario1.get(Calendar.HOUR_OF_DAY);
				minutos1 = calendario1.get(Calendar.MINUTE);
				segundos1 = calendario1.get(Calendar.SECOND);
				
				txtHoraentrada.setText(hora1 + ":" + minutos1 + ":" + segundos1);
				
				btnStop.setBackground(Color.RED);
				btnStop.setBackground(java.awt.Color.red);
			}
		});

		btnStop.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				stop();
				String totalTxt = null;
				long total = ((time_end - time_start) / 60000);

				if (total < 1)
					total = 1;
				
					totalTxt = Long.toString(total);

				txtManodeobra.setText(totalTxt);

				total();
				
				hora2 =calendario2.get(Calendar.HOUR_OF_DAY);
				minutos2 = calendario2.get(Calendar.MINUTE);
				segundos2 = calendario2.get(Calendar.SECOND);
				
				txtHorasalida.setText(hora2 + ":" + minutos2 + ":" + segundos2);
				btnStop.setBackground(null);
				
				modoCrear();
			}
		});
		
		txtPiezas.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
			txtPiezas.setText("");
			}
		});
		
		///////////////////////////////////////////////////////////////
	}

	private int nextReparacion() {
		++indiceLista;
		if (indiceLista == Listas.listaReparaciones.size()) {
			indiceLista = 0;
		}
		return indiceLista;
	}

	private int prevReparacion() {
		--indiceLista;
		if (indiceLista < 0) {
			indiceLista = Listas.listaReparaciones.size() - 1;
		}
		return indiceLista;
	}

	public void mostrarReparacion() {
		// fechaEntradaDC.setDate(Listas.listaReparaciones.get(indiceLista).getFechaEntrada());
		// fechaSalidaDC.setDate(Listas.listaReparaciones.get(indiceLista).getFechaSalida());
		listEstado.setSelectedIndex(Listas.listaReparaciones.get(indiceLista).getListEstado());
		presupuestoField.setText(Listas.listaReparaciones.get(indiceLista).getPresupuestoField());
		comentariosArea.setText(Listas.listaReparaciones.get(indiceLista).getComentariosArea());
		txtCliente.setText(Listas.listaReparaciones.get(indiceLista).getDniDuenio());
		matriculaField.setText(Listas.listaReparaciones.get(indiceLista).getMatricula());

	}

	public void modoLeer() {
		presupuestoField.setEnabled(false);
		presupuestoField.setEditable(false);
		// fechaEntradaDC.setEnabled(false);
		// fechaSalidaDC.setEnabled(false);
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
		
		lblClientesicosDelTrvpller.setText("Reparaciones del Trvpller - LECTVRA");
		// FALTA A�ADIR LOS SETTEXT A LOS CAMPOS DE LAS REPARACIONES
		// DISPONIBLES
		btnGuardar.setEnabled(false);
		btnGuardar.setVisible(false);
		lblPiezas.setEnabled(false);
		txtPiezas.setEnabled(false);
		lblCliente.setEnabled(false);
		lblComentarios.setEnabled(false);
		lblEstado.setEnabled(false);
		lblFechaEntrada.setEnabled(false);
		lblFechaSalida.setEnabled(false);
		lblManodeobra.setEnabled(false);
		lblMatricula.setEnabled(false);
		lblOpciones.setEnabled(false);
		presupuestoField.setEnabled(false);
		lblPresupuesto.setEnabled(false);
		listEstado.setEnabled(false);
		lblTipoVehiculo.setEnabled(false);
		btnStart.setEnabled(false);
		menuBar.setEnabled(true);
		responsableField.setEnabled(false);
		lblResponsable.setEnabled(false);
		
		btnAtras.setEnabled(false);
		mnMenu.setEnabled(true);
		txtCliente.setEnabled(false);
		textField.setEnabled(false);
		matriculaField.setEnabled(false);
		txtHoraentrada.setEnabled(false);
		txtHorasalida.setEnabled(false);
		
		btnEditar.setEnabled(true);
		btnBorrar.setEnabled(true);
	}

	public void modoCrear() {
		presupuestoField.setEnabled(true);
		
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
		lblClientesicosDelTrvpller.setText("Reparaciones del Trvpller - Modo Crear");
		
		btnGuardar.setEnabled(false);
		btnGuardar.setVisible(false);
		lblPiezas.setEnabled(true);
		txtPiezas.setEnabled(true);
		lblCliente.setEnabled(false);
		lblComentarios.setEnabled(true);
		lblEstado.setEnabled(true);
		lblFechaEntrada.setEnabled(true);
		lblFechaSalida.setEnabled(true);
		lblManodeobra.setEnabled(true);
		lblMatricula.setEnabled(true);
		lblOpciones.setEnabled(true);
		lblPresupuesto.setEnabled(true);
		listEstado.setEnabled(true);
		lblTipoVehiculo.setEnabled(true);
		btnStart.setEnabled(true);
		menuBar.setEnabled(true);
		responsableField.setEnabled(true);
		lblResponsable.setEnabled(true);
		
		btnEditar.setEnabled(false);
		btnBorrar.setEnabled(false);
		btnAtras.setEnabled(true);
		mnMenu.setEnabled(true);
		txtCliente.setEnabled(true);
		textField.setEnabled(true);
		matriculaField.setEnabled(true);
		txtHoraentrada.setEnabled(true);
		txtHorasalida.setEnabled(true);
	}
	public void modoCrono() {
		presupuestoField.setEnabled(false);
		comentariosArea.setEnabled(false);
		comentariosArea.setEditable(false);
		btnCrearFicha.setEnabled(false);
		btnCrearFicha.setVisible(false);
		btnGuardar.setEnabled(false);
		btnVaciar.setEnabled(false);
		btnVaciar.setVisible(false);
		btnSiguiente.setEnabled(false);
		btnSiguiente.setVisible(false);
		btnAnterior.setEnabled(false);
		btnAnterior.setVisible(false);
		lblClientesicosDelTrvpller.setText("Crono del Trvpller - EDITAR");
		lblPiezas.setEnabled(false);
		txtPiezas.setEnabled(false);
		lblCliente.setEnabled(false);
		lblComentarios.setEnabled(false);
		lblEstado.setEnabled(false);
		lblFechaEntrada.setEnabled(false);
		lblFechaSalida.setEnabled(false);
		lblManodeobra.setEnabled(false);
		lblMatricula.setEnabled(false);
		lblOpciones.setEnabled(false);
		presupuestoField.setEnabled(false);
		lblPresupuesto.setEnabled(false);
		listEstado.setEnabled(false);
		lblTipoVehiculo.setEnabled(false);
		btnStart.setEnabled(false);
		menuBar.setEnabled(false);
		responsableField.setEnabled(false);
		lblResponsable.setEnabled(false);
		
		btnAtras.setEnabled(false);
		mnMenu.setEnabled(false);
		txtCliente.setEnabled(false);
		textField.setEnabled(false);
		matriculaField.setEnabled(false);
		txtHoraentrada.setEnabled(false);
		txtHorasalida.setEnabled(false);
		
		btnEditar.setEnabled(false);
		btnBorrar.setEnabled(false);
		
	}
	
	public void modoEditar(){
presupuestoField.setEnabled(true);
		
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
		lblClientesicosDelTrvpller.setText("Reparaciones del Trvpller - Modo Crear");
		
		btnGuardar.setEnabled(true);
		btnGuardar.setVisible(true);
		lblPiezas.setEnabled(true);
		txtPiezas.setEnabled(true);
		lblCliente.setEnabled(false);
		lblComentarios.setEnabled(true);
		lblEstado.setEnabled(true);
		lblFechaEntrada.setEnabled(true);
		lblFechaSalida.setEnabled(true);
		lblManodeobra.setEnabled(true);
		lblMatricula.setEnabled(true);
		lblOpciones.setEnabled(true);
		lblPresupuesto.setEnabled(true);
		listEstado.setEnabled(true);
		lblTipoVehiculo.setEnabled(true);
		btnStart.setEnabled(true);
		menuBar.setEnabled(true);
		responsableField.setEnabled(true);
		lblResponsable.setEnabled(true);
		
		btnAtras.setEnabled(true);
		mnMenu.setEnabled(true);
		txtCliente.setEnabled(true);
		textField.setEnabled(true);
		matriculaField.setEnabled(true);
		txtHoraentrada.setEnabled(true);
		txtHorasalida.setEnabled(true);
		
		btnEditar.setEnabled(false);
		btnBorrar.setEnabled(false);
		
	}

	public void clear() {
		
		listEstado.setSelectedIndex(-1);
		listEstado.clearSelection();
		presupuestoField.setText("");
		comentariosArea.setText("");
		listEstado.setEnabled(false);
	}

	public void start() {
		time_start = System.currentTimeMillis();
	}

	public void stop() {
		time_end = System.currentTimeMillis();
	}

	public void total() {
		float total;
		float piezas;
		float manoDeObra;

		piezas = Long.parseLong(txtPiezas.getText());
		manoDeObra = Long.parseLong(txtManodeobra.getText());

		total = piezas + manoDeObra;

		presupuestoField.setText(Float.toString(total));
	}
}
