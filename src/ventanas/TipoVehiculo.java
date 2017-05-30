package ventanas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
		
		btnCoche = new JButton("COCHE");
				
		
		 btnMoto = new JButton("MOTO");
		
		 btnCamion = new JButton("CAMION");
		
		
		 btnBici = new JButton("BICI");
		
	}
	
	private void setPropiedades(){
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
	
	private void setEventos(){
		btnCoche.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		btnBici.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		btnCamion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		btnMoto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
	}
	

}
