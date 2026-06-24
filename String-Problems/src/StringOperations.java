import java.util.Arrays;

public class StringOperations {
    public static void main(String[] args) {
        // Base strings for our examples
        String text = "  Hello, Java World!  ";
        String compareText = "hello, java world!";

        System.out.println("Original String: '" + text + "'\n");

        // 1. charAt(i) - Returns the character at the specified index
        System.out.println("1. charAt(9): " + text.charAt(9));

        // 2. length() - Returns the total number of characters
        System.out.println("2. length(): " + text.length());

        // 3. substring(l, r) - Extracts a portion of the string (from index l up to, but not including, index r)
        System.out.println("3. substring(9, 13): " + text.substring(9, 13));

        // 4. toCharArray() - Converts the string into a new character array
        char[] charArray = "Java".toCharArray();
        System.out.println("4. toCharArray(): " + Arrays.toString(charArray));

        // 5 & 6. StringBuilder & reverse() - Strings are immutable, so we use StringBuilder to reverse
        StringBuilder sb = new StringBuilder("IntelliJ");
        sb.reverse();
        System.out.println("5 & 6. StringBuilder reverse(): " + sb.toString());

        // 7. indexOf() - Returns the index of the first occurrence of a character/substring
        System.out.println("7. indexOf('o'): " + text.indexOf('o'));

        // 8. lastIndexOf() - Returns the index of the last occurrence of a character/substring
        System.out.println("8. lastIndexOf('o'): " + text.lastIndexOf('o'));

        // 9. split() - Splits the string into an array based on a delimiter (Regex)
        String csv = "Apple,Banana,Orange";
        String[] fruits = csv.split(",");
        System.out.println("9. split(','): " + Arrays.toString(fruits));

        // 10. trim() - Removes leading and trailing whitespace
        String trimmedText = text.trim();
        System.out.println("10. trim(): '" + trimmedText + "'");

        // 11. equals() - Strictly compares two strings for exact equality (case-sensitive)
        System.out.println("11. equals(): " + trimmedText.equals(compareText));

        // 12. equalsIgnoreCase() - Compares two strings ignoring uppercase/lowercase differences
        System.out.println("12. equalsIgnoreCase(): " + trimmedText.equalsIgnoreCase(compareText));

        // 13. startsWith() - Checks if the string begins with the specified prefix
        System.out.println("13. startsWith('  He'): " + text.startsWith("  He"));

        // 14. endsWith() - Checks if the string ends with the specified suffix
        System.out.println("14. endsWith('World!  '): " + text.endsWith("World!  "));

        // 15. contains() - Checks if the string contains the specified sequence of characters
        System.out.println("15. contains('Java'): " + text.contains("Java"));
    }
}
