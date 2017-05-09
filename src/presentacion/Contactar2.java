package presentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JToolBar;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JMenuBar;
import javax.swing.JTextPane;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JSeparator;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.Rectangle;
import javax.swing.JSplitPane;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class Contactar2 extends JFrame {

	private JPanel contentPane;
	private JFrame frame;
	private JPanel panel;
	private JPanel pnlContenido;
	private JMenuBar menuBar;
	private JToolBar toolBar;
	private JButton btnEnviar;
	private JButton btnAdjuntar;
	private JTextField txtDestinatario;
	private JMenu mnArchivo;
	private JMenu mnEdicin;
	private JMenu mnAyuda;
	private JMenuItem mntmEnviar;
	private JMenuItem mntmAdjuntar;
	private JMenuItem mntmCargarTexto;
	private JSeparator separator;
	private JMenuItem mntmGuardar;
	private JRadioButtonMenuItem rdPequeña;
	private JRadioButtonMenuItem rdMediana;
	private JRadioButtonMenuItem rdGrande;
	private JMenuItem mntmAyuda;
	private JMenuItem mntmAcercaDe;
	private JMenu mnTamaoDeFuente;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JScrollPane scrollPane;
	private JPanel panel_1;
	private JTextArea taContenido;
	private JLabel lblAdjunto;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Contactar2 frame = new Contactar2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Contactar2() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnArchivo = new JMenu("Archivo");
		menuBar.add(mnArchivo);
		
		mntmEnviar = new JMenuItem("Enviar");
		mntmEnviar.setIcon(new ImageIcon(Contactar2.class.getResource("/presentacion/email_send_message_envelopme_electronic_icon-icons.com_59988-iloveimg-resized.png")));
		mntmEnviar.addActionListener(new BtnEnviarActionListener());
		mnArchivo.add(mntmEnviar);
		mntmEnviar.setMnemonic('e');
		
		mntmAdjuntar = new JMenuItem("Adjuntar");
		mntmAdjuntar.setIcon(new ImageIcon(Contactar2.class.getResource("/presentacion/paper-clip-flags-68822-iloveimg-resized.png")));
		mnArchivo.add(mntmAdjuntar);
		mntmAdjuntar.addActionListener(new BtnAdjuntarActionListener());
		mntmAdjuntar.setMnemonic('a');
		
		mntmCargarTexto = new JMenuItem("Cargar Texto");
		mntmCargarTexto.setIcon(new ImageIcon(Contactar2.class.getResource("/presentacion/Editing-Overview-Pages-2-icon-iloveimg-resized.png")));
		mnArchivo.add(mntmCargarTexto);
		mntmCargarTexto.addActionListener(new BtnCargarComentariosActionListener());
		mntmCargarTexto.setMnemonic('t');
		
		separator = new JSeparator();
		mnArchivo.add(separator);
		
		mntmGuardar = new JMenuItem("Guardar");
		mntmGuardar.setIcon(new ImageIcon(Contactar2.class.getResource("/presentacion/guardar-iloveimg-resized.png")));
		mntmGuardar.addActionListener(new MntmGuardarActionListener());
		mnArchivo.add(mntmGuardar);
		mntmGuardar.setMnemonic('s');
		
		mnEdicin = new JMenu("Edición");
		menuBar.add(mnEdicin);
		
		mnTamaoDeFuente = new JMenu("Tamaño de Fuente");
		mnEdicin.add(mnTamaoDeFuente);
		
		rdPequeña = new JRadioButtonMenuItem("Pequeña");
		rdPequeña.addActionListener(new MiListener());
		buttonGroup.add(rdPequeña);
		mnTamaoDeFuente.add(rdPequeña);
		rdPequeña.setMnemonic('p');
		
		
		rdMediana = new JRadioButtonMenuItem("Mediana");
		rdMediana.addActionListener(new MiListener());
		buttonGroup.add(rdMediana);
		mnTamaoDeFuente.add(rdMediana);
		rdMediana.setMnemonic('m');
		
		rdGrande = new JRadioButtonMenuItem("Grande");
		rdGrande.addActionListener(new MiListener());
		buttonGroup.add(rdGrande);
		mnTamaoDeFuente.add(rdGrande);
		rdGrande.setMnemonic('g');
		
		mnAyuda = new JMenu("Ayuda");
		menuBar.add(mnAyuda);
		
		mntmAyuda = new JMenuItem("Ayuda");
		mntmAyuda.addActionListener(new MntmAyudaActionListener());
		mntmAyuda.setIcon(new ImageIcon(Contactar2.class.getResource("/presentacion/help_question_4509-iloveimg-resized.png")));
		mnAyuda.add(mntmAyuda);
		mntmAyuda.setMnemonic('h');
		
		mntmAcercaDe = new JMenuItem("Acerca de...");
		mntmAcercaDe.addActionListener(new MntmAcercaDeActionListener());
		mntmAcercaDe.setIcon(new ImageIcon(Contactar2.class.getResource("/presentacion/Very-Basic-About-icon-iloveimg-resized.png")));
		mnAyuda.add(mntmAcercaDe);
		mntmAcercaDe.setMnemonic('i');
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		panel.setLayout(new BorderLayout(0, 0));
		
		toolBar = new JToolBar();
		panel.add(toolBar, BorderLayout.NORTH);
		
		btnEnviar = new JButton("");
		btnEnviar.setIcon(new ImageIcon(Contactar2.class.getResource("/presentacion/email_send_message_envelopme_electronic_icon-icons.com_59988-iloveimg-resized.png")));
		btnEnviar.addActionListener(new BtnEnviarActionListener());
		toolBar.add(btnEnviar);
		
		btnAdjuntar = new JButton("");
		btnAdjuntar.setIcon(new ImageIcon(Contactar2.class.getResource("/presentacion/paper-clip-flags-68822-iloveimg-resized.png")));
		btnAdjuntar.addActionListener(new BtnAdjuntarActionListener());
		toolBar.add(btnAdjuntar);
		
		pnlContenido = new JPanel();
		contentPane.add(pnlContenido, BorderLayout.CENTER);
		pnlContenido.setLayout(new BorderLayout(0, 0));
		
		txtDestinatario = new JTextField();
		pnlContenido.add(txtDestinatario, BorderLayout.NORTH);
		txtDestinatario.setColumns(10);
		
		scrollPane = new JScrollPane();
		pnlContenido.add(scrollPane, BorderLayout.CENTER);
		
		panel_1 = new JPanel();
		scrollPane.setViewportView(panel_1);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{371, 67, 0};
		gbl_panel_1.rowHeights = new int[]{0, 0};
		gbl_panel_1.columnWeights = new double[]{1.0, 0.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		taContenido = new JTextArea();
		GridBagConstraints gbc_taContenido = new GridBagConstraints();
		gbc_taContenido.insets = new Insets(0, 0, 0, 5);
		gbc_taContenido.fill = GridBagConstraints.BOTH;
		gbc_taContenido.gridx = 0;
		gbc_taContenido.gridy = 0;
		panel_1.add(taContenido, gbc_taContenido);
		
		lblAdjunto = new JLabel("");
		GridBagConstraints gbc_lblAdjunto = new GridBagConstraints();
		gbc_lblAdjunto.gridx = 1;
		gbc_lblAdjunto.gridy = 0;
		panel_1.add(lblAdjunto, gbc_lblAdjunto);
		String nombre= "";
		setTextField(nombre);	
		
	}


	
	
	private class BtnEnviarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			
				String destinatario=getTextField();
				if (destinatario.equals("")){
					JOptionPane.showMessageDialog(frame,"Mensaje NO Enviado, falta destinatario","", JOptionPane.PLAIN_MESSAGE);
				}else{
					JOptionPane.showMessageDialog(frame,"Mensaje Enviado","", JOptionPane.PLAIN_MESSAGE);
					taContenido.setText("");
					lblAdjunto.setIcon(null);
					
				}
		}
	}
	


	public void setTextField(String nombre) {
		txtDestinatario.setText(nombre);
	}
	
	public String getTextField(){
		return txtDestinatario.getText();
	}
	
	private class MiListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			int tamano=12;
			switch(e.getActionCommand()){
			case "Pequeña":
				tamano = 8;
				break;
			case "Mediana":
				tamano = 12;
				break;
			case "Grande":
				tamano =16;
				break;
			}
			taContenido.setFont(new Font(taContenido.getFont().getFontName(),
					taContenido.getFont().getStyle(), tamano));
		}
	}
	
	private class BtnCargarComentariosActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JFileChooser fcAbrir = new JFileChooser();
			fcAbrir.setFileFilter(new TextFilter());
			int valorDevuelto = fcAbrir.showOpenDialog(frame);
			//Recoger el nombre del fichero seleccionado por el usuario
			if (valorDevuelto == JFileChooser.APPROVE_OPTION) {
			File file = fcAbrir.getSelectedFile(); System.out.println("Fichero seleccionado: " + file.getName()); 
			try{
			taContenido.setText("");
			// Apertura del fichero y creacion de BufferedReader
			FileReader fr = new FileReader (file.getAbsolutePath()); BufferedReader br = new BufferedReader(fr);
			// Lectura del fichero linea a linea
			String linea;
			while((linea=br.readLine())!=null) {
			System.out.println(linea); 
			taContenido.append(linea+"\n");
			}
			br.close();
			System.out.println("Fichero leído : " + file.getName() + ".");
			     }
			     catch (IOException ioe){
			System.out.println("Problemas mientras se leía el archivo"); }
			}else
			System.out.println("El usuario ha cancelado el proceso de lectura.");
		}
	}
	
	private class BtnAdjuntarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			
			JFileChooser fcAbrir = new JFileChooser();
			
			fcAbrir.setFileFilter(new ImageFilter());
			
			int valorDevuelto = fcAbrir.showOpenDialog(frame);
			//Recoger el nombre del fichero seleccionado por el usuario
			if (valorDevuelto == JFileChooser.APPROVE_OPTION) {
			File file = fcAbrir.getSelectedFile();
			//En este punto la aplicación se debería encargar de realizar la operación sobre el fichero
			System.out.println("Fichero seleccionado: " + file.getName());
			lblAdjunto.setIcon(new ImageIcon(file.getAbsolutePath()));
		}
			
	}
	}
	private class MntmGuardarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JFileChooser selecArchivo=new JFileChooser();
			selecArchivo.setFileFilter(new AluFilter());
			int returnVal = selecArchivo.showSaveDialog(frame);
			
			if(JOptionPane.showConfirmDialog(null, "Estás seguro?")==0){
                File JFC = selecArchivo.getSelectedFile();

				FileWriter fichero = null;
		        PrintWriter pw = null;
		        try{
		        	String path=selecArchivo.getSelectedFile().getAbsolutePath();
		            fichero = new FileWriter(path);
		            pw = new PrintWriter(fichero);
		            
		            pw.println(taContenido.getText());
		            
		            if(!(path.endsWith(".alu"))){
                        File temp = new File(path+".txt");
                        JFC.renameTo(temp);//renombramos el archivo
                    }
		                
					JOptionPane.showMessageDialog(frame, "Archivo guardado correctamente");

		        } catch (Exception e1) {
		            e1.printStackTrace();
					JOptionPane.showMessageDialog(frame, "Error al guardar el archivo");
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
				JOptionPane.showMessageDialog(frame, "No ha guardado el archivo");
			}
		}
	}
	private class MntmAyudaActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			Ayuda a = new Ayuda();
			a.setVisible(true);
			
		}
	}
	private class MntmAcercaDeActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(frame, "Autor: Sonia Querencia Martín");
		}
	}
	
	
}
