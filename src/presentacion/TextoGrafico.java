package presentacion;

import java.awt.Color;

public class TextoGrafico extends ObjetoGrafico{
	private String texto;
	private Color color;
	public TextoGrafico(int x, int y, String texto, Color color) {
		super(x, y);
		this.texto = texto;
		this.color = color;
	}
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	
}
