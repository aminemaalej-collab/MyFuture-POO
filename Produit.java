public class Produit {

    // Attributs privés (Encapsulation)
    private String reference;
    private String designation;
    private double prixHT;
    private int quantitestock;

    // Constructeur avec paramètres
    public Produit(String ref, String des, double prix, int qte) {
        this.reference = ref;
        this.designation = des;
        this.prixHT = prix;
        this.quantitestock = qte;
    }

    // Getters et Setters
    public String getref() {
        return reference;
    }

    public void setref(String ref) {
        this.reference = ref;
    }

    public String getdes() {
        return designation;
    }

    public void setdes(String des) {
        this.designation = des;
    }

    public double getprix() {
        return prixHT;
    }

    public void setprix(double prix) {
        this.prixHT = prix;
    }

    public int getqte() {
        return quantitestock;
    }

    public void setqte(int qte) {
        this.quantitestock = qte;
    }

    // Méthode pour calculer le montant total du stock
    public double calculer() {
        return quantitestock * prixHT;
    }
}