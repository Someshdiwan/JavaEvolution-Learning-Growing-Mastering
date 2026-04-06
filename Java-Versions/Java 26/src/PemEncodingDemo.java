import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.util.Base64;

public class PemEncodingDemo {

    public static void main(String[] args) {

        try {

            // Generate key pair
            KeyPairGenerator generator = KeyPairGenerator.getInstance("RSA");
            generator.initialize(2048);
            KeyPair keyPair = generator.generateKeyPair();

            // Encode public key to PEM format
            String pemPublicKey = convertToPem(
                "PUBLIC KEY",
                keyPair.getPublic().getEncoded()
            );

            // Encode private key to PEM format
            String pemPrivateKey = convertToPem(
                "PRIVATE KEY",
                keyPair.getPrivate().getEncoded()
            );

            System.out.println("Public Key (PEM):");
            System.out.println(pemPublicKey);

            System.out.println("\nPrivate Key (PEM):");
            System.out.println(pemPrivateKey);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static String convertToPem(String type, byte[] data) {

        String base64 = Base64.getMimeEncoder(64, new byte[]{'\n'})
            .encodeToString(data);

        return "-----BEGIN " + type + "-----\n"
            + base64
            + "\n-----END " + type + "-----";
    }
}

/*
What changed: Previous vs New

Previous Java style:
- No direct PEM support
- Manual Base64 encoding required
- Hard to format keys correctly

New Java 26 style:
- Built-in PEM encoding/decoding support (JEP 524)
- Easier to work with cryptographic keys
- Cleaner and safer APIs

Why the new approach is better:
- Simplifies security-related code
- Standardized format handling
- Reduces manual errors

Pros:
1. Easier key handling
   - No need for custom formatting logic

2. Standard compliance
   - Follows PEM structure

3. Useful for real-world systems
   - HTTPS, certificates, authentication

4. Cleaner security APIs
   - Less boilerplate

Cons:
1. Preview feature
   - May require enabling preview in Java 26

2. Learning curve
   - Security APIs are complex

3. Not needed for basic apps
   - Mainly useful in backend/security-heavy systems

Best use case:
- SSL/TLS certificates
- Authentication systems
- Secure key storage
- API security

Compile and run:
javac PemEncodingDemo.java
java PemEncodingDemo
*/
