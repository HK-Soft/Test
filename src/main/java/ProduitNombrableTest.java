import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ProduitNombrableTest {

    private ProduitNombrable produitNombrable;
    private ProduitNombrablePrice produitNombrablePricer;

    private static final double produitNombrablePrice_A = 10;
    private static final double produitNombrableQts_A = 3;

    @Before
    public void init() {
        this.produitNombrable = new ProduitNombrable();
        this.produitNombrablePricer = new ProduitNombrablePrice();
        this.produitNombrable.price = produitNombrablePrice_A;
    }

    @Test
    public void shouldCalculateProductPrice() {
        double result = produitNombrablePricer.price(produitNombrable, produitNombrableQts_A);
        assertTrue(30.00 == result);
    }

    public void shouldCalculateProductPriceWithTax(){

    }
}
