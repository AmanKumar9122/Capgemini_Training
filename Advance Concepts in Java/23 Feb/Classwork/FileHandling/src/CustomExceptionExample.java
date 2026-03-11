public class CustomExceptionExample {

    static void checkEligibility(int age) throws NotEligibleException {
        if (age < 18) {
            throw new NotEligibleException("Not eligible: age must be 18 or above");
        }
        System.out.println("Eligible");
    }

    public static void main(String[] args) {

        try {
            checkEligibility(16);
        } catch (NotEligibleException e) {
            System.out.println(e.getMessage());
        }
    }
}