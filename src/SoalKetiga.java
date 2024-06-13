public class SoalKetiga {
    public static void main(String[] args) {
        String input = "pemrogramanDasarJava1";

        int uppercaseCount = 0;
        int lowercaseCount = 0;
        int digitCount = 0;
        int symbolCount = 0;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isUpperCase(ch)) {
                uppercaseCount++;
            } else if (Character.isLowerCase(ch)) {
                lowercaseCount++;
            } else if (Character.isDigit(ch)) {
                digitCount++;
            } else {
                symbolCount++;
            }
        }

        System.out.println("Uppercase : " + uppercaseCount);
        System.out.println("Lowercase : " + lowercaseCount);
        System.out.println("Angka : " + digitCount);
        System.out.println("Symbol : " + symbolCount);
    }
}
