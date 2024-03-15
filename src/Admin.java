//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//
import java.util.Scanner;

class Admin {
    Student student = new Student();
    public static String userx = "admin123";
    public static String passx = "admin123";

    Admin() {
    }

    int checkAdmin() {
        Scanner scanString = new Scanner(System.in);
        System.out.print("Enter your username (admin): ");
        String user = scanString.nextLine();
        System.out.print("Enter your password (admin): ");
        String pass = scanString.nextLine();
        if (user.equals(userx) && pass.equals(passx)) {
            System.out.println("Sukses login sebagai admin\n");
            return 1;
        } else {
            System.out.println("Admin tidak ditemukan\n");
            return 0;
        }
    }

    void addStudent(int i) {
        Scanner scanString = new Scanner(System.in);
        System.out.print("Masukkan nama mahasiswa: ");
        Student.nama[i] = scanString.nextLine();
        System.out.print("Masukkan fakultas mahasiswa: ");
        Student.fakultas[i] = scanString.nextLine();
        System.out.print("Masukkan NIM mahasiswa: ");

        for(Student.nim[i] = scanString.nextLine(); String.valueOf(Student.nim[i]).length() != 15; Student.nim[i] = scanString.nextLine()) {
            System.out.print("Nim Harus 15 Digit!!!\n");
            System.out.print("Masukkan NIM mahasiswa: ");
            Student var10000 = this.student;
        }

        System.out.print("Masukkan jurusan mahasiswa: ");
        Student.prodi[i] = scanString.nextLine();
        System.out.print("Data Mahasiswa berhasil ditambahkan.\n");
    }

    void dispayStudent(int i) {
        System.out.println("Data mahasiswa ke " + (i + 1));
        String var10001 = Student.nama[i];
        System.out.println("Nama: " + var10001);
        var10001 = Student.fakultas[i];
        System.out.println("Fakultas: " + var10001);
        var10001 = Student.nim[i];
        System.out.println("nim: " + var10001);
        var10001 = Student.prodi[i];
        System.out.println("prodi: " + var10001);
    }
}
