package ventanas;

import javax.swing.JButton;
import javax.swing.JFrame;

import container.Listas;
import models.Vehiculo;

import java.awt.event.ActionListener;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TipoVehiculo {

	private JFrame frameTipoVehiculo;

	private JButton btnCoche;
	private JButton btnBici;
	private JButton btnCamion;
	private JButton btnMoto;

	public JFrame getFrameTipoVehiculo() {
		return frameTipoVehiculo;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TipoVehiculo window = new TipoVehiculo();
					window.frameTipoVehiculo.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TipoVehiculo() {
		initialize();
		setPropiedades();
		setEventos();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frameTipoVehiculo = new JFrame();

		btnBici = new JButton("BICI");
		btnCamion = new JButton("CAMION");
		btnMoto = new JButton("MOTO");
		btnCoche = new JButton("COCHE");

	}

	private void setPropiedades() {
		frameTipoVehiculo.setResizable(false);
		frameTipoVehiculo.setTitle("Tipo Vehiculo");
		frameTipoVehiculo.setBounds(100, 100, 450, 300);
		frameTipoVehiculo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameTipoVehiculo.getContentPane().setLayout(null);

		btnCoche.setBounds(61, 27, 129, 90);
		frameTipoVehiculo.getContentPane().add(btnCoche);

		btnMoto.setBounds(239, 27, 129, 90);
		frameTipoVehiculo.getContentPane().add(btnMoto);

		btnCamion.setBounds(61, 149, 129, 90);
		frameTipoVehiculo.getContentPane().add(btnCamion);

		btnBici.setBounds(239, 149, 129, 90);
		frameTipoVehiculo.getContentPane().add(btnBici);

	}

	private void setEventos() {
		
		btnCoche.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				Vehiculo v = new Vehiculo(Listas.dniCliente, "Coche");
				Listas.listaVehiculo.add(v);
				frameTipoVehiculo.dispose();
				FichaVehiculoCrear f = new FichaVehiculoCrear();
				f.getFrameCrearFichaVehiculo().setVisible(true);
			}
		});
		btnMoto.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				Vehiculo v = new Vehiculo(Listas.dniCliente, "Moto");
				Listas.listaVehiculo.add(v);
				frameTipoVehiculo.dispose();
				FichaVehiculoCrear f = new FichaVehiculoCrear();
				f.getFrameCrearFichaVehiculo().setVisible(true);
			}
		});
		btnCamion.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				Vehiculo v = new Vehiculo(Listas.dniCliente, "Camion");
				Listas.listaVehiculo.add(v);
				frameTipoVehiculo.dispose();
				FichaVehiculoCrear f = new FichaVehiculoCrear();
				f.getFrameCrearFichaVehiculo().setVisible(true);
			}
		});
		btnBici.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				Vehiculo v = new Vehiculo(Listas.dniCliente, "Bici");
				Listas.listaVehiculo.add(v);
				frameTipoVehiculo.dispose();
				FichaVehiculoCrear f = new FichaVehiculoCrear();
				f.getFrameCrearFichaVehiculo().setVisible(true);
			}
		});
		
	}

}
