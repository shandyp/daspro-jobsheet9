import java.util.Scanner;

public class Tugas122 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan banyaknya nilai mahasiswa: ");
        int jumlah = sc.nextInt();
        int[] nilai = new int[jumlah];

        double total = 0;

        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = sc.nextInt();
            total += nilai[i];
        }

        int tertinggi = nilai[0];
        int terendah = nilai[0];
        for (int i = 1; i < jumlah; i++) {
            if (nilai[i] > tertinggi)
                tertinggi = nilai[i];
            if (nilai[i] < terendah)
                terendah = nilai[i];
        }

        double rataRata = total / jumlah;

        System.out.println("\nDAFTAR NILAI MAHASISWA:");
        for (int i = 0; i < jumlah; i++) {
            String status = (nilai[i] >= 70) ? "LULUS" : "TIDAK LULUS";
            System.out.println("Mahasiswa " + (i + 1) + ": " + nilai[i] + " (" + status + ")");
        }

        System.out.println("\nSTATISTIK NILAI:");
        System.out.println("Rata-rata Kelas: " + rataRata);
        System.out.println("Nilai Tertinggi: " + tertinggi);
        System.out.println("Nilai Terendah : " + terendah);

        sc.close();
    }
}