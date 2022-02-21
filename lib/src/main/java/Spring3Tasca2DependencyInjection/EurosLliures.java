package Spring3Tasca2DependencyInjection;

public class EurosLliures implements Conversor{
	
	@Override
	public String conversio(float preu) {
		return preu*0.83F+" £";
	}

}
