package Spring3Tasca2DependencyInjection;

public class EurosDolar implements Conversor{
	
	@Override
	public String conversio(float preu) {
		return preu*1.13F+" $";
		
	}

}
