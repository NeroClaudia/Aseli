import java.util.Scanner;

public class Asu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jmlBesar = 0;
        int jmlKecil = 0;
        int jmlBknHuruf = 0;
        System.out.print("Berapa banyak huruf yang ingin diidentifikasi? ");
        int jumlah = sc.nextInt();
        sc.nextLine();

        char[] huruf = new char[jumlah];

        for (int i = 0; i < huruf.length; i++) {
            System.out.print("Masukkan huruf ke-" + (i + 1) + ": ");
            String input = sc.nextLine();
            huruf[i] = input.charAt(0);
        }

        System.out.println("\n=== HASIL IDENTIFIKASI ===");

        for (int i = 0; i < huruf.length; i++) {
            char c = huruf[i];

            if (Character.isUpperCase(c)) {
                System.out.println("Huruf ke-" + (i + 1) + " adalah huruf BESAR: " + c);
                jmlBesar++;
            } else if (Character.isLowerCase(c)) {
                System.out.println("Huruf ke-" + (i + 1) + " adalah huruf kecil: " + c);
                jmlKecil++;
                System.out.println("Jumlah Huruf Kecil A");
            } else {
                System.out.println("Huruf ke-" + (i + 1) + " bukan huruf alfabet: " + c);
                jmlBknHuruf ++;
            }
        }
        System.out.println("Jumlah Huruf Besar: " + jmlBesar);
        System.out.println("Jumlah Huruf Kecil: " + jmlKecil);
        System.out.println("Jumlah Bukan Huruf: " + jmlBknHuruf);
        sc.close();
    }
}
