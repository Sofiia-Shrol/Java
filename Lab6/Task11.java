package Lab6;

public class StringToLowerCaseConverter {
    public static void main(String[] args) {
        // Тестування з різними реченнями
        System.out.println(stringToLowerCase("The user with the nickname Koala757677 left COMMENTS")); 
        // Очікується: "the user with the nickname koala757677 left comments"
        
        System.out.println(stringToLowerCase("Hello World! 123 TESTING"));
        // Очікується: "hello world! 123 testing"
    }

    public static String stringToLowerCase(String s) {
        if (s == null) {
            throw new NullPointerException("Input string cannot be null.");
        }
        return s.replaceAll("[A-Za-z]+", match -> match.group().toLowerCase());
    }
}
