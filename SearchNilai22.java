public class SearchNilai22 {
    public static void main(String[] args) {
        // Array bawaan dari modul
        int[] nilai = {78, 65, 90, 55, 88, 72};
        
        // Sengaja dicari angka yang nggak ada di array biar pesannya dieksekusi
        int key = 100; 
        boolean ditemukan = false;
        
        // Proses pencarian (Linear Search)
        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] == key) {
                System.out.println("Nilai " + key + " ditemukan pada indeks ke-" + i);
                ditemukan = true;
                break;
            }
        }
        
        // Ini bagian modifikasi pesannya biar lebih informatif
        if (!ditemukan) {
            System.out.println("Maaf, nilai " + key + " yang Anda cari tidak ditemukan dalam daftar array.");
        }
    }
}