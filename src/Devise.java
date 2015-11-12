
/**
 *
 * @author arielle
 */
public class Devise {

    private String nom;
    private double tauxChange;

    public Devise(String nom, double tauxChange) throws Exception {
        if (nom.length() == 3) {
            if (tauxChange >= 0) {
                this.nom = nom;
                this.tauxChange = tauxChange;
            }
            else{
                throw new Exception("Le taux de change "+tauxChange+" ne peut pas être négatif !");
            }

        } else {
            throw new Exception("Le nom " + nom + " est incorrect !");
        }
    }

    public String getNom() {
        return nom;
    }

    public double getTauxChange() {
        return tauxChange;
    }
}
