
public class TipoVariable {

	public static void main(String[] args) {
		
		double variable1 = 230.89;
		int variable1Entero = (int) variable1; //Casteando la variable para cumplir con la condicion de ser entero el numero
		
		System.out.println(variable1Entero);
	
		long prueba = 12222222222222222L;
		
		short numeroPequeno = 1355; 
		
		byte numeroAunMaspequeno = 15;
		
		float numeroDecimalPequeno = 2.5F;
		
		double resultado1 = variable1 + variable1Entero; 
		
		int resultado = (int) variable1 + variable1Entero;
		
		System.out.println("Este es el resultado 1 de nuestras variables: " + resultado1);
		System.out.println("Este es el resultado 2 de nuestras variables: " + resultado);
		
	}
}