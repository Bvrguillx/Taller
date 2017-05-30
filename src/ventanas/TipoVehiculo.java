package ventanas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;

public class TipoVehiculo {

	private JFrame frameTipoVehiculo;

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
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frameTipoVehiculo = new JFrame();
		frameTipoVehiculo.setResizable(false);
		frameTipoVehiculo.setTitle("Tipo Vehiculo");
		frameTipoVehiculo.setBounds(100, 100, 450, 300);
		frameTipoVehiculo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameTipoVehiculo.getContentPane().setLayout(null);
		
		JButton btnCoche = new JButton("COCHE");
		btnCoche.setBounds(61, 27, 129, 90);
		frameTipoVehiculo.getContentPane().add(btnCoche);
		
		JButton btnMoto = new JButton("MOTO");
		btnMoto.setBounds(239, 27, 129, 90);
		frameTipoVehiculo.getContentPane().add(btnMoto);
		
		JButton btnCamion = new JButton("CAMION");
		btnCamion.setBounds(61, 149, 129, 90);
		frameTipoVehiculo.getContentPane().add(btnCamion);
		
		JButton btnBici = new JButton("BICI");
		btnBici.setBounds(239, 149, 129, 90);
		frameTipoVehiculo.getContentPane().add(btnBici);
	}


}
