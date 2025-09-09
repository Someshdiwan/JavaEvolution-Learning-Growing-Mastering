public class ValidateNameandAge {
    boolean validate(String name) {
        return name.matches("[a-zA-Z\\s]+");
    }
    boolean validate(int age) {
        return age >= 3 && age <= 5;
    }
    public static void main(String[] args) {
        ValidateNameandAge validator = new ValidateNameandAge();

        // Test validation for a name.
        String name = "John Doe";
        boolean isNameValid = validator.validate(name);
        System.out.println("Is the name '" + name + "' valid? " + isNameValid);

        // Test validation for an age.
        int age = 4;
        boolean isAgeValid = validator.validate(age);
        System.out.println("Is the age " + age + " valid? " + isAgeValid);

        // Test invalid cases.
        String invalidName = "John123";
        int invalidAge = 6;

        System.out.println("Is the name '" + invalidName + "' valid? " + validator.validate(invalidName));
        System.out.println("Is the age " + invalidAge + " valid? " + validator.validate(invalidAge));
    }
}
