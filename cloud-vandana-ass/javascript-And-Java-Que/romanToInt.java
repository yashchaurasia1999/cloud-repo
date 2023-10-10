import java.util.*;

class romanToInt {

    public static void main(String[] args) {
        Map<Character, Integer> roman = new HashMap<>();
        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);

        int sum = 0;
        String str = "XMCL";
        int n = str.length();

        for (int i = 0; i < n; i++) {
            if (i != n - 1 && roman.get(str.charAt(i)) < roman.get(str.charAt(i + 1))) {
                sum += roman.get(str.charAt(i + 1)) -
                        roman.get(str.charAt(i));
                i++;
            } else {
                sum += roman.get(str.charAt(i));
            }
        }

        System.out.print(sum);

    }
}