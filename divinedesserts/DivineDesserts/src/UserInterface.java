import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class UserInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Utility utility = new Utility();
        CakeOrder cakeOrder = new CakeOrder();
        List<Cake> validCakesList = new ArrayList<>();

        System.out.println("Enter the total number of cakes needed");
        int numCakes = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.println("Enter the Cake details");
        for (int i = 0; i < numCakes; i++) {
            String input = sc.nextLine();
            String[] parts = input.split(":");
            
            String cakeId = parts[0];
            String cakeName = parts[1];
            double cost = Double.parseDouble(parts[2]);
            int quantity = Integer.parseInt(parts[3]);

            try {
                if (utility.validateCakeId(cakeId)) {
                    validCakesList.add(new Cake(cakeId, cakeName, cost, quantity));
                }
            } catch (InvalidCakeIdException e) {
                System.out.println(e.getMessage());
            }
        }

        if (validCakesList.isEmpty()) {
            System.out.println("Your booking is empty");
        } else {
            // Convert list to array for cakeBooking method requirement
            Cake[] cakesArray = validCakesList.toArray(new Cake[0]);
            cakeOrder.cakeBooking(cakesArray);

            System.out.println("Enter the UPI name to avail offer");
            String upi = sc.nextLine();
            
            cakeOrder.findDiscount(upi);
            double totalBill = cakeOrder.calculateTotalBill();
            
            // Format to two decimal places
            System.out.printf("Total Bill Amount: %.2f\n", totalBill);
        }
    }
}