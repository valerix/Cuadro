import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JFrame;


public class VentanaCuadros extends JFrame{
	
	ControladorCuadro cc;
	
	public VentanaCuadros(){
		this.setSize(500,500);
		this.setTitle("Demo Cuadros");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
		cc=new ControladorCuadro(5);
		cc.agregarElementos(new ClaseCuadro(50,50,Color.BLACK));
		cc.agregarElementos(new ClaseCuadro(110,50,Color.PINK));
		cc.agregarElementos(new ClaseCuadro(170,50,Color.MAGENTA));
		cc.agregarElementos(new ClaseCuadro(230,50,Color.GREEN));
		
	}
	
	public void paint(Graphics g){
		
		Graphics2D g2=(Graphics2D) g;
		Rectangle2D.Double rect1;
		for(int indice=0; indice<cc.getPosXArreglo(indice); indice++){
			rect1=new Rectangle2D.Double(cc.getPosXArreglo(indice),cc.getPosYArreglo(indice),50,50);
			g2.setPaint(cc.getColorArreglo(indice));
			g2.fill(rect1);
		}
		
	}

}
