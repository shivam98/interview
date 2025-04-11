public class Test {
    // first non repeating character
    public static void main(String[] args) {
//        String input = "sswi";
//        char ans = input.chars().
//                mapToObj(ch -> (char) ch).
//                filter(ch-> input.indexOf(ch) == input.lastIndexOf(ch)).
//                findFirst().orElse(null);
//        System.out.println(ans);
//        Compress strings (aaabbbbcc → a3b4c2) , c=3, a3, c=1
//                          i
        String input = "1a";
        String ans = "";
        int count = 1;
        char current = input.charAt(0);
        for(int i=0; i<input.length()-1; i++) {
            if(input.charAt(i) == input.charAt(i+1)) {
                count+=1;
            } else {
                ans += String.valueOf(current);
                ans += String.valueOf(count);
                count = 1;
                current = input.charAt(i+1);
            }
        }
        ans += String.valueOf(current);
        ans += String.valueOf(count);

//        System.out.println("--------------");
//        System.out.println(current);
//        System.out.println(count);


        System.out.println(ans);


    }

}
