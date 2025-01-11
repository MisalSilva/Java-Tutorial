// In this class we discuss java String part 2
public class Tut14 {
    public static void main(String[] args) {

        // String methods
        String  str1 = "Sri Lanka";

        System.out.println(str1.length()); // gives the length of the String
        System.out.println(str1.toUpperCase()); // Turns the String into Uppercase
        System.out.println(str1.toLowerCase()); // Turns the String into Lowercase
        System.out.println(str1.isEmpty()); // Prints true and false on whether String is empty or not
        System.out.println(str1.charAt(0)); // Prints specified Characters of the String
        System.out.println(str1.replace("Sri", "Jaya")); // Replaces a given String
        System.out.println(str1.replace("a", "@")); // Replaces a given Character in all places
        System.out.println(str1.replaceFirst("a", "#")); // Replaces a given character at the first appearance
        System.out.println(str1.contains("Jaya")); // Prints true or false on whether the String contains the given string
        System.out.println(str1.contains("Sri"));


        // Adding two Strings
        String str2 = "Country";
        // usual concatenation
        System.out.println(str1+" "+str2);
        // Using concat method
        System.out.println(str1.concat(" ").concat(str2));
    }
}
