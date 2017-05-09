package presentacion;

import java.awt.Color;

public class RectanguloGrafico extends ObjetoGrafico{
	private int x1, y1;
	private Color color;
	public RectanguloGrafico(int x, int y, int x1, int y1, Color color) {
		super(x, y);
		this.x1 = x1;
		this.y1 = y1;
		this.color = color;
	}
	public int getX1() {
		return x1;
	}
	public void setX1(int x1) {
		this.x1 = x1;
	}
	public int getY1() {
		return y1;
	}
	public void setY1(int y1) {
		this.y1 = y1;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	
}
