import java.awt.Color;


public class ControladorCuadro {
	
	private ClaseCuadro[] arreglo;
	private int MAXIMO;
	
	public ControladorCuadro(int elementos){
		MAXIMO=elementos;
		arreglo=new ClaseCuadro[MAXIMO];
	}
	
	public void agregarElementos(ClaseCuadro cuadro){
		for(int indice=0; indice<MAXIMO; indice++){
			if(arreglo[indice]==null){
				arreglo[indice]=cuadro;
				break;
			}
		}
	}
	
	public void mostrar(){
		for(int indice=0; indice<MAXIMO; indice++){
			if(arreglo[indice]!=null){
				System.out.println("Color" + arreglo[indice].getColor());
				System.out.println("X" + arreglo[indice].getPosx());
				System.out.println("Y" + arreglo[indice].getPosy());
			}
		}
	}
	
	public Color getColorArreglo(int pos){
		return arreglo[pos].getColor();
	}
	
	public int getPosXArreglo(int pos){
		return arreglo[pos].getPosx();
	}
	
	public int getPosYArreglo(int pos){
		return arreglo[pos].getPosy();
	}

	public ClaseCuadro[] getArreglo() {
		return arreglo;
	}

	public void setArreglo(ClaseCuadro[] arreglo) {
		this.arreglo = arreglo;
	}

}
