package ventanas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class TipoVehiculo {

	private JFrame frameTipoVehiculo;

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
		btnCoche.setIcon(new ImageIcon(TipoVehiculo.class.getResource("/iconos/1495927937_solid-travel-tourism-car.png")));
		btnCoche.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnCoche.setBounds(61, 27, 129, 90);
		frameTipoVehiculo.getContentPane().add(btnCoche);
		
		JButton btnMoto = new JButton("");
		btnMoto.setIcon(new ImageIcon(TipoVehiculo.class.getResource("/iconos/1496159631_solid-travel-tourism-scooter.png")));
		btnMoto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnMoto.setBounds(239, 27, 129, 90);
		frameTipoVehiculo.getContentPane().add(btnMoto);
		
		JButton btnCamion = new JButton("CAMION");
		btnCamion.setIcon(new ImageIcon(TipoVehiculo.class.getResource("/iconos/1496159319_solid-travel-tourism-truck.png")));
		btnCamion.setBounds(61, 149, 129, 90);
		frameTipoVehiculo.getContentPane().add(btnCamion);
		
		JButton btnBici = new JButton("BICI");
		btnBici.setIcon(new ImageIcon(TipoVehiculo.class.getResource("/iconos/1496159682_solid-travel-tourism-bicycle.png")));
		btnBici.setBounds(239, 149, 129, 90);
		frameTipoVehiculo.getContentPane().add(btnBici);
	}
}
