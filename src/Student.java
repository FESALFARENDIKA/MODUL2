
import java.util.Scanner;

class Student {
    public static String[] nama = new String[5];
    public static String[] fakultas = new String[5];
    public static String[] nim = new String[5];
    public static String[] prodi = new String[5];
    public static String[] bukuTerpinjam = new String[5];

    Student() {
    }

    int checkStudent() {
        Scanner scanString = new Scanner(System.in);
        System.out.print("Masukkan NIM anda: ");
        String input = scanString.nextLine();

        for(int i = 0; i < nim.length; ++i) {
            if (input.equals(nim[i])) {
                System.out.println("Sukses login sebagai student\n");
                return 1;
            }
        }

        System.out.println("NIM tidak ditemukan\n");
        return 0;
    }

    void pinjamBuku(int j) {
        Main main = new Main();
        Scanner scanString = new Scanner(System.in);
        System.out.print("Masukkan id buku yang ingin anda pinjam: ");
        String idBuku = scanString.nextLine();

        for(int i = 0; i < Main.idBuku.length; ++i) {
            if (idBuku.equals(Main.idBuku[i])) {
                System.out.println("Buku id " + idBuku + " berhasil dipinjam");
                int var10002 = Main.stock[i]--;
                break;
            }
        }

        bukuTerpinjam[j] = idBuku;
    }

    void bukuTerpinjam() {
        System.out.println("Buku terpinjam: ");

        for(int i = 0; i < bukuTerpinjam.length && bukuTerpinjam[i] != null; ++i) {
            System.out.printf("%d. %s", i + 1, bukuTerpinjam[i]);
        }

    }
}
