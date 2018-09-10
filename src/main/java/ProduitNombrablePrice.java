public class ProduitNombrablePrice implements ProduitPricer {

    public double price(Produit produit, double qts) {
        return produit.price * qts;
    }
}
