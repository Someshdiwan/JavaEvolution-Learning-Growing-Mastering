package Package;

import java.util.Optional;

public class Test2 {
    public static void main(String[] args) {
       Optional<String> name = getName(2);
       if (name.isPresent()) {
            System.out.println(name.get());
        }
    }

    private static Optional<String> getName(int id) {
        String name = "Ram";
        return Optional.of(name);
    }
}
