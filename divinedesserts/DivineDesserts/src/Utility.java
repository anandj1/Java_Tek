public class Utility {
    public boolean validateCakeId(String cakeId) throws InvalidCakeIdException {
        // Condition: Starts with "CAKE" followed by exactly 3 digits (0-9)
        if (cakeId.matches("^CAKE[0-9]{3}$")) {
            return true;
        } else {
            throw new InvalidCakeIdException("Cake Id " + cakeId + " is not valid");
        }
    }
}