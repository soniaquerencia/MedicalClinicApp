package presentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSplitPane;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.Window;

import javax.swing.AbstractListModel;
import javax.swing.DefaultListModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PanelListadoPacientes extends JFrame {

	private JPanel contentPane;
	private JSplitPane splitPane;
	private JPanel panel;
	private JScrollPane scrollPane;
	private JList list;
	private JButton btnVer;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JPanel panel_1;
	private JButton btnSalir;
	private JButton btnAtrs;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PanelListadoPacientes frame = new PanelListadoPacientes();
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
	public PanelListadoPacientes() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		splitPane = new JSplitPane();
		contentPane.add(splitPane, BorderLayout.CENTER);
		
		panel = new JPanel();
		splitPane.setLeftComponent(panel);
		panel.setLayout(new GridLayout(0, 1, 0, 0));
		
		btnNewButton = new JButton("Ver");
		panel.add(btnNewButton);
		
		btnNewButton_1 = new JButton("Editar");
		panel.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("Añadir");
		btnNewButton_2.addActionListener(new BtnNewButton_2ActionListener());
		panel.add(btnNewButton_2);
		
		btnVer = new JButton("Eliminar");
		panel.add(btnVer);
		
		scrollPane = new JScrollPane();
		splitPane.setRightComponent(scrollPane);
		
		list = new JList();
		DefaultListModel modeloLista = new DefaultListModel();
		list.setModel(modeloLista);
		modeloLista.addElement("Elena Rodriguez Martín");
		modeloLista.addElement("Enrique Martín Martín");
		//list = new JList();
		/*list.setModel(new AbstractListModel() {
			String[] values = new String[] {"Elena Rodriguez Martín", "Enrique Martín Martín", "Jorge Pérez González", "María Gutierrez Sánchez", "", "", ""};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});*/
		scrollPane.setViewportView(list);
		
		panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.SOUTH);
		
		btnAtrs = new JButton("Atrás");
		btnAtrs.addActionListener(new BtnAtrsActionListener());
		panel_1.add(btnAtrs);
		
		btnSalir = new JButton("Salir");
		panel_1.add(btnSalir);
	}

	private class BtnNewButton_2ActionListener implements ActionListener { //poner para añadir datos
		public void actionPerformed(ActionEvent e) {
			DefaultListModel modeloLista= (DefaultListModel) list.getModel(); 
			int indice = modeloLista.getSize();
			modeloLista.addElement("Nuevo Paciente"); list.setSelectedIndex(indice); list.ensureIndexIsVisible(indice);
		}
	}
	private class BtnAtrsActionListener implements ActionListener { //volver pacientes????
		public void actionPerformed(ActionEvent e) {
			Entrar en=new Entrar();
			en.setVisible(true);
			Window frame = null;
			frame.dispose();
		}
	}
}
