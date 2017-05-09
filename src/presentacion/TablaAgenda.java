package presentacion;
import java.util.*;
import javax.swing.table.*;
class TablaAgenda extends AbstractTableModel {
	private String[] nombreColumnas = { "Fecha", "Hora", "Nombre", "Demanda"};
	private Vector datos = new Vector();
	public int getColumnCount() {return nombreColumnas.length;}
	public int getRowCount() {return datos.size();}
	public String getColumnName(int col) {return nombreColumnas[col];}
	public Object getValueAt(int row, int col) {
		Object[] fila = (Object [])datos.elementAt(row); return fila[col];
	}
	public Class getColumnClass(int c) {return getValueAt(0, c).getClass();}
	public boolean isCellEditable(int row, int col) {return true;}
	public void setValueAt(Object value, int row, int col) { if (row < getRowCount() && col < getColumnCount()){
		Object[] fila = (Object [])datos.elementAt(row); fila[col] = value;
		fireTableCellUpdated(row, col);
	} 
	}
	public void aniadeFila (Object[] row){ 
		datos.add (row);
	}
	public void setModel(TablaAgenda tAgenda) {
		// TODO Auto-generated method stub
		
	}
	void setSelectionMode(int singleSelection) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
	}

