
public class ParedeAzulejo {
	public static void main(String[] args) {
		
		double hp,lp,ha,la, qtd;
		//altura da parede
		hp = 2.6;
		//largura da parede
		lp = 1.6;
		
		//altura do azulejo 
		ha = 0.35;
				
		//largura do azulejo
		la = 0.5;
		
		//calculo para descobrir a quantidade de azulejos
		qtd = (hp * lp) / (ha * la);
		
		System.out.println("A quantidade de azulejos necessarios ser? " + qtd);
		
	}

}
