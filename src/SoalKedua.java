
public class SoalKedua {
public static int roger(int k, int b) {
    if (b == 1) return 1;
    else if (k % b == 0) return 1 + roger(k, b - 1);
    else return 0 + roger(k, b - 1);
}

    public static void main(String[] args) {
        int result = roger(8, 8);
        System.out.println("Return value: " + result);
    }
//return value yang dikembalikan adalah 4
}
