package presentacion;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JToolBar;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.*;

public class Informe3 extends JFrame {


	private int x, y;

	private JPanel contentPane;
	private JToolBar toolBar;
	private JPanel panel;
	private JTextField textField;
	private JScrollPane scrollPane;
	private MiAreaDibujo miAreaDibujo;
	private ImageIcon imagen;
	private JButton btnDolor;
	private JButton btnFractura;
	private JButton btnrea;
	private JButton btnInformacin;
	
	int modo = -1;
	private final int DOLOR = 1; 
	private final int FRACTURA = 2; 
	private final int RECTANGULO = 3; 
	private final int TEXTO = 4;
	
	private Toolkit toolkit;
	private Image imagDolor;
	private Image imagFractura;
	private Image imagRectangulo;
	private Image imagTexto;

	private Image imagCursorDolor;
	private Image imagCursorFractura;
	
	private Cursor cursorDolor; 
	private Cursor cursorFractura; 
	private Cursor cursorRectangulo;
	private Cursor cursorTexto;
	
	private JFrame frameInforme;
	
	private JTextField txtTexto = new JTextField();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Informe3 frameInforme = new Informe3();
					frameInforme.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Informe3() {
		imagen= new ImageIcon("/presentacion/sistemas_oseo_muscular.jpg");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		setBounds(100, 100, 601, 536);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		toolBar = new JToolBar();
		contentPane.add(toolBar, BorderLayout.NORTH);
		
		btnDolor = new JButton("Dolor");
		btnDolor.setIcon(new ImageIcon(Informe3.class.getResource("/presentacion/DolorIcono.png")));
		btnDolor.addActionListener(new BtnDolorActionListener());
		toolBar.add(btnDolor);
		
		btnFractura = new JButton("Fractura");
		btnFractura.setIcon(new ImageIcon(Informe3.class.getResource("/presentacion/IconoFractura.png")));
		btnFractura.addActionListener(new BtnFracturaActionListener());
		toolBar.add(btnFractura);
		
		btnrea = new JButton("Área");
		btnrea.setIcon(new ImageIcon(Informe3.class.getResource("/presentacion/rectangulo.png")));
		btnrea.addActionListener(new BtnreaActionListener());
		toolBar.add(btnrea);
		
		btnInformacin = new JButton("Información");
		btnInformacin.setIcon(new ImageIcon(Informe3.class.getResource("/presentacion/aniadirAnotacion.png")));
		btnInformacin.addActionListener(new BtnInformacinActionListener());
		toolBar.add(btnInformacin);
		
		panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new BorderLayout(0, 0));
		
		textField = new JTextField();
		panel.add(textField, BorderLayout.NORTH);
		textField.setColumns(10);
		
		scrollPane = new JScrollPane();
		panel.add(scrollPane, BorderLayout.CENTER);
		
		miAreaDibujo = new MiAreaDibujo(); 
	
		
		miAreaDibujo.addMouseListener(new MiAreaDibujoMouseListener());
		miAreaDibujo.addMouseMotionListener(new MiAreaDibujoMouseMotionListener());
	
		miAreaDibujo.setHorizontalAlignment(SwingConstants.CENTER);
		miAreaDibujo.setIcon(new ImageIcon(Informe3.class.getResource("/presentacion/sistemas_oseo_muscular.jpg"))); 
		scrollPane.setViewportView(miAreaDibujo);
		
		
		//Creación de imágenes y cursores
		toolkit = Toolkit.getDefaultToolkit();
		imagDolor = toolkit.getImage(getClass().getClassLoader().getResource("presentacion/DolorIcono.png")); 
		imagFractura = toolkit.getImage(getClass().getClassLoader().getResource("presentacion/IconoFractura.png")); 
		imagRectangulo = toolkit.getImage(getClass().getClassLoader().getResource("presentacion/rectangulo.png"));
		imagTexto = toolkit.getImage(getClass().getClassLoader().getResource("presentacion/aniadirAnotacion.png"));
		imagCursorDolor =toolkit.getImage(getClass().getClassLoader().getResource("presentacion/CursorDolor.png"));
		imagCursorFractura =toolkit.getImage(getClass().getClassLoader().getResource("presentacion/CursorFractura.png"));
		
		//Creación de los cursores
		cursorRectangulo = toolkit.createCustomCursor(imagRectangulo,new Point(0,0),"CURSOR_RECTANGULO");
		cursorTexto= toolkit.createCustomCursor(imagTexto,new Point(0,0),"CURSOR_TEXTO");
		cursorDolor = toolkit.createCustomCursor(imagCursorDolor,new Point(0,0),"CURSOR_DOLOR");
		cursorFractura = toolkit.createCustomCursor(imagCursorFractura,new Point(0,0),"CURSOR_FRACTURA");
		
		
	}

	private class BtnDolorActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			modo = DOLOR;
	        frameInforme.setCursor(cursorDolor);
			
		}
	}
	private class BtnFracturaActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			modo = FRACTURA;
	        frameInforme.setCursor(cursorFractura);
		}
	}
	private class BtnreaActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			modo = RECTANGULO;
	        frameInforme.setCursor(cursorRectangulo);
		}
	}
	private class BtnInformacinActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			modo = TEXTO;
	        frameInforme.setCursor(cursorTexto);
		}
	}
	private class MiAreaDibujoMouseListener extends MouseAdapter {
		@Override
		public void mousePressed(MouseEvent e) {
			x = e.getX();
			y = e.getY();
			if (imagen != null)
			{
			switch (modo)
			{
			case DOLOR:
				miAreaDibujo.addObjetoGrafico(new ImagenGrafico(x,y,imagDolor));
				miAreaDibujo.repaint();
			break;
			case FRACTURA:
				miAreaDibujo.addObjetoGrafico(new ImagenGrafico(x,y,imagFractura));
				miAreaDibujo.repaint();
			break;
			case RECTANGULO:
				miAreaDibujo.addObjetoGrafico(new RectanguloGrafico (x,y,x,y,
	    	            Color.RED));
				//ModeloLista.addElement("Rectangulo");
			         break;
			case TEXTO: 
				txtTexto.setBounds(x, y, 200,30); 
		    	 txtTexto.setVisible(true); 
		    	 txtTexto.requestFocus(); 
		    	 txtTexto.addActionListener(new ActionListener() {
		    		 public void actionPerformed(ActionEvent arg) { 
		    			 if(!txtTexto.getText().equals(""))
		    				 miAreaDibujo.addObjetoGrafico(new TextoGrafico(x, y+15, txtTexto.getText(),Color.BLUE));
		    				 txtTexto.setText(""); 
		    				 txtTexto.setVisible(false); 
		    				 miAreaDibujo.repaint();
		    		 }
		    		 
		    		 });
		    		 miAreaDibujo.add(txtTexto);
			}
		}
	}
	}
		private class MiAreaDibujoMouseMotionListener extends MouseMotionAdapter {
			@Override
			public void mouseDragged(MouseEvent e) {
				if (modo == RECTANGULO) {
					
					((RectanguloGrafico)miAreaDibujo.getUltimoObjetoGrafico()).setX1(e.getX());
					((RectanguloGrafico)miAreaDibujo.getUltimoObjetoGrafico()).setY1(e.getY()); 
					miAreaDibujo.repaint();
				}
			}
		}
		

		

		public void setTextField(String nombre) {
			// TODO Auto-generated method stub
			textField.setText(nombre);
		}
		
	
	
	
	
	
	}

	

