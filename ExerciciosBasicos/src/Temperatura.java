
public class Temperatura {
	
	public static void main(String[] args) {
		
		double C, F, K, Re, Ra;
		C = 34;
		
		// Fahrenheit 
			F = C * 1.8 + 32;
				System.out.println("A temperatura = "+ C + " Em celsius, é equivalente à " + F + " em Fahrenheit " );
		
		//Kelvin 
			K = C + 273.15;
				System.out.println("A temperatura = "+ C + " Em celsius, é equivalente à " + K + " em Kelvin ");
				
		//Réaumur 
			Re = C * 0.8;
				System.out.println("A temperatura = "+ C + " Em celsius, é equivalente à " + Re + " em Réaumur " );
				
		//Rankine 
			Ra = C * 1.8 + 32 + 459.67;
				System.out.println("A temperatura = "+ C + " Em celsius, é equivalente à " + Ra + " em Rankine " );
	}
	

}
