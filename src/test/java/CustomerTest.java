import static org.junit.Assert.*;
import org.junit.Test;

public class CustomerTest {
    private static final String STATEMENT = "Rental Record for Test\n" +
            "\tRegular\t$2.0\n" +
            "\tNew Release\t$9.0\n" +
            "\tChildren's\t$4.5\n" +
            "Amount owned is $15.5\n" +
            "You earned 4 frequent rental points";
    @Test
    public void testStatement() {
        assertEquals(STATEMENT, mockCustomer().statement());
        System.out.println(mockCustomer().statement());
    }

    private Customer mockCustomer() {
        Customer customer = new Customer("Test");

        customer.addRental(mockRental("Regular", Movie.REGULAR, 1));
        customer.addRental(mockRental("New Release", Movie.NEW_RELEASE, 3));
        customer.addRental(mockRental("Children's", Movie.CHILDRENS, 5));

        return customer;
    }

    private Rental mockRental(String title, int priceCode, int days) {
        return new Rental(mockMovie(title, priceCode), days);
    }

    private Movie mockMovie(String title, int priceCode) {
        return new Movie(title, priceCode);
    }
}