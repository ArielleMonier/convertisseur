
/**
 *
 * @author arielle
 */
public class ConvertisseurBasique {

    private double tauxConversion;

    public ConvertisseurBasique(double tauxConversion) {
        this.tauxConversion = tauxConversion;
    }

    public double getTauxConversion() {
        return tauxConversion;
    }

    public void setTauxConversion(double tauxConversion) {
        this.tauxConversion = tauxConversion;
    }

    public double convertirEnEuros(double nombreEnFrancs) {
        return nombreEnFrancs / tauxConversion;
    }

    public double convertirEnFrancs(double nombreEnEuros) {
        return nombreEnEuros * tauxConversion;
    }

}
