import java.util.Scanner;

public class Tugas222 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};
        int[] harga = {15000, 13000, 10000, 12000, 8000, 18000, 20000};
        
        System.out.print("Masukkan nama menu yang dicari: ");
        String cari = sc.nextLine();
        boolean ditemukan = false;
        
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(cari)) {
                System.out.println("Menu " + menu[i] + " tersedia dengan harga: Rp " + harga[i]);
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Menu " + cari + " tidak tersedia di dalam daftar.");
        }
        
        System.out.print("\nMasukkan jumlah item yang ingin dipesan: ");
        int jumlahPesan = sc.nextInt();
        sc.nextLine(); 
        
        String[] daftarPesanan = new String[jumlahPesan];
        int[] hargaPesanan = new int[jumlahPesan];
        int totalBiaya = 0;
        
        for (int i = 0; i < jumlahPesan; i++) {
            boolean valid = false;
            while (!valid) {
                System.out.print("Masukkan pesanan ke-" + (i + 1) + ": ");
                String inputMenu = sc.nextLine();
                
                for (int j = 0; j < menu.length; j++) {
                    if (menu[j].equalsIgnoreCase(inputMenu)) {
                        daftarPesanan[i] = menu[j];
                        hargaPesanan[i] = harga[j];
                        totalBiaya += harga[j];
                        valid = true;
                        break;
                    }
                }
                if (!valid) {
                    System.out.println("Menu tidak ditemukan, silakan input ulang.");
                }
            }
        }
        
        System.out.println("\nREKAP PESANAN:");
        for (int i = 0; i < jumlahPesan; i++) {
            System.out.println((i + 1) + ". " + daftarPesanan[i] + " - Rp " + hargaPesanan[i]);
        }
        System.out.println("Total Biaya: Rp " + totalBiaya);
        
        sc.close();
    }
}