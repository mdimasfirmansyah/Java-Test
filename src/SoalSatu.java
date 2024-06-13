public class SoalSatu {
    public static void main(String[] args) {
        rusak(1000);
    }

    public static void rusak(int n) {
        if (n == 0) {
            return;
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Hello");
        }
        rusak(n / 2);
    }
}

//Total cetakan string hello setelah pemanggilan rusak(1000) adalah 1994 kali