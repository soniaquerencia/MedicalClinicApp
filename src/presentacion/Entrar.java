package presentacion;

import java.awt.BorderLayout;
import java.util.*;
import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.border.TitledBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.text.MaskFormatter;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFormattedTextField;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.sql.Date;
import java.text.ParseException;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.DefaultCellEditor;
import javax.swing.JSplitPane;
import javax.swing.SwingConstants;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;
import com.toedter.calendar.JDayChooser;

import java.awt.List;
import javax.swing.JList;
import java.awt.Panel;
import java.awt.Button;
import javax.swing.JTextPane;
import java.awt.event.InputMethodListener;
import java.awt.event.InputMethodEvent;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;
import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;
import java.awt.event.HierarchyListener;
import java.awt.event.HierarchyEvent;

public class Entrar extends JFrame {
	
	int dia, mes, anio;
	private JPanel contentPane;
	private JTabbedPane tabbedPane;
	private JPanel pnlDatos;
	private JPanel pnlPacientes;
	private JPanel pnlProfesionales;
	private JPanel pnlMisDatos;
	private JButton btnSalir;
	private JLabel lblNombre;
	private JLabel lblApellidos;
	private JLabel lblDNI;
	private JLabel lblNacionalidad;
	private JLabel lblFechaNacimiento;
	private JLabel lblDireccion;
	private JLabel lblTelefono;
	private JLabel lblEmail;
	private JLabel lblProfesional;
	private JTextField txtNombre;
	private JTextField txtApellidos;
	private JComboBox cmbNacionalidad;
	private JFormattedTextField ftxtDNI;
	private JFormattedTextField ftxtFechaNacimiento;
	private JTextField txtDireccion;
	private JFormattedTextField ftxtTelefono;
	private JTextField txtEmail;
	private JComboBox cmbProfesional;
	private JLabel lblFoto;
	private JButton btnCargarFoto;
	private JButton btnEditar;
	private JButton btnGuardar;
	private JPanel pnlContenido;
	private JFrame frameEntrar;
	private JLabel lblImagenPaciente;
	private JTabbedPane tabbedPane_1;
	private JPanel pnlListado;
	private JPanel pnlAgenda;
	private JPanel panel;
	private JScrollPane scrollPane;
	private JTable table;
	private JButton btnAadir;
	private JButton btnEliminar;
	private JPanel pnlSalir;
	private Panel pnlDoctor;
	private Panel pnlContenidoProf;
	private JLabel lblNewLabel;
	private JPanel pnlContactar;
	private JScrollPane scrollPane_1;
	private JTable tableProfesional;
	private JPanel pnlInforProfesionales;
	private JTextPane textInformacion;
	private JLabel lblFotoProf;
	private JButton btnContactar;
	private JDateChooser dateChooser;
	private JDayChooser dayChooser;
	private JPanel pnlCalendario;
	private JDateChooser dtChooser;
	private JButton btnVer;
	private JScrollPane scrollPane_2;
	private JTable tAgenda;
	private JPanel panel_1;
	private JTextPane txtInformacion;
	private JLabel lblFotoPaciente;
	private JButton btnInforme;
	private JLabel lblFechaltimoAcceso;
	private JPanel panel_2;
	private JFormattedTextField formattedTextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Entrar frameEntrar = new Entrar();
					frameEntrar.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Entrar() {
		addWindowListener(new ThisWindowListener());
		setResizable(false);
		
		frameEntrar =this;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1137, 666);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane, BorderLayout.CENTER);
		
		pnlDatos = new JPanel();
		pnlDatos.setBorder(new TitledBorder(null, "Mis Datos", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		tabbedPane.addTab("Mis Datos", new ImageIcon(Entrar.class.getResource("/presentacion/notebook-512.png")), pnlDatos, null);
		pnlDatos.setLayout(new BorderLayout(0, 0));
		
		pnlMisDatos = new JPanel();
		pnlDatos.add(pnlMisDatos, BorderLayout.NORTH);
		GridBagLayout gbl_pnlMisDatos = new GridBagLayout();
		gbl_pnlMisDatos.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_pnlMisDatos.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 44, 0, 0};
		gbl_pnlMisDatos.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 1.0, 1.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_pnlMisDatos.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		pnlMisDatos.setLayout(gbl_pnlMisDatos);
		
		
		lblNombre = new JLabel("NOMBRE");
		lblNombre.setEnabled(false);
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.anchor = GridBagConstraints.EAST;
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.gridx = 0;
		gbc_lblNombre.gridy = 0;
		pnlMisDatos.add(lblNombre, gbc_lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setText("María");
		txtNombre.setEnabled(false);
		GridBagConstraints gbc_txtNombre = new GridBagConstraints();
		gbc_txtNombre.gridwidth = 2;
		gbc_txtNombre.insets = new Insets(0, 0, 5, 5);
		gbc_txtNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNombre.gridx = 1;
		gbc_txtNombre.gridy = 0;
		pnlMisDatos.add(txtNombre, gbc_txtNombre);
		txtNombre.setColumns(10);
		
		lblFoto = new JLabel("");
		lblFoto.setIcon(new ImageIcon(Entrar.class.getResource("/presentacion/doctora-iloveimg-resized-2.png")));
		//lblFoto.setIcon(/presentacion/doctora-iloveimg-resized-2.png);
		GridBagConstraints gbc_lblFoto = new GridBagConstraints();
		gbc_lblFoto.gridheight = 3;
		gbc_lblFoto.gridwidth = 4;
		gbc_lblFoto.insets = new Insets(0, 0, 5, 0);
		gbc_lblFoto.gridx = 8;
		gbc_lblFoto.gridy = 0;
		pnlMisDatos.add(lblFoto, gbc_lblFoto);
		
		lblApellidos = new JLabel("APELLIDOS");
		lblApellidos.setEnabled(false);
		GridBagConstraints gbc_lblApellidos = new GridBagConstraints();
		gbc_lblApellidos.anchor = GridBagConstraints.EAST;
		gbc_lblApellidos.insets = new Insets(0, 0, 5, 5);
		gbc_lblApellidos.gridx = 0;
		gbc_lblApellidos.gridy = 1;
		pnlMisDatos.add(lblApellidos, gbc_lblApellidos);
		
		txtApellidos = new JTextField();
		txtApellidos.setText("Sánchez Ruiz");
		txtApellidos.setEnabled(false);
		GridBagConstraints gbc_txtApellidos = new GridBagConstraints();
		gbc_txtApellidos.gridwidth = 5;
		gbc_txtApellidos.insets = new Insets(0, 0, 5, 5);
		gbc_txtApellidos.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtApellidos.gridx = 1;
		gbc_txtApellidos.gridy = 1;
		pnlMisDatos.add(txtApellidos, gbc_txtApellidos);
		txtApellidos.setColumns(10);
		
		lblDNI = new JLabel("DNI");
		lblDNI.setEnabled(false);
		GridBagConstraints gbc_lblDNI = new GridBagConstraints();
		gbc_lblDNI.anchor = GridBagConstraints.EAST;
		gbc_lblDNI.insets = new Insets(0, 0, 5, 5);
		gbc_lblDNI.gridx = 0;
		gbc_lblDNI.gridy = 2;
		pnlMisDatos.add(lblDNI, gbc_lblDNI);
		
		MaskFormatter formatoDNI;
		try {
			formatoDNI = new MaskFormatter("########'-U"); formatoDNI.setPlaceholderCharacter('X'); 
			ftxtDNI = new JFormattedTextField(formatoDNI);
		} catch (ParseException e) {
		    // TODO Auto-generated catch block
		e.printStackTrace(); }
		

		ftxtDNI.setText("04788458L");
		ftxtDNI.setEnabled(false);
		GridBagConstraints gbc_ftxtDNI = new GridBagConstraints();
		gbc_ftxtDNI.gridwidth = 2;
		gbc_ftxtDNI.insets = new Insets(0, 0, 5, 5);
		gbc_ftxtDNI.fill = GridBagConstraints.HORIZONTAL;
		gbc_ftxtDNI.gridx = 1;
		gbc_ftxtDNI.gridy = 2;
		pnlMisDatos.add(ftxtDNI, gbc_ftxtDNI);
		
		lblNacionalidad = new JLabel("NACIONALIDAD");
		lblNacionalidad.setEnabled(false);
		GridBagConstraints gbc_lblNacionalidad = new GridBagConstraints();
		gbc_lblNacionalidad.anchor = GridBagConstraints.EAST;
		gbc_lblNacionalidad.insets = new Insets(0, 0, 5, 5);
		gbc_lblNacionalidad.gridx = 0;
		gbc_lblNacionalidad.gridy = 3;
		pnlMisDatos.add(lblNacionalidad, gbc_lblNacionalidad);
		
		cmbNacionalidad = new JComboBox();
		cmbNacionalidad.setEnabled(false);
		cmbNacionalidad.setModel(new DefaultComboBoxModel(new String[] {"España", "Alemania", "Argentina", "Australia", "Belgica", "Bolivia", "Brasil", "Canada", "Chile", "China", "Dinamarca", "Ecuador", "Estados Unidos", "Finlandia", "Francia", "Inglaterra", "Italia", "Japon", "Noruega"}));
		GridBagConstraints gbc_cmbNacionalidad = new GridBagConstraints();
		gbc_cmbNacionalidad.gridwidth = 2;
		gbc_cmbNacionalidad.insets = new Insets(0, 0, 5, 5);
		gbc_cmbNacionalidad.fill = GridBagConstraints.HORIZONTAL;
		gbc_cmbNacionalidad.gridx = 1;
		gbc_cmbNacionalidad.gridy = 3;
		pnlMisDatos.add(cmbNacionalidad, gbc_cmbNacionalidad);
		
		lblFechaNacimiento = new JLabel("FECHA DE NACIMIENTO");
		lblFechaNacimiento.setEnabled(false);
		GridBagConstraints gbc_lblFechaNacimiento = new GridBagConstraints();
		gbc_lblFechaNacimiento.anchor = GridBagConstraints.EAST;
		gbc_lblFechaNacimiento.insets = new Insets(0, 0, 5, 5);
		gbc_lblFechaNacimiento.gridx = 0;
		gbc_lblFechaNacimiento.gridy = 4;
		pnlMisDatos.add(lblFechaNacimiento, gbc_lblFechaNacimiento);
		
		MaskFormatter formatoFecha;
		try {
			formatoFecha = new MaskFormatter("##'/##'/####"); 
			formatoFecha.setPlaceholderCharacter('*');
			ftxtFechaNacimiento = new JFormattedTextField(formatoFecha);
			
		} catch (ParseException e) {
		    // TODO Auto-generated catch block
		    e.printStackTrace();
		}
		
		ftxtFechaNacimiento.setText("01051978");
		ftxtFechaNacimiento.setEnabled(false);
		GridBagConstraints gbc_ftxtFechaNacimiento = new GridBagConstraints();
		gbc_ftxtFechaNacimiento.gridwidth = 2;
		gbc_ftxtFechaNacimiento.insets = new Insets(0, 0, 5, 5);
		gbc_ftxtFechaNacimiento.fill = GridBagConstraints.HORIZONTAL;
		gbc_ftxtFechaNacimiento.gridx = 1;
		gbc_ftxtFechaNacimiento.gridy = 4;
		pnlMisDatos.add(ftxtFechaNacimiento, gbc_ftxtFechaNacimiento);
		
		btnCargarFoto = new JButton("Cargar Foto");
		btnCargarFoto.setIcon(new ImageIcon(Entrar.class.getResource("/presentacion/cargarFoto.png")));
		btnCargarFoto.addActionListener(new BtnCargarFotoActionListener());
		btnCargarFoto.setEnabled(false);
		GridBagConstraints gbc_btnCargarFoto = new GridBagConstraints();
		gbc_btnCargarFoto.gridwidth = 4;
		gbc_btnCargarFoto.insets = new Insets(0, 0, 5, 0);
		gbc_btnCargarFoto.gridx = 8;
		gbc_btnCargarFoto.gridy = 4;
		pnlMisDatos.add(btnCargarFoto, gbc_btnCargarFoto);
		
		lblDireccion = new JLabel("DIRECCIÓN");
		lblDireccion.setEnabled(false);
		GridBagConstraints gbc_lblDireccion = new GridBagConstraints();
		gbc_lblDireccion.anchor = GridBagConstraints.EAST;
		gbc_lblDireccion.insets = new Insets(0, 0, 5, 5);
		gbc_lblDireccion.gridx = 0;
		gbc_lblDireccion.gridy = 5;
		pnlMisDatos.add(lblDireccion, gbc_lblDireccion);
		
		txtDireccion = new JTextField();
		txtDireccion.setText("Calatrava, 5, Ciudad Real");
		txtDireccion.setEnabled(false);
		GridBagConstraints gbc_txtDireccion = new GridBagConstraints();
		gbc_txtDireccion.gridwidth = 5;
		gbc_txtDireccion.insets = new Insets(0, 0, 5, 5);
		gbc_txtDireccion.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtDireccion.gridx = 1;
		gbc_txtDireccion.gridy = 5;
		pnlMisDatos.add(txtDireccion, gbc_txtDireccion);
		txtDireccion.setColumns(10);
		
		
		lblTelefono = new JLabel("TELÉFONO");
		lblTelefono.setEnabled(false);
		GridBagConstraints gbc_lblTelefono = new GridBagConstraints();
		gbc_lblTelefono.anchor = GridBagConstraints.EAST;
		gbc_lblTelefono.insets = new Insets(0, 0, 5, 5);
		gbc_lblTelefono.gridx = 0;
		gbc_lblTelefono.gridy = 6;
		pnlMisDatos.add(lblTelefono, gbc_lblTelefono);
		

		MaskFormatter formatoTlfno;
		try {
			formatoTlfno = new MaskFormatter("'(###')' ###' ###"); 
			formatoTlfno.setPlaceholderCharacter('*');
			ftxtTelefono = new JFormattedTextField(formatoTlfno);
		} catch (ParseException e) {
		    // TODO Auto-generated catch block
		    e.printStackTrace();
		}
		ftxtTelefono.setText("926234598");
		ftxtTelefono.setEnabled(false);
		GridBagConstraints gbc_ftxtTelefono = new GridBagConstraints();
		gbc_ftxtTelefono.gridwidth = 2;
		gbc_ftxtTelefono.insets = new Insets(0, 0, 5, 5);
		gbc_ftxtTelefono.fill = GridBagConstraints.HORIZONTAL;
		gbc_ftxtTelefono.gridx = 1;
		gbc_ftxtTelefono.gridy = 6;
		pnlMisDatos.add(ftxtTelefono, gbc_ftxtTelefono);
		
		
		lblEmail = new JLabel("E-MAIL");
		lblEmail.setEnabled(false);
		GridBagConstraints gbc_lblEmail = new GridBagConstraints();
		gbc_lblEmail.anchor = GridBagConstraints.EAST;
		gbc_lblEmail.insets = new Insets(0, 0, 5, 5);
		gbc_lblEmail.gridx = 0;
		gbc_lblEmail.gridy = 7;
		pnlMisDatos.add(lblEmail, gbc_lblEmail);
		
		txtEmail = new JTextField();
		txtEmail.setText("mSanchez@gmail.com");
		txtEmail.setEnabled(false);
		GridBagConstraints gbc_txtEmail = new GridBagConstraints();
		gbc_txtEmail.gridwidth = 4;
		gbc_txtEmail.insets = new Insets(0, 0, 5, 5);
		gbc_txtEmail.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtEmail.gridx = 1;
		gbc_txtEmail.gridy = 7;
		pnlMisDatos.add(txtEmail, gbc_txtEmail);
		txtEmail.setColumns(10);
		
		lblProfesional = new JLabel("PROFESIONAL");
		lblProfesional.setEnabled(false);
		GridBagConstraints gbc_lblProfesional = new GridBagConstraints();
		gbc_lblProfesional.anchor = GridBagConstraints.EAST;
		gbc_lblProfesional.insets = new Insets(0, 0, 5, 5);
		gbc_lblProfesional.gridx = 0;
		gbc_lblProfesional.gridy = 8;
		pnlMisDatos.add(lblProfesional, gbc_lblProfesional);
		
		cmbProfesional = new JComboBox();
		cmbProfesional.setModel(new DefaultComboBoxModel(new String[] {"Cardiología", "Emergencias", "Enfermería", "Ginecología", "Neurología", "Oncología", "Pediatría", "Radiología", "Traumatología", "Urología", "", "", "", "", "", ""}));
		cmbProfesional.setEnabled(false);
		GridBagConstraints gbc_cmbProfesional = new GridBagConstraints();
		gbc_cmbProfesional.gridwidth = 2;
		gbc_cmbProfesional.insets = new Insets(0, 0, 5, 5);
		gbc_cmbProfesional.fill = GridBagConstraints.HORIZONTAL;
		gbc_cmbProfesional.gridx = 1;
		gbc_cmbProfesional.gridy = 8;
		pnlMisDatos.add(cmbProfesional, gbc_cmbProfesional);
		
		btnEditar = new JButton("Editar");
		btnEditar.setIcon(new ImageIcon(Entrar.class.getResource("/presentacion/editar-iloveimg-resized.png")));
		btnEditar.addActionListener(new BtnEditarActionListener());
		GridBagConstraints gbc_btnEditar = new GridBagConstraints();
		gbc_btnEditar.insets = new Insets(0, 0, 0, 5);
		gbc_btnEditar.gridx = 8;
		gbc_btnEditar.gridy = 11;
		pnlMisDatos.add(btnEditar, gbc_btnEditar);
		
		btnGuardar = new JButton("Guardar");
		btnGuardar.setIcon(new ImageIcon(Entrar.class.getResource("/presentacion/guardar-iloveimg-resized.png")));
		btnGuardar.addActionListener(new BtnGuardarActionListener());
		btnGuardar.setEnabled(false);
		GridBagConstraints gbc_btnGuardar = new GridBagConstraints();
		gbc_btnGuardar.insets = new Insets(0, 0, 0, 5);
		gbc_btnGuardar.gridx = 9;
		gbc_btnGuardar.gridy = 11;
		pnlMisDatos.add(btnGuardar, gbc_btnGuardar);
		
		pnlPacientes = new JPanel();
		tabbedPane.addTab("Pacientes", new ImageIcon(Entrar.class.getResource("/presentacion/48794.png")), pnlPacientes, null);
		pnlPacientes.setLayout(new BorderLayout(0, 0));
		
		pnlContenido = new JPanel();
		pnlPacientes.add(pnlContenido, BorderLayout.CENTER);
		pnlContenido.setLayout(new BorderLayout(0, 0));
		
		lblImagenPaciente = new JLabel("");
		lblImagenPaciente.setIcon(new ImageIcon(Entrar.class.getResource("/presentacion/patient_256-iloveimg-resized.png")));
		pnlContenido.add(lblImagenPaciente, BorderLayout.NORTH);
		
		tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		pnlContenido.add(tabbedPane_1, BorderLayout.CENTER);
		
		
		pnlListado = new JPanel();
		tabbedPane_1.addTab("Listado", new ImageIcon(Entrar.class.getResource("/presentacion/list-iloveimg-resized.png")), pnlListado, null);
		pnlListado.setLayout(new BorderLayout(0, 0));
		
		panel = new JPanel();
		pnlListado.add(panel, BorderLayout.NORTH);
		
		btnAadir = new JButton("Añadir");
		btnAadir.addActionListener(new BtnAadirActionListener());
		panel.add(btnAadir);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(new BtnEliminarActionListener());
		panel.add(btnEliminar);
		
		scrollPane = new JScrollPane();
		pnlListado.add(scrollPane, BorderLayout.CENTER);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		
		MiModeloTabla modeloTabla = new MiModeloTabla(); 
		table.setModel(modeloTabla); //boton Cargar Foto y date 
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		
		/*
		
		gbl_pnlInforProfesionales.columnWidths = new int[]{372, 256, 61, 0};
		gbl_pnlInforProfesionales.rowHeights = new int[]{16, 0};
		gbl_pnlInforProfesionales.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_pnlInforProfesionales.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		pnlInforProfesionales.setLayout(gbl_pnlInforProfesionales);
		
		textInformacion = new JTextPane();
		GridBagConstraints gbc_textInformacion = new GridBagConstraints();
		gbc_textInformacion.insets = new Insets(0, 0, 0, 5);
		gbc_textInformacion.fill = GridBagConstraints.BOTH;
		gbc_textInformacion.gridx = 0;
		gbc_textInformacion.gridy = 0;
		pnlInforProfesionales.add(textInformacion, gbc_textInformacion);
		
		lblFotoProf = new JLabel("");
		GridBagConstraints gbc_lblFotoProf = new GridBagConstraints();
		gbc_lblFotoProf.insets = new Insets(0, 0, 0, 5);
		gbc_lblFotoProf.gridx = 1;
		gbc_lblFotoProf.gridy = 0;
		pnlInforProfesionales.add(lblFotoProf, gbc_lblFotoProf);
		
		btnContactar = new JButton("Contactar");
		btnContactar.addActionListener(new BtnContactarActionListener());
		
		GridBagConstraints gbc_btnContactar = new GridBagConstraints();
		gbc_btnContactar.gridx = 2;
		gbc_btnContactar.gridy = 0;
		pnlInforProfesionales.add(btnContactar, gbc_btnContactar);*/
		
		panel_1 = new JPanel();
		pnlListado.add(panel_1, BorderLayout.SOUTH);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{266, 76, 0, 0, 0, 0};
		gbl_panel_1.rowHeights = new int[]{16, 0};
		gbl_panel_1.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		txtInformacion = new JTextPane();
		GridBagConstraints gbc_textPane = new GridBagConstraints();
		gbc_textPane.insets = new Insets(0, 0, 0, 5);
		gbc_textPane.fill = GridBagConstraints.BOTH;
		gbc_textPane.gridx = 0;
		gbc_textPane.gridy = 0;
		panel_1.add(txtInformacion, gbc_textPane);
		
		lblFotoPaciente = new JLabel("");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel_1.gridx = 1;
		gbc_lblNewLabel_1.gridy = 0;
		panel_1.add(lblFotoPaciente, gbc_lblNewLabel_1);
		
		btnInforme = new JButton("");
		btnInforme.setIcon(new ImageIcon(Entrar.class.getResource("/presentacion/informe3.png")));
		btnInforme.addActionListener(new BtnInformeActionListener());
		GridBagConstraints gbc_btnInforme = new GridBagConstraints();
		gbc_btnInforme.gridx = 4;
		gbc_btnInforme.gridy = 0;
		panel_1.add(btnInforme, gbc_btnInforme);
		ListSelectionModel rowSM =  table.getSelectionModel();
		rowSM.addListSelectionListener(new ListSelectionListener() {
		    public void valueChanged(ListSelectionEvent e) {
		         ListSelectionModel lsm = (ListSelectionModel) e.getSource();
		         if (!lsm.isSelectionEmpty()) {
		//int filaSeleccionada = lsm.getMinSelectionIndex() + 1;
		//taFilaSeleccionada.setText("Fila "+filaSeleccionada+" seleccionada");
		        	 MiModeloTabla modeloTabla = (MiModeloTabla) table.getModel();
		        	 int n= table.getSelectedRow();
		        	 if (n != -1) {
		        		 String contenido = "Nombre:"+ modeloTabla.getValueAt(n, 0)+"\n"+
		        				 "Apellidos: "+ modeloTabla.getValueAt(n, 1)+"\n"+ "Antecedentes Familiares: "+modeloTabla.getValueAt(n,3)+"\n"+
		        				 "Tratamiento Habitual: "+modeloTabla.getValueAt(n,6)+"\n"+"Citas: "+modeloTabla.getValueAt(n,8)+"\n"+ "Resultados Pruebas: "+modeloTabla.getValueAt(n,8)+"\n";
		        		 //txtInformacion.setText(contenido);
		        		 contenido +=(Boolean) modeloTabla.getValueAt(n, 4)?"Alergias\n": "No Alergias\n" ; //txtInformacion.setText(contenido);
		        		 contenido += (Boolean) modeloTabla.getValueAt(n, 5)?"Vacunado\n": "No Vacunado\n";
		        		 contenido +=(Boolean) modeloTabla.getValueAt(n, 7)?"Intervenido Quirurgicamente\n": "No Intervencion Quirurgica\n" ;
		        		 
		        		
		     			lblFotoPaciente.setIcon((ImageIcon)modeloTabla.getValueAt(n, 2));
		        		 txtInformacion.setText(contenido);
		        	 }
		         }
		    }
		});
		
		
		TableColumn columnaFoto = table.getColumnModel().getColumn(2); 
		columnaFoto.setCellEditor(new ColumnaFotoEditor());
		
		
		//añadir una fila de ejemplo
			
			Object[] fila1= {"María", "Gutierrez Sánchez", new ImageIcon(getClass().getClassLoader().getResource("presentacion/pacienteFoto-iloveimg-resized.png")), 
					"Diabetes", true, true, "-", false, "15/01/16", "Fractura"};
					modeloTabla.aniadeFila(fila1);
			
		
		
		
		
		pnlAgenda = new JPanel();
		tabbedPane_1.addTab("Agenda", new ImageIcon(Entrar.class.getResource("/presentacion/agenda_200-iloveimg-resized.png")), pnlAgenda, null);
		pnlAgenda.setLayout(new BorderLayout(0, 0));
		
		pnlCalendario = new JPanel();
		pnlAgenda.add(pnlCalendario, BorderLayout.NORTH);
		
		dtChooser = new JDateChooser();
		pnlCalendario.add(dtChooser);
		
		btnVer = new JButton("Ver");
		btnVer.addActionListener(new BtnVerActionListener());
		pnlCalendario.add(btnVer);
		
		scrollPane_2 = new JScrollPane();
		pnlAgenda.add(scrollPane_2, BorderLayout.CENTER);
		
		tAgenda = new JTable();
		scrollPane_2.setViewportView(tAgenda);
		
		TablaAgenda agenda = new TablaAgenda(); 
		tAgenda.setModel(agenda);  
		tAgenda.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		pnlProfesionales = new JPanel();
		tabbedPane.addTab("Profesionales", new ImageIcon(Entrar.class.getResource("/presentacion/doctor.png")), pnlProfesionales, null);
		pnlProfesionales.setLayout(new BorderLayout(0, 0));
		
		pnlDoctor = new Panel();
		pnlProfesionales.add(pnlDoctor, BorderLayout.NORTH);
		pnlDoctor.setLayout(new BorderLayout(0, 0));
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Entrar.class.getResource("/presentacion/doctorImagen-iloveimg-resized.png")));
		pnlDoctor.add(lblNewLabel);
		
		pnlContenidoProf = new Panel();
		pnlProfesionales.add(pnlContenidoProf, BorderLayout.CENTER);
		pnlContenidoProf.setLayout(new BorderLayout(0, 0));
		
		pnlContactar = new JPanel();
		pnlContenidoProf.add(pnlContactar, BorderLayout.NORTH);
		
		scrollPane_1 = new JScrollPane();
		pnlContenidoProf.add(scrollPane_1, BorderLayout.CENTER);
		
		tableProfesional = new JTable(); //añadir datos
		scrollPane_1.setViewportView(tableProfesional);
		
		MiModeloTablaProfesionales modeloProfesional = new MiModeloTablaProfesionales(); 
		tableProfesional.setModel(modeloProfesional); //boton Cargar Foto y date 
		tableProfesional.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		/*TableColumn columnaContactar = tableProfesional.getColumnModel().getColumn(10); 
		columnaContactar.setCellEditor(new ColumnaContactarEditor());*/
		
		
		TableColumn columnaNacionalidad = tableProfesional.getColumnModel().getColumn(4);
		JComboBox comboBox = new JComboBox(); 
		comboBox.addItem("España"); comboBox.addItem("Alemania"); comboBox.addItem("EEUU"); comboBox.addItem("Francia"); comboBox.addItem("China");comboBox.addItem("México");
		columnaNacionalidad.setCellEditor(new DefaultCellEditor(comboBox));
		
		TableColumn columnaProfesional = tableProfesional.getColumnModel().getColumn(8);
		JComboBox comboBox2 = new JComboBox(); 
		comboBox2.addItem("Cardiología"); comboBox2.addItem("Enfermería"); comboBox2.addItem("Pediatría"); comboBox2.addItem("Ginecología"); comboBox2.addItem("Urología");
		columnaProfesional.setCellEditor(new DefaultCellEditor(comboBox2));
		ListSelectionModel row2 =  tableProfesional.getSelectionModel();
		row2.addListSelectionListener(new ListSelectionListener() {
		    public void valueChanged(ListSelectionEvent e) {
		         ListSelectionModel ls = (ListSelectionModel) e.getSource();
		         if (!ls.isSelectionEmpty()) {

		        	 MiModeloTablaProfesionales modeloProfesional = (MiModeloTablaProfesionales) tableProfesional.getModel();
		        	 int n= tableProfesional.getSelectedRow();
		        	 if (n != -1) {
		        		 String contenido = "Nombre:"+ modeloProfesional.getValueAt(n, 0)+"\n"+
		        				 "Apellidos: "+ modeloProfesional.getValueAt(n, 1)+"\n"+ "DNI: "+modeloProfesional.getValueAt(n,3)+"\n"+
		        				 "Nacionalidad: "+modeloProfesional.getValueAt(n, 4)+"\n"+ "Fecha de Nacimiento: "+modeloProfesional.getValueAt(n,5)+"\n"+
		        				 "Teléfono: "+modeloProfesional.getValueAt(n,6)+"\n"+ "e-mail: "+modeloProfesional.getValueAt(n,7)+"\n"+ "Profesional: "+modeloProfesional.getValueAt(n, 8)+"\n"+
		        		 		 "Horario de disponibilidad: "+modeloProfesional.getValueAt(n, 9)+"\n";
		        		
		        		 textInformacion.setText(contenido);
		        		 lblFotoProf.setIcon((ImageIcon)modeloProfesional.getValueAt(n, 2));
		        	 }
		         }
		    }
		});
		
		TableColumn columnaFoto2 = tableProfesional.getColumnModel().getColumn(2); 
		columnaFoto2.setCellEditor(new ColumnaFotoEditor());
		
		
		Object[] f1= {"Angela", "Anderson", new ImageIcon(getClass().getClassLoader().getResource("presentacion/angelaAnderson-iloveimg-resized.png")), 
				"05934885-Z", "Alemania", "14/02/1972", "678934218", "maria45@outlook.com", "Ginecología", "L: 12:00-14:00", };
				modeloProfesional.aniadeFila(f1);
		Object[] f2= {"Óscar", "Medina", new ImageIcon(getClass().getClassLoader().getResource("presentacion/doctor2-iloveimg-resized.png")), 
					  "09128226-A", "México", "23/03/1968", "634786512", "oscarMed@gmail.com", "Urología", "X: 11:00-13:00", };
				modeloProfesional.aniadeFila(f2);
		Object[] f3= {"Nadia", "White", new ImageIcon(getClass().getClassLoader().getResource("presentacion/doctora3-iloveimg-resized.png")), 
					  "13693209-N", "EEUU", "01/11/1979", "666709125", "nad12@hotmail.com", "Enfermería", "J: 09:00-11:00",};
				modeloProfesional.aniadeFila(f3);
		Object[] f4= {"Enrique", "Moyano", new ImageIcon(getClass().getClassLoader().getResource("presentacion/medico-iloveimg-resized.png")), 
					  "04987123-L", "España", "04/10/1980", "609126785", "enrique_moy@gmail.com", "Pediatría", "M: 15:30-17:30", };
				modeloProfesional.aniadeFila(f4);
		Object[] f5= {"Fabiene", "Moreau", new ImageIcon(getClass().getClassLoader().getResource("presentacion/mujerDoctor-iloveimg-resized.png")), 
					  "16432961-B", "Francia", "28/11/1970", "694080512", "fabiene@outlook.com", "Cardiología", "V: 19:00-21:00", };
				modeloProfesional.aniadeFila(f5);
		
		pnlInforProfesionales = new JPanel();
		pnlProfesionales.add(pnlInforProfesionales, BorderLayout.SOUTH);
		GridBagLayout gbl_pnlInforProfesionales = new GridBagLayout();
		gbl_pnlInforProfesionales.columnWidths = new int[]{372, 256, 61, 0};
		gbl_pnlInforProfesionales.rowHeights = new int[]{16, 0};
		gbl_pnlInforProfesionales.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_pnlInforProfesionales.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		pnlInforProfesionales.setLayout(gbl_pnlInforProfesionales);
		
		textInformacion = new JTextPane();
		GridBagConstraints gbc_textInformacion = new GridBagConstraints();
		gbc_textInformacion.insets = new Insets(0, 0, 0, 5);
		gbc_textInformacion.fill = GridBagConstraints.BOTH;
		gbc_textInformacion.gridx = 0;
		gbc_textInformacion.gridy = 0;
		pnlInforProfesionales.add(textInformacion, gbc_textInformacion);
		
		lblFotoProf = new JLabel("");
		GridBagConstraints gbc_lblFotoProf = new GridBagConstraints();
		gbc_lblFotoProf.insets = new Insets(0, 0, 0, 5);
		gbc_lblFotoProf.gridx = 1;
		gbc_lblFotoProf.gridy = 0;
		pnlInforProfesionales.add(lblFotoProf, gbc_lblFotoProf);
		
		btnContactar = new JButton("");
		btnContactar.setIcon(new ImageIcon(Entrar.class.getResource("/presentacion/Contactar-iloveimg-resized.png")));
		btnContactar.addActionListener(new BtnContactarActionListener());
		
		GridBagConstraints gbc_btnContactar = new GridBagConstraints();
		gbc_btnContactar.gridx = 2;
		gbc_btnContactar.gridy = 0;
		pnlInforProfesionales.add(btnContactar, gbc_btnContactar);
		
		pnlSalir = new JPanel();
		contentPane.add(pnlSalir, BorderLayout.SOUTH);
		GridBagLayout gbl_pnlSalir = new GridBagLayout();
		gbl_pnlSalir.columnWidths = new int[]{526, 0, 75, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_pnlSalir.rowHeights = new int[]{0, 0, 44, 0};
		gbl_pnlSalir.columnWeights = new double[]{0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_pnlSalir.rowWeights = new double[]{1.0, 1.0, 0.0, Double.MIN_VALUE};
		pnlSalir.setLayout(gbl_pnlSalir);
		{
			Calendar calendario = new GregorianCalendar();
			dia =calendario.get(Calendar.DATE);
			mes = calendario.get(Calendar.DAY_OF_MONTH);
			anio= calendario.get(Calendar.DAY_OF_YEAR);	
			
			String h=(dia + "/" + mes + "/" +anio);
		}
		
		panel_2 = new JPanel();
		GridBagConstraints gbc_panel_2 = new GridBagConstraints();
		gbc_panel_2.insets = new Insets(0, 0, 0, 5);
		gbc_panel_2.fill = GridBagConstraints.BOTH;
		gbc_panel_2.gridx = 0;
		gbc_panel_2.gridy = 2;
		pnlSalir.add(panel_2, gbc_panel_2);
		lblFechaltimoAcceso = new JLabel("Fecha Último Acceso");
		panel_2.add(lblFechaltimoAcceso);
		
		
		
		{
			btnSalir = new JButton("Salir");
			GridBagConstraints gbc_btnSalir = new GridBagConstraints();
			gbc_btnSalir.insets = new Insets(0, 0, 0, 5);
			gbc_btnSalir.anchor = GridBagConstraints.NORTHWEST;
			gbc_btnSalir.gridx = 17;
			gbc_btnSalir.gridy = 2;
			pnlSalir.add(btnSalir, gbc_btnSalir);
			btnSalir.addActionListener(new BtnSalirActionListener());
			btnSalir.setIcon(new ImageIcon(Entrar.class.getResource("/presentacion/iconoSalir.png")));
		}
		Calendar calendario = new GregorianCalendar();
		dia =calendario.get(Calendar.DATE);
		mes = calendario.get(Calendar.MONTH+1);
		anio= calendario.get(Calendar.YEAR);	
		
		String h=(dia + "/" + mes + "/" +anio);
		
		formattedTextField = new JFormattedTextField(h);
		panel_2.add(formattedTextField);
		
	
	}
	private class BtnCargarFotoActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JFileChooser fcAbrir = new JFileChooser();
			fcAbrir.setFileFilter(new ImageFilter());
			fcAbrir.showOpenDialog(contentPane);
			File file = fcAbrir.getSelectedFile();
			lblFoto.setIcon(new ImageIcon(file.getAbsolutePath()));
		}
	}
	private class BtnEditarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			txtNombre.setEnabled(true);
			lblNombre.setEnabled(true);
			txtApellidos.setEnabled(true);
			lblApellidos.setEnabled(true);
			lblDNI.setEnabled(true);
			ftxtDNI.setEnabled(true);
			lblNacionalidad.setEnabled(true);
			cmbNacionalidad.setEnabled(true);
			lblFechaNacimiento.setEnabled(true);
			ftxtFechaNacimiento.setEnabled(true);
			lblDireccion.setEnabled(true);
			txtDireccion.setEnabled(true);
			lblTelefono.setEnabled(true);
			ftxtTelefono.setEnabled(true);
			lblEmail.setEnabled(true);
			txtEmail.setEnabled(true);
			lblProfesional.setEnabled(true);
			cmbProfesional.setEnabled(true);
			btnEditar.setEnabled(false);
			btnGuardar.setEnabled(true);
			btnCargarFoto.setEnabled(true);
			
		}
	}
	private class BtnGuardarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			txtNombre.setEnabled(false);
			lblNombre.setEnabled(false);
			txtApellidos.setEnabled(false);
			lblApellidos.setEnabled(false);
			lblDNI.setEnabled(false);
			ftxtDNI.setEnabled(false);
			lblNacionalidad.setEnabled(false);
			cmbNacionalidad.setEnabled(false);
			lblFechaNacimiento.setEnabled(false);
			ftxtFechaNacimiento.setEnabled(false);
			lblDireccion.setEnabled(false);
			txtDireccion.setEnabled(false);
			lblTelefono.setEnabled(false);
			ftxtTelefono.setEnabled(false);
			lblEmail.setEnabled(false);
			txtEmail.setEnabled(false);
			lblProfesional.setEnabled(false);
			cmbProfesional.setEnabled(false);
			btnEditar.setEnabled(true);
			btnGuardar.setEnabled(false);
			btnCargarFoto.setEnabled(false);
			

			JFileChooser selecArchivo=new JFileChooser();
			selecArchivo.setFileFilter(new AluFilter());
			int returnVal = selecArchivo.showSaveDialog(frameEntrar);
			
			if(JOptionPane.showConfirmDialog(null, "Estás seguro?")==0){
                File JFC = selecArchivo.getSelectedFile();

				FileWriter fichero = null;
		        PrintWriter pw = null;
		        try{
		        	String path=selecArchivo.getSelectedFile().getAbsolutePath();
		            fichero = new FileWriter(path);
		            pw = new PrintWriter(fichero);
		            
		            pw.print("Nombre "+txtNombre.getText() +"\n"+"Apellidos "+txtApellidos.getText()+"\n"+"DNI "+ftxtDNI.getText()+"\n"+"Nacionalidad "+cmbNacionalidad.getSelectedItem().toString()+"\n"+"Fecha de Nacimiento "+ftxtFechaNacimiento.getText()+"\n"+
		            		"Direccion "+txtDireccion.getText()+"\n"+"Teléfono "+ftxtTelefono.getText()+"\n"+"E-Mail "+txtEmail.getText()+"\n"+"Profesional "+cmbProfesional.getSelectedItem().toString());
		            
		            if(!(path.endsWith(".alu"))){
                        File temp = new File(path+".txt");
                        JFC.renameTo(temp);//renombramos el archivo
                    }
		                
					JOptionPane.showMessageDialog(frameEntrar, "Archivo guardado correctamente");

		        } catch (Exception e1) {
		            e1.printStackTrace();
					JOptionPane.showMessageDialog(frameEntrar, "Error al guardar el archivo");
		        } finally {
		            try {
		                /* Nuevamente aprovechamos el finally para 
		                	asegurarnos que se cierra el fichero.*/
		                if (null != fichero)
		                   fichero.close();
		            }catch (Exception e2) {
		                   e2.printStackTrace();
		            }
		        }
				
			}else{
				JOptionPane.showMessageDialog(frameEntrar, "No ha guardado el archivo");
			}
		}
	}
	private class BtnSalirActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			int n = JOptionPane.showConfirmDialog(  
					frameEntrar,
					"Desea abandonar la aplicación?" ,
					"",
					JOptionPane.YES_NO_OPTION);

					if(n == JOptionPane.YES_OPTION)
					{
						JOptionPane.showMessageDialog(frameEntrar, "Gracias por utilizar nuestra aplicación");
						System.exit(0);
					}
					else{
						Inicio in=new Inicio();
						in.getFrame().setVisible(true);;
						frameEntrar.dispose();
					}
		}
	}
	private class ThisWindowListener extends WindowAdapter {
		@Override
		public void windowClosing(WindowEvent e) {
			int n = JOptionPane.showConfirmDialog(  
					frameEntrar,
					"Desea abandonar la aplicación?" ,
					"",
					JOptionPane.YES_NO_OPTION);

					if(n == JOptionPane.YES_OPTION)
					{
						JOptionPane.showMessageDialog(frameEntrar, "Gracias por utilizar nuestra aplicación");
						System.exit(0);
					}
					else{
						Inicio in=new Inicio();
						in.getFrame().setVisible(true);;
						frameEntrar.dispose();
					}
					
		}
	}


	private class BtnAadirActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			
			/*MiModeloTabla modeloTabla = (MiModeloTabla) table.getModel(); Object[] nuevaFila = {"...", "...", new JButton("Cargar Foto"), "...",
					false, false, "...", false, "...", "..."};*/
			/*MiModeloTabla modeloTabla = (MiModeloTabla) table.getModel(); 
			Object[] nuevaFila = {"...", "...", new ImageIcon(getClass().getClassLoader().getResource("/presentacion/cargarFoto.png")), "...",
			false, false, "...", false, "...", "..."};
					modeloTabla.aniadeFila(nuevaFila); 
					modeloTabla.fireTableDataChanged();*/
			
					MiModeloTabla modeloTabla = (MiModeloTabla) table.getModel();
					Object[] nuevaFila = {"...", "...", new
							ImageIcon(getClass().getClassLoader().getResource("presentacion/cargarFoto.png")),"...",false, false, "...", false, "...","..."};
					modeloTabla.aniadeFila(nuevaFila);
					modeloTabla.fireTableDataChanged();
				}
			}
	

	private class BtnEliminarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			MiModeloTabla modeloTabla = (MiModeloTabla) table.getModel(); 
			int n= table.getSelectedRow();
			if (n != -1) modeloTabla.eliminaFila(table.getSelectedRow()); 
			modeloTabla.fireTableDataChanged();
			txtInformacion.setText(""); 
			lblFotoPaciente.setIcon(null);
		}
	}
	private class BtnContactarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			Contactar2 c= new Contactar2();
			
			c.setVisible(true);
			int n= tableProfesional.getSelectedRow();
			MiModeloTablaProfesionales modeloProfesional = (MiModeloTablaProfesionales) tableProfesional.getModel();
			String nombre = ""+ modeloProfesional.getValueAt(n, 7);
			c.setTextField(nombre);
			
		}
	}
	
	private class BtnVerActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String dia2 = Integer.toString(dtChooser.getCalendar().get(Calendar.DAY_OF_MONTH));
			String mes2= Integer.toString(dtChooser.getCalendar().get(Calendar.MONTH)+1);
			String año2 = Integer.toString(dtChooser.getCalendar().get(Calendar.YEAR));
			String fecha=(dia2 + "/" + mes2 + "/" + año2 +"\n");
			
			TablaAgenda agenda = (TablaAgenda) tAgenda.getModel();
			Object[] nuevaFila = {fecha, "9:00", "Sonia", "Enfermedad"};
			agenda.aniadeFila(nuevaFila);
			agenda.fireTableDataChanged();
			
		}
	}
	private class BtnInformeActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			Informe3 i=new Informe3();
			i.setVisible(true);
			int n= table.getSelectedRow();
			MiModeloTabla modeloPacientes = (MiModeloTabla) table.getModel();
			String nombre = ""+ modeloPacientes.getValueAt(n, 0);
			i.setTextField(nombre);
		}
	}
}




		
