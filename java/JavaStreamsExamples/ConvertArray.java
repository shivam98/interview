import java.util.Arrays;
import java.util.*;
import java.util.stream.Collectors;

public class ConvertArray {
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        List<Integer> li = new ArrayList<>();
        li.add(1); li.add(2); li.add(3);li.add(4); li.add(5);

//        String[] strArray = li.stream().map(val->String.valueOf(val)).toArray(size->new String[size]);
//        String[] strArray = li.stream().map(String::valueOf).toArray(String[] :: new);
        String[] strArray = Arrays.stream(intArray).map(String::valueOf).toArray(String[] :: new);
        long count = Arrays.stream(intArray).map(String::valueOf).count();
        // Output the result
        System.out.println(Arrays.toString(strArray)); // [1, 2, 3, 4, 5]
        System.out.println(count);

        List<Integer> filtered = li.stream()
                .filter(val-> val>3)
                .collect(Collectors.toList());
        System.out.println(filtered);
    }
}
