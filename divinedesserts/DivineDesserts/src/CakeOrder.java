import java.util.ArrayList;
import java.util.List;

public class CakeOrder {
    private List<Cake> cakeList = new ArrayList<>();
    private double discount;

    // Getters and Setters
    public List<Cake> getCakeList() { return cakeList; }
    public void setCakeList(List<Cake> cakeList) { this.cakeList = cakeList; }

    public double getDiscount() { return discount; }
    public void setDiscount(double discount) { this.discount = discount; }

    public void cakeBooking(Cake[] cakeObject) {
        for (Cake cake : cakeObject) {
            cakeList.add(cake);
        }
    }

    public void findDiscount(String UPIName) {
        // UPI names are case-insensitive
        String upi = UPIName.toLowerCase();
        if (upi.equals("phonepe")) {
            this.discount = 25.0;
        } else if (upi.equals("googlepay")) {
            this.discount = 20.0;
        } else if (upi.equals("paytm")) {
            this.discount = 15.0;
        } else {
            this.discount = 0.0;
        }
    }

    public double calculateTotalBill() {
        double totalPrice = 0.0;
        for (Cake cake : cakeList) {
            totalPrice += (cake.getCostPerKg() * cake.getQuantity());
        }
        // Bill Amount = totalPrice - (totalPrice * discount / 100)
        double billAmount = totalPrice - (totalPrice * this.discount / 100);
        return billAmount;
    }
}