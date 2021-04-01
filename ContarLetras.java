/**
 * @author  Alejandro Navarro
 * @version 1.0
 */

public class ContarLetras {

	public ContarLetras() {
		// TODO Auto-generated constructor stub
	}
	
	public int contarLetras(String cadena, char letra)
	{
		int i=0;
		int contador=0;
		int longitud = 0;
		longitud=cadena.length();
		if(longitud>0) {
			while(i<longitud)
			{
				if(cadena.charAt(i)==letra)
				{
					contador++;
				}
				i++;
			}
		}
		return contador;
	}

	public static void main(String[] args) 
	{
		ContarLetras c1 = new ContarLetras();
		System.out.println("Resultado: "+c1.contarLetras("ab", 'a'));   
	}

}
