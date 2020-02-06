import java.io.*;
import java.util.*;
import java.security.MessageDigest;

public class Solution {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        scanner.close();

        String hashType = "MD5";

        try {
            MessageDigest mDigest = MessageDigest.getInstance(hashType);
            mDigest.update(text.getBytes());
            byte[] hash = mDigest.digest();

            for (byte bt : hash) {
                System.out.printf("%02x", bt);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
