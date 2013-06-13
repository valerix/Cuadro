import java.awt.Color;


public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ControladorCuadro cc=new ControladorCuadro(5);
		cc.agregarElementos(new ClaseCuadro(50,50,Color.BLUE));
		cc.agregarElementos(new ClaseCuadro(50,50,Color.BLACK));
		cc.mostrar();
		VentanaCuadros vc=new VentanaCuadros();

	}

}
