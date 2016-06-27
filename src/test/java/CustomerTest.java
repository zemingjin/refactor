import org.junit.Assert;
import org.junit.Test;

public class CustomerTest {
    private static final String STATEMENT = "Rental Record for Test\n" +
            "\tAAA\t2.0\n" +
            "\tBBB\t9.0\n" +
            "\tCCC\t4.5\n" +
            "Amount owed is 15.5\n" +
            "You earned 4 frequent rental points";
    @Test
    public void testStatement() {
        Assert.assertEquals(STATEMENT, mockCustomer().statement());
    }

    private Customer mockCustomer() {
        Customer customer = new Customer("Test");

        customer.addRental(mockRental("AAA", 0, 1));
        customer.addRental(mockRental("BBB", 1, 3));
        customer.addRental(mockRental("CCC", 2, 5));

        return customer;
    }

    private Rental mockRental(String title, int priceCode, int days) {
        return new Rental(mockMovie(title, priceCode), days);
    }

    private Movie mockMovie(String title, int priceCode) {
        return new Movie(title, priceCode);
    }
}
