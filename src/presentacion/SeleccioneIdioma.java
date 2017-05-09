package presentacion;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.ImageIcon;

public class SeleccioneIdioma extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final JRadioButton rdbtnIngls;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			SeleccioneIdioma dialog = new SeleccioneIdioma();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	

	/**
	 * Create the dialog.
	 */
	public SeleccioneIdioma() {
		setResizable(false);
		setBounds(100, 100, 522, 224);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		GridBagLayout gbl_contentPanel = new GridBagLayout();
		gbl_contentPanel.columnWidths = new int[]{147, 81, 0, 70, 30, 0, 0};
		gbl_contentPanel.rowHeights = new int[]{23, 0, 0, 0, 0};
		gbl_contentPanel.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPanel.rowWeights = new double[]{0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		contentPanel.setLayout(gbl_contentPanel);
		{
			JLabel label = new JLabel("");
			label.setIcon(new ImageIcon(SeleccioneIdioma.class.getResource("/presentacion/ei-blancanieves-idiomas-iloveimg-resized.png")));
			GridBagConstraints gbc_label = new GridBagConstraints();
			gbc_label.gridheight = 4;
			gbc_label.insets = new Insets(0, 0, 0, 5);
			gbc_label.gridx = 0;
			gbc_label.gridy = 0;
			contentPanel.add(label, gbc_label);
		}
		{
			JPanel panel = new JPanel();
			GridBagConstraints gbc_panel = new GridBagConstraints();
			gbc_panel.insets = new Insets(0, 0, 5, 5);
			gbc_panel.fill = GridBagConstraints.BOTH;
			gbc_panel.gridx = 2;
			gbc_panel.gridy = 2;
			contentPanel.add(panel, gbc_panel);
			{
				JRadioButton rdbtnEspaol = new JRadioButton("Español");
				panel.add(rdbtnEspaol);
				buttonGroup.add(rdbtnEspaol);
			}
			{
				rdbtnIngls = new JRadioButton("Inglés");
				panel.add(rdbtnIngls);
				buttonGroup.add(rdbtnIngls);
			}
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new OkButtonActionListener());
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
		}
	}

	private class OkButtonActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (rdbtnIngls.isSelected()) Messages.setIdioma("inglés");
			Inicio ventana = new Inicio(); ventana.getFrame2().setVisible(true); dispose();
		}
	}
}
