package Spring3Tasca2DependencyInjection;

public class MostraPreus {
	
	private Conversor conversor;
	float preu;
	
	
	public MostraPreus (float preu, Conversor conversor) {
		this.preu= preu;
		this.conversor = conversor;
	}
	
	public void imprimir () {
		System.out.println("El preu es de: "+conversor.conversio(preu));
	}
	
	
}
