package Java.core_java_practice.gcr_codebase.scenerioBased;

import java.util.*;

public class SpyAgency {


    public static String reverseMessage(String msg) {
        return new StringBuilder(msg).reverse().toString();
    }


    public static boolean isPalindrome(String msg) {
        String cleaned = msg.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversed = new StringBuilder(cleaned).reverse().toString();
        return cleaned.equals(reversed);
    }


    public static void countVowelsConsonants(String msg) {
        int vowels = 0, consonants = 0;

        for (char ch : msg.toCharArray()) {
            if (Character.isLetter(ch)) {
                ch = Character.toLowerCase(ch);
                if ("aeiou".indexOf(ch) != -1)
                    vowels++;
                else
                    consonants++;
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }


    public static boolean areAnagrams(String str1, String str2) {
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        if (str1.length() != str2.length())
            return false;

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }


    public static Character firstNonRepeating(String str) {
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1)
                return entry.getKey();
        }

        return null;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Secret message
        System.out.print("Enter the secret message: ");
        String secret = sc.nextLine();

        System.out.println("Reversed Message: " + reverseMessage(secret));
        System.out.println("Palindrome: " + isPalindrome(secret));

        countVowelsConsonants(secret);


        System.out.print("\nEnter first intercept: ");
        String intercept1 = sc.nextLine();

        System.out.print("Enter second intercept: ");
        String intercept2 = sc.nextLine();

        System.out.println("Anagrams: " + areAnagrams(intercept1, intercept2));


        System.out.print("\nEnter surveillance log: ");
        String log = sc.nextLine();

        Character ch = firstNonRepeating(log);
        if (ch != null)
            System.out.println("First Non-Repeating Character: " + ch);
        else
            System.out.println("No non-repeating character found.");

        sc.close();
    }
}