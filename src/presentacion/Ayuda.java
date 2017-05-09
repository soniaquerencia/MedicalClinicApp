package presentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTree;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ayuda extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JTextPane txtpnEnviarMensaje;
	private JTextPane txtpnIncluirUn;
	private JTextPane txtpnArchivo;
	private JTextPane txtpnEnviarCtrle;
	private JTextPane txtpnAdjuntarCtrla;
	private JTextPane txtpnGuardar;
	private JTextPane txtpnGuardarCtrls;
	private JTextPane txtpnEdicin;
	private JTextPane txtpnPequeaCtrlp;
	private JTextPane txtpnMedianaCtrlm;
	private JTextPane txtpnGrandeCtrlg;
	private JTextPane txtpnAyuda;
	private JTextPane txtpnAyudaCtrlh;
	private JTextPane txtpnAcercaDeCtrli;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ayuda frame = new Ayuda();
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
	public Ayuda() {
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 329);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 268, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		txtpnEnviarMensaje = new JTextPane();
		txtpnEnviarMensaje.setText("Enviar mensaje :");
		GridBagConstraints gbc_txtpnEnviarMensaje = new GridBagConstraints();
		gbc_txtpnEnviarMensaje.insets = new Insets(0, 0, 5, 5);
		gbc_txtpnEnviarMensaje.fill = GridBagConstraints.BOTH;
		gbc_txtpnEnviarMensaje.gridx = 0;
		gbc_txtpnEnviarMensaje.gridy = 0;
		panel.add(txtpnEnviarMensaje, gbc_txtpnEnviarMensaje);
		
		txtpnIncluirUn = new JTextPane();
		txtpnIncluirUn.setText("Necesario incluir un destinatario");
		GridBagConstraints gbc_txtpnIncluirUn = new GridBagConstraints();
		gbc_txtpnIncluirUn.insets = new Insets(0, 0, 5, 0);
		gbc_txtpnIncluirUn.fill = GridBagConstraints.BOTH;
		gbc_txtpnIncluirUn.gridx = 1;
		gbc_txtpnIncluirUn.gridy = 1;
		panel.add(txtpnIncluirUn, gbc_txtpnIncluirUn);
		
		txtpnArchivo = new JTextPane();
		txtpnArchivo.setText("Archivo:");
		GridBagConstraints gbc_txtpnArchivo = new GridBagConstraints();
		gbc_txtpnArchivo.insets = new Insets(0, 0, 5, 5);
		gbc_txtpnArchivo.fill = GridBagConstraints.BOTH;
		gbc_txtpnArchivo.gridx = 0;
		gbc_txtpnArchivo.gridy = 2;
		panel.add(txtpnArchivo, gbc_txtpnArchivo);
		
		txtpnEnviarCtrle = new JTextPane();
		txtpnEnviarCtrle.setText("Enviar ctrl+e");
		GridBagConstraints gbc_txtpnEnviarCtrle = new GridBagConstraints();
		gbc_txtpnEnviarCtrle.insets = new Insets(0, 0, 5, 0);
		gbc_txtpnEnviarCtrle.fill = GridBagConstraints.BOTH;
		gbc_txtpnEnviarCtrle.gridx = 1;
		gbc_txtpnEnviarCtrle.gridy = 3;
		panel.add(txtpnEnviarCtrle, gbc_txtpnEnviarCtrle);
		
		txtpnAdjuntarCtrla = new JTextPane();
		txtpnAdjuntarCtrla.setText("Adjuntar ctrl+a");
		GridBagConstraints gbc_txtpnAdjuntarCtrla = new GridBagConstraints();
		gbc_txtpnAdjuntarCtrla.insets = new Insets(0, 0, 5, 0);
		gbc_txtpnAdjuntarCtrla.fill = GridBagConstraints.BOTH;
		gbc_txtpnAdjuntarCtrla.gridx = 1;
		gbc_txtpnAdjuntarCtrla.gridy = 4;
		panel.add(txtpnAdjuntarCtrla, gbc_txtpnAdjuntarCtrla);
		
		txtpnGuardar = new JTextPane();
		txtpnGuardar.setText("Cargar Texto ctrl+t");
		GridBagConstraints gbc_txtpnGuardar = new GridBagConstraints();
		gbc_txtpnGuardar.insets = new Insets(0, 0, 5, 0);
		gbc_txtpnGuardar.fill = GridBagConstraints.BOTH;
		gbc_txtpnGuardar.gridx = 1;
		gbc_txtpnGuardar.gridy = 5;
		panel.add(txtpnGuardar, gbc_txtpnGuardar);
		
		txtpnGuardarCtrls = new JTextPane();
		txtpnGuardarCtrls.setText("Guardar ctrl+s");
		GridBagConstraints gbc_txtpnGuardarCtrls = new GridBagConstraints();
		gbc_txtpnGuardarCtrls.insets = new Insets(0, 0, 5, 0);
		gbc_txtpnGuardarCtrls.fill = GridBagConstraints.BOTH;
		gbc_txtpnGuardarCtrls.gridx = 1;
		gbc_txtpnGuardarCtrls.gridy = 6;
		panel.add(txtpnGuardarCtrls, gbc_txtpnGuardarCtrls);
		
		txtpnEdicin = new JTextPane();
		txtpnEdicin.setText("Edición");
		GridBagConstraints gbc_txtpnEdicin = new GridBagConstraints();
		gbc_txtpnEdicin.insets = new Insets(0, 0, 5, 5);
		gbc_txtpnEdicin.fill = GridBagConstraints.BOTH;
		gbc_txtpnEdicin.gridx = 0;
		gbc_txtpnEdicin.gridy = 7;
		panel.add(txtpnEdicin, gbc_txtpnEdicin);
		
		txtpnPequeaCtrlp = new JTextPane();
		txtpnPequeaCtrlp.setText("Pequeña ctrl+p");
		GridBagConstraints gbc_txtpnPequeaCtrlp = new GridBagConstraints();
		gbc_txtpnPequeaCtrlp.insets = new Insets(0, 0, 5, 0);
		gbc_txtpnPequeaCtrlp.fill = GridBagConstraints.BOTH;
		gbc_txtpnPequeaCtrlp.gridx = 1;
		gbc_txtpnPequeaCtrlp.gridy = 8;
		panel.add(txtpnPequeaCtrlp, gbc_txtpnPequeaCtrlp);
		
		txtpnMedianaCtrlm = new JTextPane();
		txtpnMedianaCtrlm.setText("Mediana ctrl+m");
		GridBagConstraints gbc_txtpnMedianaCtrlm = new GridBagConstraints();
		gbc_txtpnMedianaCtrlm.insets = new Insets(0, 0, 5, 0);
		gbc_txtpnMedianaCtrlm.fill = GridBagConstraints.BOTH;
		gbc_txtpnMedianaCtrlm.gridx = 1;
		gbc_txtpnMedianaCtrlm.gridy = 9;
		panel.add(txtpnMedianaCtrlm, gbc_txtpnMedianaCtrlm);
		
		txtpnGrandeCtrlg = new JTextPane();
		txtpnGrandeCtrlg.setText("Grande ctrl+g");
		GridBagConstraints gbc_txtpnGrandeCtrlg = new GridBagConstraints();
		gbc_txtpnGrandeCtrlg.insets = new Insets(0, 0, 5, 0);
		gbc_txtpnGrandeCtrlg.fill = GridBagConstraints.BOTH;
		gbc_txtpnGrandeCtrlg.gridx = 1;
		gbc_txtpnGrandeCtrlg.gridy = 10;
		panel.add(txtpnGrandeCtrlg, gbc_txtpnGrandeCtrlg);
		
		txtpnAyuda = new JTextPane();
		txtpnAyuda.setText("Ayuda");
		GridBagConstraints gbc_txtpnAyuda = new GridBagConstraints();
		gbc_txtpnAyuda.insets = new Insets(0, 0, 5, 5);
		gbc_txtpnAyuda.fill = GridBagConstraints.BOTH;
		gbc_txtpnAyuda.gridx = 0;
		gbc_txtpnAyuda.gridy = 11;
		panel.add(txtpnAyuda, gbc_txtpnAyuda);
		
		txtpnAyudaCtrlh = new JTextPane();
		txtpnAyudaCtrlh.setText("Ayuda ctrl+h");
		GridBagConstraints gbc_txtpnAyudaCtrlh = new GridBagConstraints();
		gbc_txtpnAyudaCtrlh.insets = new Insets(0, 0, 5, 0);
		gbc_txtpnAyudaCtrlh.fill = GridBagConstraints.BOTH;
		gbc_txtpnAyudaCtrlh.gridx = 1;
		gbc_txtpnAyudaCtrlh.gridy = 12;
		panel.add(txtpnAyudaCtrlh, gbc_txtpnAyudaCtrlh);
		
		txtpnAcercaDeCtrli = new JTextPane();
		txtpnAcercaDeCtrli.setText("Acerca de ctrl+i");
		GridBagConstraints gbc_txtpnAcercaDeCtrli = new GridBagConstraints();
		gbc_txtpnAcercaDeCtrli.anchor = GridBagConstraints.ABOVE_BASELINE;
		gbc_txtpnAcercaDeCtrli.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtpnAcercaDeCtrli.gridx = 1;
		gbc_txtpnAcercaDeCtrli.gridy = 13;
		panel.add(txtpnAcercaDeCtrli, gbc_txtpnAcercaDeCtrli);
	}

	
}
