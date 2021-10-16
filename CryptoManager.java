package _student;


public class CryptoManager {

    private static final char LOWER_BOUND = ' ';
    private static final char UPPER_BOUND = '_';
    private static final int RANGE = UPPER_BOUND - LOWER_BOUND + 1;

    /**
     * This method determines if a string is within the allowable bounds of ASCII codes
     * according to the LOWER_BOUND and UPPER_BOUND characters
     * @param plainText a string to be encrypted, if it is within the allowable bounds
     * @return true if all characters are within the allowable bounds, false if any character is outside
     */
    public static boolean stringInBounds (String plainText) {
        char[] shi_ = plainText.toCharArray();
        for(int i = 0; i < plainText.length(); i++) {
            if(shi_[i] < LOWER_BOUND || shi_[i] > UPPER_BOUND)
                return false;
        }
        return true;
    }

    /**
     * Encrypts a string according to the Caesar Cipher.  The integer key specifies an offset
     * and each character in plainText is replaced by the character \"offset\" away from it
     * @param plainText an uppercase string to be encrypted.
     * @param key an integer that specifies the offset of each character
     * @return the encrypted string
     */
    public static String encryptCaesar(String plainText, int key) {
        // convert the plaintext into array or (other) to access each letter individually
        // and then store it to a variable
        char[] text = plainText.toCharArray();

        // loop though each character and shift by the amount of key
        for(int i = 0; i < plainText.length(); i++) {
            text[i] = (char) (text[i]+key); // I had to use (char) to convert the int number to character ascii
        }

        // when all the variables are done change the text to string and return it
        return String.valueOf(text);
    }

    /**
     * Encrypts a string according the Bellaso Cipher.  Each character in plainText is offset
     * according to the ASCII value of the corresponding character in bellasoStr, which is repeated
     * to correspond to the length of plainText
     * @param plainText an uppercase string to be encrypted.
     * @param bellasoStr an uppercase string that specifies the offsets, character by character.
     * @return the encrypted string
     */
    public static String encryptBellaso(String plainText, String bellasoStr) {

        StringBuilder result = new StringBuilder();
        for (int i = 0, j = 0; i < plainText.length(); i++) {
            char c = plainText.charAt(i);

            if (c < 'A' || c > 'Z')
                continue;
            result.append((char) ((c + bellasoStr.charAt(j) - 2 * 'A') % 26 + 'A'));
                j = ++j % bellasoStr.length();
        }
        return result.toString();

        //throw new RuntimeException("method not implemented");
    }

    /**
     * Decrypts a string according to the Caesar Cipher.  The integer key specifies an offset
     * and each character in encryptedText is replaced by the character \"offset\" characters before it.
     * This is the inverse of the encryptCaesar method.
     * @param encryptedText an encrypted string to be decrypted.
     * @param key an integer that specifies the offset of each character
     * @return the plain text string
     */
    public static String decryptCaesar(String encryptedText, int key) {
        // convert the plaintext into array to access each letter individually
        // and then store it to a variable
        char[] text = encryptedText.toCharArray();

        // loop though each character and shift by the amount of key
        for(int i = 0; i < encryptedText.length(); i++) {
            text[i] = (char) (text[i]-key);
        }

        // when all the variables are done change the text to string and return it
        return String.valueOf(text);
    }

    /**
     * Decrypts a string according the Bellaso Cipher.  Each character in encryptedText is replaced by
     * the character corresponding to the character in bellasoStr, which is repeated
     * to correspond to the length of plainText.  This is the inverse of the encryptBellaso method.
     * @param encryptedText an uppercase string to be encrypted.
     * @param bellasoStr an uppercase string that specifies the offsets, character by character.
     * @return the decrypted string
     */
    public static String decryptBellaso(String encryptedText, String bellasoStr) {
        StringBuilder messg= new StringBuilder();

        while(bellasoStr.length()<encryptedText.length())
            bellasoStr+=bellasoStr.substring(0,(encryptedText.length()-bellasoStr.length()));

        for(int i=0;i<encryptedText.length();i++) {
            char c=(char)wrap((int)encryptedText.charAt(i)-(int)bellasoStr.charAt(i) );
            messg.append(Character.toString(c));
        }

        return messg.toString();
    }
    public static int wrap(int key) {
        while(key>UPPER_BOUND)
            key-=(UPPER_BOUND-LOWER_BOUND);
        return key;
    }

}
