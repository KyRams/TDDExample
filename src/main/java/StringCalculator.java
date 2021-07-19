public class StringCalculator {

    private static int total = 0;

    public static int add(String string) {
        if (string.equals("")) {
            return total;
        } else {
            for (int i = 0; i < string.length(); ++i) {
                String n = string.substring(i, i+1);
                total += Integer.parseInt(n);
            }
            return total;
        }
    }
}
