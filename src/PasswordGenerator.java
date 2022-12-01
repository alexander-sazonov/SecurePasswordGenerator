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

        StringBuilder result = new StringBuilder(PASSWORD_LENGTH);
        result.append(generateRandomString(CHAR_LOWERCASE, 2));
        result.append(generateRandomString(CHAR_UPPERCASE, 2));
        result.append(generateRandomString(DIGIT, 2));
        result.append(generateRandomString(SPECIAL, 2));
        result.append(generateRandomString(PASSWORD_ALLOW, 12));
        return shuffleString(result.toString());
    }

    public static String generateRandomString(String str, int charCount) {
        StringBuilder result = new StringBuilder(str.length());
        for (int i = 0; i < charCount; i++) {
            int rndIndex = random.nextInt(str.length());
            char c = str.charAt(rndIndex);
            result.append(c);
        }

        return result.toString();
    }

    public static String shuffleString(String str) {
        StringBuilder result = new StringBuilder(str.length());
        StringBuilder temp = new StringBuilder(str);
        for (int i = 0; i < str.length(); i++) {
            int k = random.nextInt(temp.length());
            result.append(temp.charAt(k));
            temp.deleteCharAt(k);

        }
        return result.toString();

    }

    public static void main(String[] args) {
        System.out.println(generateStrongPassword());


    }



}
