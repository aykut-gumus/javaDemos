public class Main {
    public static void main(String[] args) {
        int number = 2;
        int remainder = number % 2;
        System.out.println(remainder);

        int sayac = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                sayac++;
            }
        }
        if (sayac > 2) {
            System.out.println("Sayı asal değildir.");
        } else {
            System.out.println("Sayı asaldır.");
        }
    }
}