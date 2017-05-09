package presentacion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Window;

import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;

import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JCheckBox;
import javax.swing.JPasswordField;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Inicio {

	private JFrame frameInicio;
	private JPanel pnlContenido;
	private JLabel lblImagen;
	private JPanel pnlLogin;
	private JLabel lblUsuario;
	private JLabel lblPassword;
	private JTextField txtUsuario;
	private JPanel pnlBotones;
	private JButton btnEntrar;
	private JButton btnLimpiar;
	private JButton btnSalir;
	private JPasswordField passwordField;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	
	private final String password = "1234Aa"; //$NON-NLS-1$
	private JLabel lblAviso;
	private Border bordeRojo = BorderFactory.createLineBorder(Color.RED);
	private Border bordeVerde = BorderFactory.createLineBorder(Color.GREEN);
	private JPanel panel;
	private JButton btnNewButton;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inicio window = new Inicio();
					window.frameInicio.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Inicio() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frameInicio = new JFrame();
		frameInicio.addWindowListener(new FrameInicioWindowListener());
		frameInicio.setResizable(false);
		frameInicio.setBounds(100, 100, 736, 282);
		frameInicio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		pnlContenido = new JPanel();
		frameInicio.getContentPane().add(pnlContenido, BorderLayout.NORTH);
		GridBagLayout gbl_pnlContenido = new GridBagLayout();
		gbl_pnlContenido.columnWidths = new int[]{373, 99, 171, 0, 0, 0, 0, 0};
		gbl_pnlContenido.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_pnlContenido.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_pnlContenido.rowWeights = new double[]{1.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		pnlContenido.setLayout(gbl_pnlContenido);
		
		lblImagen = new JLabel(""); //$NON-NLS-1$
		lblImagen.setOpaque(true);
		lblImagen.setIcon(new ImageIcon(Inicio.class.getResource("/presentacion/hipertensao-iloveimg-resized.png"))); //$NON-NLS-1$
		GridBagConstraints gbc_lblImagen = new GridBagConstraints();
		gbc_lblImagen.anchor = GridBagConstraints.WEST;
		gbc_lblImagen.gridheight = 6;
		gbc_lblImagen.insets = new Insets(0, 0, 0, 5);
		gbc_lblImagen.gridx = 0;
		gbc_lblImagen.gridy = 0;
		pnlContenido.add(lblImagen, gbc_lblImagen);
		
		pnlLogin = new JPanel();
		pnlLogin.setBorder(new TitledBorder(null, Messages.getString("Inicio.pnlLogin.borderTitle"), TitledBorder.LEADING, TitledBorder.TOP, null, null)); //$NON-NLS-1$
		GridBagConstraints gbc_pnlLogin = new GridBagConstraints();
		gbc_pnlLogin.gridheight = 3;
		gbc_pnlLogin.gridwidth = 5;
		gbc_pnlLogin.insets = new Insets(0, 0, 5, 5);
		gbc_pnlLogin.fill = GridBagConstraints.BOTH;
		gbc_pnlLogin.gridx = 1;
		gbc_pnlLogin.gridy = 2;
		pnlContenido.add(pnlLogin, gbc_pnlLogin);
		GridBagLayout gbl_pnlLogin = new GridBagLayout();
		gbl_pnlLogin.columnWidths = new int[]{94, 94, 0};
		gbl_pnlLogin.rowHeights = new int[]{36, 32, 0, 0};
		gbl_pnlLogin.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_pnlLogin.rowWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		pnlLogin.setLayout(gbl_pnlLogin);
		
		lblUsuario = new JLabel(Messages.getString("Inicio.lblUsuario.text")); //$NON-NLS-1$
		GridBagConstraints gbc_lblUsuario = new GridBagConstraints();
		gbc_lblUsuario.anchor = GridBagConstraints.EAST;
		gbc_lblUsuario.fill = GridBagConstraints.VERTICAL;
		gbc_lblUsuario.insets = new Insets(0, 0, 5, 5);
		gbc_lblUsuario.gridx = 0;
		gbc_lblUsuario.gridy = 0;
		pnlLogin.add(lblUsuario, gbc_lblUsuario);
		
		
		txtUsuario = new JTextField();
		txtUsuario.addActionListener(new TxtUsuarioActionListener());
		GridBagConstraints gbc_txtUsuario = new GridBagConstraints();
		gbc_txtUsuario.insets = new Insets(0, 0, 5, 0);
		gbc_txtUsuario.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtUsuario.gridx = 1;
		gbc_txtUsuario.gridy = 0;
		pnlLogin.add(txtUsuario, gbc_txtUsuario);
		txtUsuario.setColumns(10);
		
		
		lblPassword = new JLabel(Messages.getString("Inicio.lblPassword.text")); //$NON-NLS-1$
		lblPassword.setEnabled(false);
		GridBagConstraints gbc_lblPassword = new GridBagConstraints();
		gbc_lblPassword.anchor = GridBagConstraints.EAST;
		gbc_lblPassword.insets = new Insets(0, 0, 5, 5);
		gbc_lblPassword.fill = GridBagConstraints.VERTICAL;
		gbc_lblPassword.gridx = 0;
		gbc_lblPassword.gridy = 1;
		pnlLogin.add(lblPassword, gbc_lblPassword);
		
		passwordField = new JPasswordField();
		passwordField.addActionListener(new PwdfPasswordActionListener());
		passwordField.setEnabled(false);
		GridBagConstraints gbc_passwordField = new GridBagConstraints();
		gbc_passwordField.insets = new Insets(0, 0, 5, 0);
		gbc_passwordField.fill = GridBagConstraints.HORIZONTAL;
		gbc_passwordField.gridx = 1;
		gbc_passwordField.gridy = 1;
		pnlLogin.add(passwordField, gbc_passwordField);
		
		pnlBotones = new JPanel();
		pnlBotones.setEnabled(false);
		GridBagConstraints gbc_pnlBotones = new GridBagConstraints();
		gbc_pnlBotones.fill = GridBagConstraints.BOTH;
		gbc_pnlBotones.gridx = 1;
		gbc_pnlBotones.gridy = 2;
		pnlLogin.add(pnlBotones, gbc_pnlBotones);
		
		btnLimpiar = new JButton(Messages.getString("Inicio.btnLimpiar.text")); //$NON-NLS-1$
		btnLimpiar.setIcon(new ImageIcon(Inicio.class.getResource("/presentacion/limpiarIcono-iloveimg-resized.png"))); //$NON-NLS-1$
		btnLimpiar.addActionListener(new BtnLimpiarActionListener());
		btnLimpiar.setEnabled(false);
		pnlBotones.add(btnLimpiar);
		
		btnEntrar = new JButton(Messages.getString("Inicio.btnEntrar.text")); //$NON-NLS-1$
		btnEntrar.setIcon(new ImageIcon(Inicio.class.getResource("/presentacion/entrarIncono-iloveimg-resized.png"))); //$NON-NLS-1$
		btnEntrar.addActionListener(new BtnEntrarActionListener());
	
		btnEntrar.setEnabled(false);
		pnlBotones.add(btnEntrar);
		
		lblAviso = new JLabel(""); //$NON-NLS-1$
		lblAviso.setOpaque(true);
		GridBagConstraints gbc_lblAviso = new GridBagConstraints();
		gbc_lblAviso.anchor = GridBagConstraints.WEST;
		gbc_lblAviso.gridwidth = 4;
		gbc_lblAviso.insets = new Insets(0, 0, 0, 5);
		gbc_lblAviso.gridx = 2;
		gbc_lblAviso.gridy = 5;
		pnlContenido.add(lblAviso, gbc_lblAviso);
		
		panel = new JPanel();
		frameInicio.getContentPane().add(panel, BorderLayout.SOUTH);
		panel.setLayout(new BorderLayout(0, 0));
		
		btnSalir = new JButton(Messages.getString("Inicio.btnSalir.text"));
		panel.add(btnSalir,BorderLayout.EAST);
		btnSalir.setIcon(new ImageIcon(Inicio.class.getResource("/presentacion/iconoSalir.png"))); //$NON-NLS-1$
		
		btnNewButton = new JButton(Messages.getString("Inicio.btnNewButton.text")); //$NON-NLS-1$
		btnNewButton.setIcon(new ImageIcon(Inicio.class.getResource("/presentacion/Icono-Internet-Símbolo-Negro-iloveimg-resized.png")));
		btnNewButton.addActionListener(new BtnNewButtonActionListener());
		panel.add(btnNewButton, BorderLayout.WEST);
		btnSalir.addActionListener(new BtnSalirActionListener());
	}
	private class TxtUsuarioActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			passwordField.setEnabled(true);
			pnlBotones.setEnabled(true);
			
			btnLimpiar.setEnabled(true);
			lblPassword.setEnabled(true);
			passwordField.requestFocus();
			
		}
	}

	private class PwdfPasswordActionListener implements ActionListener { 
		public void actionPerformed(ActionEvent e) {
			
			//obtenemos la contraseña introducida
			if (String.valueOf(passwordField.getPassword()).equals(password)) {
				passwordField.setBorder(bordeVerde);
				lblPassword.setEnabled(false); 
				passwordField.setEnabled(false);
				btnEntrar.setEnabled(true); 
				btnEntrar.requestFocus();
			} else {
				btnEntrar.setEnabled(false);
				passwordField.setBorder(bordeRojo);
		} 
		}

	

	}
	private class BtnLimpiarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			txtUsuario.setText(""); //$NON-NLS-1$
			passwordField.setText("");  //$NON-NLS-1$
			lblAviso.setVisible(false);
			btnEntrar.setEnabled(false);
		}
	}
	private class BtnEntrarActionListener implements ActionListener { 
		public void actionPerformed(ActionEvent e) {
		
					Entrar en=new Entrar();
					en.setVisible(true);
					frameInicio.dispose();
				}
			}


	private class FrameInicioWindowListener extends WindowAdapter { //terminar botones e icono
		@Override
		public void windowClosing(WindowEvent e) {
			int n = JOptionPane.showConfirmDialog(  
					frameInicio,
					Messages.getString("Inicio.11") , //$NON-NLS-1$
					"", //$NON-NLS-1$
					JOptionPane.YES_NO_OPTION);
			
					if(n == JOptionPane.YES_OPTION)
					{
						Object[] botonesOptionPane = {Messages.getString("Inicio.BotonAceptarOptionPane")};
						JOptionPane.showOptionDialog (frameInicio, Messages.getString("Inicio.0"), "", JOptionPane.PLAIN_MESSAGE,
						JOptionPane.PLAIN_MESSAGE,
						null,
						botonesOptionPane, 0);
						//JOptionPane.showMessageDialog(frameInicio, Messages.getString("Inicio.0")); //$NON-NLS-1$
						System.exit(0);
					}
					else{
						Inicio in=new Inicio();
						in.getFrame().setVisible(true);;
						frameInicio.dispose();
					}
					
		}
	}
	private class BtnSalirActionListener implements ActionListener { //terminar botones e icono
		public void actionPerformed(ActionEvent e) {
			int n = JOptionPane.showConfirmDialog(  
					frameInicio,
					Messages.getString("Inicio.14") , //$NON-NLS-1$
					"", //$NON-NLS-1$
					JOptionPane.YES_NO_OPTION);

					if(n == JOptionPane.YES_OPTION)
					{
						Object[] botonesOptionPane = {Messages.getString("Inicio.BotonAceptarOptionPane")};
						JOptionPane.showOptionDialog (frameInicio, Messages.getString("Inicio.16"), "", JOptionPane.PLAIN_MESSAGE,
						JOptionPane.PLAIN_MESSAGE,
						null,
						botonesOptionPane, 0);
						//OptionPane.showMessageDialog(frameInicio, Messages.getString("Inicio.16")); //$NON-NLS-1$
						System.exit(0);
					}
					else{
						Inicio in=new Inicio();
						in.getFrame().setVisible(true);;
						frameInicio.dispose();
					}
		}
	}
	private class BtnNewButtonActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			SeleccioneIdioma en=new SeleccioneIdioma();
			en.setVisible(true);
			frameInicio.dispose();
			
			
					
		}
	}
	
	
	public JFrame getFrame2(){
		return frameInicio;
	}
	public Window getFrame() {
		// TODO Auto-generated method stub
		return null;
	}
	

	
	}

	
	
