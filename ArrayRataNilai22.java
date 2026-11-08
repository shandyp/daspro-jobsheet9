import java.util.Scanner;

public class ArrayRataNilai22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Minta user masukin jumlah elemen
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMhs = input.nextInt();
        
        // Ukuran array ngikutin variabel jumlahMhs
        int[] nilaiMhs = new int[jumlahMhs];
        int total = 0;
        double rata2;
        String predikat;
        
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMhs[i] = input.nextInt();
            total += nilaiMhs[i];
        }
        
        rata2 = (double) total / nilaiMhs.length;
        System.out.println("Total nilai: " + total);
        System.out.println("Rata-rata: " + rata2);

        int tertinggi = nilaiMhs[0];
        int terendah = nilaiMhs[0];
        for (int i = 1; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > tertinggi) {
                tertinggi = nilaiMhs[i];
            }
            if (nilaiMhs[i] < terendah) {
                terendah = nilaiMhs[i];
            }
        }
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
        
        // Loop diubah mulai dari i = 0 biar mahasiswa ke-1 juga ke-print predikatnya
        for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] >= 85) {
                predikat = "SANGAT BAIK";
            } else if (nilaiMhs[i] >= 70) {
                predikat = "BAIK";
            } else {
                predikat = "PERLU PENDAMPINGAN";
            }
            System.out.println("Nilai mahasiswa ke-" + (i + 1) + " (" + nilaiMhs[i] + ") = " + predikat);
        }

        int mahasiswaLulus = 0;
        for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > 70) {
                mahasiswaLulus++;
            }
        }
        System.out.println("Banyaknya mahasiswa yang lulus: " + mahasiswaLulus);
        
        input.close();
    }
}