public class StringUtils {
    public static int countVowels(String str) {
        if (str == null)
            return 0;

        int qtt = 0;
        String vowels = "aeiou";
        for (var ch : str.toLowerCase().toCharArray())
            if (vowels.indexOf(ch) != -1)
                qtt++;

        return qtt;
    }

    public static String reverse(String str) {
        if (str == null)
            return "";

        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0 ; i--) {
            reversed.append(str.charAt(i));
        }

        return reversed.toString();
    }
}
