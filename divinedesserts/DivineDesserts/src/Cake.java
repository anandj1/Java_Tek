public class Cake {
    private String cakeId;
    private String cakeName;
    private double costPerKg;
    private int quantity;

    // Parameterized constructor in specified order
    public Cake(String cakeId, String cakeName, double costPerKg, int quantity) {
        this.cakeId = cakeId;
        this.cakeName = cakeName;
        this.costPerKg = costPerKg;
        this.quantity = quantity;
    }

    // Getters and Setters
    public String getCakeId() { return cakeId; }
    public void setCakeId(String cakeId) { this.cakeId = cakeId; }

    public String getCakeName() { return cakeName; }
    public void setCakeName(String cakeName) { this.cakeName = cakeName; }

    public double getCostPerKg() { return costPerKg; }
    public void setCostPerKg(double costPerKg) { this.costPerKg = costPerKg; }

    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }
}