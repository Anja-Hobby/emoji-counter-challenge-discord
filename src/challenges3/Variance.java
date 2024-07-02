package challenges3;

import java.util.ArrayList;

public final class Variance {
	public static double getVariance(ArrayList<Double> lijst) {
		double aantal_instanties = lijst.size();
		double totaal = 0;
		double gemiddelde = getGemiddelde(lijst);
		for (Double waarde:lijst) {
			double afwijking = Math.pow((waarde-gemiddelde),2);
			totaal = totaal + afwijking;
		}
		totaal = totaal/lijst.size();
		//System.out.println(" Variantie = " + totaal + " uit lijst " + lijst);
		return totaal;
	}
	
	public static double getGemiddelde(ArrayList<Double> lijst) {
		double totaal = getSom(lijst);
		//System.out.println("Gemiddelde: " +(totaal/lijst.size()) + " uit " + totaal + " en " + lijst.size());
		totaal = totaal/lijst.size();
		
		return totaal;
	}
	
	public static double getSom(ArrayList<Double> scores) {
		double totaal = 0;
		for (Double waarde: scores) {
			totaal = totaal + waarde;
		}
		return totaal;
		
	}
	
	public static double round (double value, int precision) {
	    int scale = (int) Math.pow(10, precision);
	    return (double) Math.round(value * scale) / scale;
	}

}
