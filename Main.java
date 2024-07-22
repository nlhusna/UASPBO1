public class Main {
    public static void main(String[] args) {
        Pengguna pengguna = new Pengguna();
        Buku buku = new Buku();
        Komik komik = new Komik();
        Cerpen cerpen = new Cerpen();

        // Contoh penggunaan metode pada objek Cerpen
        cerpen.setJudul("Cerpen Inspiratif");
        cerpen.setPenulis("Penulis Terkenal");
        cerpen.setJumlahHalaman(25);
        cerpen.setHarga(50000);

        cerpen.tampilkanDetailCerpen();
        cerpen.tambahDiskon(5000);
        cerpen.naikkanHarga();

        // Menggunakan getter untuk mendapatkan nilai atribut
        System.out.println("Judul Cerpen: " + cerpen.getJudul());
        System.out.println("Penulis Cerpen: " + cerpen.getPenulis());
        System.out.println("Jumlah Halaman Cerpen: " + cerpen.getJumlahHalaman());
        System.out.println("Harga Cerpen: " + cerpen.getHarga());
    }
}
