import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        String s = "abcha";
        System.out.println(longestSubstringWithoutRepeatingCharacters(s));
    }

    private static int longestSubstringWithoutRepeatingCharacters(String s) {
        if (s==null) return 0;
        Set<Character> set = new HashSet<>();
        int left = 0, right = 0, maxLength =0;
        while(right < s.length()){
            char current = s.charAt(right);
            if( !set.contains(current)){
               set.add(current);
               right++;
               maxLength = Math.max(maxLength, right - left);
            }else{
                char toRemove = s.charAt(left);
                set.remove(toRemove);
                left++;
            }
        }
        return maxLength;
    }
}