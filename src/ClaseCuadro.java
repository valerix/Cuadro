import java.awt.Color;

public class ClaseCuadro {
	private int posx;
	private int posy;
	private Color color;
	
	public ClaseCuadro(int posx, int posy,Color color){
		this.posx=posx;
		this.posy=posy;
		this.color=color;
	}
	
	
	public int getPosx() {
		return posx;
	}
	public void setPosx(int posx) {
		this.posx = posx;
	}
	public int getPosy() {
		return posy;
	}
	public void setPosy(int posy) {
		this.posy = posy;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}

}


