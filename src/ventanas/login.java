package ventanas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class login {

	private JFrame login;
	private JTextField textFieldUsuario;
	private JLabel lblUsuario;
	private JLabel lblContrasenia;
	private JPasswordField contraseniaField;
	private JLabel lblTitulo;
	private JButton btnGo;
	private JButton btnNewButton;
	private boolean exito;

	/**
	 * Launch the application
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login window = new login();
					window.login.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public login() {
		initialize();
		setPropiedades();
		setEventos();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		login = new JFrame();
		lblUsuario = new JLabel("Usuario:");
		textFieldUsuario = new JTextField();
		lblContrasenia = new JLabel("Contrase\u00F1a");
		contraseniaField = new JPasswordField();
		lblTitulo = new JLabel("Taller del Trvp for the Hood");
		btnGo = new JButton("GO");
		btnNewButton = new JButton("");
		
	}
	
	public void setPropiedades(){
	
		login.setResizable(false);
		login.setTitle("Login Taller");
		login.setBounds(100, 100, 474, 400);
		login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		login.getContentPane().setLayout(null);
		
		lblUsuario.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblUsuario.setBounds(63, 112, 120, 25);
		login.getContentPane().add(lblUsuario);
		
		textFieldUsuario.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textFieldUsuario.setText("Usuario");
		textFieldUsuario.setBounds(213, 112, 159, 25);
		login.getContentPane().add(textFieldUsuario);
		textFieldUsuario.setColumns(10);
		
		lblContrasenia.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblContrasenia.setBounds(63, 183, 120, 25);
		login.getContentPane().add(lblContrasenia);
		
		contraseniaField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contraseniaField.setText("Contrasenia");
		contraseniaField.setBackground(new Color(255, 255, 255));
		contraseniaField.setToolTipText("");
		contraseniaField.setBounds(213, 183, 159, 25);
		login.getContentPane().add(contraseniaField);
		
		lblTitulo.setFont(new Font("Franklin Gothic Heavy", Font.PLAIN, 25));
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setBounds(27, 11, 389, 54);
		login.getContentPane().add(lblTitulo);
		
		btnGo.setFont(new Font("Franklin Gothic Heavy", Font.PLAIN, 20));
		btnGo.setBounds(27, 256, 311, 79);
		login.getContentPane().add(btnGo);
		
		btnNewButton.setIcon(new ImageIcon(login.class.getResource("/com/sun/javafx/scene/control/skin/caspian/dialog-error.png")));
		btnNewButton.setBounds(348, 256, 89, 79);
		login.getContentPane().add(btnNewButton);
		
	}
	
	public void setEventos(){		
		
		textFieldUsuario.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				textFieldUsuario.setText("");
			}
		});
		;
		contraseniaField.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				contraseniaField.setText("");
			}
		});
		contraseniaField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER){
					accion(lblTitulo);
				}
			}
		});
		textFieldUsuario.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER){
					accion(lblTitulo);
				}
			}
		});
		btnGo.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER){
					accion(lblTitulo);
				}
			}
		});
		btnGo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				accion(lblTitulo);
			}
		});

		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});

	}
	
	public String getUsuario(){
		return textFieldUsuario.getText().trim();
	}
	
	public String getContrasenia(){
		return new String(contraseniaField.getPassword());
	}
	
	public boolean esExito(){
		return exito;
	}
	
	public void accion(JLabel lblTitulo){
		if (Credenciales.logeo(getUsuario(), getContrasenia())){
			exito = true;
			JOptionPane.showMessageDialog(login, "Usuario & Contraseña Válidos", "Login",
					JOptionPane.INFORMATION_MESSAGE);
			login.dispose();
			 Principal p = new Principal();
			 p.getFramePrincipal().setVisible(true);
		} else {
			JOptionPane.showMessageDialog(login, "Usuario ó Contraseña Incorrectos", "Login",
					JOptionPane.ERROR_MESSAGE);
			contraseniaField.setText("");
			exito = false;
		}
	}
}
