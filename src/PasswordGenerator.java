import java.security.SecureRandom;

public class PasswordGenerator {

    static {
        random = new SecureRandom();
    }

    private static final String CHAR_LOWERCASE = "abcdefghijklmnopqrstuvwxyz";
    private static final String CHAR_UPPERCASE = CHAR_LOWERCASE.toUpperCase();
    private static final String DIGIT = "0123456789";
    private static final String SPECIAL = "!@#&()–[{}]:;',?/*";
    private static final int PASSWORD_LENGTH = 20;
    private static final String PASSWORD_ALLOW =
            CHAR_LOWERCASE + CHAR_UPPERCASE + DIGIT + SPECIAL;

    private static SecureRandom random;

    public static String generateStrongPassword() {

        return "";
    }

    public static String generateRandomString(String str, int charCount) {

        return "";
    }

    public static String shuffleString(String str) {

        return "";

    }


}
