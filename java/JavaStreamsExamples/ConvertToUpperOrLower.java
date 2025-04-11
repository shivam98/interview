import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertToUpperOrLower {
  public static void main(String[] args) {
    List < String > colors = Arrays.asList("RED", "grEEn", "white", "Orange", "pink");
    System.out.println("List of strings: " + colors);
    // Convert strings to uppercase using streams
    List < String > uppercaseStrings = colors.stream()
      .map(String::toUpperCase)
      .collect(Collectors.toList());

    System.out.println("\nUppercase Strings: " + uppercaseStrings);

    // Convert strings to lowercase using streams
    List < String > lowercaseStrings = colors.stream()
      .map(String::toLowerCase)
      .collect(Collectors.toList());

    System.out.println("Lowercase Strings: " + lowercaseStrings);



    // practice
    List < String > c = Arrays.asList("RED", "grEEn", "white", "Orange", "pink");
    c.stream().map(str-> str.toUpperCase()).collect(Collectors.toList());
    String input = "helloworld";
//    Character result = input.chars()
//            .mapToObj(intVal -> (char)intVal)
//            .filter(ch -> input.indexOf(ch) == input.lastIndexOf(ch))
//            .findFirst()
//            .orElse(null);
//    input.chars().mapToObj(val->(char)val).collect(Collectors.groupingBy(ch->ch, Collectors.counting()));
//    Map<Character, Long> freq = input.chars()
//            .mapToObj(c -> (char) c)
//            .collect(Collectors.groupingBy(ch -> ch, Collectors.counting()));

    // remove all duplicates
    // output only employees having sal more than 50k
    // first non repeated character in  a string
    // frequency of each character in a string



  }
}
