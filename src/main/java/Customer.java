import java.util.Vector;
import java.util.stream.Collectors;

class Customer {
    private String _name;
    private Vector<Rental> _rentals = new Vector<>();

    public Customer(String name) {
        _name = name;
    }

    public void addRental(Rental arg) {
        _rentals.addElement(arg);
    }

    public String getName() {
        return _name;
    }

    public String statement() {
        return getHeaderLine() +
                getRentalRecords() +
                getFooterLines();
    }

    private String getHeaderLine() {
        return "Rental Record for " + getName() + "\n";
    }

    private String getFooterLines() {
        return "Amount owned is " + getTotalAmount() + "\n" +
                "You earned " + getTotalFrequentRenterPoints() + " frequent rental points";
    }

    private String getRentalRecords() {
        return _rentals.stream()
                .map(rental -> "\t" + rental.getMovie().getTitle() + "\t" + rental.getAmount() + "\n")
                .collect(Collectors.joining());
    }

    private int getTotalFrequentRenterPoints() {
        return _rentals.stream()
                .mapToInt(Rental::getFrequentRenterPoints)
                .sum();
    }

    private double getTotalAmount() {
        return _rentals.stream()
                .mapToDouble(Rental::getAmount)
                .sum();
    }

}