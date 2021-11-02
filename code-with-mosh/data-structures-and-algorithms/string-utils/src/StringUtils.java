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
}
