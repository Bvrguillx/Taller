package ventanas;
import javax.swing.JButton;
import javax.swing.JFrame;

import container.Listas;
import models.Vehiculo;

import java.awt.event.ActionListener;
import java.awt.EventQueue;
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
 
 	
 	private void setEventos(){
 		btnCoche.addActionListener(new ActionListener() {
 			public void actionPerformed(ActionEvent arg0) {
 				Vehiculo v = new Vehiculo(Listas.listaClientes.get(Listas.listaClientes.size()-1).getDni(), "Coche"); 
 				Listas.listaVehiculo.add(v);
 			}
 		});
 		
 		btnBici.addActionListener(new ActionListener() {
 			public void actionPerformed(ActionEvent arg0) {
 				Vehiculo v = new Vehiculo(Listas.listaClientes.get(Listas.listaClientes.size()-1).getDni(), "Bici"); 
 				Listas.listaVehiculo.add(v);
 			}
 		});
 		
 		btnCamion.addActionListener(new ActionListener() {
 			public void actionPerformed(ActionEvent arg0) {
 				Vehiculo v = new Vehiculo(Listas.listaClientes.get(Listas.listaClientes.size()-1).getDni(), "Camion"); 
 				Listas.listaVehiculo.add(v);
 			}
 		});
 		
 		btnMoto.addActionListener(new ActionListener() {
 			public void actionPerformed(ActionEvent arg0) {
 				Vehiculo v = new Vehiculo(Listas.listaClientes.get(Listas.listaClientes.size()-1).getDni(), "Moto"); 
 				Listas.listaVehiculo.add(v);
 			}
 		});
 	}
 	
  
  }
