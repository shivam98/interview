// Download Extention pack for Java if using Visual Code studio.
import java.util.Arrays;
import java.util.List;
// Write a Java program to calculate the average of a list of integers using streams.
public class CalculateAvg {
  public static void main(String[] args) {
    List < Integer > nums = Arrays.asList(1, 3, 6, 8, 10, 18, 36);
    System.out.println("List of numbers: " + nums);

    // Calculate the average using streams
    double average = nums.stream()
      .mapToDouble(Integer::doubleValue)
      .average()
      .orElse(0.0);

    System.out.println("Average value of the said numbers: " + average);
  }
}

