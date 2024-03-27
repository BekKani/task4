//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static  String generateString(int n) {
        StringBuilder result = new StringBuilder("+");

        for (int i = 1; i < n; i++) {
            if (i % 2 == 0) {
                result.append("-");
            } else {
                result.append("+");
            }
        }
        return result.toString();
    }
    public static void main(String[] args) {
        System.out.println(generateString(17));
        System.out.println(generateString(23));

    }

}