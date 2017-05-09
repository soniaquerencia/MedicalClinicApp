package presentacion;
import java.io.File;
import javax.swing.filechooser.FileFilter;
public class TextFilter extends FileFilter { 
	public boolean accept (File f){
		boolean aceptar = f.isDirectory(); 
		if (!aceptar){
			String extension = getExtension(f); 
			if (extension != null)
				aceptar =extension.equals("txt");
		}
		return aceptar; 
	}
	public String getDescription(){
		return "Fichero de texto (*.txt)"; 
	}
	private String getExtension(File f) {
		String s = f.getPath(); String extension = null; int i = s.lastIndexOf('.'); 
		if (i>0 && i<s.length()-1)
			extension = s.substring(i+1).toLowerCase(); 
		return extension;
	}
}